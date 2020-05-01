package myLex;

import org.antlr.v4.runtime.misc.NotNull;
import util.propertyChecker;
import util.classChecker;
import util.pgChecker;
import wrappers.characterWrapper;

import java.util.concurrent.ExecutionException;

public class visitorImpl<T> extends digits4BaseVisitor<T>{
    digits4Parser parser;

   public visitorImpl(digits4Parser parser){
      this.parser = parser;
   }

    @Override
    public T visitClassVectorElem(digits4Parser.ClassVectorElemContext ctx) {
      // String classe = ctx.PGCLASS().getText();
      // if(ctx.SUBCLASS()!= null) {
       //    String sottoClasse = ctx.SUBCLASS().getText();
           classChecker.check(ctx);
     //  }
        return visitChildren(ctx);
    }

    @Override
    public T visitProperty(@NotNull digits4Parser.PropertyContext ctx) {
            propertyChecker.checkValidProperty(ctx.mandatory(),ctx.value(), parser);
            return visitChildren(ctx);

   }

    @Override
    public T visitPgDefition(digits4Parser.PgDefitionContext ctx) {
       try{
           visitChildren(ctx);
          characterWrapper pg = pgChecker.checkPgDefinition(ctx.property(),ctx.LETTER().getText(),parser);
       } catch (Exception e) {
           System.err.println(e);
           return null;
       }
       return null;
    }
}
