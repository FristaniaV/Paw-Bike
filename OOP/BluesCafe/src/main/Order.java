package main;

public class Order {

	private String order;
	private int tableNum;
	private double price;
	
	// alt shift s + o -> constructor
	public Order(String order, int tableNum, double price) {
		super();
		this.order = order;
		this.tableNum = tableNum;
		this.price = price;
	}

	// alt shift s + r -> setter getter
	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getTableNum() {
		return tableNum;
	}

	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	
}
