# Errors
1. [Error phases](#phase)
2. [Parsing errors](#parsing)
3. [Visiting errors](#visit)
4. [Naming errors](#name)
5. [Setting errors](#settings)

## Error phases<a name ="phase"/>
Validation on the provided file follows 4 phases:
1. Parsing validation: the tool check that all the terms inside the file are in the DDM grammar
2. Visiting validation: the tool visit the parsing tree created by the parser. In this phase the validation controls all the semantic
bindings between a property and its value. 
3. Naming validation: the tool controls that all the setting defined refers to existing characters or equipments
4. Setting validation: the tool controls that after the settings defined produce valid effects on the characters

A file must pass a check phase before
being checked by next one. Only files that pass the last phase will be used to create the corresponding PDF files.
All the errors inside a phase will be printed, in this way users can correct all errors of a certain type.



## Parsing errors<a name ="parsing"/>
These errors occur when the file contains terms not included inside the DDM grammar. To avoid
these errors, follow the examples provided in the [guides](SingleChar.md) and in the [vocabolary](vocab.md).
All the parsing errors that have been found during the parsing procedure will be told to the user.
For example, the following code:

        create Plyer myFirstCharacter{
            race: Human
            hp:82
            archetype: (Barbarian->Berserker,Cleric->War Domain)
            abilities:(18,10,15,15,15,15)
            alignment:chaotic good
            skills: (Intimidation,Nature)
            languages: (Elvish)
        }
        
        create Equipment heavyEquip{
            aror:Plate
            shield:Yes
            cnsumables:(Health potion*5,Gold*10)
            weapon:Longbow
        }
        et Level of Barbarian for myFirstCharacter = 10
        set Level of Clric for myFirstCharacter = 5

        
will print the following errors:

        org.antlr.v4.runtime.misc.ParseCancellationException:  line 1:7 no viable alternative at input 'create Plyer'; unexpected token LETTER
        org.antlr.v4.runtime.misc.ParseCancellationException:  line 2:4 extraneous input 'race' expecting {<EOF>, 'create', 'import', 'set', BL}; unexpected token RACE
        org.antlr.v4.runtime.misc.ParseCancellationException:  line 3:4 extraneous input 'hp' expecting {<EOF>, 'create', 'import', 'set', BL}; unexpected token HP
        org.antlr.v4.runtime.misc.ParseCancellationException:  line 4:4 extraneous input 'archetype' expecting {<EOF>, 'create', 'import', 'set', BL}; unexpected token ARCHTYPE
        org.antlr.v4.runtime.misc.ParseCancellationException:  line 5:4 extraneous input 'abilities' expecting {<EOF>, 'create', 'import', 'set', BL}; unexpected token ABILITY
        org.antlr.v4.runtime.misc.ParseCancellationException:  line 6:4 extraneous input 'alignment' expecting {<EOF>, 'create', 'import', 'set', BL}; unexpected token ALIGN
        org.antlr.v4.runtime.misc.ParseCancellationException:  line 7:4 extraneous input 'skills' expecting {<EOF>, 'create', 'import', 'set', BL}; unexpected token SKILLSID
        org.antlr.v4.runtime.misc.ParseCancellationException:  line 8:4 extraneous input 'languages' expecting {<EOF>, 'create', 'import', 'set', BL}; unexpected token LANG
        org.antlr.v4.runtime.misc.ParseCancellationException:  line 9:0 extraneous input '}' expecting {<EOF>, 'create', 'import', 'set', BL}; unexpected token '}'
        org.antlr.v4.runtime.misc.ParseCancellationException:  line 12:4 mismatched input 'aror' expecting {' ', 'armor', 'weapon', 'shield', 'consumables'}; unexpected token LETTER
        org.antlr.v4.runtime.misc.ParseCancellationException:  line 14:4 mismatched input 'cnsumables' expecting {' ', 'armor', 'weapon', 'shield', 'consumables'}; unexpected token LETTER
        org.antlr.v4.runtime.misc.ParseCancellationException:  line 17:0 extraneous input 'et' expecting {<EOF>, 'create', 'import', 'set', BL}; unexpected token LETTER
        org.antlr.v4.runtime.misc.ParseCancellationException:  line 18:13 mismatched input 'Clric' expecting PGCLASS; unexpected token LETTER
        
This type of errors will produce more error than the actual one, for example:

1. at line 1, the only error is the word 'Plyer' instead of 'Player'
2. the errors in the lines from 2 to 9 are not actual errors, but will be presented since the character creation identifier is invalid.

### Common errors
1. As stated in the [vocabolary](vocab.md) the grammar is case sensitive
2. At the end of the file there must be a new line(the tool will ask you for a 'BL' token)


## Visiting errors<a name ="visit"/>
### incorrect subclass:

####notSubclassExcepetion 

this error is called when a subclass of another class is assigned to a class, for example a subclass of clieric is assigned to a barbarian

		archetype: (Barbarian->Domain of life)
this code produces the following message 
		
		parsingExceptions.notSubclassExcepetionthe subclass is not compatible with the 		class, please select a one of:
		Berserker
		Path of the Totem warrior

for resolve this error you need to use a correct subClass
### malformed Property:


#### malformedPropertyException

this error is called when a property is matched with a wrong property value
for example
 
		hp: (Cleric)
		race: 12
		abilities: Half Orc
		
this code produces the following message
	
	parsingExceptions.malformedPropertyException: The vale for the HP specified in the 	line: 2 is not part of the manual
	parsingExceptions.malformedPropertyException: The vale for the race specified in 	the line: 3 is not part of the manual
	parsingExceptions.malformedPropertyException: The ability scores specified at line: 	4 are not in the correct format
	
as we can see we have multiple errors
	
## pgMalformedException

#### duplicated property

this error is called when you miss a property by duplicating another property
for example 

		create Player myFirstCharacter{
		race: Half Orc
		hp: 12
		archetype: (Bard)
		abilities: (15,15,15,15,15,15)
		skills: (History,Religion,Nature,Intimidation)
		hp: 88
		}

in this case we have duplicate hp instead of the alignment, the code produces the following message 

	 parsingExceptions.pgMalformedException: The character named 'myFirstCharacter' 		misses the following properties: [alignment]

for resolve this error you need to inserting the right property
	
#### Wrong Skills

this error is called when you chose a wrong skill for a class, for example 
	
	archetype: (Barbarian)
	skills: (Intimidation,History)
	
in this case we choose the wrong skill for a Barbarian (History), and the code produces the following error message 

		parsingExceptions.pgMalformedException: Player 'myFirstCharacter' has skills not 		permitted by his classes. Permitted skills are: [Survival, Perception, Nature, 		Athletics, Animal_Handling, Intimidation]
		
in this case for resolve this error you need to chose a corrected skill

#### Duplicate skills 

this error is called when you choose the same skill two or more times, for example 

		skills: (Intimidation,Intimidation)

in this case we have choose intimidation twice and we have tho following message

		parsingExceptions.pgMalformedException: The skill 'Intimidation' is specified 		multiple times for Player 'myFirstCharacter'

for resolve this error we need to choose two different skills

#### two skill of multiclass

this error is called when you choose two skills of your subClass, for examle

		archetype: (Barbarian,Bard)
		skills: (History,Religion)

in this case we have choose history and religion and they are a skills of Bard.
So we have the following message 

	parsingExceptions.pgMalformedException: Player 'myFirstCharacter' cannot have more 	than 1 skill provided by his multiclass.

for resolve this error we need to choose a Barbarians's skill


#### too many skills

we have this error when you've chosen too many skills, for example


		skills: (History,Religion,Nature,Intimidation)
		
so we choose four skills and we have the following message		


		parsingExceptions.pgMalformedException: Player 'myFirstCharacter' has the wrong 		number of skills. Number of skills : 3

for resolve this error you need to choose a regular number of skills

#### same class

we have this error when yo've chosen the same class twice, for example

		archetype: (Bard,Bard) 

and we have the following error 

		parsingExceptions.pgMalformedException: The class 'Bard' is specified more than 		1 time for Player 'myFirstCharacter'



## equipMalformedException

#### invalid armor 

this error is called when you put a possible item value in your armor slot, but that value isn't a possible armor, for example

		 armor: Longbow
		 
so, we have the following error 

		parsingExceptions.equipMalformedException: line: 14 Longbow is not a valid armor


for fix this error, you need to put a possible armor's value

#### invalid shield

this error is called when you put a possible item value in your shield slot, but that value isn't a possible shield, for example

		 shield: Plate
		 
so, we have the following error 

		parsingExceptions.equipMalformedException: line: 14 Plate is not a valid armor


for fix this error, you need to put a possible shield's value

#### invalid weapons 

this error is called when you put a possible item value in your weapons slot, but that value isn't a possible weapons, for example

		 shield: Plate
		 
so, we have the following error 

		parsingExceptions.equipMalformedException: line: 17 Plate is not a valid weapon


for fix this error, you need to put a possible weapons's value


#### invalid consumable 

this error is called when you put a possible item value in your consumable slot, but that value isn't a possible consumable, for example

		 shield: Plate
		 
so, we have the following error 

		parsingExceptions.equipMalformedException: line: 17 Plate is not a valid weapon


for fix this error, you need to put a possible consumable's value 

## Naming errors<a name="name"/>
These errors occur when a setting refers to a not existing character or equipment.
For example, the following code:
        
        create Player myFirstCharacter{
            race: Human
            hp:82
            archetype: (Barbarian->Berserker,Cleric->War Domain)
            abilities:(18,10,15,15,15,15)
            alignment:chaotic good
            skills: (Intimidation,Nature)
            languages: (Elvish)
        }
        
        create Equipment heavyEquip{
            armor:Plate
            shield:Yes
            consumables:(Health potion*5,Gold*10)
            weapon:Longbow
        }
        set Level of Barbarian for myFirst = 10
        set Items for myFirstCharacter = myEquip
        set Active Equipment for myFirstCharactr = actiVe
        set Items for myFirstCharacter = heavyEquip

will print the following errors:

        parsingExceptions.nameNotExist: name 'myFirstCharactr' do not exist
        parsingExceptions.nameNotExist: name 'myFirst' do not exist
        parsingExceptions.nameNotExist: equip name 'myEquip' do not exist
        parsingExceptions.nameNotExist: equip name 'actiVe' do not exist
Removing the presented setting or creating the entity printed will solve the error.
## Setting errors<a name = "settings"/>
### Level setting
#### multipleLevelSettingException
If the code presents this 2 lines:

        set Level of Barbarian for myFirstCharacter = 10
        set Level of Barbarian for myFirstCharacter = 10
        
it will print the following error:

        parsingExceptions.multipleLevelSettingException: The level of the class 'Barbarian' of Player 'myFirstCharacter' has multiple settings: only 1 setting is allowed
The solution is removing one of the 2 set entries. 
#### CharacterWithoutClassException
* The following code:

        create Player myFirstCharacter{
            race: Human
            hp:82
            archetype: (Barbarian->Berserker,Cleric->War Domain)
            abilities:(18,10,15,15,15,15)
            alignment:chaotic good
            skills: (Intimidation,Nature)
            languages: (Elvish)
        }
        set Level of Ranger for myFirstCharacter = 10
will print the following error: 

       parsingExceptions.CharacterWithoutClassException: Player 'myFirstCharacter' is not a 'Ranger'
Removing the set entry or adding the class to the character will solve the problem.
 
* The following code:

        create Player myFirstCharacter{
            race: Human
            hp:82
            archetype: (Barbarian->Berserker,Cleric->War Domain)
            abilities:(18,10,15,15,15,15)
            alignment:chaotic good
            skills: (Intimidation,Nature)
            languages: (Elvish)
        }
        set Level of Ranger for myFirstCharacter = 1
will print the following error:
        
        parsingExceptions.CharacterWithoutClassException: Player 'myFirstCharacter' cannot choose a subclass for class 'Barbarian': class level too low; level needed: 3
The solution is to remove the subclass from the class presented inside the error or to increase the class level.

* The following code:

        create Player myFirstCharacter{
            race: Human
            hp:82
            archetype: (Barbarian,Cleric->War Domain)
            abilities:(18,10,15,15,15,15)
            alignment:chaotic good
            skills: (Intimidation,Nature)
            languages: (Elvish)
        }
        set Level of Ranger for myFirstCharacter = 10
will print the following error:

        parsingExceptions.CharacterWithoutClassException: Player 'myFirstCharacter' must choose a subclass for class 'Barbarian; max class level without subclass: 2
Adding the subclass to the class presented or decreasing the class level will solve the problem.

#### classLevelException
* The following code:

        create Player myFirstCharacter{
            race: Human
            hp:82
            archetype: (Barbarian,Cleric->War Domain)
            abilities:(18,10,15,15,15,15)
            alignment:chaotic good
            skills: (Intimidation,Nature)
            languages: (Elvish)
        }
        set Level of Barbarian for myFirstCharacter = 10 
        
will print the following error:

        parsingExceptions.classLevelException: Player 'myFirstCharacter' has class 'Cleric' without a level defined
the solution is removing the class from the character or to add a set level entry for the class.

* The following code:

        create Player myFirstCharacter{
            race: Human
            hp:82
            archetype: (Barbarian,Cleric->War Domain)
            abilities:(18,10,15,15,15,15)
            alignment:chaotic good
            skills: (Intimidation,Nature)
            languages: (Elvish)
        }
        set Level of Barbarian for myFirstCharacter = 22
        
will print the following error:

        parsingExceptions.classLevelException: Player 'myFirstCharacter' has class 'Barbarian' with level above 20
the solution is lowering the level below 20.
* The following code:

        create Player myFirstCharacter{
            race: Human
            hp:82
            archetype: (Barbarian,Cleric->War Domain)
            abilities:(18,10,15,15,15,15)
            alignment:chaotic good
            skills: (Intimidation,Nature)
            languages: (Elvish)
        }
        set Level of Barbarian for myFirstCharacter = 7
        set Level of Cleric for myFirstCharacter = 15
        
will print the following error:

        parsingExceptions.classLevelException: Player 'myFirstCharacter' has a player level above 20
the solution is lowering the level inside the level settings in order to have a total level below 20.

### Background setting
#### multipleBackgroundSettingException
The following code:

        set Background for myFirstCharacter = Acolyte
        set Background for myFirstCharacter = Charlatan
will print the following error:

    parsingExceptions.multipleBackgroundSettingException: Player myFirstCharacter's background is set multiple times
removing one of the repeated background entry will solve the issue.

#### pgMalformedException
The following code:

        create Player myFirstCharacter{
            race: Human
            hp:82
            archetype: (Barbarian,Cleric->War Domain)
            abilities:(18,10,15,15,15,15)
            alignment:chaotic good
            skills: (Intimidation,Survival)
            languages: (Elvish)
        }
        set Background for myFirstCharacter = Outlander
        
will print the following error:

        parsingExceptions.pgMalformedException: Repeated skill: 'Survival' for Player 'myFirstCharacter': also present in setted background: Outlander

changing the background, removing it, change the skill will solve the problem. Indication about the skills provided
by a background can be found inside the player manual.

### Background setting
#### cannotSetActiveException
* The following code:
        
           create Player myFirstCharacter{
               race: Human
               hp:82
               archetype: (Barbarian,Cleric->War Domain)
               abilities:(18,10,15,15,15,15)
               alignment:chaotic good
               skills: (Intimidation,Survival)
               languages: (Elvish)
           }
           set Active Equipment for myFirstCharacter = heavyEquip
           set Active Equipment for myFirstCharacter = heavyEquip

will print these errors:

        1) parsingExceptions.cannotSetActiveException: Cannot set 'heavyEquip' as active equipment for Player 'myFirstCharacter': does not have this equipment
        2) parsingExceptions.cannotSetActiveException: Cannot set 'heavyEquip' as active equipment for Player 'myFirstCharacter': multiple active equipments setted

1. this error can be solved by removing the active setting or by adding an item setting for the printed equipment
2. this error can be solved by removing one of the active setting entries

### Language setting
#### pgMalformedException
* The following code:
           
        create Player myFirstCharacter{
            race: Human
            hp:82
            archetype: (Barbarian,Cleric->War Domain)
            abilities:(18,10,15,15,15,15)
            alignment:chaotic good
            skills: (Intimidation,Survival)
            languages: ()
        }    
will print this error:
        
        parsingExceptions.pgMalformedException: Wrong number of languages for Player 'myFirstCharacter'
        1 languages must be specified in 'languages'
        
this problem can be solved by changing the race of the character, removing its background setting or by adding the specified number of languages.
* The following code:
           
        create Player myFirstCharacter{
            race: Human
            hp:82
            archetype: (Barbarian,Cleric->War Domain)
            abilities:(18,10,15,15,15,15)
            alignment:chaotic good
            skills: (Intimidation,Survival)
            languages: (Orc,Infernal)
        }    
will print this error:
        
        parsingExceptions.pgMalformedException: Wrong number of languages for Player 'myFirstCharacter'
        Only 1 can be specified in 'languages'
this problem can be solved by removing the needed number of languages from the character's language entry.

* The following code:
           
        create Player myFirstCharacter{
            race: Human
            hp:82
            archetype: (Barbarian,Cleric->War Domain)
            abilities:(18,10,15,15,15,15)
            alignment:chaotic good
            skills: (Intimidation,Survival)
            languages: (Common)
        }
will print this error:
        
        parsingExceptions.pgMalformedException: Repeated language 'Common' for Player 'myFirstCharacter'
        Race languages: Common
this problem can be solved by changing the race of the character or by changing the character's language entry.

### Description setting
#### pgMalformedException
The following code:
        
        set Description for myFirstCharacter = "OK"
        set Description for myFirstCharacter = "OK"
will print this error:

        parsingExceptions.pgMalformedException: Player 'myFirstCharacter' has multiple Description settings
this error can be solved by removing one of the description setting entries.