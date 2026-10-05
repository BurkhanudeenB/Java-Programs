package com.example.userregistrationapi.controller;

import java.util.Scanner;

public class HouseRent {

    static double calculateRent(String type, double amount) {

        if (type.equalsIgnoreCase("rent")) {
            return amount;
        } else if (type.equalsIgnoreCase("lease")) {
            return amount;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of houses: ");
        int houses = sc.nextInt();

        String[] ownerNames = new String[houses];
        String[] types = new String[houses];
        double[] amounts = new double[houses];

        double totalRent = 0;

        for (int i = 0; i < houses; i++) {

            System.out.println("\nHouse " + (i + 1));

            sc.nextLine();

            System.out.print("Enter Owner Name: ");
            ownerNames[i] = sc.nextLine();

            System.out.print("Enter Type (Rent/Lease): ");
            types[i] = sc.nextLine();

            System.out.print("Enter Amount: ");
            amounts[i] = sc.nextDouble();

            double result = calculateRent(types[i], amounts[i]);

            totalRent = totalRent + result;
        }

        System.out.println("\n========== HOUSE DETAILS ==========");

        for (int i = 0; i < houses; i++) {

            System.out.println("Owner : " + ownerNames[i]);
            System.out.println("Type  : " + types[i]);
            System.out.println("Amount: ₹" + amounts[i]);
            System.out.println("--------------------------------");
        }

        System.out.println("Total Rent = ₹" + totalRent);

        sc.close();
    }
}