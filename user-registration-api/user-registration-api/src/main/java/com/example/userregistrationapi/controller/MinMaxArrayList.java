package com.example.userregistrationapi.controller;

import java.util.ArrayList;

public class MinMaxArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(25);
        numbers.add(10);
        numbers.add(50);
        numbers.add(5);
        numbers.add(40);

        int min = numbers.get(0);
        int max = numbers.get(0);

        for (int num : numbers) {

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println("ArrayList: " + numbers);
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
