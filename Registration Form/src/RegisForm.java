import java.util.Scanner;

public class RegisForm {

	public RegisForm() {
		String name;
		String major;
		int quantity;
		int price = 0;
		int discount = 0;
		int total;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("=================");
			System.out.println("Registration Form");
			System.out.println("=================");
			System.out.println("Input your name [5...30]: ");
			name = scan.nextLine();
		} while (name.length() < 5 || name.length() > 30);

		do {
			System.out.println("Choose your major [Computer Science | Information System]: ");
			major = scan.nextLine();
		} while (!major.equalsIgnoreCase("Computer Science") && !major.equalsIgnoreCase("Information System"));
		
		do {
			System.out.println("Quantity of form [1...10]; ");
			quantity = scan.nextInt();
			scan.nextLine();
		} while (quantity < 1 || quantity > 10);

		System.out.println("Registration Form");
		System.out.println("=================");
		System.out.println("Name: " + name);
		System.out.println("Major: " + major);
		System.out.println("Quantity: " + quantity);

		if (major.equalsIgnoreCase("Computer Science")) {
			price = 200000;
		} else if (major.equalsIgnoreCase("Information System")) {
			price = 150000;
		}
		
		if (quantity >= 5) {
			discount = (int) (0.2 * price * quantity);
		} else if (quantity >= 3 && quantity < 5) {
			discount = (int) (0.1 * price * quantity);
		}
		
		System.out.println("Discount: " + discount);
		total = price * quantity;
		System.out.println("Total Price: " + (total - discount));
		System.out.println("-Thanks for coming-");
		scan.close();
	}


	public static void main(String[] args) {
		new RegisForm();

	}

}
