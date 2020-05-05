package myLex;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import com.company.Main;

import parsingExceptions.importException;
import util.*;
import wrappers.characterWrapper;
import wrappers.equipWrapper;
import wrappers.listOfResults;
import wrappers.semanticResult;

import java.io.File;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.List;

public class visitorImportImpl extends digits4BaseVisitor<semanticResult>{
    digits4Parser parser;
    String entityName;
    Object imported;
    
   public visitorImportImpl(digits4Parser parser,String entityName){
      this.parser = parser;
      this.entityName = entityName;
      this.imported = null;
   }
   	
    @Override
    public semanticResult visitClassVectorElem(digits4Parser.ClassVectorElemContext ctx) {

           classChecker.check(ctx);

        return visitChildren(ctx);
    }

    @Override
    public semanticResult visitProperty(@NotNull digits4Parser.PropertyContext ctx) {
            propertyChecker.checkValidProperty(ctx.mandatory(),ctx.value(), parser);
            return visitChildren(ctx);

   }

    @Override
    public semanticResult visitPgDefition(digits4Parser.PgDefitionContext ctx) {
        characterWrapper pg = null;
       try{
           visitChildren(ctx);
           if(ctx.LETTER().getText().equals(entityName)) {
        	   pg = pgChecker.checkPgDefinition(ctx.property(),ctx.LETTER().getText(),parser);
        	   imported = pg;
           }
       } catch (Exception e) {
           System.err.println(e);
           return null;
       }
       return  pg;
    }
    
    @Override
    public semanticResult visitEquipDefinition(digits4Parser.EquipDefinitionContext ctx) {
        equipWrapper eq= null;
       try{
	    	visitChildren(ctx);
	    	if(ctx.LETTER().getText().equals(entityName)) {
	    		eq =  equipChecker.check(ctx,ctx.LETTER().getText());	
	    		imported = eq;
	    	}
    	} catch (Exception e) {
			System.err.println(e);
		}
    	return  eq;
    }

    @Override
    public semanticResult visitEntity(digits4Parser.EntityContext ctx) {
        semanticResult entity = visitChildren(ctx);

        return entity;
    }

    @Override
    public semanticResult visitStart(digits4Parser.StartContext ctx) {
        List<semanticResult> prova = new ArrayList<semanticResult>();
        for(int i = 0; i < ctx.getChildCount() && shouldVisitNextChild(ctx, null); ++i) {
            ParseTree c = ctx.getChild(i);
            semanticResult res = visit(c);
            if(res != null)
                prova.add(res);
        }
        listOfResults aggregateResult = new listOfResults(prova);
        System.out.println(aggregateResult);
       return null;
    }
    
    public Object getImported() {
    	return this.imported;
    }
}
