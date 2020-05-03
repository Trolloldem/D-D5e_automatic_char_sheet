package myLex;

import org.antlr.v4.runtime.misc.NotNull;
import util.propertyChecker;
import util.classChecker;
import util.pgChecker;
import wrappers.characterWrapper;
import wrappers.equipWrapper;
import util.equipChecker;

public class visitorImpl<T> extends digits4BaseVisitor<T>{
    digits4Parser parser;

   public visitorImpl(digits4Parser parser){
      this.parser = parser;
   }

    @Override
    public T visitClassVectorElem(digits4Parser.ClassVectorElemContext ctx) {

           classChecker.check(ctx);

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

    @Override
    public T visitEquipDefinition(digits4Parser.EquipDefinitionContext ctx) {
        try{
            visitChildren(ctx);
            equipWrapper equip = equipChecker.checkEquipDefinition(ctx.equipPiece(),ctx.LETTER().getText(),parser);
System.out.println(equip);
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
        return null;

    }
}
