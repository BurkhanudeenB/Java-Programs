package com.example.userregistrationapi.controller;
import java.util.Scanner;
public class ElectricBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalBill = 0;

        for (int month = 1; month <= 6; month++) {

            System.out.print("Enter units for month " + month + ": ");
            int units = sc.nextInt();

            double bill = units * 5;

            System.out.println("Bill = ₹" + bill);

            totalBill = totalBill + bill;
        }

        System.out.println("-------------------------");
        System.out.println("Total Bill for 6 Months = ₹" + totalBill);

        sc.close();
    }}