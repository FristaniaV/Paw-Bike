package pohStriurF;

import java.util.ArrayList;
import java.util.Scanner;

public class PohStriurF {

	Scanner scan = new Scanner(System.in);
	ArrayList<String> nameList = new ArrayList<>();
	ArrayList<String> typeList = new ArrayList<>();
	ArrayList<String> priceList = new ArrayList<>();

	String name;
	String type;
	String price;

	public PohStriurF() {

		Menu();

	}

	public void Menu() {
		int choose = 0;

		do {
			System.out.println("pohStiurF");
			System.out.println("============");
			System.out.println("1. View Fruits");
			System.out.println("2. Insert Fruits");
			System.out.println("3. Remove Fruits");
			System.out.println("4. Exit");
			System.out.print(">> ");
			try {
				choose = scan.nextInt();
			} catch (Exception e) {
				choose = 0;
			}
			scan.nextLine();
			if (choose == 1) {
				View();
			} else if (choose == 2) {
				Insert();
			} else if (choose == 3) {
				Remove();
			} else if (choose == 4) {
				System.exit(0);
			}
		} while (choose > 4 || choose < 1);
	}

	public void Insert() {
		do {
			System.out.print("Input Fruits Name [Length must be between 3 - 15 characters]: ");
			name = scan.nextLine();
		} while (name.length() < 3 || name.length() > 15);
		nameList.add(name);

		do {
			System.out.print("Input Fruits Type [ Citrus | Berries | Tropical ]: ");
			type = scan.nextLine();
		} while (!(type.equals("Citrus")) && !(type.equals("Berries")) && !(type.equals("Tropical")));
		typeList.add(type);

		do {
			System.out.print("Input Fruits Price [Must be multiple of 1000]: ");
			price = scan.nextLine();
		} while (!price.endsWith("000"));
		priceList.add(price);

		System.out.println(name + " with Type: " + type + " and Price: " + price + " has been registered!");
		System.out.println("Press enter to continue...");
		scan.nextLine();
		Menu();

	}
	
	public void View() {
		for (int i = 0; i < nameList.size(); i++) {
			for (int j = 0; j < nameList.size() - 1; j++) {
				if (nameList.get(j).compareTo(nameList.get(j + 1)) > 0) {
					String temp;

					temp = nameList.get(j);
					nameList.set(j, nameList.get(j + 1));
					nameList.set((j + 1), temp);

					temp = typeList.get(j);
					typeList.set(j, typeList.get(j + 1));
					typeList.set((j + 1), temp);

					temp = priceList.get(j);
					priceList.set(j, priceList.get(j + 1));
					priceList.set((j + 1), temp);
				}
			}
		}
		if (nameList.isEmpty()) {
			System.out.println("No fruits to be viewed");
			System.out.println();
			Menu();
		} else {
			for (int i = 0; i < nameList.size(); i++) {
				System.out.println("No. " + (i + 1));
				System.out.println("Fruit Name  : " + nameList.get(i));
				System.out.println("Fruit Type  : " + typeList.get(i));
				System.out.println("Fruit Price : " + priceList.get(i));
				System.out.println("===================================");
			}

			System.out.println();
			Menu();

		}
	}

	public void Remove() {

		int del;
		// double ranDisc = (Math.random() * (max - min + 1) + min);
		// Integer randNum1 = (int)(Math.random() * 50 + 1);
		Integer captcha = (int)(Math.random() * 901 + 100); 
		int inputCaptcha;
		
		if (nameList.isEmpty()) {
			System.out.println("No Fruits to be deleted!");
			System.out.println();
			Menu();
		} else {
			for (int i = 0; i < nameList.size(); i++) {
				System.out.println("No. " + (i + 1));
				System.out.println("Fruit Name  : " + nameList.get(i));
				System.out.println("Fruit Type  : " + typeList.get(i));
				System.out.println("Fruit Price : " + priceList.get(i));
				System.out.println("===================================");
			}
			do {
				System.out.print("Input to delete [1 - " + nameList.size() + "]");
				del = scan.nextInt(); scan.nextLine();
			} while (del < 1 || del > nameList.size());
			
			
			System.out.println("Captcha: " + captcha);
			
			do {
				System.out.print(">> ");
				inputCaptcha = scan.nextInt(); scan.nextLine();
			} while (captcha != inputCaptcha);
			
			nameList.remove(del-1);
			typeList.remove(del-1);
			priceList.remove(del-1);
			
			System.out.println("Fruits deleted!");
			System.out.println("Press enter to continue...");
			scan.nextLine();
			Menu();
			
		}

	}

	public static void main(String[] args) {
		new PohStriurF();

	}

}
