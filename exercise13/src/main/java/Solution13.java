/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution13
 *  Copyright 2021 JUan Guarnizo
 */

import java.util.Scanner;

import static java.lang.Math.ceil;


/*
 * Pseudocode
 *
 * Create scanner variable input
 * Print: "What is the principal amount? "
 * Save the input in principal
 *
 * Print: "What is the rate? "
 * Save the input in rate
 *
 * Print: "What is the number of years? "
 * Save input in time
 *
 * Print: "What is the number of times the interest is compounded per year? "
 * Save input in period
 *
 * amount = principal * (1 + rate / period) ^ (period * time)
 *
 * Print: "$principal invested at rate% for time years compounded period times per year is $amount."
 *
 * */

public class Solution13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double principal, rate, time, period;

        System.out.println("What is the principal amount? ");
        principal = input.nextDouble();

        System.out.println("What is the rate? ");
        rate = input.nextDouble();

        System.out.println("What is the number of years? ");
        time = input.nextDouble();

        System.out.println("What is the number of times the interest is compounded per year? ");
        period = input.nextDouble();

        double amount;
        amount = principal * (Math.pow((1 + (rate / 100) / period), (period * time)));
        double amountRounded = ceil(amount * 100 + 0.5) / 100;//rounding up to the nearest cent

        System.out.printf("$%.2f invested at %.1f%% for %.1f years compounded %.0f times per year is $%.2f",
                principal, rate, time, period, amountRounded);
    }
}
