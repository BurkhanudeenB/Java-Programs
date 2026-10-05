package com.example.userregistrationapi.controller;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int patients = sc.nextInt();

        for (int i = 1; i <= patients; i++) {

            System.out.println("\nPatient " + i);

            boolean fever = false;

            for (int j = 1; j <= 3; j++) {

                System.out.print("Enter temperature " + j + ": ");
                double temperature = sc.nextDouble();

                if (temperature >= 100.4) {
                    fever = true;
                }
            }

            if (fever) {
                System.out.println("Fever detected.");
                System.out.println("Continue the treatment.. For better Recovery....");
            } else {
                System.out.println("No fever detected.");
                System.out.println("Patient in the normal Condition..Pack and Get Home...");
            }
        }

        sc.close();
    }
}