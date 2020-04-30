package myLex;

import org.antlr.v4.runtime.misc.NotNull;
import util.propertyChecker;
import util.classChecker;

public class visitorImpl<T> extends digits4BaseVisitor<T>{
    digits4Parser parser;

   public visitorImpl(digits4Parser parser){
      this.parser = parser;
   }

    @Override
    public T visitClassVectorElem(digits4Parser.ClassVectorElemContext ctx) {
       String classe = ctx.PGCLASS().getText();
       String sottoClasse = ctx.SUBCLASS().getText();
       classChecker.check(classe,sottoClasse);
        return super.visitClassVectorElem(ctx);
    }

    @Override
    public T visitProperty(@NotNull digits4Parser.PropertyContext ctx) {
        propertyChecker.checkValidProperty(ctx.mandatory(),ctx.value(), parser);
        return visitChildren(ctx);
   }





}
