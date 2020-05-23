package util;


import myLex.ddmLangParser.ConsumableVectorContext;
import myLex.ddmLangParser.ConsumableVectorElemContext;
import myLex.ddmLangParser.EquipDefinitionContext;
import myLex.ddmLangParser.EquipPieceContext;
import myLex.ddmLangParser.PieceContext;
import myLex.ddmLangParser.PieceValueContext;
import parsingExceptions.equipMalformedException;
import util.lexEnum.Armors;
import util.lexEnum.Shields;
import util.lexEnum.Weapons;
import util.lexEnum.Consumables;
import wrappers.equipWrapper;
import wrappers.listOfResults;
import wrappers.semanticResult;
import wrappers.exceptionWrapper;

import java.lang.reflect.Array;
import java.util.*;

public class equipChecker {

	public static semanticResult check(EquipDefinitionContext ctx, String name) {
		Set<String> setted = new HashSet<String>(Arrays.asList(new String[]{"armor", "shield", "weapon", "consumables"}));
		equipWrapper wrapper = new equipWrapper(name);
		List<semanticResult> errors = new ArrayList<>();
		for(EquipPieceContext prop : ctx.equipPiece() ) {
			PieceContext mandatoryChild = prop.piece();
            PieceValueContext value = prop.pieceValue();
            String strValue = value.getText().replaceAll(" ","_"); //Come nel nome degli enumerativi

			String text = mandatoryChild.getText();
			if ("armor".equals(text)) {
				try {
					wrapper.setArmor(Armors.valueOf(strValue));
				}catch (IllegalArgumentException e) {
					errors.add(new exceptionWrapper(new equipMalformedException(value.getText() + " is not a valid armor", prop.getStart().getLine())));
				}
				setted.remove("armor");
			}
			if ("shield".equals(text)) {
				try {
					wrapper.setShield(Shields.valueOf(strValue));
				}catch (IllegalArgumentException e) {
					errors.add(new exceptionWrapper(new equipMalformedException(value.getText() + " is not a valid shield", prop.getStart().getLine())));
				}
				setted.remove("shield");
			}
			if ("weapon".equals(text)) {
				try {
					wrapper.setWeapon(Weapons.valueOf(strValue));
				}catch (IllegalArgumentException e) {
					errors.add(new exceptionWrapper(new equipMalformedException(value.getText() + " is not a valid weapon", prop.getStart().getLine())));
				}
				setted.remove("weapon");
			}
			if ("consumables".equals(text)) {
				if (strValue.equals("None"))
					continue;

				ConsumableVectorContext consumableList = value.consumableVector();
				ConsumableVectorElemContext consumableElem = null;
				if(consumableList == null){
					errors.add(new exceptionWrapper(new equipMalformedException(value.getText() + " is not a valid consumable", prop.getStart().getLine())));
				}else
					consumableElem = consumableList.consumableVectorElem();
				while (consumableElem != null) {
					Consumables consumable = null;
					try {
						consumable = Consumables.valueOf(consumableElem.CONSUMABLE().getText().replace(" ", "_"));
					}catch (IllegalArgumentException e) {
						errors.add(new exceptionWrapper(new equipMalformedException(value.getText() + " is not a valid consumable", prop.getStart().getLine())));
					}
					Integer digit = new Integer(consumableElem.DIGIT().getText());

					if (digit < 1)
						errors.add(new exceptionWrapper(new equipMalformedException("You can't have " + digit + " " + consumableElem.CONSUMABLE().getText(), prop.getStart().getLine())));
					consumableElem = consumableElem.consumableVectorElem();

					wrapper.addConsumable(consumable, digit);
				}
				setted.remove("consumables");
			}
		}
		if(setted.size()>0){
			errors.add(new exceptionWrapper(new equipMalformedException("Equipments: "+wrapper.getName()+" misses the following properties: "+setted)));
		}
		if (errors.size()>0){
			listOfResults res = new listOfResults(errors);
			return res;
		}
		return wrapper;
	}
}
