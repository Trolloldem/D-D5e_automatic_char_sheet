grammar digits4;

options {
   language = Java;
}



@header{
	package myLex;
	//import util.checkStats;
        //import util.classChecker; //util è il nome del mio package, chiamalo come vuoi te

}


BLANKSPACE: ' ' -> skip;
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

CLASS 	: 'Class';
STARTPG : '{';
ENDPG :   '}';
CREATE:   'Create ';



COLON 	:	':';

BL	:	'\n';

RACE: ('race');
HP: ('hp');
ARCHTYPE: ('archetype');
ABILITY: ('abilities');
ALIGN: ('alignment');
SKILLSID: ('skills');
LANG: ('languages');

value : (RACES | DIGIT | classVector | abilities |alignment | skills | languages);

classVector: ('(' classVectorElem ')' );
classVectorElem: (PGCLASS ('->' SUBCLASS)? ',' classVectorElem | PGCLASS ('->' SUBCLASS)?);

PGCLASS : ('Cleric'| 'Paladin' | 'Barbarian');
SUBCLASS : ('Berserker' | 'Totem warrior' | 'Domain of life');

abilities: '(' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ')';

alignment: ( LEGALITY '_'  MORALITY);
MORALITY: 'good' | 'neutral' | 'evil';
LEGALITY: 'lawful' | 'neutral' | 'chaotic' ;

skills: '(' SKILL ',' SKILL ')';
SKILL: 'Acrobatics' | 'Animal Handling' | 'History';

languages: '('LANGUAGE (',' LANGUAGE)?')';
LANGUAGE: 'Common' | 'Elfic' | 'Abissal';

RACES : ('Elf'|'Human'|'Orc'|'Dwarf');

mandatory: ( RACE | HP | ARCHTYPE | ABILITY | ALIGN | SKILLSID | LANG) | statID;

statID	:  (STR | DEX | INT | CHA | CON | WIS);

stats : stat_line BL stat_line BL stat_line BL stat_line BL stat_line BL stat_line;

stat_line: no=statID COLON valore=DIGIT;

sclass 	:	 CLASS COLON (BLANKSPACE)* cl = LETTER;

pg : CREATE LETTER (BL)? STARTPG val=stats (BL)? ENDPG;

pgBody : (property (BL)?)+;

property: mandatory (BLANKSPACE)* COLON (BLANKSPACE)* valore=value;

start : pgBody;


LETTER 	: ('a'..'z'|'A'..'Z')+ ;