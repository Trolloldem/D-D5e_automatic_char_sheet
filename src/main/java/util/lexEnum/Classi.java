package util.lexEnum;


public enum Classi{
    Barbarian(new subClass[] {subClass.Berserker, subClass.Path_of_the_Totem_warrior},3, new Abilities[] {Abilities.STR,Abilities.CON}),
    Bard(new subClass[] {subClass.College_of_Lore, subClass.College_of_Valor },3, new Abilities[] {Abilities.DEX,Abilities.CHA}),
    Cleric(new subClass[] {subClass.Knowledge_Domain, subClass.Life_Domain, subClass.Light_Domain,
            subClass.Nature_Domain, subClass.Tempest_Domain, subClass.Trickery_Domain,
            subClass.War_Domain},1, new Abilities[] {Abilities.WIS,Abilities.CHA}),
    Druid(new subClass[] {subClass.Circle_of_the_land, subClass.Circle_of_the_moon},2, new Abilities[] {Abilities.INT,Abilities.WIS}),
    Fighter(new subClass[] {subClass.Champion, subClass.Battle_master, subClass.Eldritch_knight},1, new Abilities[] {Abilities.STR,Abilities.CON}),
    Monk(new subClass[] {subClass.Way_of_the_open_hand, subClass.Way_of_shadow, subClass.Way_of_the_four_elements },3, new Abilities[] {Abilities.STR,Abilities.DEX}),
    Paladin(new subClass[] {subClass.Oath_of_devotion, subClass.Oath_of_the_ancients, subClass.Oath_of_vengeance},3, new Abilities[] {Abilities.WIS,Abilities.CHA}),
    Ranger(new subClass[] {subClass.Hunter, subClass.Beast_master},3, new Abilities[] {Abilities.STR,Abilities.DEX}),
    Rogue(new subClass[] {subClass.Thief, subClass.Assassin, subClass.Arcane_trickster},3, new Abilities[] {Abilities.DEX,Abilities.INT}),
    Sorcerer(new subClass[] {subClass.Dragonic_bloodline, subClass.Wild_magic},1, new Abilities[] {Abilities.CON,Abilities.CHA}),
    Warlock(new subClass[] {subClass.The_fiend, subClass.the_archfey, subClass.The_great_old_one},1, new Abilities[] {Abilities.WIS,Abilities.CHA}),
    Wizard(new subClass[] {subClass.School_of_abjuration, subClass.School_of_divination, subClass.School_of_enchantment,
            subClass.School_of_conjuration, subClass.School_of_evocation, subClass.School_of_illusion,
            subClass.School_of_necromancy, subClass.School_of_transmutation},2, new Abilities[] {Abilities.INT,Abilities.WIS});

    private subClass[] subClasses;
    private int subClassLevel;
    private Abilities[] savingThrows;

    Classi(subClass[] sub, int subclassLevel, Abilities[] savingThrows){
        this.subClasses=sub;
        this.subClassLevel = subclassLevel;
        this.savingThrows = savingThrows;
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
}
