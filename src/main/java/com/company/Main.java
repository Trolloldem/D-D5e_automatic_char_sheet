package com.company;

import myLex.*;
import org.antlr.v4.runtime.*;
import parsingExceptions.CustomErrorListener;
import util.checkerSetting;
import wrappers.exceptionWrapper;
import wrappers.listOfResults;
import wrappers.semanticResult;


class Scan{
    public void executeParsing() {
        try{
        String fileIn = Main.BASEPATH + "example.txt";
            ddmLangLexer lexer = new ddmLangLexer(CharStreams.fromFileName(fileIn));
        lexer.removeErrorListeners();
        lexer.addErrorListener(CustomErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
            ddmLangParser parser = new ddmLangParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(CustomErrorListener.INSTANCE);
            ddmLangVisitor<semanticResult> visitor = new visitorImpl(parser);
            ddmLangParser.StartContext parserTree = parser.start();
        semanticResult resParsing = visitor.visitStart(parserTree);
        checkerSetting.existName(resParsing);
        checkerSetting.existEquipName(resParsing);
        if(((listOfResults)resParsing).getResults().get(0) instanceof exceptionWrapper)
            System.err.println(resParsing);
        else
            System.out.println(resParsing);
        }catch(Exception e){
            System.err.println(e);
            return;
        }
    }

}


public class Main {

	public static final String BASEPATH = "./src/main/java/com/company/";

	public static void main(String[] args) {
	Scan a = new Scan();
	a.executeParsing();
	
    }
}
