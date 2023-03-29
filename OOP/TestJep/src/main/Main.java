package main;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    Scanner scan = new Scanner(System.in);

    ArrayList<String> tabelNumList =  new ArrayList<>();
    ArrayList<String> orderNameList = new ArrayList<>();
    ArrayList<Double> finalPriceList =  new ArrayList<>();

    String tabelNum;
    double price;
    double finalPrice;
    String orderName;
    double tax;
    double priceAndTax;
    double priceAndServ;
    
    public Main(){
        Menu();
    }

    public void Menu(){
        int choose;
        do{
            System.out.println("1. Add Order");
            System.out.println("2. Show All Orders");
            System.out.println("3. Remove Order");
            System.out.println("4. Exit");
            System.out.println(">> ");
            try{
                choose = scan.nextInt();
            }
            catch(Exception e){
                choose = 404;
            } scan.nextLine();
        } while(choose > 4  || choose < 1);

        if(choose == 1){
            AddOrder();
        }
        else if(choose == 2){
            ShowOrder();
        }
        else if(choose == 3){
            RemoveOrder();
        }
        else if(choose == 4){
            System.exit(0);
        }
    }

    public void AddOrder(){
        do{
            System.out.println("Input your table number: ");
            tabelNum = scan.nextLine();
        }
        while(!(tabelNum.contains("0") || tabelNum.contains("1") || tabelNum.contains("2") || tabelNum.contains("3") || tabelNum.contains("4") || tabelNum.contains("5") || tabelNum.contains("6") || tabelNum.contains("7") || tabelNum.contains("8") || tabelNum.contains("9")));

        tabelNumList.add(tabelNum);

        do{
            System.out.println("Input your order: ");
            orderName = scan.nextLine();
        } while(orderName.length() > 30 || orderName.length() < 5);

        orderNameList.add(orderName);

        do{
            System.out.println("Input your order price: ");
            try{
                price = scan.nextDouble();
            } catch(Exception e){
                price = 404;
            } scan.nextLine();
        } while(price == 0);

        priceAndTax = (price * (10 / 100));
        priceAndServ = (price * (7.5 / 100));
        finalPrice = price + priceAndTax + priceAndServ;

        finalPriceList.add(finalPrice);

        System.out.println();
        System.out.println("Order Added!");
        System.out.println("Press enter to continue...");
        scan.nextLine();
        Menu();

        System.out.println();
    } 

    public void ShowOrder(){
        for(int i = 0; i< tabelNumList.size(); i++){
            System.out.println("Table Number" + tabelNumList.get(i));
            System.out.println("Order Name: " + orderNameList.get(i));
            System.out.println("Price : " + finalPriceList.get(i));
        }
        System.out.println();
        System.out.println("Press enter to continue...");
        scan.nextLine();
        Menu();
    }
    public void RemoveOrder(){

    }
    
    public static void main(String[] args){
        new Main();
    }
}