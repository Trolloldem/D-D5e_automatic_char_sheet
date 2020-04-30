package myLex;

import org.antlr.v4.runtime.misc.NotNull;
import util.propertyChecker;

public class visitorImpl<T> extends digits4BaseVisitor<T>{
    digits4Parser parser;

   public visitorImpl(digits4Parser parser){
      this.parser = parser;
   }




    @Override
    public T visitProperty(@NotNull digits4Parser.PropertyContext ctx) {
       propertyChecker.checkValidProperty(ctx.mandatory(),ctx.value(), parser);
       return visitChildren(ctx);
   }





}
