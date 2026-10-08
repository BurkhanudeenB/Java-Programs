package com.example.userregistrationapi.controller;

import java.util.Scanner;

class Employee {

    int empId;
    String empName;
    double basicSalary;
    String department;

    Employee(int empId, String empName, double basicSalary, String department) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.department = department;
    }

    void calculateSalary() {
        System.out.println("Salary calculation");
    }

    void displayDetails() {
        System.out.println("Employee ID     : " + empId);
        System.out.println("Employee Name   : " + empName);
        System.out.println("Department      : " + department);
        System.out.println("Basic Salary    : " + basicSalary);
    }
}

// Child class 1
class Manager extends Employee {

    Manager(int empId, String empName, double basicSalary, String department) {
        super(empId, empName, basicSalary, department);
    }

    @Override
    void calculateSalary() {

        double hra = basicSalary * 0.20;
        double bonus = 5000;
        double finalSalary = basicSalary + hra + bonus;

        displayDetails();
        System.out.println("Role            : Manager");
        System.out.println("HRA             : " + hra);
        System.out.println("Bonus           : " + bonus);
        System.out.println("Final Salary    : " + finalSalary);
    }
}

// Child class 2
class Developer extends Employee {

    Developer(int empId, String empName, double basicSalary, String department) {
        super(empId, empName, basicSalary, department);
    }

    @Override
    void calculateSalary() {

        double hra = basicSalary * 0.15;
        double projectAllowance = 3000;
        double finalSalary = basicSalary + hra + projectAllowance;

        displayDetails();
        System.out.println("Role            : Developer");
        System.out.println("HRA             : " + hra);
        System.out.println("Project Allow.  : " + projectAllowance);
        System.out.println("Final Salary    : " + finalSalary);
    }
}

// Child class 3
class Intern extends Employee {

    Intern(int empId, String empName, double basicSalary, String department) {
        super(empId, empName, basicSalary, department);
    }

    @Override
    void calculateSalary() {

        double allowance = 1000;
        double finalSalary = basicSalary + allowance;

        displayDetails();
        System.out.println("Role            : Intern");
        System.out.println("Allowance       : " + allowance);
        System.out.println("Final Salary    : " + finalSalary);
    }
}

public class EmployeeSalaryProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.println("\nChoose Employee Type");
        System.out.println("1. Manager");
        System.out.println("2. Developer");
        System.out.println("3. Intern");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Employee employee;

        if (choice == 1) {
            employee = new Manager(id, name, salary, department);
        }
        else if (choice == 2) {
            employee = new Developer(id, name, salary, department);
        }
        else {
            employee = new Intern(id, name, salary, department);
        }

        System.out.println("\n----- EMPLOYEE DETAILS -----");
        employee.calculateSalary();

        sc.close();
    }
}