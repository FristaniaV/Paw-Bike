package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.Artifact;
import model.GoldenArtifact;
import model.PurpleArtifact;

public class Main {

	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	private ArrayList<Artifact> artifactList;
	private ArrayList<Double> damageList;
	
	public Main() {
		
		this.artifactList = new ArrayList<>();
		this.damageList = new ArrayList<>();
		Menu();
	}
	
	private void Menu() {
		
		int choose;
		
		do {
			System.out.println("Key Domain");
			System.out.println("==============================");
			System.out.println("1. Insert artifacts");
			System.out.println("2. View obtainable artifacts");
			System.out.println("3. Grind for artifact");
			System.out.println("4. Exit");
			System.out.print(">> ");
			try {
				choose = scan.nextInt();
			} catch (Exception e) {
				choose = 404;
			} scan.nextLine();
		} while (choose > 4 || choose < 1);
		
		System.out.println();
		
		if (choose == 1) {
			Insert();
		} else if (choose == 2) {
			View();
		} else if (choose == 3) {
			Grind();
		} else if (choose == 4) {
			System.exit(0);
		}
		
		
	}
	
	private void Insert() {
		
		int artifact;
		String name;
		String type;
		int baseAttack = 0;
		String bonusStatus;
		double multiplier;
		double damage = 0;
		
		do {
			System.out.println("Which artifacts you want to add?");
			System.out.println("1. Purple Artifact");
			System.out.println("2. Golden Artifact");
			System.out.print(">> ");
			try {
				artifact = scan.nextInt();
			} catch (Exception e) {
				artifact = 404;
			} scan.nextLine();
		} while (artifact > 2 || artifact < 1);
		
		System.out.println();
		
		if (artifact == 1) {
			
			System.out.println("Add new artifacts!");
			System.out.println("========================");
			
			do {
				System.out.print("Input name [5..25 characters] : ");
				name = scan.nextLine();
			} while (name.length() > 25 || name.length() < 5);
			
			do {
				System.out.print("Input type [Flower | Plume | Sands | Goblet | Circlet] [case sensitive] : ");
				type = scan.nextLine();
			} while (!(type.equals("Flower")) && !(type.equals("Plume")) && !(type.equals("Sands")) && !(type.equals("Goblet")) && !(type.equals("Circlet")));
			
			if (type.equals("Flower") || type.equals("Plume")) {
				do {
					System.out.print("Input base attack [Flower/Plume = 90-100 | Sands/Goblet/Circlet = 101-110] : ");
					try {
						baseAttack = scan.nextInt();
					} catch (Exception e) {
						baseAttack = 404;
					} scan.nextLine();
				} while (baseAttack > 100 || baseAttack < 90);
			} else if (type.equals("Sands") || type.equals("Goblet") || type.equals("Circlet")) {
				do {
					System.out.print("Input base attack [Flower/Plume = 90-100 | Sands/Goblet/Circlet = 101-110] : ");
					try {
						baseAttack = scan.nextInt();
					} catch (Exception e) {
						baseAttack = 404;
					} scan.nextLine();
				} while (baseAttack > 110 || baseAttack < 101);
			}
			
			do {
				System.out.print("Input bonus status [Anemo | Pyro | Hydro | Electro | Cryo][case sensitive] : ");
				bonusStatus = scan.nextLine();
			} while (!(bonusStatus.equals("Anemo") || bonusStatus.equals("Pyro") || bonusStatus.equals("Hydro") || bonusStatus.equals("Electro") || bonusStatus.equals("Cyro")));
			
			PurpleArtifact pAD = new PurpleArtifact(name, type, baseAttack, bonusStatus);
			artifactList.add(pAD);
			
			damage = baseAttack * 100;
			
			damageList.add(damage);
			
			System.out.println();
			System.out.println("Successfully inserted!");
			System.out.println("Press enter to continue...");
			scan.nextLine();
			Menu();
			
		} else if (artifact == 2) {
			
			System.out.println("Add new artifacts!");
			System.out.println("========================");
			
			do {
				System.out.print("Input name [5..25 characters] : ");
				name = scan.nextLine();
			} while (name.length() > 25 || name.length() < 5);
			
			do {
				System.out.print("Input type [Flower | Plume | Sands | Goblet | Circlet] [case sensitive] : ");
				type = scan.nextLine();
			} while (!(type.equals("Flower")) && !(type.equals("Plume")) && !(type.equals("Sands")) && !(type.equals("Goblet")) && !(type.equals("Circlet")));
			
			if (type.equals("Flower") || type.equals("Plume")) {
				do {
					System.out.print("Input base attack [Flower/Plume = 90-100 | Sands/Goblet/Circlet = 101-110] : ");
					try {
						baseAttack = scan.nextInt();
					} catch (Exception e) {
						baseAttack = 404;
					} scan.nextLine();
				} while (baseAttack > 100 || baseAttack < 90);
			} else if (type.equals("Sands") || type.equals("Goblet") || type.equals("Circlet")) {
				do {
					System.out.print("Input base attack [Flower/Plume = 90-100 | Sands/Goblet/Circlet = 101-110] : ");
					try {
						baseAttack = scan.nextInt();
					} catch (Exception e) {
						baseAttack = 404;
					} scan.nextLine();
				} while (baseAttack > 110 || baseAttack < 101);
			}
			
			do {
				System.out.print("Input multiplier [1.5x - 2.0x] : ");
				try {
					multiplier = scan.nextDouble();
				} catch (Exception e) {
					multiplier = 404;
				} scan.nextLine();
			} while (multiplier > 2.0 || multiplier < 1.5);
			
			GoldenArtifact gAD = new GoldenArtifact(name, type, baseAttack, multiplier);
			artifactList.add(gAD);
			
			damage = (baseAttack * multiplier) * 100;
			
			damageList.add(damage);
			
			System.out.println();
			System.out.println("Successfully inserted!");
			System.out.println("Press enter to continue...");
			scan.nextLine();
			Menu();
		}
		
	}
	
	private void View() {
		
		if (artifactList.isEmpty()) {
			System.out.println("No obtainable artifacts!");
			System.out.println("Press enter to continue...");
			scan.nextLine();
			Menu();
		} else {
			System.out.println("Obtainable Artifacts");
			System.out.println("=======================================================================");
			System.out.printf("|%-20s|%-15s|%-10s|%-10s|%-10s|\n", "Name", "Type", "Base Atk", "Bonus Stat", "Multiplier");
			System.out.println("+---------------------------------------------------------------------+");
			for (int i = 0; i < artifactList.size(); i++) {
			
				if (artifactList.get(i).getMultiplier() == 0) {
					System.out.printf("|%-20s|%-15s|%-10d|%-10s|%-10s|\n", artifactList.get(i).getName(), artifactList.get(i).getType(), artifactList.get(i).getBaseAttack(), artifactList.get(i).getBonusStatus(), "-");
				} else {
					System.out.printf("|%-20s|%-15s|%-10d|%-10s|%-10f|\n", artifactList.get(i).getName(), artifactList.get(i).getType(), artifactList.get(i).getBaseAttack(), "-", artifactList.get(i).getMultiplier());
				}
			}
			System.out.println("=======================================================================");
		}
		
		System.out.println();
		System.out.println("Press enter to continue...");
		scan.nextLine();
		Menu();
		
	}
	
	private void Grind() {
		
		String character = null;
		int random = rand.nextInt(artifactList.size());
		
		if (artifactList.isEmpty()) {
			System.out.println("No obtainable artifacts!");
			System.out.println("Press enter to continue...");
			scan.nextLine();
			Menu();
		} else {
			System.out.println("List Character:");
			System.out.println("Diluc - Xiao - Keqing");
			do {
				System.out.print("Input chosen character [case insensitive] : ");
				character = scan.nextLine();
				if (!(character.equalsIgnoreCase("Diluc")) && !(character.equalsIgnoreCase("Xiao")) && !(character.equalsIgnoreCase("Keqing"))) {
					System.out.println("Character invalid!");
				}
			} while (!(character.equalsIgnoreCase("Diluc")) && !(character.equalsIgnoreCase("Xiao")) && !(character.equalsIgnoreCase("Keqing")));
		}
		
		System.out.println();
		
		Artifact x = artifactList.get(random);
		System.out.println(character + " came back and got you a new artifact!");
		System.out.println("Name : " + x.getName());
		System.out.println("Type : " + x.getType());
		System.out.println("Base atk : " + x.getBaseAttack());
			
		if (x instanceof PurpleArtifact) {
			System.out.println("Damage : " + damageList.get(random));
			System.out.println("Bonus Stat : " + ((PurpleArtifact)x).getBonusStatus());
		} else {
			System.out.println("Damage : " + damageList.get(random));
		}
		
		System.out.println();
		System.out.println("Press enter to continue...");
		
		artifactList.remove(random);
		damageList.remove(random);
		
		scan.nextLine();
		Menu();
		
	}
	

	public static void main(String[] args) {
		new Main();

	}

}
