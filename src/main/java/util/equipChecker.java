package util;


import myLex.digits4Parser.ConsumableVectorContext;
import myLex.digits4Parser.ConsumableVectorElemContext;
import myLex.digits4Parser.EquipDefinitionContext;
import myLex.digits4Parser.EquipPieceContext;
import myLex.digits4Parser.PieceContext;
import myLex.digits4Parser.PieceValueContext;
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
				wrapper.setArmor(Armors.valueOf(strValue));
			}
			if ("shield".equals(text)) {
				wrapper.setShield(Shields.valueOf(strValue));
			}
			if ("weapon".equals(text)) {
				wrapper.setWeapon(Weapons.valueOf(strValue));
			}
			if ("consumables".equals(text)) {
				if (strValue.equals("None"))
					continue;

				ConsumableVectorContext consumableList = value.consumableVector();
				ConsumableVectorElemContext consumableElem = consumableList.consumableVectorElem();
				while (consumableElem != null) {
					Consumables consumable = Consumables.valueOf(consumableElem.CONSUMABLE().getText().replace(" ", "_"));
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
