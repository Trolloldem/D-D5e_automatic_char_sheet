package util;

import myLex.digits4Parser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import parsingExceptions.malformedPropertyException;


public class propertyChecker {



    private static Boolean checkPropertyToken(int mandatoryTokenType, int valueTokenType, Token mandatoryToken,digits4Parser parser) throws malformedPropertyException {

        if (mandatoryTokenType == parser.getTokenType("RACE")){
            if(valueTokenType == parser.getTokenType("RACES")){
                return true;
            }else{
                throw new malformedPropertyException("IL VALORE DELLA RAZZA DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È PRESENTE NEL MANUALE");
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
                throw new malformedPropertyException("IL VALORE DELLA STATISTICA DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È UN NUMERO");
            }
        }
        if (mandatoryTokenType == parser.getTokenType("RACE")){
            if(valueTokenType == parser.getTokenType("RACES")){
                return true;
            }else{
                throw new malformedPropertyException("IL VALORE DELLA RAZZA DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È PRESENTE NEL MANUALE");
            }
        }
        if(mandatoryTokenType == parser.getTokenType("ARCHTYPE")){
            throw new malformedPropertyException("LA CLASSE DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È ESPRESSA NEL FORMATO CORRETTO");
        }

        if(mandatoryTokenType == parser.getTokenType("ABILITY")){

            throw new malformedPropertyException("LE STATISTICHE DEFINITE NELLA RIGA "+mandatoryToken.getLine()+" NON SONO ESPRESSE NEL FORMATO CORRETTO");

        }

        if(mandatoryTokenType == parser.getTokenType("SKILLSID")){

            throw new malformedPropertyException("LE ABILITÀ DEFINITE NELLA RIGA "+mandatoryToken.getLine()+" NON SONO ESPRESSE NEL FORMATO CORRETTO");

        }
        if(mandatoryTokenType == parser.getTokenType("LANG")){

            throw new malformedPropertyException("I LINGUAGGI DEFINITI NELLA RIGA "+mandatoryToken.getLine()+" NON PRESENTI NEL MANUALE");

        }
        if (mandatoryTokenType == parser.getTokenType("ALIGN")){
            if(valueTokenType == parser.getTokenType("ALIGNMENT")){
                return true;
            }else {
                throw new malformedPropertyException("L'ALLINEAMENTO DEFINITO NELLA RIGA " + mandatoryToken.getLine() + " NON È PRESENTE NEL MANUALE");
            }
        }
        return false;
    }

    private static Boolean checkPropertyContext(int mandatoryTokenType, Object valueChild, Token mandatoryToken,digits4Parser parser) throws malformedPropertyException {

        if(mandatoryTokenType == parser.getTokenType("ARCHTYPE")){
            if(valueChild instanceof digits4Parser.ClassVectorContext){
                return true;
            }else{
                throw new malformedPropertyException("LA CLASSE DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È ESPRESSA NEL FORMATO CORRETTO");
            }
        }

        if(mandatoryTokenType == parser.getTokenType("ABILITY")){
            if(valueChild instanceof digits4Parser.AbilitiesContext){
                return true;
            }else{
                throw new malformedPropertyException("LE STATISTICHE DEFINITE NELLA RIGA "+mandatoryToken.getLine()+" NON SONO ESPRESSE NEL FORMATO CORRETTO");
            }
        }

        if(mandatoryTokenType == parser.getTokenType("SKILLSID")){
            if(valueChild instanceof digits4Parser.SkillsContext){
                return true;
            }else{
                throw new malformedPropertyException("LE ABILITÀ DEFINITE NELLA RIGA "+mandatoryToken.getLine()+" NON SONO ESPRESSE NEL FORMATO CORRETTO");
            }
        }
        if(mandatoryTokenType == parser.getTokenType("LANG")){
            if(valueChild instanceof digits4Parser.LanguagesContext){
                return true;
            }else{
                throw new malformedPropertyException("I LINGUAGGI DEFINITI NELLA RIGA "+mandatoryToken.getLine()+" NON PRESENTI NEL MANUALE");
            }
        }

        if (mandatoryTokenType == parser.getTokenType("ALIGN")){
            throw new malformedPropertyException("L'ALLINEAMENTO DEFINITO NELLA RIGA " + mandatoryToken.getLine() + " NON È PRESENTE NEL MANUALE");

        }

        if (mandatoryTokenType == parser.getTokenType("RACE")){
            throw new malformedPropertyException("IL VALORE DELLA RAZZA DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È PRESENTE NEL MANUALE");

        }
        if (mandatoryTokenType == parser.getTokenType("HP")){
            throw new malformedPropertyException("IL VALORE DELLA STATISTICA DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È UN NUMERO");
        }
        return false;
    }


    public static Boolean checkValidProperty(digits4Parser.MandatoryContext mandatory, digits4Parser.ValueContext value,digits4Parser parser) throws malformedPropertyException {

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
            if(mandaToryChild instanceof digits4Parser.StatIDContext){
                digits4Parser.StatIDContext mandatoryContext = (digits4Parser.StatIDContext) mandaToryChild;
                Token mandatoryToken = (Token) mandatoryContext.getChild(0).getPayload();
                if(valueChild instanceof Token) {
                    int valueTokenType = ((Token) valueChild).getType();
                    return checkPropertyToken(mandatoryToken.getType(), valueTokenType,mandatoryToken, parser);

                }
                if(valueChild instanceof RuleContext){
                    throw new malformedPropertyException("IL VALORE DELLA STATISTICA DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È UN NUMERO");
                }
            }
            return false;

    }

}
