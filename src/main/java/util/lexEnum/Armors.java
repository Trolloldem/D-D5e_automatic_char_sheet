package util.lexEnum;

public enum Armors {

	Padded(11,armorType.Light_Armor),
	Leather(11,armorType.Light_Armor),
	Studded_leather(12,armorType.Medium_Armor),
	Hide(12,armorType.Medium_Armor),
	Chain_shirt(13,armorType.Medium_Armor),
	Scale_mail(14,armorType.Medium_Armor),
	Breastplate(14,armorType.Medium_Armor),
	Half_plate(15,armorType.Medium_Armor),
	Ring_mail(14,armorType.Heavy_Armor),
	Chain_mail(16,armorType.Heavy_Armor),
	Splint(17,armorType.Heavy_Armor),
	Plate(18,armorType.Heavy_Armor),
	None(0,armorType.Heavy_Armor);

	private int armorClass;
	private armorType typeOfArmor;

	Armors(int ca,armorType type){
		this.armorClass = ca;
		typeOfArmor = type;
	}

	public int getArmorClass() {
		return armorClass;
	}

	public armorType getTypeOfArmor(){
		return typeOfArmor;
	}

	public Abilities getScaling(){
		if(typeOfArmor!=null)
			return typeOfArmor.getScaling();
		else
			return null;
	}
}
