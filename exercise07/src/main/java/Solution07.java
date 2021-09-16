/*
 *   UCF COP 3330 Fall 2021 Assignment 2
 *   Solution 07
 *   Copyright 2021 Juan Guarnizo
 *
 * */


/*
 * Pseudocode
 * Ask the user: "What is the length of the room in feet? ".
 * Save the user input as "length".
 *
 * Ask the user: "What is the width of the room in feet? ".
 * Save the user input as "width".
 *
 * Print to the screen: "You entered dimensions of "length" feet by "width" feet."
 * Print to the screen: "The area is"
 *
 * Save conversion factor as: "convFactor = 0.09290304".
 * Calculate the area and save it as "area".
 * Print to the screen: " "area" square feet"
 *
 * Convert area into square meters and save it as "areasm".
 * Print to the screen: " "areasm" square meters"
 * */



import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the room in feet? ");
        double length = input.nextInt();

        System.out.println("What is the width of the room in feet? ");
        double width = input.nextInt();

        System.out.printf("You entered dimensions of %f feet by %f feet.", length, width);
        System.out.println("The area is\n");

        double convFactor = 0.09290304;
        double area = length * width;
        System.out.printf("%f square feet\n", area);

        double areasm = area * convFactor;
        System.out.printf("%f square meters\n", areasm);




    }
}
