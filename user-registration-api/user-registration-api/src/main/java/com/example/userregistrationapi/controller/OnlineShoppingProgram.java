package com.example.userregistrationapi.controller;

import java.util.Scanner;

class Product {

    int productId;
    String productName;
    double price;
    String brand;
    int quantity;

    Product(int productId, String productName, double price,
            String brand, int quantity) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
    }

    void calculatePrice() {
        System.out.println("Product price calculation");
    }

    void displayDetails() {

        System.out.println("Product ID      : " + productId);
        System.out.println("Product Name    : " + productName);
        System.out.println("Brand           : " + brand);
        System.out.println("Price           : " + price);
        System.out.println("Quantity        : " + quantity);
    }
}

// Child 1
class Electronics extends Product {

    int warranty;
    int deliveryDays;

    Electronics(int productId, String productName, double price,
                String brand, int quantity,
                int warranty, int deliveryDays) {

        super(productId, productName, price, brand, quantity);

        this.warranty = warranty;
        this.deliveryDays = deliveryDays;
    }

    @Override
    void calculatePrice() {

        double discount = price * 0.10;
        double finalPrice = (price - discount) * quantity;

        displayDetails();

        System.out.println("Category        : Electronics");
        System.out.println("Warranty        : " + warranty + " Years");
        System.out.println("Delivery Days   : " + deliveryDays);
        System.out.println("Discount        : " + discount);
        System.out.println("Final Price     : " + finalPrice);
    }
}

// Child 2
class Clothing extends Product {

    String size;
    String color;
    String material;

    Clothing(int productId, String productName, double price,
             String brand, int quantity,
             String size, String color, String material) {

        super(productId, productName, price, brand, quantity);

        this.size = size;
        this.color = color;
        this.material = material;
    }

    @Override
    void calculatePrice() {

        double discount = price * 0.20;
        double finalPrice = (price - discount) * quantity;

        displayDetails();

        System.out.println("Category        : Clothing");
        System.out.println("Size            : " + size);
        System.out.println("Color           : " + color);
        System.out.println("Material        : " + material);
        System.out.println("Discount        : " + discount);
        System.out.println("Final Price     : " + finalPrice);
    }
}

// Child 3
class Food extends Product {

    String expiryDate;
    double weight;
    String foodType;

    Food(int productId, String productName, double price,
         String brand, int quantity,
         String expiryDate, double weight, String foodType) {

        super(productId, productName, price, brand, quantity);

        this.expiryDate = expiryDate;
        this.weight = weight;
        this.foodType = foodType;
    }

    @Override
    void calculatePrice() {

        double discount = price * 0.05;
        double finalPrice = (price - discount) * quantity;

        displayDetails();

        System.out.println("Category        : Food");
        System.out.println("Expiry Date     : " + expiryDate);
        System.out.println("Weight          : " + weight + " kg");
        System.out.println("Food Type       : " + foodType);
        System.out.println("Discount        : " + discount);
        System.out.println("Final Price     : " + finalPrice);
    }
}

public class OnlineShoppingProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ONLINE SHOPPING =====");

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.println("\nSelect Product Type");
        System.out.println("1. Electronics");
        System.out.println("2. Clothing");
        System.out.println("3. Food");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Product product;

        if (choice == 1) {

            System.out.print("Enter Warranty Years: ");
            int warranty = sc.nextInt();

            System.out.print("Enter Delivery Days: ");
            int delivery = sc.nextInt();

            product = new Electronics(
                    id, name, price, brand, quantity,
                    warranty, delivery
            );

        } else if (choice == 2) {

            sc.nextLine();

            System.out.print("Enter Size: ");
            String size = sc.nextLine();

            System.out.print("Enter Color: ");
            String color = sc.nextLine();

            System.out.print("Enter Material: ");
            String material = sc.nextLine();

            product = new Clothing(
                    id, name, price, brand, quantity,
                    size, color, material
            );

        } else {

            sc.nextLine();

            System.out.print("Enter Expiry Date: ");
            String expiry = sc.nextLine();

            System.out.print("Enter Weight: ");
            double weight = sc.nextDouble();

            sc.nextLine();

            System.out.print("Enter Food Type: ");
            String foodType = sc.nextLine();

            product = new Food(
                    id, name, price, brand, quantity,
                    expiry, weight, foodType
            );
        }

        System.out.println("\n----- PRODUCT DETAILS -----");

        product.calculatePrice();

        sc.close();
    }
}