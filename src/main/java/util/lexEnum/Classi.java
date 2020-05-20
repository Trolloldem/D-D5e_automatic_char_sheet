package util.lexEnum;


public enum Classi{
    Barbarian(new subClass[] {subClass.Berserker, subClass.Path_of_the_Totem_warrior},3,
            new Abilities[] {Abilities.STR,Abilities.CON}
            ,new Skills[] {Skills.Animal_Handling,Skills.Athletics,Skills.Intimidation,Skills.Nature,Skills.Perception,Skills.Survival},2,false,12),
    Bard(new subClass[] {subClass.College_of_Lore, subClass.College_of_Valor },3, new Abilities[] {Abilities.DEX,Abilities.CHA},
            new Skills[] {},3,true,8),
    Cleric(new subClass[] {subClass.Knowledge_Domain, subClass.Life_Domain, subClass.Light_Domain,
            subClass.Nature_Domain, subClass.Tempest_Domain, subClass.Trickery_Domain,
            subClass.War_Domain},1, new Abilities[] {Abilities.WIS,Abilities.CHA}
            ,new Skills[] {Skills.History,Skills.Insight,Skills.Medicine,Skills.Persuasion,Skills.Religion},2,false,8),
    Druid(new subClass[] {subClass.Circle_of_the_land, subClass.Circle_of_the_moon},2, new Abilities[] {Abilities.INT,Abilities.WIS},
            new Skills[] {Skills.Arcana,Skills.Animal_Handling,Skills.Insight,Skills.Medicine,Skills.Nature,Skills.Perception,Skills.Religion,Skills.Survival},2,false,8),
    Fighter(new subClass[] {subClass.Champion, subClass.Battle_master, subClass.Eldritch_knight},1, new Abilities[] {Abilities.STR,Abilities.CON},
            new Skills[] {Skills.Acrobatics,Skills.Athletics,Skills.History,Skills.Insight,Skills.Intimidation,Skills.Perception,Skills.Survival},2,false,10),
    Monk(new subClass[] {subClass.Way_of_the_open_hand, subClass.Way_of_shadow, subClass.Way_of_the_four_elements },3, new Abilities[] {Abilities.STR,Abilities.DEX,},
            new Skills[] {Skills.Acrobatics,Skills.Animal_Handling,Skills.Athletics,Skills.History,Skills.Insight,Skills.Religion,Skills.Stealth},2,false,8),
    Paladin(new subClass[] {subClass.Oath_of_devotion, subClass.Oath_of_the_ancients, subClass.Oath_of_vengeance},3, new Abilities[] {Abilities.WIS,Abilities.CHA},
            new Skills[] {Skills.Athletics,Skills.Insight,Skills.Intimidation,Skills.Medicine,Skills.Persuasion,Skills.Religion},2,false,10),
    Ranger(new subClass[] {subClass.Hunter, subClass.Beast_master},3, new Abilities[] {Abilities.STR,Abilities.DEX},
            new Skills[] {Skills.Animal_Handling,Skills.Athletics,Skills.Insight,Skills.Investigation,Skills.Nature,Skills.Perception, Skills.Stealth,Skills.Survival},3,true,10),
    Rogue(new subClass[] {subClass.Thief, subClass.Assassin, subClass.Arcane_trickster},3, new Abilities[] {Abilities.DEX,Abilities.INT},
            new Skills[] {Skills.Acrobatics,Skills.Athletics,Skills.Deception,Skills.Insight,Skills.Intimidation,Skills.Investigation,Skills.Perception,Skills.Performance,Skills.Persuasion, Skills.Sleight_of_Hand,Skills.Stealth},4,true,8),
    Sorcerer(new subClass[] {subClass.Dragonic_bloodline, subClass.Wild_magic},1, new Abilities[] {Abilities.CON,Abilities.CHA},
            new Skills[] {Skills.Arcana,Skills.Deception,Skills.Insight, Skills.Intimidation,Skills.Persuasion, Skills.Religion},2,false,6),
    Warlock(new subClass[] {subClass.The_fiend, subClass.the_archfey, subClass.The_great_old_one},1, new Abilities[] {Abilities.WIS,Abilities.CHA},
            new Skills[] {Skills.Arcana,Skills.Deception,Skills.History,Skills.Intimidation,Skills.Investigation,Skills.Nature,Skills.Religion},2,false,8),
    Wizard(new subClass[] {subClass.School_of_abjuration, subClass.School_of_divination, subClass.School_of_enchantment,
            subClass.School_of_conjuration, subClass.School_of_evocation, subClass.School_of_illusion,
            subClass.School_of_necromancy, subClass.School_of_transmutation},2, new Abilities[] {Abilities.INT,Abilities.WIS},
            new Skills[] {Skills.Arcana,Skills.Religion,Skills.History,Skills.Insight,Skills.Investigation,Skills.Medicine},2,false,6);

    private subClass[] subClasses;
    private int subClassLevel;
    private Abilities[] savingThrows;
    private Skills[] prof;
    private int numSkills;
    private boolean addSkillMulticlass;
    private String dice;

    Classi(subClass[] sub, int subclassLevel, Abilities[] savingThrows,Skills[] skills, int numChoice,boolean hasAdd, int hitDice){
        this.subClasses=sub;
        this.subClassLevel = subclassLevel;
        this.savingThrows = savingThrows;
        if(skills.length!=0)
            prof = skills;
        else
            prof = Skills.values();
        numSkills = numChoice;
        addSkillMulticlass = hasAdd;
        dice = "d"+hitDice;
    }

    public subClass[] getSubClasses() {
        return subClasses;

    }

    public int getSubClassLevel(){
        return subClassLevel;
    }

    public Abilities[] getSavingThrows() {
        return savingThrows;
    }

    public int getNumSkills() {
        return numSkills;
    }

    public boolean isAddSkillMulticlass() {
        return addSkillMulticlass;
    }

    public Skills[] getProf() {
        return prof;
    }

    public String getDice() {
        return dice;
    }
}
