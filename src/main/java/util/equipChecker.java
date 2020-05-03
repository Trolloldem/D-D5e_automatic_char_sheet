package util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;

import myLex.digits4Parser;
import myLex.digits4Parser.ClassVectorContext;
import myLex.digits4Parser.ConsumableVectorContext;
import myLex.digits4Parser.ConsumableVectorElemContext;
import myLex.digits4Parser.EquipDefinitionContext;
import myLex.digits4Parser.EquipPieceContext;
import myLex.digits4Parser.PieceContext;
import myLex.digits4Parser.PieceValueContext;
import myLex.digits4Parser.PropertyContext;
import parsingExceptions.equipMalformedException;
import parsingExceptions.pgMalformedException;
import util.lexEnum.Armors;
import util.lexEnum.Classi;
import util.lexEnum.Shields;
import util.lexEnum.Weapons;
import util.lexEnum.subClass;
import util.lexEnum.Consumables;
import wrappers.equipWrapper;
public class equipChecker {

	public static equipWrapper check(EquipDefinitionContext ctx, String name) {
		equipWrapper wrapper = new equipWrapper(name);
		
		for(EquipPieceContext prop : ctx.equipPiece() ) {
			PieceContext mandatoryChild = prop.piece();
            PieceValueContext value = prop.pieceValue();
            String strValue = value.getText().replaceAll(" ","_"); //Come nel nome degli enumerativi
            
            switch(mandatoryChild.getText()) {
            case "armor": 
            	wrapper.setArmor(Armors.valueOf(strValue));
            	break;
            	
            case "shield":
            	wrapper.setShield(Shields.valueOf(strValue));
            	break;
            	
            case "weapon":
            	wrapper.setWeapon(Weapons.valueOf(strValue));
            	break;
            
            case "consumables":
            	if(strValue.equals("None"))
            		break;
            	
            	ConsumableVectorContext consumableList = value.consumableVector();
            	ConsumableVectorElemContext consumableElem = consumableList.consumableVectorElem();
            	while(consumableElem != null){
            		Consumables consumable = Consumables.valueOf(consumableElem.CONSUMABLE().getText().replace(" ", "_"));
            		Integer digit = new Integer(consumableElem.DIGIT().getText());
            		
            		if(digit <= 1)
            			throw new equipMalformedException("You can't have " + digit + " " + consumableElem.CONSUMABLE().getText(),prop.getStart().getLine());
            		consumableElem = consumableElem.consumableVectorElem();
            		
            		wrapper.addConsumable(new Pair<Consumables, Integer>(consumable, digit));
            	}
            	
            	break;
            	
            default:
            	throw new equipMalformedException("The piece: " + mandatoryChild.getText() + " does not exist",prop.getStart().getLine());
            }
		}
		return wrapper;
	}
}
