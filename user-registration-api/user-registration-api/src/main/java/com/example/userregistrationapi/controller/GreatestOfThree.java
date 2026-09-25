package com.example.userregistrationapi.controller;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int greatest = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            if (n > greatest) {
                greatest = n;
            }
        }

        System.out.println("Greatest = " + greatest);
    }
}