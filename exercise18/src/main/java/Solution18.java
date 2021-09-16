/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution18
 *  Copyright 2021 Juan Guarnizo
 */
/*
 * Pseudocode
 * Create scanner variable input
 * Print: "Press C to convert from Fahrenheit to Celsius."
 * Print: "Press F to convert from Celsius to Fahrenheit."
 * Save input in string choice
 *
 * if(choice.equals(C) || choice.equals(c))
 * Print: "Your choice: C"
 * Print: "Please enter the temperature in Fahrenheit:"
 * Save input in tempF
 * tempC = (tempF − 32) × 5 / 9
 * Print: "The temperature in Celsius is tempC."
 *
 * else
 * Print: "Your choice: F"
 * Print: "Please enter the temperature in Celsius:"
 * Save input in tempC
 * tempF = (tempC × 9 / 5) + 32
 * Print: "The temperature in Fahrenheit is tempF."
 *
 */

import java.util.Scanner;

public class Solution18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.");
        String choice = input.next();

        if(choice.equals("C") || choice.equals("c"))
        {
            System.out.println("Your choice: C\n" + "Please enter the temperature in Fahrenheit: ");
            double tempF = input.nextDouble();
            double tempC = ((tempF - 32) * 5 / 9);
            System.out.printf("The temperature in Celsius is %.2f.", tempC);
        }
        else
        {
            System.out.println("Your choice: F\n" + "Please enter the temperature in Celsius: ");
            double tempC = input.nextDouble();
            double tempF = (tempC * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is %.2f.", tempF);
        }



    }
}
