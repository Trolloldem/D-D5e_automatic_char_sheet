package parsingExceptions;

public class multipleLevelSettingException extends RuntimeException{
    public multipleLevelSettingException(String name, String pgClass){
        super("The level of the class '"+pgClass+"' of Player '"+name+"' has multiple settings: only 1 setting is allowed");
    }
}
