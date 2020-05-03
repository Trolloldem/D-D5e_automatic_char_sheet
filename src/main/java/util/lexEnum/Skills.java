package util.lexEnum;

public enum Skills {
    Acrobatics(Abilities.DEX),
    Animal_Handling(Abilities.WIS),
    Arcana(Abilities.INT),
    Athletics(Abilities.STR),
    Deception(Abilities.CHA),
    History(Abilities.INT),
    Insight(Abilities.WIS),
    Intimidation(Abilities.CHA),
    Investigation(Abilities.INT),
    Medicine(Abilities.WIS),
    Nature(Abilities.INT),
    Perception(Abilities.WIS),
    Performance(Abilities.CHA),
    Persuasion(Abilities.CHA),
    Religion(Abilities.INT),
    Sleight_of_Hand(Abilities.DEX),
    Stealth(Abilities.DEX),
    Survival(Abilities.WIS);

    Abilities ability;
    Skills(Abilities scaling){
        ability = scaling;
    }
}
