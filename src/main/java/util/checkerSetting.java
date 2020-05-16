
	package util;
	import java.util.*;

	import org.antlr.v4.runtime.misc.Pair;
	import parsingExceptions.CharacterWithoutClassException;
	import parsingExceptions.classLevelException;
	import parsingExceptions.multipleLevelSettingException;
	import parsingExceptions.nameNotExist;
	import util.lexEnum.Classi;
	import util.lexEnum.subClass;
	import wrappers.*;
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

	public static listOfResults setOptionals(Map<String, semanticResult> resParsing){
			listOfResults res = null;
			List<semanticResult> errors = new ArrayList<semanticResult>();

			setClassLevel(resParsing, errors);

		if(errors.size()>0)
			res = new listOfResults(errors);
		return res;

	}
	
}
	

