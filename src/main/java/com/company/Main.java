package com.company;

import myLex.*;
import org.antlr.v4.runtime.*;
import parsingExceptions.CustomErrorListener;

class Scan{
    public void example() {
        try{
        String fileIn = "./src/main/java/com/company/example.txt";
        digits4Lexer lexer = new digits4Lexer(CharStreams.fromFileName(fileIn));
        lexer.removeErrorListeners();
        lexer.addErrorListener(CustomErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        digits4Parser parser = new digits4Parser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(CustomErrorListener.INSTANCE);
        digits4Visitor visitor = new visitorImpl(parser);
        digits4Parser.StartContext parserTree = parser.start();
        visitor.visitStart(parserTree);
        }catch(Exception e){
            System.err.println(e);
            return;
        }
    }

}


public class Main {

    public static void main(String[] args) {
	Scan a = new Scan();
	a.example();
    }
}
