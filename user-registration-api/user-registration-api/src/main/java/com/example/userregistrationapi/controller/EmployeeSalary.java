package com.example.userregistrationapi.controller;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Designation: ");
        String desig = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Years of Experience: ");
        int yoe = sc.nextInt();

        System.out.print("Enter Net Pay: ");
        double np = sc.nextDouble();

        double increment = 0;
        double deptBonus = 0;

        if (desig.equalsIgnoreCase("HR") && yoe >= 5) {
            increment = 4000;
        }

        if (dept.equalsIgnoreCase("IT")) {
            deptBonus = 3000;
        } else if (dept.equalsIgnoreCase("HR")) {
            deptBonus = 2000;
        } else if (dept.equalsIgnoreCase("Finance")) {
            deptBonus = 2500;
        }

        double finalPay = np + increment + deptBonus;

        System.out.println("\n====================================================");
        System.out.println("              EMPLOYEE SALARY DETAILS");
        System.out.println("====================================================");

        System.out.printf("%-20s : %d%n", "Employee ID", id);
        System.out.printf("%-20s : %s%n", "Employee Name", name);
        System.out.printf("%-20s : %s%n", "Designation", desig);
        System.out.printf("%-20s : %s%n", "Department", dept);
        System.out.printf("%-20s : %d Years%n", "Experience", yoe);
        System.out.printf("%-20s : %.2f%n", "Net Pay", np);
        System.out.printf("%-20s : %.2f%n", "Increment", increment);
        System.out.printf("%-20s : %.2f%n", "Department Bonus", deptBonus);
        System.out.printf("%-20s : %.2f%n", "Final Pay", finalPay);

        System.out.println("====================================================");

        sc.close();
    }
}