package model;

public class RollerSkate extends Footwear {

	private int wheel;

	public RollerSkate(String name, int price, String type, int wheel) {
		super(name, price, type);
		this.wheel = wheel;
	}

	@Override
	public double getHeight() {
		return 0;
	}

	@Override
	public int getWheel() {
		return wheel;
	}
	
	
	
}
