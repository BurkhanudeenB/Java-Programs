package com.example.userregistrationapi.controller;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(50) + 1;
        boolean guessed = false;

        for (int attempt = 1; attempt <= 3; attempt++) {

            System.out.print("Attempt " + attempt + " - Guess the number: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Hurrahhhh! Fabulous You guessed the number.");
                guessed = true;
                break;
            } else if (guess < number) {
                System.out.println(" It is Low of ur guessed.!");
            } else {
                System.out.println("It is High of ur guessed!");
            }
        }

        if (!guessed) {
            System.out.println("You used all 3 attempts.");
            System.out.println("Correct Number = " + number);
        }

        sc.close();
    }
}