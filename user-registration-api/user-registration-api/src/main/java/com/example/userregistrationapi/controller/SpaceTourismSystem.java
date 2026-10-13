package com.example.userregistrationapi.controller;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.ArrayList;
import java.util.Scanner;

class SpaceTrip {

    private int tripId;
    private String tripName;
    private double price;
    private int availableSeats;

    public SpaceTrip(int tripId, String tripName, double price, int availableSeats) {
        this.tripId = tripId;
        this.tripName = tripName;
        this.price = price;
        this.availableSeats = availableSeats;
    }

    public int getTripId() {
        return tripId;
    }

    public String getTripName() {
        return tripName;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void displayTrip() {
        System.out.println("Trip ID: " + tripId);
        System.out.println("Trip Name: " + tripName);
        System.out.println("Price: Rs. " + price);
        System.out.println("Available Seats: " + availableSeats);
        System.out.println("-----------------------------");
    }
}

class Booking {

    private int bookingId;
    private String customerName;
    private SpaceTrip trip;
    private int numberOfSeats;
    private double totalAmount;

    public Booking(int bookingId, String customerName,
                   SpaceTrip trip, int numberOfSeats) {

        this.bookingId = bookingId;
        this.customerName = customerName;
        this.trip = trip;
        this.numberOfSeats = numberOfSeats;

        this.totalAmount = trip.getPrice() * numberOfSeats;
    }

    public void displayBooking() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Trip Name: " + trip.getTripName());
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Total Amount: Rs. " + totalAmount);
        System.out.println("-----------------------------");
    }
}

public class SpaceTourismSystem {

    static ArrayList<SpaceTrip> trips = new ArrayList<>();
    static ArrayList<Booking> bookings = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    static int nextBookingId = 1001;

    public static void main(String[] args) {

        trips.add(new SpaceTrip(101, "Moon Orbit Trip", 5000, 5));
        trips.add(new SpaceTrip(102, "Earth Orbit Trip", 3000, 8));
        trips.add(new SpaceTrip(103, "Space Station Experience", 10000, 3));

        int choice;

        do {
            System.out.println("\n===== GALAXY TOURS =====");
            System.out.println("1. View Available Space Trips");
            System.out.println("2. Book a Space Trip");
            System.out.println("3. View All Bookings");
            System.out.println("4. Search Trip by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    viewTrips();
                    break;

                case 2:
                    bookTrip();
                    break;

                case 3:
                    viewBookings();
                    break;

                case 4:
                    searchTrip();
                    break;

                case 5:
                    System.out.println("Thank you for visiting Galaxy Tours!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }

    static void viewTrips() {

        System.out.println("\n===== AVAILABLE SPACE TRIPS =====");

        for (SpaceTrip trip : trips) {
            trip.displayTrip();
        }
    }

    static void bookTrip() {

        System.out.print("Enter your name: ");
        sc.nextLine();
        String customerName = sc.nextLine();

        System.out.print("Enter Trip ID: ");
        int tripId = sc.nextInt();

        SpaceTrip selectedTrip = null;

        for (SpaceTrip trip : trips) {
            if (trip.getTripId() == tripId) {
                selectedTrip = trip;
                break;
            }
        }

        if (selectedTrip == null) {
            System.out.println("Trip not found!");
            return;
        }

        System.out.println("Selected Trip: " + selectedTrip.getTripName());
        System.out.println("Price per seat: Rs. " + selectedTrip.getPrice());
        System.out.println("Available Seats: " + selectedTrip.getAvailableSeats());

        System.out.print("Enter number of seats: ");
        int seats = sc.nextInt();

        if (seats <= 0) {
            System.out.println("Number of seats must be greater than zero!");
        } else if (seats > selectedTrip.getAvailableSeats()) {
            System.out.println("Sorry! Not enough seats available.");
        } else {

            Booking booking = new Booking(
                    nextBookingId,
                    customerName,
                    selectedTrip,
                    seats
            );

            bookings.add(booking);

            selectedTrip.setAvailableSeats(
                    selectedTrip.getAvailableSeats() - seats
            );

            System.out.println("\nBooking Successful!");
            System.out.println("Your Booking ID: " + nextBookingId);
            System.out.println();

            booking.displayBooking();

            nextBookingId++;

        }
    }

    static void viewBookings() {

        System.out.println("\n===== ALL BOOKINGS =====");

        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }

        for (Booking booking : bookings) {
            booking.displayBooking();
        }
    }

    static void searchTrip() {

        System.out.print("Enter Trip ID to search: ");
        int tripId = sc.nextInt();

        boolean found = false;

        for (SpaceTrip trip : trips) {
            if (trip.getTripId() == tripId) {
                trip.displayTrip();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Trip not found!");
        }
    }
}