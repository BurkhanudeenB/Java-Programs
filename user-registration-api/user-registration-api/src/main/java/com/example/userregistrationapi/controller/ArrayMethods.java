package com.example.userregistrationapi.controller;

import java.util.Arrays;
public class ArrayMethods {
    public static void main(String[] args) {

        int[] arr = {40, 10, 30, 20, 50};

        // Arrays.toString() - original Array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Arrays.sort() - Ascending Order
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Arrays.copyOf() - copy the array and add new length space to 7
        int[] copyArray = Arrays.copyOf(arr, 7);
        System.out.println("Copy of Array: " + Arrays.toString(copyArray));

        // Arrays.copyOfRange()
        int[] rangeArray = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("Range Copy: " + Arrays.toString(rangeArray));

        // Arrays.equals()
        int[] arr2 = {10, 20, 30, 40, 50};

        boolean result = Arrays.equals(arr, arr2);
        System.out.println("Arrays are equal: " + result);
    }
}