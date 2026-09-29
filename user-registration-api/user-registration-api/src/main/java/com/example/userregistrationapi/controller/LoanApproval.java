package com.example.userregistrationapi.controller;

import java.util.Scanner;

public class LoanApproval {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Are you an employee? (true/false): ");
        boolean employeeStatus = sc.nextBoolean();

        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        boolean approved;

        if (employeeStatus && salary >= 20000 && creditScore >= 700) {
            approved = true;
        } else {
            approved = false;
        }

        System.out.println("\n======================================");
        System.out.println("          LOAN APPROVAL DETAILS");
        System.out.println("======================================");

        System.out.printf("%-20s : %s%n", "Employee Status", employeeStatus);
        System.out.printf("%-20s : %.2f%n", "Monthly Salary", salary);
        System.out.printf("%-20s : %d%n", "Credit Score", creditScore);

        if (approved) {
            System.out.println("--------------------------------------");
            System.out.println("Loan Status         : APPROVED");
        } else {
            System.out.println("--------------------------------------");
            System.out.println("Loan Status         : NOT APPROVED");
        }

        System.out.println("======================================");

        sc.close();
    }
}