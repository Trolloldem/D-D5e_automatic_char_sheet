package util.lexEnum;

public enum Weapons {
	Bastard_sword(WeaponsType.Normal,"1d8"),
	Axe(WeaponsType.Normal,"1d6"),
	Dagger(WeaponsType.Finesse,"1d6"),
	Longbow(WeaponsType.Ranged,"1d4"),
	None(null,null);
	

	WeaponsType Type;
	String value;
	Weapons(WeaponsType type,String s) {
	 this.Type = type;	
	 value=s;
	}
	public Abilities getScaling() {
		if(Type!=null)
			return Type.getAbility();
		return null;
	}
	public WeaponsType getType() {
		return Type;
	}
	public String getValue() {
		return value;
	}
	
	
}
