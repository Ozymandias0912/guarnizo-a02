/*
 *   UCF COP 3330 Fall 2021 Assignment 2
 *   Solution 06
 *   Copyright 2021 Juan Guarnizo
 *
 * */


/*
 * Pseudocode
 * Ask the user: "What is your current age? ".
 * Get his/her age.
 *
 * Ask the user: "At what age would you like to retire? ".
 * Get their retirement age.
 *
 * Calculate their time to retire.
 * Print to the screen: "You have "time to retire" years left until you can retire".
 *
 * Get current year.
 * Print to the screen: "It's "current year",  so you can retire in "current year + time to retire" ".
 * */

import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your current age? ");
        int age = input.nextInt();

        System.out.println("At what age would you like to retire? ");
        int retirementAge = input.nextInt();

        int timeToRetire = retirementAge - age;
        System.out.printf("You have %d years left until you can retire.\n", timeToRetire);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.printf("It's %d,  so you can retire in %d", currentYear, currentYear + timeToRetire);
    }


}

