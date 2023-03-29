import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner input = new Scanner(System.in);
    ArrayList<customerTable> tables = new ArrayList<customerTable>();
    ArrayList<tableOrder> orders = new ArrayList<tableOrder>();
	
    double totalCash = 0;
    String foodOrder;
    double foodPrice;
    int foodQuantity;
    int totalPrice;
    int tableNumber;
    double totalFee;
    
	public Main() {
		Menu();
	}
	
    public void addOrder() {

        // table number input
        System.out.print("Input table number : ");
        while (!input.hasNextInt()) {
            System.out.println("Input error.");
            System.out.println("Input table number : ");
            input.next();
        }
        int tableNumber = input.nextInt();
        input.nextLine();
        // newTable.tableNumber = tableNumber;

        // gatekeeper
        // System.out.println("Table Number succeed.");

        
  

            // order input
            System.out.print("Input order : ");
            while (input.hasNextInt()) {
                System.out.println("Input error.");
                System.out.print("Input Order : ");
                foodOrder = input.nextLine();
            }

            // gatekeeper
            // System.out.println("Order succeed.");

            // quantity input
            System.out.print("Input quantity : ");
            while (!input.hasNextInt()) {
                System.out.println("Input error.");
                System.out.print("Input quantity : ");
                try {
					foodQuantity = input.nextInt();
				} catch (Exception e) {
					// TODO: handle exception
				} input.nextLine();
            }

            // gatekeeper
            // System.out.println("Quantity succeed.");

            // price per quantity input
            System.out.print("Input price (in one quantity) : Rp");
            while (!input.hasNextInt()) {
                System.out.println("Input error.");
                System.out.print("Input price (in one quantity) : ");
                try {
					foodPrice = input.nextDouble();
				} catch (Exception e) {
					// TODO: handle exception
				} input.nextLine();
            }

            // gatekeeper
            // System.out.println("Price succeed.");

            tableOrder orderData = new tableOrder(foodOrder, foodPrice, foodQuantity);
            this.orders.add(orderData);
            

            System.out.println();
    		System.out.println("Your order has been added..");
    		System.out.println();
    		System.out.println("Press enter to continue..");
    		input.nextLine();
    		Menu();

        

        totalPrice = 0;
        totalFee = 0;
        
        customerTable tableData = new customerTable(totalPrice, tableNumber, totalFee);
        this.tables.add(tableData);
    }

    public void showOrders() {

        System.out.print("Table number : ");
        
        int tableNumberKey = 0;
        tableNumberKey = input.nextInt();
        input.nextLine();

        System.out.println("====================================");
        System.out.println("| Quantity\t|| Name\t||\tPrice\t|");
        System.out.println("====================================");

        for (int i = 0; i < tables.size(); i++) {
            if (tables.get(i).getTableNumber() == tableNumberKey) {
                for (int j = 0; j < orders.size(); j++) {
                    System.out.print("" + orders.get(j).getFoodQuantity() + "\t");
                    System.out.print(orders.get(j).getFoodOrder() + "\t");
                    System.out.println("Rp" + orders.get(j).getFoodPrice());
                }
            }
        }

        // for (customerTable table : tables) {
        // // if (table.getTableNumber() == tableNumber) {
        // for (int i) {
        // // System.out.print("" + list.getFoodQuantity() + "\t");
        // // System.out.print(list.getFoodOrder() + "\t");
        // // System.out.println("Rp" + list.getFoodPrice());
        // }
        // // }
        // }
    }

    public void removeOrder() {

    }

    public void exit() {

    }

    public void header() {
        String logo = " ___ _                ___       __     \n" +
                "| _ ) |_  _ ___ ___  / __|__ _ / _|___ \n" +
                "| _ \\ | || / -_|_-< | (__/ _` |  _/ -_)\n" +
                "|___/_|\\_,_\\___/__/  \\___\\__,_|_| \\___|\n\n" +
                "Total earned money : Rp" + totalCash +
                "\n=======================================";

        System.out.println(logo);
    }

    public void Menu() {

        System.out.println("1. Add Order");
        System.out.println("2. Show All Order");
        System.out.println("3. Remove Order");
        System.out.println("4. Exit");
        System.out.print(">> ");

        while (!input.hasNextInt()) {
            System.out.println("Wrong input.");
            System.out.print(">> ");
            input.next();
        }
        int key = input.nextInt();

        if (key == 1) {
			addOrder();
		} else if (key == 2) {
			showOrders();
		} else if (key == 3) {
			removeOrder();
		} else if (key == 4) {
			System.exit(0);
		}
    }

	public static void main(String[] args) {
        new Main();

	}

}
