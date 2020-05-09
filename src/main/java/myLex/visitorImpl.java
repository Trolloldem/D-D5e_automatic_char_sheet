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
public class visitorImpl extends digits4BaseVisitor<semanticResult>{
    digits4Parser parser;

   public visitorImpl(digits4Parser parser){
      this.parser = parser;
   }

   
   	@Override public semanticResult visitImportData(digits4Parser.ImportDataContext ctx) { 
   		String fileName = ctx.LETTER(1).getText() + ".ddm";
   		String moduleFileName = com.company.Main.BASEPATH + fileName;
   		String entityName = ctx.LETTER(0).getText();

        semanticResult importedEntity = entityImporter.load(moduleFileName, entityName);
		return importedEntity; //Non fa nulla, non ho children nell' import
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
            pg = pgChecker.checkPgDefinition(ctx.property(),ctx.LETTER().getText(),parser);
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
	    	eq =  equipChecker.check(ctx,ctx.LETTER().getText());	    	
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
    public semanticResult visitLine(digits4Parser.LineContext ctx) {
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
    public semanticResult visitStart(digits4Parser.StartContext ctx) {

        List<semanticResult> prova = new ArrayList<semanticResult>();
        for(int i = 0; i < ctx.getChildCount() && shouldVisitNextChild(ctx, null); ++i) {
            ParseTree c = ctx.getChild(i);
            semanticResult res = visit(c);
            if(res != null)
                prova.add(res);
        }
        listOfResults aggregateResult = new listOfResults(prova);
        return aggregateResult;
    }

    @Override
    public semanticResult visitSetting(digits4Parser.SettingContext ctx) {
        return visitChildren(ctx);
    }
}
