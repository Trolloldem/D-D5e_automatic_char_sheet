package util.lexEnum;


public enum Classi{
    Barbarian(new subClass[] {subClass.Berserker, subClass.Path_of_the_Totem_warrior}),
    Bard(new subClass[] {subClass.College_of_Lore, subClass.College_of_Valor }),
    Cleric(new subClass[] {subClass.Knowledge_Domain, subClass.Life_Domain, subClass.Light_Domain,
            subClass.Nature_Domain, subClass.Tempest_Domain, subClass.Trickery_Domain,
            subClass.War_Domain}),
    Druid(new subClass[] {subClass.Circle_of_the_land, subClass.Circle_of_the_moon}),
    Fighter(new subClass[] {subClass.Champion, subClass.Battle_master, subClass.Eldritch_knight}),
    Monk(new subClass[] {subClass.Way_of_the_open_hand, subClass.Way_of_shadow, subClass.Way_of_the_four_elements }),
    Paladin(new subClass[] {subClass.Oath_of_devotion, subClass.Oath_of_the_ancients, subClass.Oath_of_vengeance}),
    Ranger(new subClass[] {subClass.Hunter, subClass.Beast_master}),
    Rogue(new subClass[] {subClass.Thief, subClass.Assassin, subClass.Arcane_trickster}),
    Sorcerer(new subClass[] {subClass.Dragonic_bloodline, subClass.Wild_magic}),
    Warlock(new subClass[] {subClass.The_fiend, subClass.the_archfey, subClass.The_great_old_one}),
    Wizard(new subClass[] {subClass.School_of_abjuration, subClass.School_of_divination, subClass.School_of_enchantment,
            subClass.School_of_conjuration, subClass.School_of_evocation, subClass.School_of_illusion,
            subClass.School_of_necromancy, subClass.School_of_transmutation});

    public subClass[] subClasses;
    Classi(subClass[] sub){
        this.subClasses=sub;
    }

    public subClass[] getsubClass() {
        return subClasses;

    }
}
