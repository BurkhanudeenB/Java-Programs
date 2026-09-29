package com.example.userregistrationapi.controller;
import java.util.Scanner;
public class CountDaysInMonth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        int days;

        switch (month) {

            case 1: days = 31;
            break;

            case 2: System.out.print("Enter year: ");
            int year = sc.nextInt();

                if ((year % 400 == 0) ||
                        (year % 4 == 0 && year % 100 != 0))
                {
                    days = 29;
                    System.out.println("Bcoz It is a Leap yr, So ");
                } else {
                    days = 28;
                }
                break;

            case 3: days = 31;
            break;

            case 4: days = 30;
            break;

            case 5: days = 31;
            break;

            case 6: days = 30;
            break;

            case 7: days = 31;
            break;

            case 8: days = 31;
            break;

            case 9: days = 30;
            break;

            case 10: days = 31;
            break;

            case 11: days = 30;
            break;

            case 12: days = 31;
            break;

            default:
                days = 0;
                System.out.println("Invalid month.");
        }

        if (days != 0) {
            System.out.println("Number of days = " + days);
        }

        sc.close();
    }
}