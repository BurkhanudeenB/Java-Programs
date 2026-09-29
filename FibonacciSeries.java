package com.example.userregistrationapi.controller;

public class FibonacciSeries {
    public static void main(String[] args) {

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= 15; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}