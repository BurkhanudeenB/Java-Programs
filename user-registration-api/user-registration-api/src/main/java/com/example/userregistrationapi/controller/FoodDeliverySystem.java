package com.example.userregistrationapi.controller;

import java.util.Scanner;

abstract class FoodOrder {

    String customerName;
    double price;

    FoodOrder(String customerName, double price) {
        this.customerName = customerName;
        this.price = price;
    }

    abstract void prepareFood();

    void displayOrder() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Price         : ₹" + price);
    }
}

class Pizza extends FoodOrder {

    Pizza(String customerName, double price) {
        super(customerName, price);
    }

    @Override
    void prepareFood() {
        System.out.println("Preparing Pizza...");
    }
}

class Burger extends FoodOrder {

    Burger(String customerName, double price) {
        super(customerName, price);
    }

    @Override
    void prepareFood() {
        System.out.println("Preparing Burger...");
    }
}

class Biryani extends FoodOrder {

    Biryani(String customerName, double price) {
        super(customerName, price);
    }

    @Override
    void prepareFood() {
        System.out.println("Preparing Biryani...");
    }
}

public class FoodDeliverySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.println("\n1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Biryani");

        System.out.print("Choose food: ");
        int choice = sc.nextInt();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        FoodOrder order;

        switch (choice) {

            case 1:
                order = new Pizza(name, price);
                break;

            case 2:
                order = new Burger(name, price);
                break;

            case 3:
                order = new Biryani(name, price);
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        System.out.println();

        order.prepareFood();
        order.displayOrder();

        sc.close();
    }
}
