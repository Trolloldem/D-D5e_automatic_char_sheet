
	package util;
	import java.util.*;

	import org.antlr.v4.runtime.misc.Pair;
	import parsingExceptions.*;
	import util.lexEnum.Classi;
	import util.lexEnum.subClass;
	import wrappers.*;
	import wrappers.settings.bgSetting;
	import wrappers.settings.levelSetting;
	import wrappers.settings.settingWrapper;

	public class checkerSetting {
		public static Map<String, semanticResult>  existName(semanticResult resParsing) {
			Map<String, semanticResult>  errors = new HashMap<String, semanticResult>();
			Map<String, semanticResult> pgs = new HashMap<String, semanticResult>();
			List<semanticResult> tempResult = new ArrayList<semanticResult>();
			tempResult=((listOfResults) resParsing).getResults();
			characterWrapper temp=null;
			Set<String> names= new HashSet<String>( settingChecker.getnames());
			Set<String> charac= new HashSet<String>();

			for(int i=0;i<tempResult.size();i++) {
	    		if(tempResult.get(i) instanceof characterWrapper) {
	    			temp=(characterWrapper) tempResult.get(i);
	    			charac.add(temp.getName());
	    			pgs.put(temp.getName(),temp);
	    		}
	    	}
			Set<String> intersezione = new HashSet<String>(names);
			intersezione.retainAll(charac);
			if(!intersezione.equals(names)) {
				for(String name:names) {
					if(!intersezione.contains(name))
						errors.put(name,new exceptionWrapper(new nameNotExist("name '" +name+"' do not exist")));
				}

		}
			if(errors.size()>0){
				return errors;
			}
			return  pgs;
	}
		public static Map<String, semanticResult>  existEquipName(semanticResult resParsing) {

			Map<String, semanticResult>  errors = new HashMap<String, semanticResult>();
			List<semanticResult> tempResult = new ArrayList<semanticResult>();
			Map<String, semanticResult> equips = new HashMap<String, semanticResult>();
			tempResult=((listOfResults) resParsing).getResults();
			equipWrapper temp=null;
			Set<String> names= new HashSet<String>( settingChecker.getEquipNames());
			Set<String> equip= new HashSet<String>(); 

			for(int i=0;i<tempResult.size();i++) {
	    		if(tempResult.get(i) instanceof equipWrapper) {
	    			temp=(equipWrapper) tempResult.get(i);
	    			equip.add(temp.getName());
	    			equips.put(temp.getName(),temp);
	    		}

	    	}
			Set<String> intersezione = new HashSet<String>(names);
			intersezione.retainAll(equip);
			if(!intersezione.equals(names)) {

				for(String name:names) {
					if(!intersezione.contains(name))

						errors.put(name,new exceptionWrapper(new nameNotExist("equip name '" +name+"' do not exist")));
				}

		}
			if(errors.size()>0){
				return errors;
			}
			return  equips;
	}

	public static void setClassLevel(Map<String ,semanticResult> resParsing, List<semanticResult> errors){

			Map<String,Set<Classi>> alreadySetClass = new HashMap<String, Set<Classi>>();

			for(settingWrapper w : settingChecker.getSettingWrappers().get("Level")){
				if( w instanceof levelSetting) {
					levelSetting wrapper = (levelSetting) w;
					characterWrapper character = (characterWrapper)resParsing.get(wrapper.getPgName());
					try {
						character.setClassLevel(wrapper.getPgClass(),wrapper.getSetting());
						if(alreadySetClass.containsKey(wrapper.getPgName())){
							if(alreadySetClass.get(wrapper.getPgName()).contains(wrapper.getPgClass())){
								errors.add(new exceptionWrapper(new multipleLevelSettingException(wrapper.getPgName(),wrapper.getPgClass().toString().replace("_"," "))));
							}else{
								alreadySetClass.get(wrapper.getPgName()).add(wrapper.getPgClass());
							}
						}else{
							Set<Classi> set = new HashSet<Classi>();
							set.add(wrapper.getPgClass());
							alreadySetClass.put(wrapper.getPgName(),set);
						}
					}catch (CharacterWithoutClassException e){
						errors.add(new exceptionWrapper(e));
					}


				}
			}

		for(Map.Entry<String,semanticResult> entry : resParsing.entrySet()){
			characterWrapper wrapper = (characterWrapper)entry.getValue();
			int charTotalLevel = 0;

			for(Map.Entry<Pair<Classi, subClass>, Integer> charLevel : wrapper.getPgClass().entrySet()){

				if(charLevel.getValue() <= 0){
					errors.add(new exceptionWrapper(new classLevelException(wrapper.getName(),charLevel.getKey().a.toString().replace("_"," "))));
					continue;
				}
				if(charLevel.getValue() >20){
					errors.add(new exceptionWrapper(new classLevelException(wrapper.getName(),charLevel.getKey().a.toString().replace("_"," "),20)));

				}
				charTotalLevel = charTotalLevel + charLevel.getValue();

				try{
					wrapper.hasCorrectSubClass(charLevel.getKey().a);
				}catch (CharacterWithoutClassException e){
					errors.add(new exceptionWrapper(e));
				}
			}
			if(charTotalLevel > 20){
				errors.add(new exceptionWrapper(new classLevelException(wrapper.getName())));
			}
			wrapper.setTotalLevel(charTotalLevel);


		}



	}

	public static void setBg(Map<String,semanticResult> resParsing, List<semanticResult> errors){
			Set<String> alreadySetBg = new HashSet<String>();
			for(settingWrapper w : settingChecker.getSettingWrappers().get("Background")){
				bgSetting bg = (bgSetting) w;
				if(resParsing.containsKey(bg.getPgName())){
					if(!alreadySetBg.contains(bg.getPgName())) {
						characterWrapper character = (characterWrapper) resParsing.get(bg.getPgName());
						character.setBackground(bg.getSetting());
						alreadySetBg.add(bg.getPgName());
					}else{
						errors.add(new exceptionWrapper(new multipleBackgroundSettingException(bg.getPgName())));
					}

				}

		}
	}

	public static listOfResults setOptionals(Map<String, semanticResult> resParsing){
			listOfResults res = null;
			List<semanticResult> errors = new ArrayList<semanticResult>();

			setClassLevel(resParsing, errors);
			setBg(resParsing, errors);

			checkLanguages(resParsing,errors);
		if(errors.size()>0)
			res = new listOfResults(errors);
		return res;

	}

		private static void checkLanguages(Map<String, semanticResult> resParsing, List<semanticResult> errors) {

			for(Map.Entry<String,semanticResult> entry : resParsing.entrySet()) {

				characterWrapper wrapper = (characterWrapper) entry.getValue();
				int numLang = wrapper.getLanguages().size();
				int expectedNumLang;
				if(wrapper.getBackground() != null)
					expectedNumLang = wrapper.getRace().getLanguages().length + wrapper.getBackground().getExtraLang() + wrapper.getRace().getExtraLang();
				else
					expectedNumLang= wrapper.getRace().getLanguages().length + wrapper.getRace().getExtraLang();

				if(numLang > expectedNumLang)
					errors.add(new exceptionWrapper(new pgMalformedException("Wrong number of languages for Player '"+wrapper.getName()+"'\nOnly "+(expectedNumLang-wrapper.getRace().getLanguages().length)+" can be specified in 'languages'")));
				if(numLang < expectedNumLang)
					errors.add(new exceptionWrapper(new pgMalformedException("Wrong number of languages for Player '"+wrapper.getName()+"'\n"+(expectedNumLang-wrapper.getRace().getLanguages().length)+" languages must be specified in 'languages'")));
				Set<String> langOccurrence = new HashSet<String>();
				for(String lang : wrapper.getLanguages()){
					if(!langOccurrence.contains(lang))
						langOccurrence.add(lang);
					else {
						String errorMsg = "Repeated language '" + lang + "' for Player '" + wrapper.getName() + "'\nRace languages:";
						for(String s : wrapper.getRace().getLanguages())
							errorMsg = errorMsg + " " + s;

						errors.add(new exceptionWrapper(new pgMalformedException(errorMsg)));
					}
				}
			}
		}

	}
	

