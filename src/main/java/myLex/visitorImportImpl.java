package myLex;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import com.company.Main;

import parsingExceptions.equipMalformedException;
import parsingExceptions.importException;
import parsingExceptions.pgMalformedException;
import util.*;
import wrappers.*;

import java.io.File;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.List;

public class visitorImportImpl extends ddmLangBaseVisitor<semanticResult>{
    ddmLangParser parser;
    String entityName;
    semanticResult imported;
    
   public visitorImportImpl(ddmLangParser parser,String entityName){
      this.parser = parser;
      this.entityName = entityName;
      this.imported = null;
   }
   	
    @Override
    public semanticResult visitClassVectorElem(ddmLangParser.ClassVectorElemContext ctx) {

           classChecker.check(ctx);

        return visitChildren(ctx);
    }

    @Override
    public semanticResult visitProperty(@NotNull ddmLangParser.PropertyContext ctx) {
            propertyChecker.checkValidProperty(ctx.mandatory(),ctx.value(), parser);
            return visitChildren(ctx);

   }

    @Override
    public semanticResult visitPgDefition(ddmLangParser.PgDefitionContext ctx) {
        semanticResult pg = null;
        List<semanticResult> errors = new ArrayList<semanticResult>();
        for(int i = 0; i < ctx.getChildCount() && shouldVisitNextChild(ctx, null); ++i) {
            ParseTree c = ctx.getChild(i);
            try {
                visit(c);
            }catch (Exception e){

                errors.add( new exceptionWrapper(e));
            }

        }

        if (errors.size()>0) {

            pgMalformedException newExc = new pgMalformedException("Error during import of '"+entityName+"': previous "+errors.size()+" errors refer to that entity");
            semanticResult ecc = new exceptionWrapper(newExc);
            errors.add(ecc);
            pg = new listOfResults(errors);
        }
        if(pg!= null ){
            imported = pg;
            return pg;
        }
       try{

           if(ctx.LETTER().getText().equals(entityName)) {
        	   pg = pgChecker.checkPgDefinition(ctx.property(),ctx.LETTER().getText(),parser);
        	   imported = pg;
           }
       } catch (Exception e) {
           equipMalformedException newExc = new equipMalformedException("Error during import of '"+entityName+"' :"+e.getMessage());
           imported = new exceptionWrapper(newExc);
       }
       return  pg;
    }
    
    @Override
    public semanticResult visitEquipDefinition(ddmLangParser.EquipDefinitionContext ctx) {
        semanticResult eq= null;
       try{
	    	visitChildren(ctx);
	    	if(ctx.LETTER().getText().equals(entityName)) {
	    		eq =  equipChecker.check(ctx,ctx.LETTER().getText());
	    		if(eq instanceof  listOfResults)
	    		    throw new Exception();
	    		imported = eq;
	    	}
    	} catch (Exception e) {

           equipMalformedException newExc = new equipMalformedException("Error during import of '"+entityName+"', previous "+((listOfResults) eq).getResults().size()+" errors refer to that entity");
           semanticResult ecc = new exceptionWrapper(newExc);
           ((listOfResults) eq).getResults().add(ecc);
           imported = eq;
		}
    	return  eq;
    }

    @Override
    public semanticResult visitEntity(ddmLangParser.EntityContext ctx) {
        semanticResult entity = visitChildren(ctx);
        return entity;
    }

    @Override
    public semanticResult visitLine(ddmLangParser.LineContext ctx) {

        List<semanticResult> prova = new ArrayList<semanticResult>();
        for(int i = 0; i < ctx.getChildCount() && shouldVisitNextChild(ctx, null); ++i) {
            ParseTree c = ctx.getChild(i);
            semanticResult res = visit(c);
            if(res != null)
                prova.add(res);
        }

        if(prova.size()>0)
            return prova.get(0);
        else
            return null;
    }

    @Override
    public semanticResult visitStart(ddmLangParser.StartContext ctx) {
        List<semanticResult> prova = new ArrayList<semanticResult>();
        List<semanticResult> listaEccezioni = new ArrayList<semanticResult>();
        for(int i = 0; i < ctx.getChildCount() && shouldVisitNextChild(ctx, null); ++i) {
            ParseTree c = ctx.getChild(i);
            semanticResult res = visit(c);

            if(res != null && !(res instanceof exceptionWrapper))
                prova.add(res);
            if(res instanceof exceptionWrapper)
                listaEccezioni.add(res);
            if(res instanceof listOfResults){
                listOfResults checkList = (listOfResults) res;
                if (checkList.getResults().get(0) instanceof exceptionWrapper){
                    listaEccezioni.addAll(checkList.getResults());
                }
            }
        }
        listOfResults aggregateResult;
        if(listaEccezioni.size()==0)
             aggregateResult = new listOfResults(prova);
        else
             aggregateResult = new listOfResults(listaEccezioni);

        return aggregateResult;
    }
    
    public semanticResult getImported() {
    	return this.imported;
    }
}
