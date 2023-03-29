package model;

public class Heels extends Footwear {

	private double height;

	public Heels(String name, int price, String type, double height) {
		super(name, price, type);
		this.height = height;
	}

	@Override
	public double getHeight() {
		return height;
	}

	@Override
	public int getWheel() {
		return 0;
	}
	
	
}
