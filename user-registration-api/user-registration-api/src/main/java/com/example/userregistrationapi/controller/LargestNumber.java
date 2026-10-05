package com.example.userregistrationapi.controller;

public class LargestNumber {
    public static void main(String[] args) {

        int[] arr = {25, 70, 15, 90, 45};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest Number = " + largest);
    }
}