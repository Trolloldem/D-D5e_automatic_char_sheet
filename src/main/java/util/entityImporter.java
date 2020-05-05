package util;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import myLex.digits4Lexer;
import myLex.digits4Parser;
import myLex.digits4Visitor;
import myLex.visitorImpl;
import myLex.visitorImportImpl;
import parsingExceptions.CustomErrorListener;
import parsingExceptions.importException;
import wrappers.semanticResult;

public class entityImporter {
	
	public static semanticResult load(String moduleFileName, String entityName) {
		semanticResult importedEntity = null;
		digits4Lexer lexer;
		try {
			lexer = new digits4Lexer(CharStreams.fromFileName(moduleFileName));
		} catch (IOException e) {
			throw new importException("module " + moduleFileName + " cannot be parsed: " + e.getMessage());
		}
		
		//System.out.println("Loading: " + entityName +" from: " + moduleFileName);
		
        lexer.removeErrorListeners();
        lexer.addErrorListener(CustomErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        digits4Parser parser = new digits4Parser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(CustomErrorListener.INSTANCE);
        digits4Visitor visitor = new visitorImportImpl(parser,entityName);
        digits4Parser.StartContext parserTree = parser.start();
        visitor.visitStart(parserTree);
        
        importedEntity = ((visitorImportImpl) visitor).getImported();
        
        //Se non ho trovato nulla con quel nome
        if(importedEntity == null)
        	throw new importException("module " + moduleFileName + " does not contains: " + entityName);
        	
        return importedEntity;
	}
	
	
}
