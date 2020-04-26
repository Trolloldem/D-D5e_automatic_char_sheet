package myLex;

import com.sun.javafx.css.Rule;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import propertyExceptions.malformedProperty;

import javax.xml.bind.PropertyException;

public class visitorImpl<T> extends digits4BaseVisitor<T>{
    digits4Parser parser;

   public visitorImpl(digits4Parser parser){
      this.parser = parser;
   }




    @Override
    public T visitProperty(@NotNull digits4Parser.PropertyContext ctx) {

       checkValidProperty(ctx.mandatory(),ctx.value());
       return visitChildren(ctx);
   }


   private Boolean checkPropertyToken(int mandatoryTokenType, int valueTokenType,Token mandatoryToken) throws PropertyException {

       if (mandatoryTokenType == parser.getTokenType("RACE")){
           if(valueTokenType == parser.getTokenType("RACES")){
            return true;
           }else{
               throw new PropertyException("IL VALORE DELLA RAZZA DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È PRESENTE NEL MANUALE");
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
               throw new PropertyException("IL VALORE DELLA STATISTICA DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È UN NUMERO");
           }
       }
       if (mandatoryTokenType == parser.getTokenType("RACE")){
           if(valueTokenType == parser.getTokenType("RACES")){
               return true;
           }else{
               throw new PropertyException("IL VALORE DELLA RAZZA DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È PRESENTE NEL MANUALE");
           }
       }
       if(mandatoryTokenType == parser.getTokenType("ARCHTYPE")){
           throw new PropertyException("LA CLASSE DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È ESPRESSA NEL FORMATO CORRETTO");
       }

       if(mandatoryTokenType == parser.getTokenType("ABILITY")){

               throw new PropertyException("LE STATISTICHE DEFINITE NELLA RIGA "+mandatoryToken.getLine()+" NON SONO ESPRESSE NEL FORMATO CORRETTO");

       }

       if(mandatoryTokenType == parser.getTokenType("SKILLSID")){

               throw new PropertyException("LE ABILITÀ DEFINITE NELLA RIGA "+mandatoryToken.getLine()+" NON SONO ESPRESSE NEL FORMATO CORRETTO");

       }
       if(mandatoryTokenType == parser.getTokenType("LANG")){

               throw new PropertyException("I LINGUAGGI DEFINITI NELLA RIGA "+mandatoryToken.getLine()+" NON PRESENTI NEL MANUALE");

       }
       if (mandatoryTokenType == parser.getTokenType("ALIGN")){
           throw new PropertyException("L'ALLINEAMENTO DEFINITO NELLA RIGA "+mandatoryToken.getLine()+" NON È PRESENTE NEL MANUALE");
       }
       return false;
   }

    private Boolean checkPropertyContext(int mandatoryTokenType, Object valueChild, Token mandatoryToken) throws PropertyException {

       if(mandatoryTokenType == parser.getTokenType("ARCHTYPE")){
           if(valueChild instanceof digits4Parser.ClassVectorContext){
               return true;
           }else{
               throw new PropertyException("LA CLASSE DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È ESPRESSA NEL FORMATO CORRETTO");
           }
       }

        if(mandatoryTokenType == parser.getTokenType("ABILITY")){
            if(valueChild instanceof digits4Parser.AbilitiesContext){
                return true;
            }else{
                throw new PropertyException("LE STATISTICHE DEFINITE NELLA RIGA "+mandatoryToken.getLine()+" NON SONO ESPRESSE NEL FORMATO CORRETTO");
            }
        }

        if(mandatoryTokenType == parser.getTokenType("SKILLSID")){
            if(valueChild instanceof digits4Parser.SkillsContext){
                return true;
            }else{
                throw new PropertyException("LE ABILITÀ DEFINITE NELLA RIGA "+mandatoryToken.getLine()+" NON SONO ESPRESSE NEL FORMATO CORRETTO");
            }
        }
        if(mandatoryTokenType == parser.getTokenType("LANG")){
            if(valueChild instanceof digits4Parser.LanguagesContext){
                return true;
            }else{
                throw new PropertyException("I LINGUAGGI DEFINITI NELLA RIGA "+mandatoryToken.getLine()+" NON PRESENTI NEL MANUALE");
            }
        }

        if (mandatoryTokenType == parser.getTokenType("ALIGN")){
            if(valueChild instanceof digits4Parser.AlignmentContext){
             return true;
            }else {
                throw new PropertyException("L'ALLINEAMENTO DEFINITO NELLA RIGA " + mandatoryToken.getLine() + " NON È PRESENTE NEL MANUALE");
            }
        }

        if (mandatoryTokenType == parser.getTokenType("RACE")){
                throw new PropertyException("IL VALORE DELLA RAZZA DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È PRESENTE NEL MANUALE");

        }
        if (mandatoryTokenType == parser.getTokenType("HP")){
            throw new PropertyException("IL VALORE DELLA STATISTICA DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È UN NUMERO");
        }
        return false;
    }


    private Boolean checkValidProperty(digits4Parser.MandatoryContext mandatory, digits4Parser.ValueContext value) {
        try {
            if(mandatory.getChildCount()>1 || value.getChildCount()>1){
                throw new malformedProperty("Wrong number of children nodes");
            }

            //Recupero il child della regola 'mandatory' e ne verifico il tipo
            Object mandaToryChild = mandatory.getChild(0).getPayload();
            Object valueChild = value.getChild(0).getPayload();
            if(mandaToryChild instanceof Token){
                Token mandatoryToken = (Token) mandaToryChild;
                int  mandatoryTokenType = mandatoryToken.getType();
                if(valueChild instanceof Token){
                    int valueTokenType = ((Token) valueChild).getType();
                    return checkPropertyToken(mandatoryTokenType, valueTokenType,mandatoryToken);
                }
                if(valueChild instanceof RuleContext){
                    return checkPropertyContext(mandatoryTokenType,  valueChild, mandatoryToken);
                }

            }
            if(mandaToryChild instanceof digits4Parser.StatIDContext){
                digits4Parser.StatIDContext mandatoryContext = (digits4Parser.StatIDContext) mandaToryChild;
                Token mandatoryToken = (Token) mandatoryContext.getChild(0).getPayload();
                if(valueChild instanceof Token) {
                    int valueTokenType = ((Token) valueChild).getType();
                    return checkPropertyToken(mandatoryToken.getType(), valueTokenType,mandatoryToken);

                }
                if(valueChild instanceof RuleContext){
                    throw new PropertyException("IL VALORE DELLA STATISTICA DEFINITA NELLA RIGA "+mandatoryToken.getLine()+" NON È UN NUMERO");
                }
            }

        }catch(Exception e){
            System.err.println(e);
            return false;
        }
        return false;
    }


    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     *
     * @param ctx
     */
    @Override
    public T visitMandatory(digits4Parser.MandatoryContext ctx) {

        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     *
     * @param ctx
     */
    @Override
    public T visitStatID(digits4Parser.StatIDContext ctx) {
        return super.visitStatID(ctx);
    }
}
