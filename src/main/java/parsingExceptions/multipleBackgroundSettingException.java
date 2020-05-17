package parsingExceptions;

public class multipleBackgroundSettingException extends RuntimeException{
    public multipleBackgroundSettingException(String name){
        super("Player "+name+"'s background is set multiple times");
    }
}
