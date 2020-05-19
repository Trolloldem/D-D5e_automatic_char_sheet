package util.lexEnum;

public enum  armorType {

    Light_Armor(Abilities.DEX),
    Medium_Armor(Abilities.DEX),
    Heavy_Armor(null);

    private Abilities scaling;

    armorType(Abilities scaling){
        this.scaling = scaling;
    }

    public Abilities getScaling(){
        return this.scaling;
    }

}
