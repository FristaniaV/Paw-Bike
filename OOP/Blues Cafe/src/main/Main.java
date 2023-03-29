package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	ArrayList<String> tableNumList = new ArrayList<>();
	ArrayList<String> orderNameList = new ArrayList<>();
	ArrayList<Double> finalPriceList = new ArrayList<>();
	
	String tableNum;
	String orderName;
	double price;
	double finalPrice;
	double taxPrice;
	double servTax;
	double priceAndTax;
	double priceAndServ;
	double cafeEarnedMoney = 0;
	
	public Main() {
		
		Menu();
		
	}
	
	public void Menu() {

		int choose;
		
		do {
			System.out.println("Cafe Earned Money: " + cafeEarnedMoney);
			System.out.println("1. Add Order");
			System.out.println("2. Show All Orders");
			System.out.println("3. Remove Order");
			System.out.println("4. Exit");
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
			tableNum = scan.nextLine();
		} while (!(tableNum.contains("0") || tableNum.contains("1") || tableNum.contains("2") || tableNum.contains("3") || tableNum.contains("4") || tableNum.contains("5") || tableNum.contains("6") || tableNum.contains("7") || tableNum.contains("8") || tableNum.contains("9")));
		
		tableNumList.add(tableNum);
		
		do {
			System.out.print("Input your order: ");
			orderName = scan.nextLine();
		} while (orderName.length() > 30 || orderName.length() < 5);
		
		orderNameList.add(orderName);
		
		do {
			System.out.print("Input your order price: ");
			try {
				price = scan.nextDouble();
			} catch (Exception e) {
				price = 404;
			} scan.nextLine();
		} while (price == 0);
		
		priceAndTax = (price * (10 / 100));
		priceAndServ = (price * (7.5 / 100));
		finalPrice = priceAndTax + priceAndServ + price;
		
		finalPriceList.add(finalPrice);
		
		System.out.println();
		System.out.println("Order Added!");
		System.out.println("Press enter to continue...");
		scan.nextLine();
		Menu();
		
	}
	
	public void ShowOrder() {
		
		System.out.println();
		for (int i = 0; i < tableNumList.size(); i++) {
			
			System.out.println("Order Number: " + (i + 1));
			System.out.println("Table Number: " + tableNumList.get(i));
			System.out.println("Order Name: " + orderNameList.get(i));
			System.out.println("Price: " + finalPriceList.get(i));
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Press enter to continue...");
		scan.nextLine();
		Menu();
		
	}
	
	public void RemoveOrder() {
		
		int remove;
		
		if (tableNumList.isEmpty()) {
			System.out.println("There is no order...");
			System.out.println();
			System.out.println("Press enter to continue...");
			scan.nextLine();
			Menu();
		} else {
			do {
				System.out.print("Enter the order number you want to remove: ");
				try {
					remove = scan.nextInt();
				} catch (Exception e) {
					remove = 404;
				} scan.nextLine();
			} while (remove < 1 || remove > tableNumList.size());
			
			cafeEarnedMoney = finalPriceList.get(remove - 1);
		
			tableNumList.remove(remove - 1);
			orderNameList.remove(remove - 1);
			finalPriceList.remove(remove - 1);
			
			System.out.println();
			System.out.println("Order has been removed...");
			System.out.println();
			System.out.println("Press enter to continue...");
			scan.nextLine();
			Menu();
			
		}
		
	}
	
	

	public static void main(String[] args) {
		new Main();
	}

}
