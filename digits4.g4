grammar digits4;

options {
   language = Java;
}



@header{
	package myLex;

}


BLANKSPACE: ' ';
WS: BLANKSPACE BLANKSPACE -> skip;
TAB: '\t'->skip;
BLANKORTAB: (BLANKSPACE | TAB | WS);
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

BL	:	('\n' | '\r\n');

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

PGCLASS : ('Barbarian'|
           'Bard'|
           'Cleric'|
           'Druid'|
           'Monk'|
           'Paladin'|
           'Ranger'|
           'Rogue'|
           'Sorcerer'|
           'Warlock'|
           'Wizard');
SUBCLASS : ('Berserker'|
            'Path of the Totem warrior'|
            'College of Lore'|
            'College of Valor'|
            'Knowledge Domain'|
            'Life Domain'|
            'Light Domain'|
            'Nature Domain'|
            'Tempest Domain'|
            'Trickery Domain'|
            'War Domain'|
            'Circle of the land'|
            'Circle of the moon'|
            'Champion'|
            'Battle master'|
            'Eldritch knight'|
            'Way of the open hand'|
            'Way of shadow'|
            'Way of the four elements'|
            'Oath of devotion'|
            'Oath of the ancients'|
            'Oath of vengeance'|
            'Hunter'|
            'Beast master'|
            'Thief'|
            'Assassin'|
            'Arcane trickster'|
            'Dragonic bloodline'|
            'Wild magic'|
            'The fiend'|
            'The great old one'|
            'the archfey'|
            'School of abjuration'|
            'School of conjuration'|
            'School of divination'|
            'School of enchantment'|
            'School of evocation'|
            'School of illusion'|
            'School of necromancy'|
            'School of transmutation');

abilities: '(' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ')';

ALIGNMENT: 'lawful good' | 'lawful neutral' | 'lawful evil' |
           'neutral good' | 'neutral' | 'neutral evil' |
           'chaotic good' | 'chaotic neutral' | 'chaotic evil';

skills: '(' SKILL ',' SKILL ')';
SKILL: 'Acrobatics' | 'Animal Handling' | 'History';

languages: '('LANGUAGE (',' LANGUAGE)?')';
LANGUAGE: 'Common' | 'Elfic' | 'Abissal';

RACES : ('Dragonborn'|'Dwarf'|'Elf'|'Gnome' | 'Half Elf'| 'Halfling'|'Half Orc'|'Human'|'Tiefling');

mandatory: ( RACE | HP | ARCHTYPE | ABILITY | ALIGN | SKILLSID | LANG | statID);

statID	:  (STR | DEX | INT | CHA | CON | WIS);

stats : stat_line BL stat_line BL stat_line BL stat_line BL stat_line BL stat_line;

stat_line: no=statID COLON valore=DIGIT;

sclass 	:	 CLASS COLON (BLANKSPACE)* cl = LETTER;


pgDefition : CREATE BLANKSPACE PLAYER BLANKSPACE LETTER STARTENTITY BL
             ((property BL  property BL property BL property BL property BL property BL property ) |
             (property BL property BL property BL property BL property BL property BL property BL property BL property BL property BL property BL property ))
             BL ENDENTITY;
equipDefinition: CREATE BLANKSPACE EQUIPMENT BLANKSPACE LETTER STARTENTITY BL
                 equipPiece BL equipPiece BL equipPiece BL equipPiece
                 BL ENDENTITY;

equipPiece: (BLANKORTAB)* piece (BLANKSPACE)* COLON (BLANKSPACE)* pieceValue;
property: (BLANKORTAB)* mandatory (BLANKSPACE)* COLON (BLANKSPACE)* value;

entity : (pgDefition | equipDefinition);

start : (entity BL)+;


LETTER 	: ('a'..'z'|'A'..'Z')+ ;