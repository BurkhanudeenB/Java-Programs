package com.example.userregistrationapi.controller;

import java.util.Scanner;

class BankAccount {

    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void transaction(double amount) {
        System.out.println("Bank transaction");
    }

    void displayDetails() {
        System.out.println("Account Number  : " + accountNumber);
        System.out.println("Account Holder  : " + accountHolder);
        System.out.println("Balance         : " + balance);
    }
}

// Child class 1
class SavingsAccount extends BankAccount {

    double interestRate = 4.0;

    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    void transaction(double amount) {

        balance = balance + amount;

        double interest = balance * interestRate / 100;
        balance = balance + interest;

        displayDetails();

        System.out.println("Account Type    : Savings Account");
        System.out.println("Deposit Amount  : " + amount);
        System.out.println("Interest Rate   : " + interestRate + "%");
        System.out.println("Interest Added  : " + interest);
        System.out.println("Final Balance   : " + balance);
    }
}

// Child class 2
class CurrentAccount extends BankAccount {

    double transactionCharge = 100;

    CurrentAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    void transaction(double amount) {

        double totalAmount = amount + transactionCharge;

        if (balance >= totalAmount) {
            balance = balance - totalAmount;

            displayDetails();

            System.out.println("Account Type    : Current Account");
            System.out.println("Withdrawal      : " + amount);
            System.out.println("Transaction Fee : " + transactionCharge);
            System.out.println("Final Balance   : " + balance);

        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

// Child class 3
class SalaryAccount extends BankAccount {

    double cashback = 200;

    SalaryAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    void transaction(double amount) {

        if (balance >= amount) {

            balance = balance - amount;
            balance = balance + cashback;

            displayDetails();

            System.out.println("Account Type    : Salary Account");
            System.out.println("Withdrawal      : " + amount);
            System.out.println("Cashback        : " + cashback);
            System.out.println("Final Balance   : " + balance);

        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class BankingTransactionProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== BANKING TRANSACTION SYSTEM =====");

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.println("\nSelect Account Type");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("3. Salary Account");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Transaction Amount: ");
        double amount = sc.nextDouble();

        BankAccount account;

        if (choice == 1) {

            account = new SavingsAccount(
                    accountNumber,
                    accountHolder,
                    balance
            );

        } else if (choice == 2) {

            account = new CurrentAccount(
                    accountNumber,
                    accountHolder,
                    balance
            );

        } else {

            account = new SalaryAccount(
                    accountNumber,
                    accountHolder,
                    balance
            );
        }

        System.out.println("\n----- TRANSACTION DETAILS -----");

        account.transaction(amount);

        sc.close();
    }
}