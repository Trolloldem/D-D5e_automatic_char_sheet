package parsingExceptions;

public class classLevelException extends RuntimeException{
    public classLevelException(String name,String pgClass){

         super("Player '"+name+"' has class '"+pgClass+"' without a level defined");
    }

    public classLevelException(String name,String pgClass,int level){

        super("Player '"+name+"' has class '"+pgClass+"' with level above 20");
    }

    public classLevelException(String name){

        super("Player '"+name+"' has a player level above 20");
    }
}
