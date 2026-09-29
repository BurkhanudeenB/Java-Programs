package com.example.userregistrationapi.controller;
import java.util.Scanner;

public class ResortBooking {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("========== RESORT BOOKING ==========");

            System.out.println("1. Single Room");
            System.out.println("2. Double Room");
            System.out.println("3. Single AC Room");
            System.out.println("4. Double AC Room");
            System.out.println("5. Low Budjet Store Room");

            System.out.print("Select Room Type: ");
            int roomChoice = sc.nextInt();

            String roomType;
            double roomPrice;

            switch (roomChoice) {

                case 1:
                    roomType = "Single Room";
                    roomPrice = 2000;
                    break;

                case 2:
                    roomType = "Double Room";
                    roomPrice = 3500;
                    break;

                case 3:
                    roomType = "Single AC Room";
                    roomPrice = 3000;
                    break;

                case 4:
                    roomType = "Double AC Room";
                    roomPrice = 5500;
                    break;

                case 5:
                    roomType = "Low Budget Store Room";
                    roomPrice = 1000;
                    break;

                default:
                    System.out.println("Invalid room choice.");
                    sc.close();
                    return;
            }

            System.out.println("\nComplimentary Food?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            System.out.print("Enter your choice: ");
            int foodChoice = sc.nextInt();

            System.out.print("\nEnter Number of Days: ");
            int daysCount = sc.nextInt();



            String food;
            double foodCharge;

            switch (foodChoice) {  // Nested switch

                case 1: food = "Yes";
                foodCharge = 500;
                break;

                case 2: food = "No";
                foodCharge = 0;
                break;

                default: System.out.println("Invalid food choice.");
                sc.close();
                return;
            }

            double total = (roomPrice + foodCharge) * daysCount;

            System.out.println("\n====================================");
            System.out.println("          RESORT BOOKING");
            System.out.println("====================================");

            System.out.println("Room Type          : " + roomType);
            System.out.println("Room Price         : ₹" + roomPrice);
            System.out.println("Complimentary Food : " + food);
            System.out.println("Food Charge        : ₹" + foodCharge);
            System.out.println("Total Amount       : ₹" + total);

            System.out.println("Thanks.. For Visiting..Come Again..");

            System.out.println("====================================");

            sc.close();
        }
    }

