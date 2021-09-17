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
        String item1price = input.next();
        double item1p = Integer.parseInt(item1price);

        System.out.println("Enter the quantity of item 1:");
        String item1quantity = input.next();
        double item1q = Integer.parseInt(item1quantity);

        System.out.println("Enter the price of item 2: ");
        String item2price = input.next();
        double item2p = Integer.parseInt(item2price);

        System.out.println("Enter the quantity of item 2:");
        String item2quantity = input.next();
        double item2q = Integer.parseInt(item2quantity);

        System.out.println("Enter the price of item 3: ");
        String item3price = input.next();
        double item3p = Integer.parseInt(item3price);

        System.out.println("Enter the quantity of item 3:");
        String item3quantity = input.next();
        double item3q = Integer.parseInt(item3quantity);

        double subtotal = (item1p * item1q) + (item2p * item2q) + (item3p * item3q);
        final double taxRate = 0.055;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        String output = "Subtotal: $%.2f\n" + "Tax: $%.2f\n" + "Total: $%.2f\n";

        System.out.printf(output, subtotal, tax, total);

    }
}
