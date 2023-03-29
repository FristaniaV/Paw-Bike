package model;

public abstract class Weapon {
	protected String weaponName;
	protected int attack;
	protected int price;
	public Weapon(String weaponName, int attack, int price) {
		super();
		this.weaponName = weaponName;
		
		this.attack = attack;
		this.price = price;
	}
	public String getWeaponName() {
		return weaponName;
	}
	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract String Info(String name); 
		
	
	
	

}
