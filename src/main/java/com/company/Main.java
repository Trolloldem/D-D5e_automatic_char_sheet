package com.company;

import myLex.*;
import org.antlr.v4.runtime.*;

class Scan{
    public void example() {
        try{
        String fileIn = "/home/oldem/IdeaProjects/D_and_D_Compiler/src/main/java/com/company/example.txt";
        digits4Lexer lexer = new digits4Lexer(CharStreams.fromFileName(fileIn));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        digits4Parser parser = new digits4Parser(tokens);
        digits4Visitor visitor = new visitorImpl(parser);
        visitor.visitStart(parser.start());
        }catch(Exception e){
            System.out.println(e);
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
