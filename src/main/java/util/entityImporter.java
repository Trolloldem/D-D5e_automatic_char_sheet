package util;

import java.io.File;
import java.io.IOException;

import myLex.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parsingExceptions.CustomErrorListener;
import parsingExceptions.importException;
import wrappers.semanticResult;

public class entityImporter {
	
	public static semanticResult load(String moduleFileName, String entityName) {
		semanticResult importedEntity = null;
        ddmLangLexer lexer;
		try {
			lexer = new ddmLangLexer(CharStreams.fromFileName(moduleFileName));
		} catch (IOException e) {
			throw new importException("module " + moduleFileName + " cannot be parsed: " + e.getMessage());
		}
		
		//System.out.println("Loading: " + entityName +" from: " + moduleFileName);
		
        lexer.removeErrorListeners();
        lexer.addErrorListener(CustomErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ddmLangParser parser = new ddmLangParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(CustomErrorListener.INSTANCE);
        ddmLangVisitor visitor = new visitorImportImpl(parser,entityName);
        ddmLangParser.StartContext parserTree = parser.start();
        visitor.visitStart(parserTree);
        
        importedEntity = ((visitorImportImpl) visitor).getImported();
        
        //Se non ho trovato nulla con quel nome
        if(importedEntity == null)
        	throw new importException("module " + moduleFileName + " does not contains: " + entityName);
        	
        return importedEntity;
	}
	
	
}
