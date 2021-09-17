/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution11
 *  Copyright 2021 Juan Guarnizo
 */

/* Pseudocode
Create scanner variable

Print to the screen: "How many euros are you exchanging? "
Save the input in "euros"

Print to the screen: "What is the exchange rate? "
Save the input in "rate"

Create "dollars" = euros * rate

Print to the screen:" "euros" euros at an exchange rate of "rate" is "
Print to the screen:" "dollars" U.S. dollars. "

 */


import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many euros are you exchanging? ");
        double euros = input.nextDouble();

        System.out.println("What is the exchange rate? ");
        double rate = input.nextDouble();

        double dollars = euros * rate;
        double dollarsRounded = Math.floor((dollars * 100) + 0.5) / 100;
        System.out.printf(" %.2f euros at an exchange rate of %.4f is \n" + " %.2f U.S. dollars. "
                , euros, rate, dollarsRounded);

    }
}
