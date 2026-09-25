package com.example.userregistrationapi.controller;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Type of Building (House/Shop): ");
        String type = sc.nextLine();

        System.out.print("Enter Previous Reading: ");
        int previous = sc.nextInt();

        System.out.print("Enter Current Reading: ");
        int current = sc.nextInt();

        int units = current - previous;

        double rate;
        double bill;
        double concession = 0;

        if (type.equalsIgnoreCase("House")) {
            rate = 5;
            bill = units * rate;

            // 10% concession for House
            concession = bill * 0.10;
            bill = bill - concession;


        } else {
            rate = 8;
            bill = units * rate;

        }

        System.out.println("\n================================================");
        System.out.println("             ELECTRICITY BILL");
        System.out.println("================================================");

        System.out.printf("%-20s : %d%n", "Consumer ID", id);
        System.out.printf("%-20s : %s%n", "Consumer Name", name);
        System.out.printf("%-20s : %s%n", "Building Type", type);
        System.out.printf("%-20s : %d%n", "Previous Reading", previous);
        System.out.printf("%-20s : %d%n", "Current Reading", current);
        System.out.printf("%-20s : %d%n", "Units Consumed", units);
        System.out.printf("%-20s : %.2f%n", "Concession", concession);
        System.out.printf("%-20s : %.2f%n", "Final Bill", bill);

        System.out.println("================================================");

        sc.close();

}}