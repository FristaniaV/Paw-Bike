package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.Blade;
import model.Gun;
import model.Weapon;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	ArrayList<Weapon> weaponList = new ArrayList<>();
	
	String type = null;
	String name = null;
	int atk = 0;
	int price = 0;
	int ammoCap = 0;
	int ammoLevel = 0;
	int sharpness = 0;
	
	public Main() {
		Menu();
	}
	
	private void Menu() {
		int choose;
		
		do {
			System.out.println("====================");
			System.out.println("1. Add Weapon");
			System.out.println("2. View Weapon");
			System.out.println("3. Update Weapon");
			System.out.println("4. Exit");
			System.out.println("====================");
			System.out.print("Choose >> ");
			try {
				choose = scan.nextInt();
			} catch (Exception e) {
				choose = -1;
			} scan.nextLine();
		} while (choose > 4 || choose < 1);
		
		if (choose == 1) {
			AddWeapon();
		} else if (choose == 2) {
			ViewWeapon();
		} else if (choose == 3) {
			UpdateWeapon();
		} else if (choose == 4) {
			System.exit(0);
		}
	}
	
	private void AddWeapon() {
		
		do {
			System.out.print("Choose Weapon Type [Gun | Blade (Case Sensitive)]: ");
			type = scan.nextLine();
		} while (!(type.equals("Gun")) && !(type.equals("Blade")));
		
		if (type.equals("Gun")) {
			do {
				System.out.print("Input Weapon Name [Must end with -G, e.g. Cross-G]: ");
				name = scan.nextLine();
			} while (!(name.endsWith("-G")));	
			
			do {
				System.out.print("Input Weapon ATK [20 - 450]: ");
				try {
					atk = scan.nextInt();
				} catch (Exception e) {
					atk = 404;
				} scan.nextLine();
			} while (atk > 450 || atk < 20);
			
			do {
				System.out.print("Input Weapon Price [1500 - 10000]: ");
				try {
					price = scan.nextInt();
				} catch (Exception e) {
					price = 404;
				} scan.nextLine();
			} while (price > 10000 || price < 1500);
			
			do {
				System.out.print("Input Ammo Capacity [Must be multiple of 2]: ");
				try {
					ammoCap = scan.nextInt();
				} catch (Exception e) {
					ammoCap = 404;
				} scan.nextLine();
			} while (!(ammoCap % 2 == 0));
			
			do {
				System.out.print("Input Ammo Level [1 - 3]: ");
				try {
					ammoLevel = scan.nextInt();
				} catch (Exception e) {
					ammoLevel = 404;
				} scan.nextLine();
			} while (ammoLevel > 3 || ammoLevel < 1);
			
			Gun gunData = new Gun(type, name, atk, price, ammoCap, ammoLevel);
			weaponList.add(gunData);
			
			System.out.println();
			System.out.println("Insert Success...");
			System.out.println();
			System.out.println("Press Enter to Continue...");
			scan.nextLine();
			Menu();
			
		} else if (type.equals("Blade")) {
			
			do {
				System.out.print("Input Weapon Name [Must end with -B, e.g. Cross-B]: ");
				name = scan.nextLine();
			} while (!(name.endsWith("-B")));	
			
			do {
				System.out.print("Input Weapon ATK [20 - 450]: ");
				try {
					atk = scan.nextInt();
				} catch (Exception e) {
					atk = 404;
				} scan.nextLine();
			} while (atk > 450 || atk < 20);
			
			do {
				System.out.print("Input Weapon Price [1500 - 10000]: ");
				try {
					price = scan.nextInt();
				} catch (Exception e) {
					price = 404;
				} scan.nextLine();
			} while (price > 10000 || price < 1500);
			
			do {
				System.out.print("Input Sharpness Level [1 - 5]: ");
				try {
					sharpness = scan.nextInt();
				} catch (Exception e) {
					sharpness = 404;
				} scan.nextLine();
			} while (sharpness > 5 || sharpness < 1);
			
			Blade bladeData = new Blade(type, name, atk, price, sharpness);
			weaponList.add(bladeData);
			
			System.out.println();
			System.out.println("Insert Success...");
			System.out.println();
			System.out.println("Press Enter to Continue...");
			scan.nextLine();
			Menu();
		}
	}
	
	private void ViewWeapon() {
		
		if (weaponList.isEmpty()) {
			System.out.println("Empty");
			System.out.println();
			System.out.println("Press Enter to Continue...");
			scan.nextLine();
			Menu();
		} else {
			
			System.out.println("Your Weapons");
			System.out.println("============");
			System.out.println();
			
			for (int i = 0; i < weaponList.size(); i++) {	
				Weapon g = weaponList.get(i);
				System.out.println("===========================================");
				System.out.printf("|%-15s:%-25s|\n", "No", (i + 1));
				System.out.printf("|%-15s:%-25s|\n", "Weapon Name", g.getName());
				System.out.printf("|%-15s:%-25s|\n", "Weapon ATK", g.getAtk());
				System.out.printf("|%-15s:%-25s|\n", "Weapon Price", g.getPrice());
				
				if (g instanceof Gun) {
					System.out.printf("|%-15s:%-25s|\n", "Ammo Capacity", g.getAmmoCap());
					System.out.printf("|%-15s:%-25s|\n", "Ammo Level", g.getAmmoLevel());
				} else {
					System.out.printf("|%-15s:%-25s|\n", "Sharpness Level", g.getSharpness());
				}
				
//				if (type.equals("Gun")) {
//					System.out.printf("|%-15s:%-25s|\n", "Ammo Capacity", g.getAmmoCap());
//					System.out.printf("|%-15s:%-25s|\n", "Ammo Level", g.getAmmoLevel());
//				} else if (type.equals("Blade")) {
//					System.out.printf("|%-15s:%-25s|\n", "Sharpness Level", g.getSharpness());
//				}
				System.out.println("===========================================");
			}
			
			
			System.out.println();
			System.out.println("Press Enter to Continue...");
			scan.nextLine();
			Menu();
		}
	}
	
	private void UpdateWeapon() {
		
		int update;
		
		if (weaponList.isEmpty()) {
			System.out.println("Empty");
			System.out.println();
			System.out.println("Press Enter to Continue...");
			scan.nextLine();
			Menu();
		} else {
			
			System.out.println("Your Weapons");
			System.out.println("============");
			System.out.println();
			
			for (int i = 0; i < weaponList.size(); i++) {	
				Weapon g = weaponList.get(i);
				System.out.println("===========================================");
				System.out.printf("|%-15s:%-25s|\n", "No", (i + 1));
				System.out.printf("|%-15s:%-25s|\n", "Weapon Name", g.getName());
				System.out.printf("|%-15s:%-25s|\n", "Weapon ATK", g.getAtk());
				System.out.printf("|%-15s:%-25s|\n", "Weapon Price", g.getPrice());
				
				if (g instanceof Gun) {
					System.out.printf("|%-15s:%-25s|\n", "Ammo Capacity", g.getAmmoCap());
					System.out.printf("|%-15s:%-25s|\n", "Ammo Level", g.getAmmoLevel());
				} else {
					System.out.printf("|%-15s:%-25s|\n", "Sharpness Level", g.getSharpness());
				}
				
//				if (type.equals("Gun")) {
//					System.out.printf("|%-15s:%-25s|\n", "Ammo Capacity", g.getAmmoCap());
//					System.out.printf("|%-15s:%-25s|\n", "Ammo Level", g.getAmmoLevel());
//				} else if (type.equals("Blade")) {
//					System.out.printf("|%-15s:%-25s|\n", "Sharpness Level", g.getSharpness());
//				}
				System.out.println("===========================================");
			}
			
			do {
				System.out.print("Input Weapon Number to Update [1 - " + weaponList.size() + "]: ");
				try {
					update = scan.nextInt();
				} catch (Exception e) {
					update = 404;
				} scan.nextLine();
			} while (update < 1 || update > weaponList.size());
			
			if (weaponList.get(update - 1).getType().equals("Gun")) {
				do {
					System.out.print("Input Weapon Name [Must end with -G, e.g. Cross-G]: ");
					name = scan.nextLine();
				} while (!(name.endsWith("-G")));	
				
				do {
					System.out.print("Input Weapon ATK [20 - 450]: ");
					try {
						atk = scan.nextInt();
					} catch (Exception e) {
						atk = 404;
					} scan.nextLine();
				} while (atk > 450 || atk < 20);
				
				do {
					System.out.print("Input Weapon Price [1500 - 10000]: ");
					try {
						price = scan.nextInt();
					} catch (Exception e) {
						price = 404;
					} scan.nextLine();
				} while (price > 10000 || price < 1500);
				
				do {
					System.out.print("Input Ammo Capacity [Must be multiple of 2]: ");
					try {
						ammoCap = scan.nextInt();
					} catch (Exception e) {
						ammoCap = 404;
					} scan.nextLine();
				} while (!(ammoCap % 2 == 0));
				
				do {
					System.out.print("Input Ammo Level [1 - 3]: ");
					try {
						ammoLevel = scan.nextInt();
					} catch (Exception e) {
						ammoLevel = 404;
					} scan.nextLine();
				} while (ammoLevel > 3 || ammoLevel < 1);
				
				Gun gunDataUpdate = new Gun(type, name, atk, price, ammoCap, ammoLevel);
				weaponList.set((update - 1), gunDataUpdate);
				
				System.out.println();
				System.out.println("Insert Success...");
				System.out.println();
				System.out.println("Press Enter to Continue...");
				scan.nextLine();
				Menu();
				
			} else if (weaponList.get(update - 1).getType().equals("Blade")) {
				
				do {
					System.out.print("Input Weapon Name [Must end with -B, e.g. Cross-B]: ");
					name = scan.nextLine();
				} while (!(name.endsWith("-B")));	
				
				do {
					System.out.print("Input Weapon ATK [20 - 450]: ");
					try {
						atk = scan.nextInt();
					} catch (Exception e) {
						atk = 404;
					} scan.nextLine();
				} while (atk > 450 || atk < 20);
				
				do {
					System.out.print("Input Weapon Price [1500 - 10000]: ");
					try {
						price = scan.nextInt();
					} catch (Exception e) {
						price = 404;
					} scan.nextLine();
				} while (price > 10000 || price < 1500);
				
				do {
					System.out.print("Input Sharpness Level [1 - 5]: ");
					try {
						sharpness = scan.nextInt();
					} catch (Exception e) {
						sharpness = 404;
					} scan.nextLine();
				} while (sharpness > 5 || sharpness < 1);
				
				Blade bladeDataUpdate = new Blade(type, name, atk, price, sharpness);
				weaponList.set((update - 1), bladeDataUpdate);
				
				System.out.println();
				System.out.println("Insert Success...");
				System.out.println();
				System.out.println("Press Enter to Continue...");
				scan.nextLine();
				Menu();
			}
			
			
			
			
			System.out.println();
			System.out.println("Press Enter to Continue...");
			scan.nextLine();
			Menu();
		}
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
