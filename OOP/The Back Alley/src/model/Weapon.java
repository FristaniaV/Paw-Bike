package model;

public class Weapon extends MagicItem {

	private int durability;

	public Weapon(String name, int damage, String element, char rank, int durability) {
		super(name, damage, element, rank);
		this.durability = durability;
	}

	@Override
	public int getDurability() {
		return durability;
	}

	@Override
	public String getSLevel() {
		return null;
	}

	
	
}
