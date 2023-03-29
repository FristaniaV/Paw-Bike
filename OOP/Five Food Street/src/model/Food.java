package model;

public abstract class Food {

	private String name;
	private String dish;
	private String type;
	private int bPrice;
	
	public Food(String name, String dish, String type, int bPrice) {
		super();
		this.name = name;
		this.dish = dish;
		this.type = type;
		this.bPrice = bPrice;
	}

	public abstract String getVege();
	
	public abstract String getMeat();
	
	public abstract String getAddOns();
	
	public abstract int getGrandTotal();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		this.dish = dish;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getbPrice() {
		return bPrice;
	}

	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}

	
	
	
}
