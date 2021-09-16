/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution14
 *  Copyright 2021 JUan Guarnizo
 */

import java.util.Scanner;
import static java.lang.Math.floor;


/*
 * Pseudocode
 *
 * Create scanner variable input
 * Print: "What is the order amount? "
 * Save the input in order
 *
 * Print: "What is the state? "
 * Save the input in state
 *
 * if (state == "WI")
 * tax = order * 0.55
 * Print: "The subtotal is order."
 * Print: "The tax is $0.55."
 * Print: "The total is order + tax."
 * //end if statement
 * else
 * Print: "The total is order."
 *
 * */

public class Solution14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the order amount? ");
        double order = input.nextDouble();

        System.out.println("What is the state? ");
        String state = input.next();

        if (state.equals("WI"))
        {
            double tax = order * 0.055;
            System.out.printf("The subtotal is $%.2f\n", order);
            System.out.printf("The tax is $%.2f\n", tax);
            double totalRounded = floor((order + tax) * 100 + 0.5) / 100;
            System.out.printf("The total is $%.2f\n", totalRounded);

        }
        else
            System.out.printf("The total is $%.2f\n", order);

    }

}
