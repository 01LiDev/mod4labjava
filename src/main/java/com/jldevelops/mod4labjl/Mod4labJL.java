/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.jldevelops.mod4labjl;

import java.util.Scanner;

/**
 *
 * @author johnsonli
 */
public class Mod4labJL {

    public static void main(String[] args) {
        System.out.println("Solving 7.11");
        arrayOps();
        System.out.println("Solving 7.14");
        int sum = sum();
        System.out.println("The total of the integers inputted is " + sum);
        System.out.println("Solving 7.19");
        AirlineSystem();
    }

    public static void arrayOps() {
        //Set the 10 elements of integer array counts to zero.
        int[] integers = {5, 2, 3, 4, 5, 7, 4, 5, 6, 7};
        for (int i = 0; i < integers.length; i++) {
            integers[i] = 0;
        }
        for (int n : integers) {
            System.out.println(n);
        }
        //Add one to each of the 15 elements of integer array bonus.
        int[] bonus = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] += 1;
        }
        for (int n : bonus) {
            System.out.println(n);
        }
        //Display the five values of integer array bestScores in column format.
        int[] bestScores = {55, 11, 232, 42, 22};
        for (int i = 0; i < bestScores.length; i++) {
            System.out.printf("%5d ", bestScores[i]);
        }
        System.out.println("");
    }

    public static int sum() {//7.14
        Scanner kb = new Scanner(System.in);
        System.out.println("How many integers are you putting?");
        int input = kb.nextInt();
        int[] userNums = new int[input];
        for (int i = 0; i < userNums.length; i++) {
            System.out.print("Enter a Number: ");
            int num = kb.nextInt();
            userNums[i] += num;
        }
        int total = 0;
        for (int i = 0; i < userNums.length; i++) {
            total += userNums[i];
        }
        return total;
    }

    public static void AirlineSystem() {
        boolean[] seats = {true, true, true, true, false, true, true, true, true, true};
        System.out.println("Welcome to Sprint Airline");
        Scanner kb = new Scanner(System.in);
        System.out.println("Your flight number is 124124329849");
        System.out.println("Please type 1 for First Class or Please type 2 for Economy:");
        int input = kb.nextInt();
        boolean isfull = false;
        boolean foundSeat = false;
        if (input == 1) {
            for (int i = 0; i < 5; i++) {
                if (seats[i] == false) {
                    seats[i] = true;
                    System.out.println("Boarding pass: Seat " + (i + 1) + " in First Class");
                    foundSeat = true;
                    break;
                } else {
                    isfull = true;
                }
            }
            if (isfull && !foundSeat) {
                System.out.println("No available seats in First Class. Would you like to switch to Economy? (y/n)");
                String change = kb.next();
                if (change.equals("y")) {
                    for (int x = 5; x < 10; x++) {
                        if (seats[x] == false) {
                            seats[x] = true;
                            System.out.println("Boarding pass: Seat " + (x + 1) + " in Economy Class");
                            break;
                        }
                    }
                } else if (change.equals("n")) {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            }
        } else if (input == 2) {
            for (int i = 5; i < 10; i++) {
                if (seats[i] == false) {
                    seats[i] = true;
                    System.out.println("Boarding pass: Seat " + (i + 1) + " in Economy Class");
                    foundSeat = true;
                    break;
                } else {
                    isfull = true;
                }
            }
            if (isfull && !foundSeat) {
                System.out.println("No available seats in Economy Class. Would you like to switch to First Class? (y/n)");
                String change = kb.next();
                if (change.equals("y")) {
                    for (int x = 0; x < 5; x++) {
                        if (seats[x] == false) {
                            seats[x] = true;
                            System.out.println("Boarding pass: Seat " + (x + 1) + " in First Class");
                            break;
                        }
                    }
                } else if (change.equals("n")) {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            }
        }

        for (boolean check : seats) {
            System.out.println(check);
        }
    }
}
