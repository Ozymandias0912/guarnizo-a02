/*
 *   UCF COP 3330 Fall 2021 Assignment 2
 *   Solution 10
 *   Copyright 2021 Juan Guarnizo
 *
 * */


import java.util.Scanner;

/*
 * Pseudocode
 * Ask the user: "Enter the price of item 1: ".
 * Save the user input as "item1p".
 *
 * Ask the user: "Enter the quantity of item 1: ".
 * Save the user input as "item1q".
 *
 * Ask the user: "Enter the price of item 2: ".
 * Save the user input as "item2p".
 *
 * Ask the user: "Enter the quantity of item 2: ".
 * Save the user input as "item2q".
 *
 * Ask the user: "Enter the price of item 3: ".
 * Save the user input as "item3p".
 *
 * Ask the user: "Enter the quantity of item 3: ".
 * Save the user input as "item3q".
 *
 * Calculate subtotal = (item1p * item1q) + (item2p * item2q) + (item3p * item3q)
 * constant taxRate = 0.055
 * tax = taxRate * subtotal
 * total = subtotal + tax
 *
 * Print to the screen: "Subtotal: $"subtotal""
 * Print to the screen: "Tax: $"tax""
 * Print to the screen: "Total: $"total""
 *
 *
 * */
public class Solution10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of item 1: ");
        double item1p = input.nextDouble();

        System.out.println("Enter the quantity of item 1:");
        double item1q = input.nextDouble();

        System.out.println("Enter the price of item 2: ");
        double item2p = input.nextDouble();

        System.out.println("Enter the quantity of item 2:");
        double item2q = input.nextDouble();

        System.out.println("Enter the price of item 3: ");
        double item3p = input.nextDouble();

        System.out.println("Enter the quantity of item 3:");
        double item3q = input.nextDouble();

        double subtotal = (item1p * item1q) + (item2p * item2q) + (item3p * item3q);
        final double taxRate = 0.055;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);

    }
}
