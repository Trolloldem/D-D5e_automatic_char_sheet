package wrappers;

import wrappers.semanticResult;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import parsingExceptions.sameName;

public class listOfResults implements semanticResult {

    private List<semanticResult> results;

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

    public List<semanticResult> getResults() {
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
    	Set result = new HashSet();
    	Set Duplicate = new HashSet();
    	for(int i=0;i<ListName.size();i++) {
    		 if (!result.add(ListName.get(i))) {
    			 flag=true;
    			 if (Duplicate.add(ListName.get(i)))
    				 error=error+ListName.get(i)+"\n";
    		 }
    	}
    	if(flag==true) {
    		throw new sameName("multiple Player have the same name: \n" + error);
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
    	Set result = new HashSet();
    	Set Duplicate = new HashSet();
    	for(int i=0;i<ListEquipName.size();i++) {
    		 if (!result.add(ListEquipName.get(i))) {
    			 flag=true;
    			 if (Duplicate.add(ListEquipName.get(i)))
    				 error=error+ListEquipName.get(i)+"\n";
    		 }
    	}
    	if(flag==true) {
    		throw new sameName("multiple Equipment have the same name: \n" + error);
    	}
    }
    
    
    @Override
    public String toString() {
        return results.toString();
    }
}
