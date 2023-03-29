import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);

	int menu;
	String name;
	int age;
	String flightType;
	String departure;
	String destination;
	String classTicket;
	int number;

	public Main() {

		menu();

	}

	public void menu() {
		System.out.println("1. Let's Travel");
		System.out.println("2. Exit");
		System.out.println("Choose : ");
		menu = scan.nextInt();
		scan.nextLine();

		if (menu == 1) {
			letsTravel();
		} else if (menu == 2) {
			exit();
		}
	}

	public void letsTravel() {

		do {
			System.out.print("Input customer name: ");
			name = scan.nextLine();
		} while (name.length() < 1 || name.length() > 50);

		do {
			System.out.print("Input age [min. 1]: ");
			try {
				age = scan.nextInt();
			} catch (Exception e) {
				age = -1;
			}
			scan.nextLine();
		} while (age < 1);

		do {
			System.out.print("Input flight type [Domestic | International]: ");
			flightType = scan.nextLine();
		} while (!(flightType.equals("Domestic") || flightType.equals("International")));

		do {
			System.out.print("Input departure city [4..20]: ");
			departure = scan.nextLine();
		} while (departure.length() < 4 || departure.length() > 20);

		do {
			System.out.print("Input desrination city [4..20]: ");
			destination = scan.nextLine();
		} while (destination.length() < 4 || destination.length() > 20 || destination.equals(departure));

		do {
			System.out.print("Select flight class ticket [Eco | Silver | Prime]: ");
			classTicket = scan.nextLine();
		} while (!(classTicket.equals("Eco") || classTicket.equals("Silver") || classTicket.equals("Prime")));

		System.out.println("");
		System.out.println("traFleX Airlines");
		System.out.println("================");
		System.out.println("");

		System.out.println("Customer Name: " + name);
		System.out.println("Age          : " + age);
		System.out.println("Depatrute    : " + departure);
		System.out.println("Destination  : " + destination);
		System.out.println("Ticket Class : " + classTicket);

		System.out.println("");

		System.out.println("-Bon Voyage-");
		System.out.println("Have a nice trip!");
		System.out.println("Press enter to continue...");

		scan.nextLine();

		menu();

	}

	public void exit() {

	}

	public static void main(String[] args) {
		new Main();

	}

}
