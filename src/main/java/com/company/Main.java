package com.company;

import myLex.*;
import org.antlr.v4.runtime.*;
import parsingExceptions.CustomErrorListener;
import util.checkerSetting;
import resultValidators.errorPrinter;
import wrappers.characterWrapper;
import wrappers.listOfResults;
import wrappers.semanticResult;

import java.util.Map;


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

            if(!errorPrinter.print(resParsing)){
                Map<String, semanticResult> mappaPgNames = checkerSetting.existName(resParsing);
                Map<String, semanticResult> mappaEquipNames =checkerSetting.existEquipName(resParsing);
                boolean noErrorsPg = !errorPrinter.print(mappaPgNames);
                boolean noErrorsEquip = !errorPrinter.print(mappaEquipNames);
                if(noErrorsPg && noErrorsEquip) {
                    listOfResults levelErrors = checkerSetting.setClassLevel(mappaPgNames);
                    errorPrinter.print(levelErrors);
                }
            }


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
