package model;

public class Minuman extends Menu {

	private Integer sugar;

	public Minuman(String name, String desc, Integer price, Integer quantity, Integer sugar) {
		super(name, desc, price, quantity);
		this.sugar = sugar;
	}
	
	
	
}
