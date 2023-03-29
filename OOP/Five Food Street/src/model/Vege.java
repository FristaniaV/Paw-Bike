package model;

public class Vege extends Food {

	private String vege;

	public Vege(String name, String dish, String type, int bPrice, String vege) {
		super(name, dish, type, bPrice);
		this.vege = vege;
	}

	@Override
	public String getVege() {
		return vege;
	}

	@Override
	public String getMeat() {
		return null;
	}

	@Override
	public String getAddOns() {
		return null;
	}

	@Override
	public int getGrandTotal() {
		int priceDish = 0;
		int priceVege = 0;
		int grandTotal = 0;
		
		if (this.getDish().equalsIgnoreCase("Rice")) {
			priceDish = 5000;
		} else if (this.getDish().equalsIgnoreCase("Noodle")) {
			priceDish = 3000;
		}
		
		if (this.getVege().equalsIgnoreCase("Potato")) {
			priceVege = this.getName().length() * 2000;
		} else if (this.getVege().equalsIgnoreCase("Tomato")) {
			priceVege = this.getName().length() * 1000;
		}
		
		grandTotal = priceDish + priceVege;
		
		return grandTotal + super.getbPrice();
		
	}

}
