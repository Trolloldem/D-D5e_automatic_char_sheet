package util;

import myLex.digits4Parser;
import org.antlr.v4.runtime.Token;
import parsingExceptions.equipMalformedException;
import wrappers.equipWrapper;

import java.util.List;

public class equipChecker {
    public static equipWrapper checkEquipDefinition(List<digits4Parser.EquipPieceContext> eqipPiece, String name, digits4Parser parser){
        equipWrapper equip = new equipWrapper(name);
        for(digits4Parser.EquipPieceContext piece : eqipPiece){

            Object pieceOfEquipChild = piece.piece().getChild(0).getPayload();
            Object value = piece.pieceValue().getChild(0).getPayload();
            if(pieceOfEquipChild instanceof Token){
                selectOperation(equip, (Token)pieceOfEquipChild,value, parser);
            }else{
                throw new equipMalformedException("Wrong equipment definition property in line: "+piece.getStart().getLine());
            }

        }
        return equip;
    }

    private static void selectOperation(equipWrapper equip, Token pieceOfEquipChild, Object value, digits4Parser parser) {
        if(pieceOfEquipChild.getType() == parser.getTokenType("ARMOR")){
            equip.setArmor(((Token)value).getText());

        }
        if(pieceOfEquipChild.getType() == parser.getTokenType("WEAPON")){
            equip.setWeapon(((Token)value).getText());
        }
        if(pieceOfEquipChild.getType() == parser.getTokenType("SHIELD")){

            if(((Token)value).getText().equals("Yes")){
                equip.setShield(true);
            }else {
                equip.setShield(false);
            }
        }
        if(pieceOfEquipChild.getType() == parser.getTokenType("SHIELD")){
            //METODO di valerio
        }
    }
}
