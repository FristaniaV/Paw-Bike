package model;

public class Makanan extends Menu {
	
	private Integer fat; // unique atribute
	// super -> nunjuk attribut parent

	public Makanan(String name, String desc, Integer price, Integer quantity) {
		super(name, desc, price, quantity);
		// TODO Auto-generated constructor stub
	}
	public Makanan(String name, String desc, Integer price, Integer quantity, Integer fat) {
		super(name, desc, price, quantity);
		this.fat = fat;
	}
	
	// alt shift s o -> buat constructor


	
}
