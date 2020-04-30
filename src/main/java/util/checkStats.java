package util;

import javafx.util.Pair;
import myLex.digits4BaseVisitor;
import myLex.digits4Parser;
import org.antlr.v4.runtime.Token;
import java.util.HashMap;
import java.util.Map;

public class checkStats {
    private static int pos=0;
    private static Map<String,Integer> statsMap = new HashMap<String,Integer>();

    public static Pair<String,Integer> checkStatVal(String stat,Token op){

        if (Integer.parseInt(op.getText())>20){
            System.err.println("La statistica definita nella linea: "+op.getLine()+" ha un valore non valido(Valore: "+op.getText()+"; valori attesi: min:0, max:20)");
            return new Pair<String,Integer>(stat, new Integer(Integer.parseInt(op.getText())));
        }
        return new Pair<String,Integer>(stat, new Integer(Integer.parseInt(op.getText())));

    };


}
