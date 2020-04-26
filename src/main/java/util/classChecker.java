package util;


//import org.antlr.runtime.Token;
import org.antlr.v4.runtime.Token;

public class classChecker {

    enum Classi {
        Barbarian,
        Bard,
        Cleric,
        Druid,
        Fighter,
        Monk,
        Paladin,
        Ranger,
        Rogue,
        Sorcerer,
        Warlock,
        Wizard


    }


    public static void checkClass(Token cl){


        for( Classi check:Classi.values()){
            if (cl.getText().equals(check.name())){

                System.out.println("Il personaggio è della classe: "+cl.getText());
                return;

            }
        }
        System.out.println("Il personaggio non di una classe valida");
        return;


        }

    };
