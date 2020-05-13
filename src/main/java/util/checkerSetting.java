
	package util;
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	import parsingExceptions.nameNotExist;
	import wrappers.characterWrapper;
	import wrappers.listOfResults;
	import wrappers.semanticResult;

	public class checkerSetting {
		public static void existName(semanticResult resParsing) {
			List<semanticResult> tempResult = new ArrayList<semanticResult>();
			tempResult=((listOfResults) resParsing).getResults();
			characterWrapper temp=null;
			Set<String> names= new HashSet<String>( settingChecker.getnames());
			Set<String> charac= new HashSet<String>(); 
			boolean flag=false;
			for(int i=0;i<tempResult.size();i++) {
	    		if(tempResult.get(i) instanceof characterWrapper) {
	    			temp=(characterWrapper) tempResult.get(i);
	    			charac.add(temp.getName());
	    		}
	    	}
			Set<String> intersezione = new HashSet<String>(names);
			intersezione.retainAll(charac);
			if(!intersezione.equals(names)) {
				String result="";
				for(String name:names) {
					if(!intersezione.contains(name))
						result = result+" "+name;
				}
				throw new nameNotExist("names" +result+" do not exist");	
		}
	}
	}

