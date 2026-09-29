package com.example.userregistrationapi.controller;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your account balance: ");
        double balance = sc.nextDouble();

        boolean Continue = true;
        while (Continue) {

            System.out.println("1. Withdraw Money");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            double withdrawal;
            double minimumBalance = 1000;

            switch (choice) {

                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    withdrawal = sc.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println("Withdrawal amount must be greater than 0.");
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient balance.");
                    } else if (balance - withdrawal < minimumBalance) {
                        System.out.println("Minimum balance of ₹1000 must be maintained.");
                    } else {
                        balance = balance - withdrawal;

                        System.out.println("Withdrawal successful.");
                        System.out.println("Remaining Balance = ₹" + balance);
                    }
                    break;

                case 2:
                    System.out.println("Available Balance = ₹" + balance);
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    if (deposit <= 0) {
                        System.out.println("Deposit amount must be greater than 0.");
                    } else {
                        balance = balance + deposit;
                    }
                    System.out.println("Deposit successful.");
                    System.out.println("Deposited Amount =$" + deposit);
                    System.out.println("Updated Balance =$" + balance);
                    break;

                case 4:
                    System.out.println("Thanks for Visiting ATM.....");
                    Continue = false;
                    break;


                default:
                    System.out.println("Invalid choice.");
            }


        }
        sc.close();
    }
}