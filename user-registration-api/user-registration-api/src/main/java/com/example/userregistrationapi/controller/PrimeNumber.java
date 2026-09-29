package com.example.userregistrationapi.controller;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean prime = true;

        if (number <= 1) {
            prime = false;
        } else {

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        sc.close();
    }
}