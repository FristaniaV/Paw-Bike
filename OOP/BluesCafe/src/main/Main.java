package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Order> orderList = new ArrayList<>();
	
	String order;
	int tableNum;
	double price;
	double cafeEarnedMoney = 0;
	boolean tableCheck;

	public Main() {
		Menu();
	}
	
	public void Menu() {
		
		int choose;
		
		System.out.println("Blues Cafe");
		System.out.println("==========");
		System.out.println("Cafe Earned Money: " + cafeEarnedMoney);
		System.out.println("1. Add Order");
		System.out.println("2. Show All Order");
		System.out.println("3. Remove Order");
		System.out.println("4. Exit");
		do {
			System.out.print(">> ");
			try {
				choose = scan.nextInt();
			} catch (Exception e) {
				choose = 404;
			} scan.nextLine();
		} while (choose > 4 || choose < 1);
		
		if (choose == 1) {
			AddOrder();
		} else if (choose == 2) {
			ShowOrder();
		} else if (choose == 3) {
			RemoveOrder();
		} else if (choose == 4) {
			System.exit(0);
		}
		
	}
	
	public void AddOrder() {
		
		do {
			System.out.print("Input your table number: ");
			try {
				tableNum = scan.nextInt();
				tableCheck = false;
			} catch (Exception e) {
				tableCheck = true;
			} scan.nextLine();
		} while (tableCheck);
		
		do {
			System.out.print("Input your order: ");
			order = scan.nextLine();
		} while (order.length() > 20 || order.length() < 5);
		
		do {
			System.out.print("Input your order price: ");
			try {
				price = scan.nextInt();
			} catch (Exception e) {
				price = 404;
			} scan.nextLine();
		} while (price == 0);
		
		double tax = price * (10 / 100);
		double serv = price * (7.5 / 100);
		
		price = price + tax + serv;
		
		Order orderData = new Order(order, tableNum, price);
		
		orderList.add(orderData);
		
		System.out.println();
		System.out.println("Your order has been added..");
		System.out.println();
		System.out.println("Press enter to continue..");
		scan.nextLine();
		Menu();
	}
	
	public void ShowOrder() {
		
		if (orderList.isEmpty()) {
			System.out.println("There is no menu...");
			System.out.println();
			System.out.println("Press enter to continue..");
			scan.nextLine();
			Menu();
		} else {
			System.out.println();
			System.out.println("Your Order");
			for (int i = 0; i < orderList.size(); i++) {
				System.out.println("==========================================");
				System.out.println("Order Number: " + (i+1));
				System.out.println("Table Number: " + orderList.get(i).getTableNum());
				System.out.println("Order: " + orderList.get(i).getOrder());
				System.out.println("Price: " + orderList.get(i).getPrice());
				System.out.println("==========================================");
			}
			
			System.out.println();
			System.out.println("Press enter to continue..");
			scan.nextLine();
			Menu();
		}
	}
	
	public void RemoveOrder() {
		
		int removeNum = 0;
		
		if (orderList.isEmpty()) {
			System.out.println("There is no menu...");
			System.out.println();
			System.out.println("Press enter to continue..");
			scan.nextLine();
			Menu();
		} else {
			System.out.println();
			System.out.println("Your Order");
			
			for (int i = 0; i < orderList.size(); i++) {
				System.out.println("==========================================");
				System.out.println("Order Number: " + (i+1));
				System.out.println("Table Number: " + orderList.get(i).getTableNum());
				System.out.println("Order: " + orderList.get(i).getOrder());
				System.out.println("Price: " + orderList.get(i).getPrice());
				System.out.println("==========================================");
			}
			
			System.out.println();
			System.out.print("Input the order number you want to remove: ");

			try {
				removeNum = scan.nextInt();
			} catch (Exception e) {
				removeNum = 404;
			} scan.nextLine();
			
			for (Order order : orderList) {
				if (order.getTableNum() == removeNum) {
					this.orderList.remove(removeNum - 1);
					break;
				} removeNum++;
			}
			
			System.out.println("Order has been removed...");
			System.out.println();
			System.out.println("Press enter to continue..");
			scan.nextLine();
			Menu();
			
		}
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
