package util.lexEnum;

public enum Weapons {
	Bastard_sword(WeaponsType.Normal),
	Axe(WeaponsType.Normal),
	Dagger(WeaponsType.Finesse),
	Longbow(WeaponsType.Ranged),
	None(null);
	
	WeaponsType Type;
	Weapons(WeaponsType type) {
	 this.Type = type;	
	}
	public Abilities getScaling() {
		if(Type!=null)
			return Type.getAbility();
		return null;
	}
	public WeaponsType getType() {
		return Type;
	}
	
}
