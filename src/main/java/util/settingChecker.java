package util;


import myLex.ddmLangParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import parsingExceptions.setMalformedException;
import util.lexEnum.Backgrounds;
import util.lexEnum.Classi;
import wrappers.settings.*;

public class settingChecker {

    private static final int DESC_MAX_LEN = 250;

    public static List<String> names=new ArrayList<String>();
    public static List<String> equipNames=new ArrayList<String>();
    public static Map<String,List<settingWrapper>> settingWrappers = new HashMap<String,List<settingWrapper>>();

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
                addSetting( Classi.valueOf(ctx.toSet().getText().replace(" ","_")),ctx.LETTER().getText(),Integer.parseInt(((Token) child).getText()));
                break;
            case "Description":

                if(child instanceof Token){

                    throw new setMalformedException("Wrong format for Description setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". Text for descriptions starts with \"");
                }
                if(((ddmLangParser.DescriptionContext) child).getText().length()>DESC_MAX_LEN){
                    throw new setMalformedException("Wrong format for Description setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". The description is too long. Max "+DESC_MAX_LEN+" characters");
                }
                addSetting("Description", ctx.LETTER().getText(),((Token) child).getText());
                break;
            case "Background":
                if(!(child instanceof Token)){

                    throw new setMalformedException("Wrong format for Background setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". The background specified is not part of the manual");
                }else{
                    Token childToken = (Token) child;
                    if(!(childToken.getType() == parser.getTokenType("BACKGROUND")))
                        throw new setMalformedException("Wrong format for Background setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". The background specified is not part of the manual");
                }
                addSetting("Background", ctx.LETTER().getText(), Backgrounds.valueOf(((Token) child).getText().replace(" ","_")));
                break;
            case "Items":
                if(!(child instanceof Token)){

                    throw new setMalformedException("Wrong format for Items setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". The equipment specified must be a name of an Equipment");
                }else{
                    Token childToken = (Token) child;
                    if(!(childToken.getType() == parser.getTokenType("LETTER")))
                        throw new setMalformedException("Wrong format for Items setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". The equipment specified must be a name of an Equipment");
                }
                addEquipNames(((Token) child).getText());
                addSetting("Items", ctx.LETTER().getText(),((Token) child).getText());
                break;
            case "Active Equipment":
                if(!(child instanceof Token)){

                    throw new setMalformedException("Wrong format for Active Equipment setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". The equipment specified must be a name of an Equipment");
                }else{
                    Token childToken = (Token) child;
                    if(!(childToken.getType() == parser.getTokenType("LETTER")))
                        throw new setMalformedException("Wrong format for Active Equipment setting at line: "+ctx.OPTIONAL().getSymbol().getLine()+". The equipment specified must be a name of an Equipment");
                }
                addEquipNames(((Token) child).getText());
                addSetting("Active Equipment", ctx.LETTER().getText(),((Token) child).getText());
                break;
        }
        addname(ctx.LETTER().getText());
    }
    private static void addname(String s) {
		names.add(s);
    }
    public static List<String> getEquipNames() {
		return equipNames;
	}
	private static void addEquipNames(String tempItem) {
		equipNames.add(tempItem);
	}
	public static List<String> getnames() {
    	return names;
    }

    private static void addSetting(Classi pgClass,String pgName, Integer level){
        if(!settingWrappers.containsKey("Level"))
            settingWrappers.put("Level",new ArrayList<settingWrapper>());
        settingWrapper levelSettingWrapp = new levelSetting(pgName,level,pgClass);

        settingWrappers.get("Level").add(levelSettingWrapp);


    }

    private static <T> void addSetting(String type, String pgName, T val){
        settingWrapper toAdd = null;
        String key = null;
        switch (type){
            case "Description":
                if(val instanceof String) {
                    if(!settingWrappers.containsKey("Description"))
                        settingWrappers.put("Description",new ArrayList<settingWrapper>());
                    key = "Description";
                    toAdd = new descrSetting(pgName, (String) val);
                }
                break;
            case "Background":
                if(val instanceof Backgrounds) {
                    if(!settingWrappers.containsKey("Background"))
                        settingWrappers.put("Background",new ArrayList<settingWrapper>());
                    key = "Background";
                    toAdd = new bgSetting(pgName, (Backgrounds) val);
                }
                break;
            case "Items":
                if(val instanceof String) {
                    if(!settingWrappers.containsKey("Items"))
                        settingWrappers.put("Items",new ArrayList<settingWrapper>());
                    key = "Items";
                    toAdd = new itemsSetting(pgName, (String) val);
                }
                break;
            case "Active Equipment":
                if(val instanceof String) {
                    if(!settingWrappers.containsKey("Active Equipment"))
                        settingWrappers.put("Active Equipment",new ArrayList<settingWrapper>());
                    key = "Active Equipment";
                    toAdd = new activeSetting(pgName, (String) val);
                }
                break;
        }
        if (toAdd != null)
            settingWrappers.get(key).add(toAdd);
    }

    public static Map<String,List<settingWrapper>> getSettingWrappers(){
        return settingWrappers;
    }
}