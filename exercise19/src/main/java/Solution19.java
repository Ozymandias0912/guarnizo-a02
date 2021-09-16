/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution19
 *  Copyright 2021 Juan Guarnizo
 */
/*
 * Pseudocode
 * Create scanner variable input
 * Print: "Enter your height in inches"
 * Validate data
 * Save input in height
 * Print: "Enter your weight in pounds"
 * Validate data
 * Save input in weight
 *
 * Calculate BMI
 * BMI = (weight / (height * height)) * 703
 *
 * if(18.5 <= BMI <= 25)
 * Print: "You are within the ideal weight range."
 *
 * else
 *      if(BMI < 18.5)
 *          Print: "You are underweight. You should see your doctor."
 *      else
 *          Print: "You are overweight. You should see your doctor."
 *
 */


import java.util.Scanner;

public class Solution19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in inches");
        if(!input.hasNextDouble())
        {
            String string = input.next();
            System.out.printf("%s is not a valid input\n", string);
            System.exit(0);
        }
        double height = input.nextDouble();
        System.out.println("Enter your weight in pounds");
        if(!input.hasNextDouble())
        {
            String string = input.next();
            System.out.printf("%s is not a valid input\n", string);
            System.exit(0);
        }
        double weight = input.nextDouble();

        double BMI = (weight / (height * height)) * 703;

        if((BMI >= 18.5) && (BMI <= 25))
        {
            System.out.println("You are within the ideal weight range.");
        }
        else
        {
            if(BMI < 18.5)
                System.out.println("You are underweight. You should see your doctor.");
            else
                System.out.println("You are overweight. You should see your doctor.");
        }

    }
}
