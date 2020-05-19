package parsingExceptions;

public class cannotSetActiveException extends RuntimeException{
    public cannotSetActiveException(String name,String equip){
        super("Cannot set '"+equip+"' as active equipment for Player '"+name+"': Ado does not have this equipment");
    }
}
