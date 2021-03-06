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

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


class Scan{
    public void executeParsing(String fileIn) {
        try{

            if(fileIn == null)
                fileIn = Main.BASEPATH + "example.txt";
            else
                fileIn = System.getProperty("user.dir")+"/"+fileIn;

            ddmLangLexer lexer = new ddmLangLexer(CharStreams.fromFileName(fileIn));
            lexer.removeErrorListeners();
            lexer.addErrorListener(CustomErrorListener.INSTANCE);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
                ddmLangParser parser = new ddmLangParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(CustomErrorListener.INSTANCE);
            ddmLangVisitor<semanticResult> visitor = new visitorImpl(parser);
            ddmLangParser.StartContext parserTree = parser.start();
            if(CustomErrorListener.INSTANCE.errors.size()>0){
                for(ParseCancellationException e : CustomErrorListener.INSTANCE.errors)
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
                    listOfResults settingErrors = checkerSetting.setOptionals(mappaPgNames,mappaEquipNames);
                    if(errorPrinter.print(settingErrors))
                        return;
                }else
                    return;
            }else
                return;

            ddmProducer.produceDocument(mappaPgNames, mappaEquipNames, new String[] {});




        }catch(Exception e){
            e.printStackTrace();
            return;
        }
    }

}


public class Main {

	public static final String BASEPATH = "./src/main/java/com/company/";
    public static boolean checkArgs= false;
    private static String helpString = "Welcome to the D&D Automatic Charsheet Compiler.\n" +
                                        "In order to compile your charsheet, you have to provide a ddm or .txt file written in DDM.\n" +
                                        "This file must be inside your current folder, together the other files used for the imports.\n" +
                                        "Example:" +
                                        "java -jar DD_Automatic_Charsheet_Compiler.jar example.txt";
	public static void main(String[] args) {

	Scan a = new Scan();
	if(args.length>0 && args[0]!= null) {
	    if(Arrays.stream(args)
                .filter( arg -> {
	                return arg.equals("-help") || arg.equals("-h");
                })
                .collect(Collectors.toSet()).size()>0) {
            System.out.println(helpString);
	        return;
        }
        checkArgs = true;
        a.executeParsing(args[0]);

    }
	else
        a.executeParsing(null);
	
    }
}
