package util;

//import org.antlr.runtime.Token;
import javafx.util.Pair;
import myLex.digits4BaseVisitor;
import myLex.digits4Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class checkStats extends digits4BaseVisitor<String> {
    private static int pos=0;
    private static Map<String,Integer> statsMap = new HashMap<String,Integer>();

    public static Pair<String,Integer> checkStatVal(String stat,Token op){

        if (Integer.parseInt(op.getText())>20){
            System.err.println("La statistica definita nella linea: "+op.getLine()+" ha un valore non valido(Valore: "+op.getText()+"; valori attesi: min:0, max:20)");
            return new Pair<String,Integer>(stat, new Integer(Integer.parseInt(op.getText())));
        }
        return new Pair<String,Integer>(stat, new Integer(Integer.parseInt(op.getText())));

    };

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     *
     * @param ctx
     */
    @Override
    public String visitStat_line(digits4Parser.Stat_lineContext ctx) {
        System.out.println("Sono nel visitor, ctx ha "+ctx.no.getText());
        visitChildren(ctx);
        return ctx.no.getText();
    }
}
