package com.example.userregistrationapi.controller;

import java.util.Scanner;

interface CabBooking {

    void bookRide();

    double calculateFare(double distance);
}

class Cab implements CabBooking {

    String customerName;
    double distance;

    Cab(String customerName, double distance) {
        this.customerName = customerName;
        this.distance = distance;
    }

    @Override
    public void bookRide() {
        System.out.println("Cab booked successfully!");
    }

    @Override
    public double calculateFare(double distance) {
        return 0;
    }
}

class MiniCab extends Cab {

    MiniCab(String customerName, double distance) {
        super(customerName, distance);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 20;
    }
}

class AutoCab extends Cab {

    AutoCab(String customerName, double distance) {
        super(customerName, distance);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 10;
    }
}

class SedanCab extends Cab {

    SedanCab(String customerName, double distance) {
        super(customerName, distance);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 30;
    }
}

public class CabBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();

        System.out.println("\n1. Mini Cab");
        System.out.println("2. Auto Cab");
        System.out.println("3. Sedan Cab");

        System.out.print("Choose cab type: ");
        int choice = sc.nextInt();

        Cab cab;

        switch (choice) {

            case 1:
                cab = new MiniCab(name, distance);
                break;

            case 2:
                cab = new AutoCab(name, distance);
                break;

            case 3:
                cab = new SedanCab(name, distance);
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        cab.bookRide();

        double fare = cab.calculateFare(distance);

        System.out.println("\nCustomer Name : " + name);
        System.out.println("Distance      : " + distance + " km");
        System.out.println("Cab Fare      : ₹" + fare);

        sc.close();
    }
}
