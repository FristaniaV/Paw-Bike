package pawBike;

import java.util.ArrayList;
import java.util.Scanner;

public class PawBike {

	Scanner scan = new Scanner(System.in);

	String resto;
	String food;
	int price;
	String address;
	String ynn;
	String newResto;
	String newFood;
	String newAddress;
	int newPrice;
	String newResto2;
	String newFood2;
	String newAddress2;
	int newPrice2;
	String show;
	

	ArrayList<String> restoList = new ArrayList<String>();
	ArrayList<String> foodList = new ArrayList<String>();
	ArrayList<String> addressList = new ArrayList<String>();
	ArrayList<Integer> priceList = new ArrayList<Integer>();

	public PawBike() {

		menu();
	}

	public void menu() {

		int choose;

		do {
			System.out.println("Welcome to Paw Bike");
			System.out.println("===================");
			System.out.println("1. Add New Order");
			System.out.println("2. Show All Order");
			System.out.println("3. Update an Order");
			System.out.println("4. Cancel an Order");
			System.out.println("5. Exit");
			System.out.print(">> ");
			choose = scan.nextInt();
			scan.nextLine();
		} while (choose > 5 || choose < 1);

		if (choose == 1) {
			add();
		} else if (choose == 2) {
			show();
		} else if (choose == 3) {
			update();
		} else if (choose == 4) {
			cancel();
		} else if (choose == 5) {
			System.out.println("Thankyou for using this application");
			System.exit(0);
		}

	}

	public void add() {

		do {
			System.out.print("Input Restaurant Name [Must starts with 'Resto ']: ");
			resto = scan.nextLine();
		} while (!resto.startsWith("Resto "));

		do {
			System.out.print("Input Food Name [Must between 5 - 15 characters]: ");
			food = scan.nextLine();
		} while (food.length() > 15 || food.length() < 5);

		do {
			System.out.print("Input Food Price [Must Between 15000 - 100000]: ");
			price = scan.nextInt(); scan.nextLine();
		} while (price > 100000 || price < 15000);

		do {
			System.out.print("Input Your Address [Must ends with ' Street']: ");
			address = scan.nextLine();
		} while (!address.endsWith(" Street"));

		do {
			System.out.print("Apply a Voucher [Yes or No]: ");
			ynn = scan.nextLine();
		} while (!ynn.equals("Yes") && !ynn.equals("No"));

		int min = 35;
		int max = 50;
		double ranDisc = (Math.random() * (max - min + 1) + min);
		int currentPrice =  (int)(((100 - ranDisc) * price)/100);
		restoList.add(resto);
		foodList.add(food);
		priceList.add(currentPrice);
		addressList.add(address);
		
		if (ynn.equals("No")) {
			System.out.println("Press enter to continue...");
			scan.nextLine();
			menu();
		} else if (ynn.equals("Yes")) {
			
			System.out.println("Congratulations you have got a discount " + (int)ranDisc + "%");
			System.out.println("Current Food Price: " + currentPrice);
			System.out.println("Press enter to continue...");
			scan.nextLine();
			menu();
		}



	}

	public void show() {
		if (restoList.isEmpty()) {
			System.out.println("There is no data!");
			System.out.println("Press enter to continue...");
			scan.nextLine();
			menu();
		} else {
			double status = Math.random();
			if (status > 0.5000) {
				show = "Ordered";
			} else {
				show = "Success";
			}
			for (int i = 0; i < restoList.size(); i++) {
				System.out.println((i + 1) + ". " + restoList.get(i) + ", " + foodList.get(i) + ", " + priceList.get(i)
						+ ", " + addressList.get(i) + ", " + show);
			}
			System.out.println("Press enter to continue...");
			scan.nextLine();
			menu();
		}
	}

	public void update() {

		int replace;

		if (restoList.isEmpty()) {
			System.out.println("There is no data!");
			System.out.println("Press enter to continue...");
			scan.nextLine();
			menu();
		} else {
			if (show.equals("Success")) {
				System.out.println("The order statur already Success, cannot be upated or deleted");
			} else {
				int min = 35;
				int max = 50;
				double ranDisc = (Math.random() * (max - min + 1) + min);
				int currentPrice =  (int)(((100 - ranDisc) * price)/100);
				do {
					System.out.print("Input Order Number [1 - " + restoList.size() + "] ( 0 back to main menu): ");
					replace = scan.nextInt();
					scan.nextLine();
					if (replace == 0) {
						menu();
					}
				} while (replace > restoList.size() || replace < 0);

				do {
					System.out.print("Input Restaurant Name [Must starts with 'Resto ']: ");
					restoList.set(replace, newResto);
					resto = scan.nextLine();
				} while (!newResto.startsWith("Resto "));

				do {
					System.out.print("Input Food Name [Must between 5 - 15 characters]: ");
					food = scan.nextLine();
					foodList.set(replace, newFood);
				} while (newFood.length() > 15 || newFood.length() < 5);

				do {
					System.out.print("Input Food Price [Must Between 15000 - 100000]: ");
					price = scan.nextInt();
					priceList.set(replace, newPrice);
				} while (newPrice > 100000 || newPrice < 15000);

				do {
					System.out.print("Input Your Address [Must ends with ' Street']: ");
					address = scan.nextLine();
					addressList.set(replace, newAddress);
				} while (!newAddress.endsWith(" Street"));

				do {
					System.out.print("Apply a Voucher [Yes or No]: ");
					ynn = scan.nextLine();
				} while (!ynn.equals("Yes") && !ynn.equals("No"));

				if (ynn.equals("No")) {
					System.out.println("Press enter to continue...");
					scan.nextLine();
					menu();
				} else if (ynn.equals("Yes")) {
					System.out.println("Congratulations you have got a discount " + ranDisc + "%");
					System.out.println("Current Food Price: " + currentPrice);
					System.out.println("Press enter to continue...");
					scan.nextLine();
					menu();
				}
			}
		}

	}

	public void cancel() {

		int del;

		if (restoList.isEmpty()) {
			System.out.println("There is no data!");
			System.out.println("Press enter to continue...");
			scan.nextLine();
			menu();
		} else {
			System.out.print("Input Order Number [1 - " + restoList.size() + "] ( 0 back to main menu): ");
			del = scan.nextInt();
			scan.nextLine();

			do {
				System.out.print("Input Restaurant Name [Must starts with 'Resto ']: ");
				resto = scan.nextLine();
				restoList.remove(del);
			} while (!newResto2.startsWith("Resto "));

			do {
				System.out.print("Input Food Name [Must between 5 - 15 characters]: ");
				food = scan.nextLine();
				foodList.remove(del);
			} while (newFood2.length() > 15 || newFood2.length() < 5);

			do {
				System.out.print("Input Food Price [Must Between 15000 - 100000]: ");
				price = scan.nextInt();
				priceList.remove(del);
			} while (newPrice2 > 100000 || newPrice2 < 15000);

			do {
				System.out.print("Input Your Address [Must ends with ' Street']: ");
				address = scan.nextLine();
				addressList.remove(del);
			} while (!newAddress2.endsWith(" Street"));

			do {
				System.out.print("Apply a Voucher [Yes or No]: ");
				ynn = scan.nextLine();
			} while (!ynn.equals("Yes") && !ynn.equals("No"));

			if (ynn.equals("No")) {
				System.out.println("Press enter to continue...");
				scan.nextLine();
				menu();
			} else if (ynn.equals("Yes")) {
				System.out.println("Press enter to continue...");
				scan.nextLine();
				menu();
			}
		}
	}

	public static void main(String[] args) {
		new PawBike();

	}

}
