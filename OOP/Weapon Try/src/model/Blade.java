package model;

public class Blade extends Weapon {
	private int sharpnessLevel;
	
	public Blade(String weaponName, int attack, int price, int sharpnessLevel) {
		super(weaponName, attack, price);
		this.sharpnessLevel = sharpnessLevel;
	}
	public int getSharpnessLevel() {
		return sharpnessLevel;
	}
	public void setSharpnessLevel(int sharpnessLevel) {
		this.sharpnessLevel = sharpnessLevel;
	}
	@Override
	public String Info(String name) {
		if (name.endsWith("-B")) {
			System.out.println(sharpnessLevel);
		}return name;
				
	}
	
	
}
