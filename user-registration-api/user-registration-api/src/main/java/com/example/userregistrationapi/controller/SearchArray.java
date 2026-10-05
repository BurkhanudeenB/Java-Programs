package com.example.userregistrationapi.controller;

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {
                System.out.println("Number found.");
                System.out.println("Index Position = " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found.");
        }

        sc.close();
    }
}
