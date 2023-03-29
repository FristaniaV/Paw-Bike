package model;

public abstract class Footwear {

	private String name;
	private int price;
	private String type;
	
	public Footwear(String name, int price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public abstract double getHeight();
	
	public abstract int getWheel();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
