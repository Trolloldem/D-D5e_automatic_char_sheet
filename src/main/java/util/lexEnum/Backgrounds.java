package util.lexEnum;

public enum Backgrounds {

    Acolyte(new Skills[]{Skills.Insight, Skills.Religion},2),
    Charlatan(new Skills[]{Skills.Deception,Skills.Sleight_of_Hand},0),
            Criminal(new Skills[]{Skills.Deception,Skills.Stealth},0),
            Entertainer(new Skills[]{Skills.Acrobatics,Skills.Performance},0),
            Folk_Hero(new Skills[]{Skills.Animal_Handling,Skills.Survival},0),
            Gladiator(new Skills[]{Skills.Acrobatics,Skills.Performance},0),
    Guild_Artisan(new Skills[]{Skills.Insight,Skills.Persuasion},1),
            Guild_Merchant(new Skills[]{Skills.Insight, Skills.Persuasion},1),
            Hermit(new Skills[]{Skills.Medicine,Skills.Religion},1),
            Knight(new Skills[]{Skills.History,Skills.Persuasion},1),
            Noble(new Skills[]{Skills.History,Skills.Persuasion},1),
    Outlander(new Skills[]{Skills.Athletics,Skills.Survival},1),
            Pirate(new Skills[]{Skills.Athletics,Skills.Perception},0),
            Sage(new Skills[]{Skills.Arcana,Skills.History},2),
            Sailor(new Skills[]{Skills.Athletics,Skills.Perception},0),
            Soldier(new Skills[]{Skills.Athletics,Skills.Intimidation},0),
            Spy(new Skills[]{Skills.Deception,Skills.Stealth},0),
            Urchin(new Skills[]{Skills.Sleight_of_Hand, Skills.Stealth},0);


    private Skills[] skills;
    private int extraLang;

    Backgrounds(Skills[] skills, int extraLang){
        this.skills = skills;
        this.extraLang = extraLang;
    }

    public int getExtraLang(){
        return extraLang;
    }
}
