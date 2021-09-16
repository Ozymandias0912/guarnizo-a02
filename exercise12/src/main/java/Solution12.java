/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution12
 *  Copyright 2021 JUan Guarnizo
 */

import java.util.Scanner;

/*
* Pseudocode
*
* Create scanner variable input
* Print: "Enter the principal: "
* Save the input in principal
*
* Print: "Enter the rate of interest: "
* Save the input in interest
*
* Print: "Enter the number of years: "
* Save input in time
*
* siMoney = principal * (1 + (interest * time)) //simple interest amount accrued
*
* Print: "After time years at interest%, the investment will be worth $siMoney."
*
* */
public class Solution12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        double principal = input.nextDouble();

        System.out.println("Enter the rate of interest: ");
        double interest = input.nextDouble();

        System.out.println("Enter the number of years: ");
        int time = input.nextInt();

        double siMoney = principal * (1 + (interest/100 * time)); //simple interest amount accrued

        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f.", time, interest, siMoney);

    }
}
