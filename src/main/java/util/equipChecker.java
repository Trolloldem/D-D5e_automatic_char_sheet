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
public class equipChecker {

	public static equipWrapper check(EquipDefinitionContext ctx, String name) {
		equipWrapper wrapper = new equipWrapper(name);
		
		for(EquipPieceContext prop : ctx.equipPiece() ) {
			PieceContext mandatoryChild = prop.piece();
            PieceValueContext value = prop.pieceValue();
            String strValue = value.getText().replaceAll(" ","_"); //Come nel nome degli enumerativi

			String text = mandatoryChild.getText();
			if ("armor".equals(text)) {
				try {
					wrapper.setArmor(Armors.valueOf(strValue));
				}catch (IllegalArgumentException e) {
					throw new equipMalformedException(value.getText() + " is not a valid armor", prop.getStart().getLine());
				}
			}
			if ("shield".equals(text)) {
				try {
					wrapper.setShield(Shields.valueOf(strValue));
				}catch (IllegalArgumentException e) {
					throw new equipMalformedException(value.getText() + " is not a valid shield", prop.getStart().getLine());
				}
			}
			if ("weapon".equals(text)) {
				try {
					wrapper.setWeapon(Weapons.valueOf(strValue));
				}catch (IllegalArgumentException e) {
					throw new equipMalformedException(value.getText() + " is not a valid weapon", prop.getStart().getLine());
				}
			}
			if ("consumables".equals(text)) {
				if (strValue.equals("None"))
					continue;

				ConsumableVectorContext consumableList = value.consumableVector();
				ConsumableVectorElemContext consumableElem = consumableList.consumableVectorElem();
				while (consumableElem != null) {
					Consumables consumable = null;
					try {
						consumable = Consumables.valueOf(consumableElem.CONSUMABLE().getText().replace(" ", "_"));
					}catch (IllegalArgumentException e) {
						throw new equipMalformedException(value.getText() + " is not a valid consumable", prop.getStart().getLine());
					}
					Integer digit = new Integer(consumableElem.DIGIT().getText());

					if (digit < 1)
						throw new equipMalformedException("You can't have " + digit + " " + consumableElem.CONSUMABLE().getText(), prop.getStart().getLine());
					consumableElem = consumableElem.consumableVectorElem();

					wrapper.addConsumable(consumable, digit);
				}
			}
		}
		return wrapper;
	}
}
