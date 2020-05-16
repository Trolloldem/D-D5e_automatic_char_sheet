package parsingExceptions;

import util.lexEnum.Classi;
import util.lexEnum.subClass;

public class CharacterWithoutClassException extends RuntimeException{
    public CharacterWithoutClassException(String name,String pgClass) {

        super("Player '"+name+"' is not a '"+pgClass+"'");
    }

    public CharacterWithoutClassException(String name, Classi pgClass, subClass sub) {

        super("Player '"+name+"' cannot choose a subclass for class '"+pgClass.toString().replace("_"," ")+"': class level too low; level needed: "+pgClass.getSubClassLevel());
    }

    public CharacterWithoutClassException(String name,Classi pgClass) {

        super("Player '"+name+"' must choose a subclass for class '"+pgClass.toString().replace("_"," ")+"; max class level without subclass: "+(pgClass.getSubClassLevel()-1));
    }
}
