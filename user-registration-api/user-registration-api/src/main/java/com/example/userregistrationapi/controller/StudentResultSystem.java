package com.example.userregistrationapi.controller;

import java.util.Scanner;

public class StudentResultSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student Count
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[][] marks = new int[students][subjects];

        int[] studentIds = new int[students];
        String[] studentNames = new String[students];

        int[] totals = new int[students];
        double[] averages = new double[students];
        char[] grades = new char[students];

        // Input student details and marks
        for (int i = 0; i < students; i++) {

            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter Student ID: ");
            studentIds[i] = sc.nextInt();

            sc.nextLine(); // clear buffer

            System.out.print("Enter Student Name: ");
            studentNames[i] = sc.nextLine();

            int total = 0;

            // Input marks with validation
            for (int j = 0; j < subjects; j++) {

                while (true) {

                    System.out.print("Subject " + (j + 1) + " Mark " + ": ");
                    int mark = sc.nextInt();

                    if (mark >= 0 && mark <= 100) {
                        marks[i][j] = mark;
                        total += mark;
                        break;
                    } else {
                        System.out.println(
                                "Invalid! Enter marks between 0 and 100."
                        );
                    }
                }
            }

            totals[i] = total;
            averages[i] = total / (double) subjects;

            // Grade calculation
            if (averages[i] >= 90)
                grades[i] = 'A';
            else if (averages[i] >= 75)
                grades[i] = 'B';
            else if (averages[i] >= 60)
                grades[i] = 'C';
            else if (averages[i] >= 50)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }

        // Find topper
        int topperIndex = 0;

        for (int i = 1; i < students; i++) {

            if (totals[i] > totals[topperIndex]) {
                topperIndex = i;
            }
        }

        // Final Report
        System.out.println("\n================ FINAL REPORT ================");

        System.out.print("ID\tName\t");

        for (int j = 0; j < subjects; j++) {
            System.out.print("Sub" + (j + 1) + "\t");
        }

        System.out.println("Total\tAvg\tGrade");

        for (int i = 0; i < students; i++) {

            System.out.print(
                    studentIds[i] + "\t" +
                            studentNames[i] + "\t"
            );

            for (int j = 0; j < subjects; j++) {
                System.out.print(marks[i][j] + "\t");
            }

            System.out.println(
                    totals[i] + "\t" +
                            averages[i] + "\t" +
                            grades[i]
            );
        }

        // Display topper
        System.out.println("\n=============== TOPPER List ===============");

        System.out.println("Student ID: " + studentIds[topperIndex]);
        System.out.println("Student Name: " + studentNames[topperIndex]);
        System.out.println("Total Marks: " + totals[topperIndex]);
        System.out.println("Average: " + averages[topperIndex]);
        System.out.println("Grade: " + grades[topperIndex]);

        sc.close();
    }
}