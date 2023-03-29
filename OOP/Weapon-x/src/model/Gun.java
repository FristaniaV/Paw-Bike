package model;

public class Gun extends Weapon {

	private int ammoCap;
	private int ammoLevel;
	
	public Gun(String type, String name, int atk, int price, int ammoCap, int ammoLevel) {
		super(type, name, atk, price);
		this.ammoCap = ammoCap;
		this.ammoLevel = ammoLevel;
	}

	@Override
	public int getAmmoCap() {
		return ammoCap;
	}

	@Override
	public int getAmmoLevel() {
		return ammoLevel;
	}

	@Override
	public int getSharpness() {
		return 0;
	}
	
	

}
