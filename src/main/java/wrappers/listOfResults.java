package wrappers;

import wrappers.semanticResult;

import java.util.ArrayList;
import java.util.List;

public class listOfResults implements semanticResult {

    private List<semanticResult> results;

    public listOfResults(List<semanticResult> list){
        results=list;
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

    @Override
    public String toString() {
        return results.toString();
    }
}
