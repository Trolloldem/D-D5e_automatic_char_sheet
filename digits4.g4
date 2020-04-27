grammar digits4;

options {
   language = Java;
}



@header{
	package myLex;
	//import util.checkStats;
        //import util.classChecker; //util è il nome del mio package, chiamalo come vuoi te

}


BLANKSPACE: ' ';
WS: BLANKSPACE BLANKSPACE -> skip;
DIGIT
	:	('0'..'9')+
	;
STR 	:	('STR')
;
DEX 	:	('DEX')
;
CHA 	:	('CHA')
;
INT 	:	('INT')
;
CON 	:	('CON')
;
WIS 	:	('WIS')
;

STARTENTITY : '{';
ENDENTITY :   '}';
CREATE:   'create';
PLAYER: 'Player';
EQUIPMENT: 'Equipment';



COLON 	:	':';

BL	:	'\n'->skip;

RACE: ('race');
HP: ('hp');
ARCHTYPE: ('archetype');
ABILITY: ('abilities');
ALIGN: ('alignment');
SKILLSID: ('skills');
LANG: ('languages');

ARMOR:    'armor';
WEAPON: 'weapon';
SHIELD: 'shield';
CONSUMABLES: 'consumables';

ARMORTYPE: ('Half plate' | 'Full plate' | NONE);
WEAPONTYPE: ('Bastard sword' | 'Axe' | NONE);
SHIELDPRESENCE: ('Yes' | 'No');
NONE: 'None';
CONSUMABLE: ('Health potion' | 'Mana potion' | 'Gold');
piece: (ARMOR | WEAPON | SHIELD | CONSUMABLES);
pieceValue: (ARMORTYPE | WEAPONTYPE | SHIELDPRESENCE | consumableVector );

consumableVector:   NONE |('(' consumableVectorElem ')' );
consumableVectorElem: (CONSUMABLE '*' DIGIT',' consumableVectorElem | CONSUMABLE '*' DIGIT);

value : (RACES | DIGIT | classVector | abilities |ALIGNMENT | skills | languages);

classVector: ('(' classVectorElem ')' );
classVectorElem: (PGCLASS ('->' SUBCLASS)? ',' classVectorElem | PGCLASS ('->' SUBCLASS)?);

PGCLASS : ('Cleric'| 'Paladin' | 'Barbarian');
SUBCLASS : ('Berserker' | 'Totem warrior' | 'Domain of life');

abilities: '(' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ')';

ALIGNMENT: 'lawful good' | 'lawful neutral' | 'lawful evil' |
           'neutral good' | 'neutral' | 'neutral evil' |
           'chaotic good' | 'chaotic neutral' | 'chaotic evil';

skills: '(' SKILL ',' SKILL ')';
SKILL: 'Acrobatics' | 'Animal Handling' | 'History';

languages: '('LANGUAGE (',' LANGUAGE)?')';
LANGUAGE: 'Common' | 'Elfic' | 'Abissal';

RACES : ('Elf'|'Human'|'Orc'|'Dwarf');

mandatory: ( RACE | HP | ARCHTYPE | ABILITY | ALIGN | SKILLSID | LANG | statID);

statID	:  (STR | DEX | INT | CHA | CON | WIS);

stats : stat_line BL stat_line BL stat_line BL stat_line BL stat_line BL stat_line;

stat_line: no=statID COLON valore=DIGIT;

sclass 	:	 CLASS COLON (BLANKSPACE)* cl = LETTER;


pgDefition : CREATE BLANKSPACE PLAYER BLANKSPACE LETTER STARTENTITY BL
             ((property (BL)  property (BL) property (BL) property (BL) property (BL) property (BL) property ) |
             (property (BL) property (BL) property (BL) property (BL) property (BL) property (BL) property (BL) property (BL) property (BL) property (BL) property (BL) property ))
             BL ENDENTITY;
equipDefinition: CREATE BLANKSPACE EQUIPMENT BLANKSPACE LETTER STARTENTITY BL
                 equipPiece BL equipPiece BL equipPiece BL equipPiece
                 BL ENDENTITY;

equipPiece: piece (BLANKSPACE)* COLON (BLANKSPACE)* pieceValue;
property: mandatory (BLANKSPACE)* COLON (BLANKSPACE)* valore=value;

entity : (pgDefition | equipDefinition);

start : (entity BL)+;


LETTER 	: ('a'..'z'|'A'..'Z')+ ;