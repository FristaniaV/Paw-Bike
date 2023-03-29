package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.Food;
import model.NonVege;
import model.Vege;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	ArrayList<String> IDList = new ArrayList<>();
	ArrayList<Food> foodList;

	public Main() {
		this.foodList = new ArrayList<>();
		Menu();
	}
	
	private void Menu() {
		int choose;
		
		System.out.println("Five Food Street");
		System.out.println("================");
		System.out.println("1. Insert New Menu");
		System.out.println("2. View All Menu");
		System.out.println("3. Sell Menu Item");
		System.out.println("4. Exit");
		do {
			System.out.print(">>> ");
			try {
				choose = scan.nextInt();
			} catch (Exception e) {
				choose = 404;
			} scan.nextLine();
		} while (choose > 4 || choose < 1);
		
		if (choose == 1) {
			Insert();
		} else if (choose == 2) {
			View();
		} else if (choose == 3) {
			Sell();
		} else if (choose == 4 ) {
			System.exit(0);
		}
	}
	
	private void Insert() {
		
		String name;
		String dish;
		String type;
		int bPrice;
		String vege = null;
		String meat = null;
		String addOns = null;
		String ID;
		
		do {
			System.out.print("Input menu name [8-20]: ");
			name = scan.nextLine();
		} while (name.length() > 20 || name.length() < 8);
		
		do {
			System.out.print("input menu dish [Rice | Noodle][Case Insensitive]:");
			dish = scan.nextLine();
		} while (!(dish.equalsIgnoreCase("Rice")) && !(dish.equalsIgnoreCase("Noodle")));
		
		do {
			System.out.print("Input menu type [Vege | Non-Vege][Case Sensitive]: ");
			type = scan.nextLine();
		} while (!(type.equals("Vege")) && !(type.equals("Non-Vege")));
		
		do {
			System.out.print("Input base price [5000 - 25000][Multiple of 1000]: ");
			try {
				bPrice = scan.nextInt();
			} catch (Exception e) {
				bPrice = 404;
			} scan.nextLine();
		} while (bPrice > 25000 || bPrice < 5000 || !(bPrice % 1000 == 0));
		
		
		if (type.equals("Vege")) {
			do {
				System.out.print("Input Vegetable [Potato | Tomato][Case Insensitive]:");
				vege = scan.nextLine();
			} while (!(vege.equalsIgnoreCase("Tomato")) && !(vege.equalsIgnoreCase("Potato")));
			// Belom di insert
			
			String IDvv = "VV";
			int randomNumber = rand.nextInt(10); 
			int randomNumber2 = rand.nextInt(10);
			int randomNumber3 = rand.nextInt(10);
//			ID += IDvv;
//			ID += (randomNumber + "");
//			ID += (randomNumber2 + "");
//			ID += (randomNumber3 + "");
			ID = IDvv + "" + randomNumber + "" + randomNumber2 + "" + randomNumber3;
			
			IDList.add(ID);
			
			Vege foodVDetail = new Vege(name, dish, type, bPrice, vege);
			foodList.add(foodVDetail);
			
		} else if (type.equals("Non-Vege")) {
			do {
				System.out.print("Input Meat [Beef | Chicken | Pork][Case Insensitive]: ");
				meat = scan.nextLine();
			} while (!(meat.equalsIgnoreCase("Beef")) && !(meat.equalsIgnoreCase("Chicken")) && !(meat.equalsIgnoreCase("Pork")));
		
			do {
				System.out.print("Input addOns [Meatballs | Fishballs | Fried Potato][Case Insensitive]: ");
				addOns = scan.nextLine();
			} while (!(addOns.equalsIgnoreCase("Meatballs")) && !(addOns.equalsIgnoreCase("Fishballs")) && !(addOns.equalsIgnoreCase("Fried Potato")));
			// Belom di insert
			
			String IDnv = "NV";
			int randomNumber = rand.nextInt(10); 
			int randomNumber2 = rand.nextInt(10);
			int randomNumber3 = rand.nextInt(10);
//			ID += IDnv;
//			ID += (randomNumber + "");
//			ID += (randomNumber2 + "");
//			ID += (randomNumber3 + "");
			ID = IDnv + "" + randomNumber + "" + randomNumber2 + "" + randomNumber3;
			
			IDList.add(ID);
			
			NonVege foodNVDetail = new NonVege(name, dish, type, bPrice, meat, addOns);
			foodList.add(foodNVDetail);
			
		}
		
		if (type.equals("Vege")) {
			System.out.println();
			System.out.println("Vege food added succesfully");
			System.out.println("Press enter to continue...");
			scan.nextLine();
			Menu();
		} else if (type.equals("Non-Vege")) {
			System.out.println();
			System.out.println("Non-Vege food added succesfully");
			System.out.println("Press enter to continue...");
			scan.nextLine();
			Menu();
		}
	}
	
	private void View() {
		if (foodList.isEmpty()) {
			System.out.println("No menu available");
		} else {
			System.out.println("========================================================");
			System.out.printf("|%-3s|%-7s|%-20s|%-10s|%-10s|\n", "No", "ID", "Name", "Price", "Type");
			System.out.println("========================================================");
			for (int i = 0; i < foodList.size(); i++) {
				System.out.printf("|%-3d|%-7s|%-20s|%-10d|%-10s|\n", i + 1, IDList.get(i), foodList.get(i).getName(), foodList.get(i).getbPrice(), foodList.get(i).getType());
			}
			System.out.println("========================================================");
		
			System.out.println("Press enter to continue...");
			scan.nextLine();
			System.out.println();
			Menu();
		}
	}
	
	private void Sell() {
		
		int sell;
		int qty;
		
		if (foodList.isEmpty()) {
			System.out.println("No menu available");
		} else {
			System.out.println("========================================================");
			System.out.printf("|%-3s|%-7s|%-20s|%-10s|%-10s|\n", "No", "ID", "Name", "Price", "Type");
			System.out.println("========================================================");
			for (int i = 0; i < foodList.size(); i++) {
				System.out.printf("|%-3d|%-7s|%-20s|%-10d|%-10s|\n", i + 1, IDList.get(i), foodList.get(i).getName(), foodList.get(i).getbPrice(), foodList.get(i).getType());
			}
			System.out.println("========================================================");
		
			do {
				System.out.print("Input number [1 - " + foodList.size() + "]: ");
				try {
					sell = scan.nextInt();
				} catch (Exception e) {
					sell = 404;
				} scan.nextLine();
			} while (sell > foodList.size() || sell < 1);
			
			do {
				System.out.print("Input quantity: ");
				try {
					qty = scan.nextInt();
				} catch (Exception e) {
					qty = 404;
				} scan.nextLine();
			} while (qty == 0);
			
			System.out.println("ID: " + IDList.get(sell - 1));
			System.out.println("Menu name: " + foodList.get(sell - 1).getName());
			System.out.println("Main dish: " + foodList.get(sell - 1).getDish());
			System.out.println("Price: " + foodList.get(sell - 1).getbPrice());
			System.out.println("Grand total: " + foodList.get(sell - 1).getGrandTotal());
			
			System.out.println();
			System.out.println("Food Sold!");
			System.out.println();
			System.out.println("Press enter to continue...");
			scan.nextLine();
			System.out.println();
			Menu();
		}
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
