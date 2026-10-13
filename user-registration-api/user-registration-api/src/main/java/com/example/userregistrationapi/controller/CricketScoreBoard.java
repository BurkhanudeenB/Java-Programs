package com.example.userregistrationapi.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketScoreBoard {

    public static void main(String[] args) {

        HashMap<String, Integer> scoreboard = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("\n========== CRICKET SCORE BOARD ==========");
            System.out.println("1. Add Player");
            System.out.println("2. Update Player Score");
            System.out.println("3. Search Player");
            System.out.println("4. Remove Player");
            System.out.println("5. Display Score Board");
            System.out.println("6. Find Highest Scorer");
            System.out.println("7. Exit");
            System.out.println("=========================================");

            System.out.print("Enter your choice: ");

            // Validate menu input
            if (!sc.hasNextInt()) {
                System.out.println("\nInvalid input! Please enter a number from 1 to 7.");
                sc.nextLine();
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // 1. Add Player
                case 1: {
                    System.out.println("\n---------- ADD PLAYER ----------");

                    System.out.print("Enter Player Name: ");
                    String player = sc.nextLine().trim();

                    if (player.isEmpty()) {
                        System.out.println("Player name cannot be empty.");
                        break;
                    }

                    if (scoreboard.containsKey(player)) {
                        System.out.println("Player already exists!");
                        break;
                    }

                    System.out.print("Enter Runs: ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input! Runs must be a whole number.");
                        sc.nextLine();
                        break;
                    }

                    int runs = sc.nextInt();
                    sc.nextLine();

                    if (runs < 0) {
                        System.out.println("Runs cannot be negative.");
                        break;
                    }

                    scoreboard.put(player, runs);

                    System.out.println("\nPlayer Added Successfully!");
                    System.out.println("Player Name : " + player);
                    System.out.println("Runs        : " + runs);

                    break;
                }

                // 2. Update Player Score
                case 2: {
                    System.out.println("\n---------- UPDATE PLAYER SCORE ----------");

                    System.out.print("Enter Player Name: ");
                    String player = sc.nextLine().trim();

                    if (player.isEmpty()) {
                        System.out.println("Player name cannot be empty.");
                        break;
                    }

                    if (!scoreboard.containsKey(player)) {
                        System.out.println("Player Not Found!");
                        break;
                    }

                    System.out.println("Current Score: " + scoreboard.get(player));

                    System.out.print("Enter New Score: ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input! Runs must be a whole number.");
                        sc.nextLine();
                        break;
                    }

                    int runs = sc.nextInt();
                    sc.nextLine();

                    if (runs < 0) {
                        System.out.println("Runs cannot be negative.");
                        break;
                    }

                    scoreboard.put(player, runs);

                    System.out.println("\nScore Updated Successfully!");
                    System.out.println("Player Name : " + player);
                    System.out.println("Updated Runs: " + runs);

                    break;
                }

                // 3. Search Player
                case 3: {
                    System.out.println("\n---------- SEARCH PLAYER ----------");

                    System.out.print("Enter Player Name: ");
                    String player = sc.nextLine().trim();

                    if (player.isEmpty()) {
                        System.out.println("Player name cannot be empty.");
                        break;
                    }

                    if (scoreboard.containsKey(player)) {
                        System.out.println("\nPlayer Found!");
                        System.out.println("Player Name : " + player);
                        System.out.println("Runs        : " + scoreboard.get(player));
                    } else {
                        System.out.println("Player Not Found!");
                    }

                    break;
                }

                // 4. Remove Player
                case 4: {
                    System.out.println("\n---------- REMOVE PLAYER ----------");

                    System.out.print("Enter Player Name: ");
                    String player = sc.nextLine().trim();

                    if (player.isEmpty()) {
                        System.out.println("Player name cannot be empty.");
                        break;
                    }

                    if (scoreboard.containsKey(player)) {
                        int removedRuns = scoreboard.remove(player);

                        System.out.println("\nPlayer Removed Successfully!");
                        System.out.println("Removed Player : " + player);
                        System.out.println("Previous Runs  : " + removedRuns);
                    } else {
                        System.out.println("Player Not Found!");
                    }

                    break;
                }

                // 5. Display Score Board
                case 5: {
                    System.out.println("\n========== SCORE BOARD ==========");

                    if (scoreboard.isEmpty()) {
                        System.out.println("Score Board is Empty.");
                        break;
                    }

                    System.out.printf("%-25s %10s%n", "Player Name", "Runs");
                    System.out.println("----------------------------------------");

                    for (Map.Entry<String, Integer> entry : scoreboard.entrySet()) {
                        System.out.printf(
                                "%-25s %10d%n",
                                entry.getKey(),
                                entry.getValue()
                        );
                    }

                    System.out.println("----------------------------------------");
                    System.out.println("Total Players: " + scoreboard.size());

                    break;
                }

                // 6. Find Highest Scorer
                case 6: {
                    System.out.println("\n---------- HIGHEST SCORER ----------");

                    if (scoreboard.isEmpty()) {
                        System.out.println("Score Board is Empty.");
                        break;
                    }

                    String topPlayer = "";
                    int highestRuns = Integer.MIN_VALUE;

                    for (Map.Entry<String, Integer> entry : scoreboard.entrySet()) {

                        if (entry.getValue() > highestRuns) {
                            highestRuns = entry.getValue();
                            topPlayer = entry.getKey();
                        }
                    }

                    System.out.println("Highest Scorer Details");
                    System.out.println("----------------------");
                    System.out.println("Player Name : " + topPlayer);
                    System.out.println("Runs        : " + highestRuns);

                    break;
                }

                // 7. Exit
                case 7: {
                    System.out.println("\nThank you for using Cricket Score Board!");
                    break;
                }

                default: {
                    System.out.println("\nInvalid Choice! Please enter a number from 1 to 7.");
                }
            }

        } while (choice != 7);

        sc.close();
    }
}