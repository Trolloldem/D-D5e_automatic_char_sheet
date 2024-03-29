package wrappers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import parsingExceptions.sameNameException;

public class listOfResults implements semanticResult {

     List<semanticResult> results;

    public listOfResults(List<semanticResult> list){
        results=list;
        checkName(results);
        checkEquipName(results);
        
    }

    public listOfResults(){
        results=new ArrayList<semanticResult>();
    }

    public void setResults(List<semanticResult> results) {
        this.results = results;
    }

    public  List<semanticResult> getResults() {
        return results;
    }

    public void checkName(List<semanticResult> results) {
    	List<String> ListName = new ArrayList<String>();
    	characterWrapper temp;
    	String error = "";
    	boolean flag=false;
    	for(int i=0;i<results.size();i++) {
    		if(results.get(i) instanceof characterWrapper) {
    			temp=(characterWrapper) results.get(i);
    			ListName.add(temp.getName());
    		}
    	}
    	Set<String> result = new HashSet<String>();
    	Set<String> Duplicate = new HashSet<String>();
    	for(int i=0;i<ListName.size();i++) {
    		 if (!result.add(ListName.get(i))) {
    			 flag=true;
    			 if (Duplicate.add(ListName.get(i)))
    				 error=error+ListName.get(i)+"\n";
    		 }
    	}
    	if(flag==true) {
    		throw new sameNameException("multiple player have the same name: " + error);
    	}
    }
    
    public void checkEquipName(List<semanticResult> results) {
    	List<String> ListEquipName = new ArrayList<String>();
    	equipWrapper temp;
    	String error = "";
    	boolean flag=false;
    	for(int i=0;i<results.size();i++) {
    		if(results.get(i) instanceof equipWrapper) {
    			temp=(equipWrapper) results.get(i);
    			ListEquipName.add(temp.getName());
    		}
    	}
    	Set<String> result = new HashSet<String>();
    	Set<String> Duplicate = new HashSet<String>();
    	for(int i=0;i<ListEquipName.size();i++) {
    		 if (!result.add(ListEquipName.get(i))) {
    			 flag=true;
    			 if (Duplicate.add(ListEquipName.get(i)))
    				 error=error+ListEquipName.get(i)+"\n";
    		 }
    	}
    	if(flag==true) {
    		throw new sameNameException("multiple equipment have the same name: " + error);
    	}
    	
    }
    
    
    @Override
    public String toString() {

    	if(results.size()>0){
    		if(!(results.get(0) instanceof exceptionWrapper))
    			return results.toString();
		}
		String toReturn = "";
        for(semanticResult res : results){
        	toReturn = toReturn + res +"\n";
		}
        return toReturn;

    }
}
