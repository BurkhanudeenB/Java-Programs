package com.example.userregistrationapi.controller;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "Furkhan";
        String password = "9876543210";

        while (true) {

            System.out.print("Enter Username: ");
            String u = sc.next();

            System.out.print("Enter Password: ");
            String p = sc.next();

            if (u.equals(username) && p.equals(password)) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Invalid Username or Password");
                System.out.println("Try Again");
            }
        }

        sc.close();
    }
}