package wrappers;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.antlr.v4.runtime.misc.Pair;

import util.lexEnum.Armors;
import util.lexEnum.Consumables;
import util.lexEnum.Shields;
import util.lexEnum.Weapons;

public class equipWrapper {
	private String name;
	private Armors armor;
	private Shields shield;
	private Weapons weapon;
	private Map<Consumables,Integer> consumables;
	
	private AtomicInteger counter = new AtomicInteger(0);
	
	public equipWrapper() {
		consumables = new HashMap<Consumables,Integer>();
	}
	
	public equipWrapper(String name) {
		this.name = name;
		consumables = new HashMap<Consumables,Integer>();
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Armors getArmor() {
		return armor;
	}


	public void setArmor(Armors armor) {
		this.armor = armor;
	}


	public Shields getShield() {
		return shield;
	}


	public void setShield(Shields shield) {
		this.shield = shield;
	}


	public Weapons getWeapon() {
		return weapon;
	}


	public void setWeapon(Weapons weapon) {
		this.weapon = weapon;
	}


	public Map<Consumables, Integer> getConsumables() {
		return consumables;
	}
	
	public void addConsumable(Consumables consumable, Integer quantity) {
		consumables.put(consumable, quantity);
	}

	@Override
	public String toString() {
		return "equipWrapper [name=" + name + ", armor=" + armor + ", shield=" + shield + ", weapon=" + weapon
				+ ", consumables=" + consumables + "]";
	}
	
}
