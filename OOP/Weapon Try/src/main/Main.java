package main;

import java.util.Scanner;
import java.util.Vector;

import model.Blade;
import model.Gun;
import model.Weapon;

public class Main {
	private Scanner sc = new Scanner(System.in);
	Vector<Weapon> vWeapon = new Vector<>();
	public Main() {
		Menu();
	}

	private void Menu() {
		int choose;
		
		do {
			System.out.println("=======================");
			System.out.println("1. Add Weapon");
			System.out.println("2. View Weapons");
			System.out.println("3. Update Weapon");
			System.out.println("4. Exit");
			System.out.println("========================");
			System.out.print("Choose >> ");
			choose = sc.nextInt();
			sc.nextLine();
			
			switch(choose) {
			case 1:
				addWeapon();
				System.out.println("Press Enter to Continue");
				break;
			case 2:
				viewWeapon();
				System.out.println("Press Enter To Continue");
				break;
			case 3:
				updateWeapon();
				break;
			
			}
			
		} while (choose != 4);
	}

	

	private void updateWeapon() {
		if (vWeapon.size() == 0) {
			System.out.println("Empty");
		}else {
			int idx =0;
			viewWeapon();
			
			System.out.print("Input Weapon Number to Update [1 -"+ vWeapon.size() + "]");
			try {
				idx =sc.nextInt();
				
			} catch (Exception e) {
				sc.nextLine();
			}

			vWeapon.remove(idx - 1);
			
			addWeapon();
		}
		
	}
	private void viewWeapon() {
		if (vWeapon.size() == 0) {
			System.out.println("Empty");
		}else {
			for (int i = 0; i < vWeapon.size(); i++) {
				Weapon g = vWeapon.get(i);
				System.out.println("No : " + (i+1));
				System.out.println("Weapon Name: "+ g.getWeaponName());
				System.out.println("Weapon ATK: "+ g.getAttack());
				System.out.println("Weapon Price: "+ g.getPrice());
				
			if (g instanceof Gun) {
				System.out.println("Ammo Capacity: "+ ((Gun)g).getAmmoCapacity());
				System.out.println("Ammo level: "+ ((Gun)g).getAmmoLevel() );
			}else {
				System.out.println("Sharpness level: "+  ((Blade)g).getSharpnessLevel());
			}
			}
		}
		
	}
	private void addWeapon() {
		String weaponName,type;
		int attack = 0, price = 0,ammoCapacity = 0,ammoLevel = 0, sharpnessLevel = 0;
		do {
			System.out.print("Choose Weapon Type [Gun | Blade]: ");
			type = sc.nextLine();
			} while (!type.equals("Gun") && !type.equals("Blade"));
		if (type.equals("Gun")) {
			do {
				System.out.print("Input Weapon Name [Must End with -G]: ");
				weaponName = sc.nextLine();
			} while (!weaponName.endsWith("-G"));

			do {
				try {
					System.out.print("Input Weapon ATK [20-450] : ");
					attack = sc.nextInt();
				} catch (Exception e) {
					sc.nextLine();
				}
				
			} while (attack < 20 || attack > 450);

			do {
				try {
					System.out.print(" Input Weapon Price [1500 - 10000] : ");
					price = sc.nextInt();
					
				} catch (Exception e) {
					sc.nextLine();
				}
			} while (price < 1500 || price > 10000);

			do {
				try {
					System.out.print("Input Ammo capacity [must be multiple 2]: ");
					ammoCapacity = sc.nextInt();
					
				} catch (Exception e) {
					sc.nextLine();
				}
			} while (ammoCapacity%2 == 1);

			do {
				try {
					System.out.print("Input Ammo Level [1 - 3]: ");
					ammoLevel = sc.nextInt();
					
				} catch (Exception e) {
					sc.nextLine();
				}
			} while (ammoLevel < 1 || ammoLevel > 3);
				Gun g = new Gun(weaponName, attack, price, ammoCapacity, ammoLevel);
				vWeapon.add(g);
						System.out.println("Insert Success");
		}else {
			do {
				System.out.println("input Weapon Name[must be end with -B] : ");
				weaponName = sc.nextLine();
			} while (!weaponName.endsWith("-B"));
			
			do {
				try {
					System.out.print("Input Weapon ATK [50 - 100]: ");
					attack = sc.nextInt();
					
				} catch (Exception e) {
					sc.nextLine();
				}
			} while (attack < 50 || attack > 500);
			
			do {
				try {
					System.out.print("Input Weapon Price [1500 - 10000]: ]");
					price = sc.nextInt();
					
				} catch (Exception e) {
					sc.nextLine();
				}
			} while (price < 1500 || price > 10000);
			
			do {
				try {
					System.out.print("Input Sharpness Level [1 - 5]: ");
					sharpnessLevel = sc.nextInt();
					
				} catch (Exception e) {
					sc.nextLine();
				}
			} while (sharpnessLevel < 1 || sharpnessLevel > 5);
			
			Blade b = new Blade(weaponName, attack, price, sharpnessLevel);
			vWeapon.add(b);
			System.out.println("Insert Success");
		}
			

		
	}
	public static void main(String[] args) {
		new Main();

	}

}
