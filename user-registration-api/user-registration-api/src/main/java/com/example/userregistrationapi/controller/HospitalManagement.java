package com.example.userregistrationapi.controller;

import java.util.Scanner;

class Patient {

    private int patientId;
    private String patientName;
    private String disease;
    private double billAmount;

    Patient(int patientId, String patientName, String disease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.disease = disease;
    }

    void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    double getBillAmount() {
        return billAmount;
    }

    void displayDetails() {
        System.out.println("\n----- PATIENT DETAILS -----");
        System.out.println("Patient ID   : " + patientId);
        System.out.println("Patient Name : " + patientName);
        System.out.println("Disease      : " + disease);
        System.out.println("Bill Amount  : " + getBillAmount());
    }
}

public class HospitalManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.print("Enter Bill Amount: ");
        double bill = sc.nextDouble();

        Patient p = new Patient(id, name, disease);

        p.setBillAmount(bill);

        p.displayDetails();

        sc.close();
    }
}