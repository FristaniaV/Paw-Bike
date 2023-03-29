package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.MagicItem;
import model.Spellbook;
import model.Weapon;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	Random rand = new Random();
	
	ArrayList<MagicItem> miList = new ArrayList<>();
	
	String item;
	String name;
	int damage;
	String element;
	int durability;
	String sLevel;
	char randRank;
	
	public Main() {
		Menu();
	}
	
	private void Menu() {
		
		int choose = 0;
		
		System.out.println("The Back Alley");
		System.out.println("1. Insert Magic Item");
		System.out.println("2. View Magic Item");
		System.out.println("3. Delete Magic Item");
		System.out.println("4. Exit");
		do {
			System.out.print(">> ");
			try {
				choose = scan.nextInt();
			} catch (Exception e) {
				System.out.println("INI SALAH");
			} scan.nextLine();
		} while (choose < 1 || choose > 4);
		
		if (choose == 1) {
			Insert();
		} else if (choose == 2) {
			View();
		} else if (choose == 3) {
			Delete();
		} else if (choose == 4) {
			System.exit(0);
		}
	}
	
	private void Insert() {
		
		int chooseInsert;
		
		System.out.println("Choose Item to Insert");
		System.out.println("=====================");
		System.out.println("1. Weapon");
		System.out.println("2. Spellbook");
		System.out.println("0. Return");
		do {
			System.out.print(">> ");
			try {
				chooseInsert = scan.nextInt();
			} catch (Exception e) {
				chooseInsert = 404;
			} scan.nextLine();
		} while (chooseInsert < 0 || chooseInsert > 2);
		
		if (chooseInsert == 1) {
			
			System.out.println("Insert New Weapon");
			System.out.println("=================");
			
			do {
				System.out.print("Weapon Name [5 - 30 characters]: ");
				name = scan.nextLine();
			} while (name.length() > 30 || name.length() < 5);
			
			do {
				System.out.print("Weapon Damage [5 - 150]: ");
				try {
					damage = scan.nextInt();
				} catch (Exception e) {
					damage = 404;
				} scan.nextLine();
			} while (damage > 150 || damage < 5);
			
			do {
				System.out.print("Weapon Element [ Fire | Water | Wind | Earth ] (case insensitive): ");
				element = scan.nextLine();
			} while (!(element.equalsIgnoreCase("Fire")) && !(element.equalsIgnoreCase("Water")) && !(element.equalsIgnoreCase("Wind")) && !(element.equalsIgnoreCase("Earth")));
			
			do {
				System.out.print("Weapon Durability [Greater than 10]: ");
				try {
					durability = scan.nextInt();
				} catch (Exception e) {
					durability = 404;
				} scan.nextLine();
			} while (durability <= 10);
					
			randRank = (char) ('A' + rand.nextInt(26)); 
			
			Weapon weaponData = new Weapon(name, damage, element, randRank, durability);
			miList.add(weaponData);
			
			System.out.println();
			System.out.println("New weapon has been added !");
			System.out.println("Press Enter to Continue..");
			scan.nextLine();
			Menu();
			
		} else if (chooseInsert == 2) {
			
			System.out.println("Insert New Spellbook");
			System.out.println("=================");
			
			do {
				System.out.print("Weapon Name [5 - 30 characters]: ");
				name = scan.nextLine();
			} while (name.length() > 30 || name.length() < 5);
			
			do {
				System.out.print("Weapon Damage [5 - 150]: ");
				try {
					damage = scan.nextInt();
				} catch (Exception e) {
					damage = 404;
				} scan.nextLine();
			} while (damage > 150 || damage < 5);
			
			do {
				System.out.print("Weapon Element [ Fire | Water | Wind | Earth ] (case insensitive): ");
				element = scan.nextLine();
			} while (!(element.equalsIgnoreCase("Fire")) && !(element.equalsIgnoreCase("Water")) && !(element.equalsIgnoreCase("Wind")) && !(element.equalsIgnoreCase("Earth")));
			
			do {
				System.out.print("Spell Level [ Basic | Intermediate | Advanced ] (case sensitive): ");
				sLevel = scan.nextLine();
			} while (!(sLevel.equals("Basic")) && !(sLevel.equals("Intermediate")) && !(sLevel.equals("Advanced")));
			
			Spellbook spellBookData = new Spellbook(name, damage, element, randRank, sLevel);
			miList.add(spellBookData);
			
			System.out.println();
			System.out.println("New spellbook has been added !");
			System.out.println("Press Enter to Continue..");
			scan.nextLine();
			Menu();
			
		}
		
	}
	
	private void View() {
	
		
		
		
		if (miList.isEmpty()) {
			System.out.println("There Are no Magic Items !");
		} else {
			System.out.println("=================================");
			System.out.printf("|%-3s|%-20s|%-5s|%-7s|%-10s|%-7s|%-10|%-10|\n", "Id", "Name", "Rank", "Element", "Level", "Damage", "Durability", "Total Damage");
			System.out.println("====================================");
			for (int i = 0; i < miList.size(); i++) {
				if (miList.get(i).getDurability() == 0) {
					System.out.printf("|%-3s|%-20s|%-5s|%-7s|%-10s|%-7s|%-10|%-10|\n", (i + 1), miList.get(i).getName(), miList.get(i).getRank(), miList.get(i).getElement(), miList.get(i).getSLevel(), miList.get(i).getDamage(), "-", "-");
				} else {
					System.out.printf("|%-3s|%-20s|%-5s|%-7s|%-10s|%-7s|%-10|%-10|\n", (i + 1), miList.get(i).getName(), miList.get(i).getRank(), miList.get(i).getElement(), "-", miList.get(i).getDamage(), miList.get(i).getDurability(), "-");
				}
			}
		}
		
		System.out.println();
		System.out.println("Press Enter to Continue..");
		scan.nextLine();
		Menu();
		
	}
	
	private void Delete() {
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
