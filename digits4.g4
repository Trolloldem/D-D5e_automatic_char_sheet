grammar digits4;

options {
   language = Java;
}



@header{
	package myLex;
	import util.checkStats;
        import util.classChecker; //util è il nome del mio package, chiamalo come vuoi te

}


BLANKSPACE: ' ';
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

LETTER 	: ('a'..'z'|'A'..'Z')+ ;

COLON 	:	':';

BL	:	'\n';

value : (RACES | DIGIT | classVector);

classVector: ('(' classVectorElem ')' );
classVectorElem: (PGCLASS ('->' SUBCLASS)? ',' classVectorElem | PGCLASS ('->' SUBCLASS)?);

PGCLASS : ('Cleric'| 'Paladin' | 'Barbarian');
SUBCLASS : ('Berserker' | 'Totem warrior' | 'Domain of life');

abilities: '(' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ',' DIGIT ',' ')';

alignment: ( LEGALITY BLANKSPACE MORALITY);
MORALITY: 'good' | 'neutral' | 'evil';
LEGALITY: 'lawful' | 'neutral' | 'chaotic' ;


RACES : ('Elf'|'Human'|'Orc'|'Dwarf');

MANDATORY: ('race' | 'hp' | 'archetype' | 'abilities' | 'alignment' | 'skills' | 'languages' | STAT);

STAT	:  (STR | DEX | INT | CHA | CON | WIS);

stats : stat_line BL stat_line BL stat_line BL stat_line BL stat_line BL stat_line;

stat_line: no=STAT COLON valore=DIGIT
		{checkStats.checkStatVal($no.text,$valore);}
	;


sclass 	:	 CLASS COLON (BLANKSPACE)* cl = LETTER
{classChecker.checkClass($cl);}
;

pg : CREATE LETTER (BL)? STARTPG val=stats (BL)? ENDPG;

pgBody : (property (BL)?)*;

property: MANDATORY (BLANKSPACE)* COLON (BLANKSPACE)* value;

start : pgBody;
