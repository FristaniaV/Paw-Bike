package model;

public class Blade extends Weapon {

	private int sharpness;

	public Blade(String type, String name, int atk, int price, int sharpness) {
		super(type, name, atk, price);
		this.sharpness = sharpness;
	}

	@Override
	public int getAmmoCap() {
		return 0;
	}

	@Override
	public int getAmmoLevel() {
		return 0;
	}

	@Override
	public int getSharpness() {
		return sharpness;
	}
	
	
	

}
