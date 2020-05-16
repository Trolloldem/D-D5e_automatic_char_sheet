package util;



import org.antlr.v4.runtime.Token;
import myLex.ddmLangParser;
import parsingExceptions.notSubclassException;
import util.lexEnum.Classi;
import util.lexEnum.subClass;
import wrappers.semanticResult;


public class classChecker implements semanticResult {

	public static void check(ddmLangParser.ClassVectorElemContext ctx) {
    	Object mandaToryChild = ctx.getChild(0).getPayload();
    	Token mandatoryToken = (Token) mandaToryChild;
    	String C = ctx.PGCLASS().getText();
    	Classi TempClasse = Classi.valueOf(C);
    	boolean flag=false;
    	if(ctx.SUBCLASS()!= null) {
    		String S = ctx.SUBCLASS().getText();
    		S = S.replace(' ','_');
    		for( Classi check:Classi.values()){
    			if(C.equals(check.name())) {
    				for(subClass tempo:check.getSubClasses()) {
    					if(S.equals(tempo.name())) {

    						flag=true;
    				 }
    			 }
    		 }
    	 	}
    	 	if(flag==false) {
    	 		String s="the subclass is not compatible with the class, please select a one of:"+ "\n";
    	 		for(subClass tempS:TempClasse.getSubClasses())
    				s=s+tempS+"\n";
    	 		s=s.replace("_", " ");
            	throw new notSubclassException(s);
    	}
    	}
    }
	
}
  