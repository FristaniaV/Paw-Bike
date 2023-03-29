package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.Footwear;
import model.Heels;
import model.RollerSkate;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	ArrayList<Footwear> fwList = new ArrayList<>();
	
	String name;
	int price;
	String type;
	double height;
	int wheel;
	
	public Main() {
		Menu();
	}
	
	private void Menu() {
		int choose;
		
		System.out.println("Just DU It !!");
		System.out.println("=============");
		System.out.println("1. Add Footwear");
		System.out.println("2. View Footwear");
		System.out.println("3. Update Footwear");
		System.out.println("4. Delete Footwear");
		System.out.println("5. Exit");
		do {
			System.out.print(">> ");
			try {
				choose = scan.nextInt();
			} catch (Exception e) {
				choose = 404;
			} scan.nextLine();
		} while (choose > 5 || choose < 1);
		
		if (choose == 1) {
			Add();
		} else if (choose == 2) {
			View();
		} else if (choose == 3) {
			Update();
		} else if (choose == 4) {
			Delete();
		} else if (choose == 5) {
			System.exit(0);
		}
	}
	
	private void Add() {
		
		do {
			System.out.print("Footwear name [3 - 25 characters]: ");
			name = scan.nextLine();
		} while (name.length() > 25 || name.length() < 3);
		
		do {
			System.out.print("Footwear price [more than 10000]: ");
			try {
				price = scan.nextInt();
			} catch (Exception e) {
				price = 404;
			} scan.nextLine();
		} while (price <= 10000);
		
		do {
			System.out.print("Footwear type [Heels / RollerSkate]: ");
			type = scan.nextLine();
		} while (!(type.equals("Heels")) && !(type.equals("RollerSkate")));
		
		if (type.equals("Heels")) {
			do {
				System.out.print("Footwear height [1.0 - 9.0]: ");
				try {
					height = scan.nextInt();
				} catch (Exception e) {
					height = 404;
				} scan.nextLine();
			} while (height > 9.0 || height < 1.0);
			
			Heels heelsData = new Heels(name, price, type, height);
			fwList.add(heelsData);
			
		} else if (type.equals("RollerSkate")) {
			do {
				System.out.print("Footwear total wheel [2 - 4 inclusive]: ");
				try {
					wheel = scan.nextInt();
				} catch (Exception e) {
					wheel = 404;
				} scan.nextLine();
			} while (wheel > 4 || wheel < 2);
			
			RollerSkate rollerSkateData = new RollerSkate(name, price, type, wheel);
			fwList.add(rollerSkateData);
			
		}
		
		System.out.println("Foot wear added successfully !!");
		System.out.println();
		System.out.println("Press Enter to Continue...");
		scan.nextLine();
		Menu();
		
	}
	
	private void View() {
		
		if (fwList.isEmpty()) {
			System.out.println("There are no footwears to display !");
		} else {
			System.out.println("=====================================================");
			System.out.printf("|%-3s|%-20s|%-7s|%-7s|%-10s|\n", "No", "Name", "Price", "Height", "Total Wheel");
			System.out.println("=====================================================");
			for (int i = 0; i < fwList.size(); i++) {
				if (fwList.get(i).getType().equals("Heels")) {
					System.out.printf("|%-3s|%-20s|%-7s|%-7s|%-10s|\n", (i + 1), fwList.get(i).getName(), fwList.get(i).getPrice(), fwList.get(i).getHeight(), "-");
				} else if (fwList.get(i).getType().equals("RollerSkate")) {
					System.out.printf("|%-3s|%-20s|%-7s|%-7s|%-10s|\n", (i + 1), fwList.get(i).getName(), fwList.get(i).getPrice(), "-", fwList.get(i).getWheel());
				}
			}
			System.out.println("=====================================================");
		}
		
		System.out.println();
		System.out.println("Press Enter to Continue...");
		scan.nextLine();
		Menu();
		
	}
	
	private void Update() {
		
		int update;
		
		if (fwList.isEmpty()) {
			System.out.println("There are no footwears to update !");
		} else {
			System.out.println("=====================================================");
			System.out.printf("|%-3s|%-20s|%-7s|%-7s|%-10s|\n", "No", "Name", "Price", "Height", "Total Wheel");
			System.out.println("=====================================================");
			for (int i = 0; i < fwList.size(); i++) {
				if (fwList.get(i).getType().equals("Heels")) {
					System.out.printf("|%-3s|%-20s|%-7s|%-7s|%-10s|\n", (i + 1), fwList.get(i).getName(), fwList.get(i).getPrice(), fwList.get(i).getHeight(), "-");
				} else if (fwList.get(i).getType().equals("RollerSkate")) {
					System.out.printf("|%-3s|%-20s|%-7s|%-7s|%-10s|\n", (i + 1), fwList.get(i).getName(), fwList.get(i).getPrice(), "-", fwList.get(i).getWheel());
				}
			}
			System.out.println("=====================================================");
		}
		
		System.out.println();
		
		do {
			System.out.print("Input footwear index to update: ");
			try {
				update = scan.nextInt();
			} catch (Exception e) {
				update = 404;
			} scan.nextLine();
		} while (update < 1 || update > fwList.size());
		
		do {
			System.out.print("Footwear name [3 - 25 characters]: ");
			name = scan.nextLine();
		} while (name.length() > 25 || name.length() < 3);
		
		do {
			System.out.print("Footwear price [more than 10000]: ");
			try {
				price = scan.nextInt();
			} catch (Exception e) {
				price = 404;
			} scan.nextLine();
		} while (price <= 10000);
		
		if (type.equals("Heels")) {
			do {
				System.out.print("Footwear height [1.0 - 9.0]: ");
				try {
					height = scan.nextInt();
				} catch (Exception e) {
					height = 404;
				} scan.nextLine();
			} while (height > 9.0 || height < 1.0);
			
			Heels heelsDataUpdate = new Heels(name, price, fwList.get(update - 1).getType(), height);
			fwList.set((update - 1), heelsDataUpdate);
			
		} else if (type.equals("RollerSkate")) {
			do {
				System.out.print("Footwear total wheel [2 - 4 inclusive]: ");
				try {
					wheel = scan.nextInt();
				} catch (Exception e) {
					wheel = 404;
				} scan.nextLine();
			} while (wheel > 4 || wheel < 2);
			
			RollerSkate rollerSkateDataUpdate = new RollerSkate(name, price, fwList.get(update - 1).getType(), wheel);
			fwList.set((update - 1), rollerSkateDataUpdate);
			
		}
		
		System.out.println();
		System.out.println("Footwear updated successfully !!");
		System.out.println();
		System.out.println("Press Enter to Continue...");
		scan.nextLine();
		Menu();
		
	}
	
	private void Delete() {
		
		int delete;
		
		if (fwList.isEmpty()) {
			System.out.println("There are no footwears to delete !");
		} else {
			System.out.println("=====================================================");
			System.out.printf("|%-3s|%-20s|%-7s|%-7s|%-10s|\n", "No", "Name", "Price", "Height", "Total Wheel");
			System.out.println("=====================================================");
			for (int i = 0; i < fwList.size(); i++) {
				if (fwList.get(i).getType().equals("Heels")) {
					System.out.printf("|%-3s|%-20s|%-7s|%-7s|%-10s|\n", (i + 1), fwList.get(i).getName(), fwList.get(i).getPrice(), fwList.get(i).getHeight(), "-");
				} else if (fwList.get(i).getType().equals("RollerSkate")) {
					System.out.printf("|%-3s|%-20s|%-7s|%-7s|%-10s|\n", (i + 1), fwList.get(i).getName(), fwList.get(i).getPrice(), "-", fwList.get(i).getWheel());
				}
			}
			System.out.println("=====================================================");
		}
		
		System.out.println();
		
		do {
			System.out.print("Input footwear index to delete: ");
			try {
				delete = scan.nextInt();
			} catch (Exception e) {
				delete = 404;
			} scan.nextLine();
		} while (delete < 1 || delete > fwList.size());
		
		fwList.remove(delete - 1);
		
		System.out.println();
		System.out.println("Footwear deleted successfully !!");
		System.out.println();
		System.out.println("Press Enter to Continue...");
		scan.nextLine();
		Menu();
		
		
	}
	

	public static void main(String[] args) {
		new Main();

	}

}
