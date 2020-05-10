package util;


import myLex.ddmLangParser;
import org.antlr.v4.runtime.Token;
import parsingExceptions.setMalformedException;

public class settingChecker {

    private static final int DESC_MAX_LEN = 250;

    public static void checkSettingFormat(ddmLangParser.SettingContext ctx, ddmLangParser parser){
        if(!ctx.OPTIONAL().getText().equals("Level") && ctx.OF()!=null){
            throw new setMalformedException("Setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+" presents 'of'.Only Level settings can have 'of' inside");
        }

        if(ctx.OPTIONAL().getText().equals("Level") && ctx.OF() == null){
            throw new setMalformedException("Wrong format for Level setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". Level settings must have 'of' inside");
        }
        Object child = ctx.optionalValue().getChild(0).getPayload();
        switch (ctx.OPTIONAL().getText()){
            case "Level":

                if(!(child instanceof Token)){

                    throw new setMalformedException("Wrong format for Level setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". Level value must be a number");
                }else{
                    Token childToken = (Token) child;
                    if(!(childToken.getType() == parser.getTokenType("DIGIT")))
                        throw new setMalformedException("Wrong format for Level setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". Level value must be a number");
                }
            case "Description":

                if(child instanceof Token){

                    throw new setMalformedException("Wrong format for Description setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". Text for descriptions starts with \"");
                }
                if(((ddmLangParser.DescriptionContext) child).getText().length()>DESC_MAX_LEN){
                    throw new setMalformedException("Wrong format for Description setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". The description is too long. Max "+DESC_MAX_LEN+" characters");
                }
            case "Background":
                if(!(child instanceof Token)){

                    throw new setMalformedException("Wrong format for Background setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". The background specified is not part of the manual");
                }else{
                    Token childToken = (Token) child;
                    if(!(childToken.getType() == parser.getTokenType("BACKGROUND")))
                        throw new setMalformedException("Wrong format for Background setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". The background specified is not part of the manual");
                }
            case "Items":
                if(!(child instanceof Token)){

                    throw new setMalformedException("Wrong format for Items setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". The equipment specified must be a name of an Equipment");
                }else{
                    Token childToken = (Token) child;
                    if(!(childToken.getType() == parser.getTokenType("LETTER")))
                        throw new setMalformedException("Wrong format for Items setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". The equipment specified must be a name of an Equipment");
                }
        }
    }

}
