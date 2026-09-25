package com.example.userregistrationapi.controller;

import java.util.Scanner;

public class StudentMark {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        String grade;

        if (avg >= 90) {
            grade = "O";
        } else if (avg >= 80) {
            grade = "A";
        } else if (avg >= 70) {
            grade = "B";
        } else if (avg >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("\n==============================================");
        System.out.println("           STUDENT MARK DETAILS");
        System.out.println("==============================================");

        System.out.printf("%-10s %-15s %-8s %-8s %-8s %-10s %-10s %-8s%n",
                "ID", "Name", "M1", "M2", "M3", "Total", "Average", "Grade");

        System.out.println("--------------------------------------------------------------------------");

        System.out.printf("%-10d %-15s %-8d %-8d %-8d %-10d %-10.2f %-8s%n",
                id, name, m1, m2, m3, total, avg, grade);

        System.out.println("==============================================");

        sc.close();
    }
}
