package model;

public abstract class Weapon {
	
	private String type;
	private String name;
	private int atk;
	private int price;

	public Weapon(String type, String name, int atk, int price) {
		super();
		this.type = type;
		this.name = name;
		this.atk = atk;
		this.price = price;
	}

	public abstract int getAmmoCap();
	
	public abstract int getAmmoLevel();
	
	public abstract int getSharpness();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}




}
