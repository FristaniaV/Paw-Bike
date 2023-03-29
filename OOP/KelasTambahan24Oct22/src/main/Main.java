package main;

import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);

	// OOP 60%
	// OOP -> banyak class
	// Class -> blueprint -> biar bisa dipake terus
	// Constructor -> yang cetak
	// Object -> hasil cetakan
	// Attributes -> data dari class. ciri"ny gt la
	
	// Case: Resto buat sistem CRUD
	// 1. Big Idea: Menu
	// 2. Class: Menu, makanan, dan minuman
	
	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public void Menu() {
		int choose;
		System.out.println("1. Tambah Menu");
		System.out.println("2. Lihat Menu");
		System.out.println("3. Hapus Menu");
		System.out.println("4. Exit");
		do {
			System.out.print(">> ");
			try {
				choose = scan.nextInt();
			} catch (Exception e) {
				choose = 404;
			} scan.nextLine();
		} while (choose > 4 || choose < 1);
	}

	public static void main(String[] args) {
		new Main();

	}

}
