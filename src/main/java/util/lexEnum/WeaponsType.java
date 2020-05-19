package util.lexEnum;

public enum WeaponsType {
	Normal(Abilities.STR),
	Finesse(null),
	Ranged(Abilities.DEX);
	
	private Abilities abilty;

	WeaponsType(Abilities ab){
		this.abilty=ab;
	}
	
	public Abilities getAbility(){
		return abilty;
	}
}
