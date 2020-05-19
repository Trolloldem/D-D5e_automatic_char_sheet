package util;

import java.io.File;
import java.io.IOException;

import myLex.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parsingExceptions.CustomErrorListener;
import parsingExceptions.importException;
import wrappers.exceptionWrapper;
import wrappers.semanticResult;

public class entityImporter {
	
	public static semanticResult load(String moduleFileName, String entityName) {
		semanticResult importedEntity = null;
        ddmLangLexer lexer;
		try {
			lexer = new ddmLangLexer(CharStreams.fromFileName(moduleFileName));
		} catch (IOException e) {
            return new exceptionWrapper(new importException("module " + moduleFileName + " cannot be parsed: " + e.getMessage()));
		}
		
		//System.out.println("Loading: " + entityName +" from: " + moduleFileName);
		CustomErrorListener errList = new CustomErrorListener(moduleFileName);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errList);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ddmLangParser parser = new ddmLangParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errList);
        ddmLangVisitor visitor = new visitorImportImpl(parser,entityName);
        ddmLangParser.StartContext parserTree = parser.start();
        if(errList.errors.size()>0) {
            String errorMsg = ("module " + moduleFileName + " has parsing errors in "+entityName+":\n");
            for(Exception e : errList.errors){
                errorMsg = errorMsg + e.getMessage()+"\n";
            }
            return new exceptionWrapper(new importException(errorMsg));
        }
        visitor.visitStart(parserTree);
        
        importedEntity = ((visitorImportImpl) visitor).getImported();
        
        //Se non ho trovato nulla con quel nome
        if(importedEntity == null)
            return new exceptionWrapper(new importException("module " + moduleFileName + " does not contains: " + entityName));
        	
        return importedEntity;
	}
	
	
}
