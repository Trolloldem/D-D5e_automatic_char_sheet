package util.lexEnum;

public enum WeaponsType {
	Normal(Abilities.STR),
	Finesse(temp()),
	Ranged(Abilities.DEX);
	
	private Abilities abilty;

	WeaponsType(Abilities ab){
		this.abilty=ab;
	}
	
	public Abilities getAbility(){
		return abilty;
	}
	private static Abilities temp() {
		if(Abilities.STR.getPdfFormCheckBox()>Abilities.DEX.getPdfFormCheckBox())
			return Abilities.STR;
		else
			return Abilities.DEX;
		
	}
}
