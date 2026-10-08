package com.example.userregistrationapi.controller;

import java.util.Scanner;

class Vehicle {

    int vehicleId;
    String vehicleName;
    double rentPerDay;
    String fuelType;

    Vehicle(int vehicleId, String vehicleName,
            double rentPerDay, String fuelType) {

        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.rentPerDay = rentPerDay;
        this.fuelType = fuelType;
    }

    void calculateRent(int days) {
        System.out.println("Rental calculation");
    }

    void displayDetails() {

        System.out.println("Vehicle ID      : " + vehicleId);
        System.out.println("Vehicle Name    : " + vehicleName);
        System.out.println("Rent Per Day    : " + rentPerDay);
        System.out.println("Fuel Type       : " + fuelType);
    }
}

// Child 1
class Car extends Vehicle {

    boolean ac;
    double driverCharge;

    Car(int vehicleId, String vehicleName,
        double rentPerDay, String fuelType,
        boolean ac, double driverCharge) {

        super(vehicleId, vehicleName, rentPerDay, fuelType);

        this.ac = ac;
        this.driverCharge = driverCharge;
    }

    @Override
    void calculateRent(int days) {

        double acCharge = ac ? 500 : 0;
        double totalRent = (rentPerDay + acCharge + driverCharge) * days;

        displayDetails();

        System.out.println("Vehicle Type    : Car");
        System.out.println("AC              : " + ac);
        System.out.println("Driver Charge   : " + driverCharge);
        System.out.println("Rental Days     : " + days);
        System.out.println("Total Rent      : " + totalRent);
    }
}

// Child 2
class Bike extends Vehicle {

    double helmetCharge;
    boolean insurance;

    Bike(int vehicleId, String vehicleName,
         double rentPerDay, String fuelType,
         double helmetCharge, boolean insurance) {

        super(vehicleId, vehicleName, rentPerDay, fuelType);

        this.helmetCharge = helmetCharge;
        this.insurance = insurance;
    }

    @Override
    void calculateRent(int days) {

        double insuranceCharge = insurance ? 200 : 0;

        double totalRent =
                (rentPerDay + helmetCharge + insuranceCharge) * days;

        displayDetails();

        System.out.println("Vehicle Type    : Bike");
        System.out.println("Helmet Charge   : " + helmetCharge);
        System.out.println("Insurance       : " + insurance);
        System.out.println("Rental Days     : " + days);
        System.out.println("Total Rent      : " + totalRent);
    }
}

// Child 3
class Van extends Vehicle {

    int extraPassengers;
    double driverCharge;

    Van(int vehicleId, String vehicleName,
        double rentPerDay, String fuelType,
        int extraPassengers, double driverCharge) {

        super(vehicleId, vehicleName, rentPerDay, fuelType);

        this.extraPassengers = extraPassengers;
        this.driverCharge = driverCharge;
    }

    @Override
    void calculateRent(int days) {

        double passengerCharge = extraPassengers * 300;

        double totalRent =
                (rentPerDay + passengerCharge + driverCharge) * days;

        displayDetails();

        System.out.println("Vehicle Type    : Van");
        System.out.println("Extra Passengers: " + extraPassengers);
        System.out.println("Driver Charge   : " + driverCharge);
        System.out.println("Rental Days     : " + days);
        System.out.println("Total Rent      : " + totalRent);
    }
}

public class VehicleRentalProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== VEHICLE RENTAL SYSTEM =====");

        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Vehicle Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Rent Per Day: ");
        double rent = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Fuel Type: ");
        String fuel = sc.nextLine();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        System.out.println("\nSelect Vehicle Type");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Van");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Vehicle vehicle;

        if (choice == 1) {

            System.out.print("Is AC available? (true/false): ");
            boolean ac = sc.nextBoolean();

            System.out.print("Enter Driver Charge: ");
            double driver = sc.nextDouble();

            vehicle = new Car(
                    id, name, rent, fuel,
                    ac, driver
            );

        } else if (choice == 2) {

            System.out.print("Enter Helmet Charge: ");
            double helmet = sc.nextDouble();

            System.out.print("Insurance available? (true/false): ");
            boolean insurance = sc.nextBoolean();

            vehicle = new Bike(
                    id, name, rent, fuel,
                    helmet, insurance
            );

        } else {

            System.out.print("Enter Extra Passengers: ");
            int passengers = sc.nextInt();

            System.out.print("Enter Driver Charge: ");
            double driver = sc.nextDouble();

            vehicle = new Van(
                    id, name, rent, fuel,
                    passengers, driver
            );
        }

        System.out.println("\n----- VEHICLE DETAILS -----");

        vehicle.calculateRent(days);

        sc.close();
    }
}