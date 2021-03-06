grammar ddmLang;

options {
   language = Java;
}



@header{
	package myLex;

}


BLANKSPACE: ' ';
WS: ((BLANKSPACE BLANKSPACE) | '\t')-> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;

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
IMPORT: 'import';
FROM: 'from';
SET : 'set';
FOR : 'for';
OF : 'of';

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

ARMORTYPE: (
'Padded'|
'Leather'|
'Studded leather'|
'Hide'|
'Chain shirt'|
'Scale mail'|
'Breastplate'|
'Half plate'|
'Ring mail'|
'Chain mail'|
'Splint'|
'Plate' |
NONE);
WEAPONTYPE: ('Bastard sword' | 'Axe' | 'Dagger' | 'Longbow' | NONE);
SHIELDPRESENCE: ('Yes' | 'No');
NONE: 'None';
CONSUMABLE: ('Health potion' | 'Mana potion' | 'Gold');

ALIGNMENT: 'lawful good' | 'lawful neutral' | 'lawful evil' |
           'neutral good' | 'neutral' | 'neutral evil' |
           'chaotic good' | 'chaotic neutral' | 'chaotic evil';

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

SKILL:
         'Acrobatics' |
         'Animal Handling' |
         'Arcana'|
         'Athletics'|
         'Deception' |
         'History' |
         'Insight' |
         'Intimidation' |
         'Investigation' |
         'Medicine'|
         'Nature' |
         'Perception' |
         'Performance'|
         'Persuasion' |
         'Religion' |
         'Sleight of Hand' |
         'Stealth' |
         'Survival';

BACKGROUND:
'Acolyte' |
'Charlatan'|
'Criminal'|
'Entertainer'|
'Folk Hero'|
'Gladiator'|
'Guild Artisan'|
'Guild Merchant'|
'Hermit'|
'Knight'|
'Noble'|
'Outlander'|
'Pirate'|
'Sage'|
'Sailor'|
'Soldier'|
'Spy'|
'Urchin';


LANGUAGE: 'Common' | 'Draconic' | 'Infernal' | 'Dwarvish' | 'Elvish' | 'Gnomish' | 'Orc' | 'Halfling' ;

RACES : ('Dragonborn'|'Dwarf'|'Elf'|'Gnome' | 'Half Elf'| 'Halfling'|'Half Orc'|'Human'|'Tiefling');

OPTIONAL : ('Description' | 'Level' | 'Background' | 'Items' | 'Active Equipment');
ACCENT : ('\u00e1' | '\u00c1' |
          '\u00e9' | '\u00c9' |
          '\u00ed'| '\u00cd'|
          '\u00f3' |'\u00d3'|
          '\u00fa'| '\u00da' |
          '\u00e0' |'\u00c0'|
          '\u00e8' |'\u00c8'|
          '\u00ec' |'\u00cc'|
          '\u00f2' |'\u00d2'|
          '\u00f9' |'\u00d9'
          );
LETTER 	: ('a'..'z'|'A'..'Z')+ ;


optionalValue : (description | DIGIT | BACKGROUND | LETTER);
toSet : (PGCLASS);
description : '"'(.*? | ACCENT)'"';

piece: (ARMOR | WEAPON | SHIELD | CONSUMABLES);
pieceValue: (ARMORTYPE | WEAPONTYPE | SHIELDPRESENCE | consumableVector );

consumableVector:   NONE |('(' consumableVectorElem ')' );
consumableVectorElem: (CONSUMABLE '*' DIGIT',' consumableVectorElem | CONSUMABLE '*' DIGIT);

value : (RACES | DIGIT | classVector | abilities |ALIGNMENT | skills | languages);

classVector: ('(' classVectorElem ')' );
classVectorElem: (PGCLASS ('->' SUBCLASS)? ',' classVectorElem | PGCLASS ('->' SUBCLASS)?);



abilities: '(' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ')';

skills: '(' SKILL ',' SKILL (',' SKILL)? (',' SKILL)? (',' SKILL)?')';


languages: '('(LANGUAGE)? (',' LANGUAGE)?  (',' LANGUAGE)?')';




mandatory: ( RACE | HP | ARCHTYPE | ABILITY | ALIGN | SKILLSID | LANG | statID);

statID	:  (STR | DEX | INT | CHA | CON | WIS);

pgDefition : CREATE BLANKSPACE PLAYER BLANKSPACE LETTER STARTENTITY BL
             property BL property BL property BL property BL property BL property BL property (BL property BL property BL property BL property BL property)?
             BL ENDENTITY;
equipDefinition: CREATE BLANKSPACE EQUIPMENT BLANKSPACE LETTER STARTENTITY BL
                 equipPiece BL equipPiece BL equipPiece BL equipPiece
                 BL ENDENTITY;

equipPiece: (BLANKSPACE)* piece (BLANKSPACE)* COLON (BLANKSPACE)* pieceValue;
property:  (BLANKSPACE)* mandatory (BLANKSPACE)* COLON (BLANKSPACE)* value;

importData: IMPORT BLANKSPACE LETTER BLANKSPACE FROM BLANKSPACE LETTER;

entity : (pgDefition | equipDefinition);

setting : SET BLANKSPACE OPTIONAL  BLANKSPACE (OF BLANKSPACE toSet BLANKSPACE)? FOR BLANKSPACE LETTER (BLANKSPACE)*'='(BLANKSPACE)* optionalValue;

line : ((entity | importData | setting) BL) |BL;

start : (line)+EOF;


