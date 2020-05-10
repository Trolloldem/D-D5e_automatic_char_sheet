package myLex;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import com.company.Main;

import parsingExceptions.importException;
import util.*;
import wrappers.*;

import java.io.File;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.List;

//TODO: Per ogni classe bisogna controllare che non ho già definito il relativo pg o equipaggiamento
public class visitorImpl extends ddmLangBaseVisitor<semanticResult>{
    ddmLangParser parser;

   public visitorImpl(ddmLangParser parser){
      this.parser = parser;
   }

   
   	@Override public semanticResult visitImportData(ddmLangParser.ImportDataContext ctx) {
   		String fileName = ctx.LETTER(1).getText() + ".ddm";
   		String moduleFileName = com.company.Main.BASEPATH + fileName;
   		String entityName = ctx.LETTER(0).getText();

        semanticResult importedEntity = entityImporter.load(moduleFileName, entityName);
		return importedEntity; //Non fa nulla, non ho children nell' import
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
        characterWrapper pg = null;
       try{
           visitChildren(ctx);
            pg = pgChecker.checkPgDefinition(ctx.property(),ctx.LETTER().getText(),parser);
       } catch (Exception e) {
           System.err.println(e);
           return new exceptionWrapper();
       }
       return  pg;
    }
    
    @Override
    public semanticResult visitEquipDefinition(ddmLangParser.EquipDefinitionContext ctx) {
        equipWrapper eq= null;
       try{
	    	visitChildren(ctx);
	    	eq =  equipChecker.check(ctx,ctx.LETTER().getText());	    	
    	} catch (Exception e) {
			System.err.println(e);
			return new exceptionWrapper();
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
        for(int i = 0; i < ctx.getChildCount() && shouldVisitNextChild(ctx, null); ++i) {
            ParseTree c = ctx.getChild(i);
            semanticResult res = visit(c);
            if(res != null && !(res instanceof exceptionWrapper))
                prova.add(res);
            if(res instanceof exceptionWrapper)
                return null;
        }
        listOfResults aggregateResult = new listOfResults(prova);
        return aggregateResult;
    }

    @Override
    public semanticResult visitSetting(ddmLangParser.SettingContext ctx) {
        return visitChildren(ctx);
    }
}
