package parsingExceptions;

public class cannotSetActiveException extends RuntimeException{
    public cannotSetActiveException(String name,String equip){
        super("Cannot set '"+equip+"' as active equipment for Player '"+name+"': does not have this equipment");
    }
    public cannotSetActiveException(String name,String equip,Boolean flag){
        super("Cannot set '"+equip+"' as active equipment for Player '"+name+"': multiple active equipments setted");
    }
}
