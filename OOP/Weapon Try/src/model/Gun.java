package model;

public class Gun extends Weapon {
	
	private int ammoCapacity;
	private int ammoLevel;
	
	public Gun(String weaponName, int attack, int price, int ammoCapacity, int ammoLevel) {
		super(weaponName, attack, price);
		this.ammoCapacity = ammoCapacity;
		this.ammoLevel = ammoCapacity;
	}
	public int getAmmoCapacity() {
		return ammoCapacity;
	}
	public void setAmmoCapacity(int ammoCapacity) {
		this.ammoCapacity = ammoCapacity;
	}
	public int getAmmoLevel() {
		return ammoLevel;
	}
	public void setAmmoLevel(int ammoLevel) {
		this.ammoLevel = ammoLevel;
	}
	@Override
	public String Info(String name) {
		if (name.endsWith("-G")) {
			System.out.println(ammoCapacity);
			System.out.println("ammoLevel");
		}
			return name;
		}
		
	}
	
	

