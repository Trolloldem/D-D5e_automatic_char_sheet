# Errors
1. [Error phases](#phase)
2. [Parsing errors](#parsing)
3. [Visiting errors](#visit)
4. [Naming errors](#name)
5. [Setting errors](#settings)

## Error phases<a name ="phase"/>
Validation on the provided file follows 4 phases. A valid file must pass a check phase before
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



