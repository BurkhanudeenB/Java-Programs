package com.example.userregistrationapi.controller;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};

        int[] arr2 = Arrays.copyOf(arr1, arr1.length);

        System.out.println("First Array: " + Arrays.toString(arr1));
        System.out.println("Second Array: " + Arrays.toString(arr2));
    }
}