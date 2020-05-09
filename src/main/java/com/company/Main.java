package com.company;

import myLex.*;
import org.antlr.v4.runtime.*;
import parsingExceptions.CustomErrorListener;
import wrappers.semanticResult;

class Scan{
    public void example() {
        try{
        String fileIn = Main.BASEPATH + "example.txt";
        digits4Lexer lexer = new digits4Lexer(CharStreams.fromFileName(fileIn));
        lexer.removeErrorListeners();
        lexer.addErrorListener(CustomErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        digits4Parser parser = new digits4Parser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(CustomErrorListener.INSTANCE);
        digits4Visitor<semanticResult> visitor = new visitorImpl(parser);
        digits4Parser.StartContext parserTree = parser.start();
        semanticResult resParsing = visitor.visitStart(parserTree);
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
	a.example();
    }
}
