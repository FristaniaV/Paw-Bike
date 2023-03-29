package model;

public abstract class MagicItem {

	private String name;
	private int damage;
	private String element;
	private char rank;

	public MagicItem(String name, int damage, String element, char rank) {
		super();
		this.name = name;
		this.damage = damage;
		this.element = element;
		this.rank = rank;
	}

	public abstract int getDurability();
	
	public abstract String getSLevel();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public char getRank() {
		return rank;
	}

	public void setRank(char rank) {
		this.rank = rank;
	}
	
	
	
	
	
}
