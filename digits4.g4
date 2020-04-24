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

value : (races | DIGIT | classVector);

classVector: ('(' classVectorElem ')' );
classVectorElem: (pgClass ('->' subclass)? ',' classVectorElem | pgClass ('->' subclass)?);

pgClass : ('Cleric'| 'Paladin' | 'Barbarian');
subclass : ('Berserker' | 'Totem warrior' | 'Domain of life');

races : ('Elf'|'Human'|'Orc'|'Dwarf');

mandatory: ('race' | 'hp' | 'archetype' | 'abilities' | 'alignment' | 'skills' | 'languages' | stat);

stat	:  (STR | DEX | INT | CHA | CON | WIS);

stats : stat_line BL stat_line BL stat_line BL stat_line BL stat_line BL stat_line;

stat_line: no=stat COLON valore=DIGIT
		{checkStats.checkStatVal($no.text,$valore);}
	;


sclass 	:	 CLASS COLON (BLANKSPACE)* cl = LETTER
{classChecker.checkClass($cl);}
;

pg : CREATE LETTER (BL)? STARTPG val=stats (BL)? ENDPG;

pgBody : (property (BL)?)*;

property: mandatory (BLANKSPACE)* COLON (BLANKSPACE)* value;
