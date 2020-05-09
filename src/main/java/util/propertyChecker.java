package util;

import myLex.ddmLangParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import parsingExceptions.malformedPropertyException;


public class propertyChecker {



    private static Boolean checkPropertyToken(int mandatoryTokenType, int valueTokenType, Token mandatoryToken,ddmLangParser parser) throws malformedPropertyException {

        if (mandatoryTokenType == parser.getTokenType("RACE")){
            if(valueTokenType == parser.getTokenType("RACES")){
                return true;
            }else{
                throw new malformedPropertyException("The vale for the race specified in the line: "+mandatoryToken.getLine()+" is not part of the manual");
            }
        }
        if (mandatoryTokenType == parser.getTokenType("HP") ||
                mandatoryTokenType == parser.getTokenType("STR") ||
                mandatoryTokenType == parser.getTokenType("DEX") ||
                mandatoryTokenType == parser.getTokenType("INT") ||
                mandatoryTokenType == parser.getTokenType("CHA") ||
                mandatoryTokenType == parser.getTokenType("WIS") ||
                mandatoryTokenType == parser.getTokenType("CON")){
            if(valueTokenType == parser.getTokenType("DIGIT")){
                return true;
            }else{
                throw new malformedPropertyException("The ability score specified at line: "+mandatoryToken.getLine()+" is not a number");
            }
        }

        if(mandatoryTokenType == parser.getTokenType("ARCHTYPE")){
            throw new malformedPropertyException("The class specified at line: "+mandatoryToken.getLine()+" is not in the correct format");
        }

        if(mandatoryTokenType == parser.getTokenType("ABILITY")){

            throw new malformedPropertyException("The ability scores specified at line: "+mandatoryToken.getLine()+" are not in the correct format");

        }

        if(mandatoryTokenType == parser.getTokenType("SKILLSID")){

            throw new malformedPropertyException("The skills specified at line: "+mandatoryToken.getLine()+" are not in the correct format");

        }
        if(mandatoryTokenType == parser.getTokenType("LANG")){

            throw new malformedPropertyException("The languages specified at line: "+mandatoryToken.getLine()+" are not in the correct format");

        }
        if (mandatoryTokenType == parser.getTokenType("ALIGN")){
            if(valueTokenType == parser.getTokenType("ALIGNMENT")){
                return true;
            }else {
                throw new malformedPropertyException("The alignment specified at line " + mandatoryToken.getLine() + " is not part of the manual");
            }
        }
        return false;
    }

    private static Boolean checkPropertyContext(int mandatoryTokenType, Object valueChild, Token mandatoryToken,ddmLangParser parser) throws malformedPropertyException {

        if(mandatoryTokenType == parser.getTokenType("ARCHTYPE")){
            if(valueChild instanceof ddmLangParser.ClassVectorContext){
                return true;
            }else{
                throw new malformedPropertyException("The class specified at line: "+mandatoryToken.getLine()+" is not in the correct format");
            }
        }

        if(mandatoryTokenType == parser.getTokenType("ABILITY")){
            if(valueChild instanceof ddmLangParser.AbilitiesContext){
                return true;
            }else{
                throw new malformedPropertyException("The ability scores specified at line: "+mandatoryToken.getLine()+" are not in the correct format");
            }
        }

        if(mandatoryTokenType == parser.getTokenType("SKILLSID")){
            if(valueChild instanceof ddmLangParser.SkillsContext){
                return true;
            }else{
                throw new malformedPropertyException("The skills specified at line: "+mandatoryToken.getLine()+" are not in the correct format");
            }
        }
        if(mandatoryTokenType == parser.getTokenType("LANG")){
            if(valueChild instanceof ddmLangParser.LanguagesContext){
                return true;
            }else{
                throw new malformedPropertyException("The languages specified at line: "+mandatoryToken.getLine()+" are not in the correct format");
            }
        }

        if (mandatoryTokenType == parser.getTokenType("ALIGN")){
            throw new malformedPropertyException("The alignment specified at line " + mandatoryToken.getLine() + " is not part of the manual");

        }

        if (mandatoryTokenType == parser.getTokenType("RACE")){
            throw new malformedPropertyException("The vale for the race specified in the line: "+mandatoryToken.getLine()+" is not part of the manual");

        }
        if (mandatoryTokenType == parser.getTokenType("HP")){
            throw new malformedPropertyException("The vale for the race specified in the line: "+mandatoryToken.getLine()+" is not part of the manual");
        }
        return false;
    }


    public static Boolean checkValidProperty(ddmLangParser.MandatoryContext mandatory, ddmLangParser.ValueContext value,ddmLangParser parser) throws malformedPropertyException {

            if(mandatory.getChildCount()>1 || value.getChildCount()>1){
                throw new malformedPropertyException("Wrong number of children nodes");
            }

            //Recupero il child della regola 'mandatory' e ne verifico il tipo
            Object mandaToryChild = mandatory.getChild(0).getPayload();
            Object valueChild = value.getChild(0).getPayload();
            if(mandaToryChild instanceof Token){
                Token mandatoryToken = (Token) mandaToryChild;
                int  mandatoryTokenType = mandatoryToken.getType();
                if(valueChild instanceof Token){
                    int valueTokenType = ((Token) valueChild).getType();
                    return checkPropertyToken(mandatoryTokenType, valueTokenType,mandatoryToken, parser);
                }
                if(valueChild instanceof RuleContext){
                    return checkPropertyContext(mandatoryTokenType,  valueChild, mandatoryToken,parser);
                }

            }
            if(mandaToryChild instanceof ddmLangParser.StatIDContext){
                ddmLangParser.StatIDContext mandatoryContext = (ddmLangParser.StatIDContext) mandaToryChild;
                Token mandatoryToken = (Token) mandatoryContext.getChild(0).getPayload();
                if(valueChild instanceof Token) {
                    int valueTokenType = ((Token) valueChild).getType();
                    return checkPropertyToken(mandatoryToken.getType(), valueTokenType,mandatoryToken, parser);

                }
                if(valueChild instanceof RuleContext){
                    throw new malformedPropertyException("The ability score specified at line: "+mandatoryToken.getLine()+" is not a number");
                }
            }
            return false;

    }

}
