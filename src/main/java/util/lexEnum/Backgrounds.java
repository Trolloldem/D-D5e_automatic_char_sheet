package util.lexEnum;

public enum Backgrounds {

    Acolyt(new Skills[]{Skills.Insight, Skills.Religion}),
    Charlatan(new Skills[]{Skills.Deception,Skills.Sleight_of_Hand}),
            Criminal(new Skills[]{Skills.Deception,Skills.Stealth}),
            Entertainer(new Skills[]{Skills.Acrobatics,Skills.Performance}),
            Folk_Hero(new Skills[]{Skills.Animal_Handling,Skills.Survival}),
            Gladiator(new Skills[]{Skills.Acrobatics,Skills.Performance}),
    Guild_Artisan(new Skills[]{Skills.Insight,Skills.Persuasion}),
            Guild_Merchant(new Skills[]{Skills.Insight, Skills.Persuasion}),
            Hermit(new Skills[]{Skills.Medicine,Skills.Religion}),
            Knight(new Skills[]{Skills.History,Skills.Persuasion}),
            Noble(new Skills[]{Skills.History,Skills.Persuasion}),
    Outlander(new Skills[]{Skills.Athletics,Skills.Survival}),
            Pirate(new Skills[]{Skills.Athletics,Skills.Perception}),
            Sage(new Skills[]{Skills.Arcana,Skills.History}),
            Sailor(new Skills[]{Skills.Athletics,Skills.Perception}),
            Soldier(new Skills[]{Skills.Athletics,Skills.Intimidation}),
            Spy(new Skills[]{Skills.Deception,Skills.Stealth}),
            Urchin(new Skills[]{Skills.Sleight_of_Hand, Skills.Stealth});


    private final Skills[] skills;


    Backgrounds(Skills[] skills){
        this.skills = skills;
    }
}
