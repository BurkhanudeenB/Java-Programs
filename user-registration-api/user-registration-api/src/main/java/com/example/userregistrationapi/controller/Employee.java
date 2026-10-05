package com.example.userregistrationapi.controller;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int employees = sc.nextInt();

        int[] ids = new int[employees];
        String[] names = new String[employees];
        double[] salaries = new double[employees];

        int highestIndex = 0;

        for (int i = 0; i < employees; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            ids[i] = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salaries[i] = sc.nextDouble();

            if (i == 0) {
                highestIndex = 0;
            } else if (salaries[i] > salaries[highestIndex]) {
                highestIndex = i;
            }
        }

        System.out.println("\n========== EMPLOYEE DETAILS ==========");

        for (int i = 0; i < employees; i++) {

            System.out.println("ID     : " + ids[i]);
            System.out.println("Name   : " + names[i]);
            System.out.println("Salary : ₹" + salaries[i]);
            System.out.println("-----------------------------------");
        }

        System.out.println("\n========== HIGHEST SALARY ==========");

        System.out.println("Employee ID   : " + ids[highestIndex]);
        System.out.println("Employee Name : " + names[highestIndex]);
        System.out.println("Salary        : ₹" + salaries[highestIndex]);

        sc.close();
    }
}