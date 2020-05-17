package com.company;

import myLex.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import parsingExceptions.CustomErrorListener;
import util.checkerSetting;
import resultValidators.errorPrinter;
import wrappers.listOfResults;
import wrappers.semanticResult;
import documentProducer.ddmProducer;

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
            if(CustomErrorListener.errors.size()>0){
                for(ParseCancellationException e : CustomErrorListener.errors)
                    System.err.println(e);
                return;
            }
            semanticResult resParsing = visitor.visitStart(parserTree);
            Map<String, semanticResult> mappaPgNames = null;
            Map<String, semanticResult> mappaEquipNames = null;
            if(!errorPrinter.print(resParsing)){
                mappaPgNames = checkerSetting.existName(resParsing);
                mappaEquipNames =checkerSetting.existEquipName(resParsing);
                boolean noErrorsPg = !errorPrinter.print(mappaPgNames);
                boolean noErrorsEquip = !errorPrinter.print(mappaEquipNames);
                if(noErrorsPg && noErrorsEquip) {
                    listOfResults settingErrors = checkerSetting.setOptionals(mappaPgNames);
                    errorPrinter.print(settingErrors);
                    return;
                }
            }

            ddmProducer.produceDocument(mappaPgNames, mappaEquipNames);




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
