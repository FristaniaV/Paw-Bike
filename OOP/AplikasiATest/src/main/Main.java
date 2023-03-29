package main;

import java.util.ArrayList;
import java.util.Scanner;

import level.Basic;
import level.Gold;
import level.Platinum;
import level.Silver;
import level.User;

public class Main {

	Scanner scan = new Scanner(System.in);
	//ke basic bukan ke user karena dia awalnya langsung auto ke BASIC
	ArrayList<User> basicData = new ArrayList<User>();
	
	String username; 
	String password; 
	String email;
	String phone; 
	String firstName; 
	String lastName; 
	String gender; 
	String DOB; 
	int transactionCount = 0;
	int poin = 0;
	int menu;
	int moneySpent = 0;
	
	public Main() {

		Menu1();
	}
	
	public void Menu1() {
		System.out.println("Aplikasi A");
		System.out.println("=================");
		
		do {
			System.out.print("Input first name: ");
			firstName = scan.nextLine();
		} while (firstName.length()<2);
		
		do {
			System.out.print("Input last name: ");
			lastName = scan.nextLine();
			
		} while (lastName.length()<2);

		System.out.print("Input username: ");
		username = scan.nextLine();

		do {
			System.out.print("Input Email [ Must be valid email with '@' ]: ");
			email = scan.nextLine();
		} while (!email.contains("@"));
				
		do {
			System.out.print("Input phone [ Must be valid number with minimal 10 digits! ]: ");
			phone = scan.nextLine();
		} while (phone.length()<10 || phone.startsWith("0"));
				
		do {
			System.out.print("Input gender [ Pria | Wanita ] (case insensitive): ");
			gender = scan.nextLine();
		} while (!gender.equalsIgnoreCase("pria") && !gender.equalsIgnoreCase("wanita"));
				
		System.out.print("Input DOB: ");		
		DOB = scan.nextLine();
				
		do {
			System.out.print("Input password [ minimal 6 digits! ]: ");
			password = scan.nextLine();	
		} while (password.length()<6);
				
		System.out.println("");
		System.out.println("Terima kasih telah registrasi!");

		System.out.println();
		Menu2();
		
		//save data 
		// jumlah transaksi poin dll semua jadiin 0 
		//basicData.add(new Basic(username, password, email, phone, firstName, lastName, gender, DOB, 0, 0, 0));
	
	}
	
	public void Menu2() {
		do {
			System.out.println("Menu");
			System.out.println("======");
			System.out.println("1. Tukar poin");
			System.out.println("2. exit");
			System.out.print(">> ");
			menu = scan.nextInt(); scan.nextLine();
			
			if (menu == 1) {
				CheckPoin();
			} else if (menu == 2) {
				System.exit(0);
			}
		} while(menu > 2 || menu < 1);
	}
	
	public void CheckPoin() {
		do {
			System.out.print("Input total transaction made: ");
			transactionCount = scan.nextInt(); scan.nextLine();
		} while (transactionCount<1);
		
		do {
			System.out.print("Input total transaction [ Input money ]: ");
			moneySpent = scan.nextInt(); scan.nextLine();
			//gk boleh kalo misal money spent = 0 
		} while (!(moneySpent%10000 == 0));
		
		

		//basic => Silver => gold => Plantinum  by REMOVING the basic
		if (transactionCount > 0 && transactionCount < 50) {
			//basicData.remove(basicData.size() - 1);
			
			Basic basicUser = new Basic(username, password, email, phone, firstName, lastName, gender, DOB, poin, transactionCount, moneySpent);
			basicUser.poinConversion();
		
			System.out.println("Poin kamu adalah " + basicUser.getPoin());
			
		} else if (transactionCount > 49 && transactionCount < 100) {
			//basicData.remove(basicData.size() - 1);

			Silver silverUser = new Silver(username, password, email, phone, firstName, lastName, gender, DOB, poin, transactionCount, moneySpent);
			silverUser.poinConversion();
			
			System.out.println("Poin kamu adalah " + silverUser.getPoin());
			
		}else if (transactionCount > 99 && transactionCount < 150) {
			//basicData.remove(basicData.size() - 1);
			
			Gold goldUser = new Gold(username, password, email, phone, firstName, lastName, gender, DOB, poin, transactionCount, moneySpent);
			goldUser.poinConversion();
			
			System.out.println("Poin kamu adalah " + goldUser.getPoin());
			
		} else if (transactionCount > 149) {
			//basicData.remove(basicData.size() - 1);
			
			Platinum platinumUser = new Platinum(username, password, email, phone, firstName, lastName, gender, DOB, poin, transactionCount, moneySpent);
			platinumUser.poinConversion();
			
			System.out.println("Poin kamu adalah " + platinumUser.getPoin());

		}
		
		System.out.println();
		Menu1();
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
