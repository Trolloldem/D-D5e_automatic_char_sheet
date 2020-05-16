package resultValidators;

import util.settingChecker;
import wrappers.exceptionWrapper;
import wrappers.listOfResults;
import wrappers.semanticResult;
import wrappers.settings.levelSetting;
import wrappers.settings.settingWrapper;

import java.util.Map;

public class errorPrinter {
    public static boolean print(semanticResult resParsing){
        boolean errorPrinted = false;
        if(resParsing!=null) {


            if (((listOfResults) resParsing).getResults().get(0) instanceof exceptionWrapper) {
                System.err.println(resParsing);
                errorPrinted = true;
            }
        }
        return errorPrinted;
    }

    public static boolean print(Map<String,semanticResult> resParsing){

        boolean errorPrinted = false;

        for(Map.Entry<String,semanticResult> res : resParsing.entrySet()){
            if(res.getValue() instanceof exceptionWrapper){
                System.err.println(res.getValue());
                errorPrinted = true;
            }
        }

        return errorPrinted;
    }
}
