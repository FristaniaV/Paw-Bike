package model;

public class NonVege extends Food {

	private String meat;
	private String addOns;
	
	public NonVege(String name, String dish, String type, int bPrice, String meat, String addOns) {
		super(name, dish, type, bPrice);
		this.meat = meat;
		this.addOns = addOns;
	}

	@Override
	public String getVege() {
		return null;
	}

	@Override
	public String getMeat() {
		return meat;
	}

	@Override
	public String getAddOns() {
		return addOns;
	}

	@Override
	public int getGrandTotal() {
		int priceDish = 0;
		int priceMeat = 0;
		int priceAddOns = 0;
		int grandTotal = 0;
		
		if (this.getDish().equalsIgnoreCase("Rice")) {
			priceDish = 5000;
		} else if (this.getDish().equalsIgnoreCase("Noodle")) {
			priceDish = 3000;
		}
		
		if (this.getVege().equalsIgnoreCase("Beef")) {
			priceMeat = this.getName().length() * 2500;
		} else if (this.getVege().equalsIgnoreCase("Chicken")) {
			priceMeat = this.getName().length() * 1000;
		} else if (this.getVege().equalsIgnoreCase("Pork")) {
			priceMeat = this.getName().length() * 2000;
		}
		
		if (this.getAddOns().equalsIgnoreCase("Meatballs")) {
			priceAddOns = 4000;
		} else if (this.getAddOns().equalsIgnoreCase("Fishballs")) {
			priceAddOns = 3000;
		} else if (this.getAddOns().equalsIgnoreCase("Fried Potato")) {
			priceAddOns = 5000;
		}
		
		grandTotal = priceDish + priceMeat + priceAddOns;
		
		return grandTotal + super.getbPrice();
		
	}
	
	
}
