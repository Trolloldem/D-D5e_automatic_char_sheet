package util.lexEnum;

public enum Skills {
    Acrobatics(Abilities.DEX,23),
    Animal_Handling(Abilities.WIS,24),
    Arcana(Abilities.INT,25),
    Athletics(Abilities.STR,26),
    Deception(Abilities.CHA,27),
    History(Abilities.INT,28),
    Insight(Abilities.WIS,29),
    Intimidation(Abilities.CHA,30),
    Investigation(Abilities.INT,31),
    Medicine(Abilities.WIS,32),
    Nature(Abilities.INT,33),
    Perception(Abilities.WIS,34),
    Performance(Abilities.CHA,35),
    Persuasion(Abilities.CHA,36),
    Religion(Abilities.INT,37),
    Sleight_of_Hand(Abilities.DEX,38),
    Stealth(Abilities.DEX,39),
    Survival(Abilities.WIS,40);

    private Abilities ability;
    private int checkBox;

    Skills(Abilities scaling,int checkBox){
        ability = scaling;
        this.checkBox = checkBox;
    }

    public Abilities getAbility() {
        return ability;
    }

    public int getCheckBox() {
        return checkBox;
    }
}
