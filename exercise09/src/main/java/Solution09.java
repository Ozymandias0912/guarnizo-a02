/*
 *   UCF COP 3330 Fall 2021 Assignment 2
 *   Solution 09
 *   Copyright 2021 Juan Guarnizo
 *
 * */


/*
 * Pseudocode
 * Ask the user: "What is the width of the room? ".
 * Save the user input as "width".
 *
 * Ask the user: "What is the length of the room? ".
 * Save the user input as "length".
 *
 * Make constant factor "sfPerGallon".
 * Calculate area of the ceiling and save it as "area".
 * Calculate gallons needed and save them as gallons = roundUp("area" / "sfPerGallon").
 *
 * Print to the screen: "You will need to purchase "gallons" gallons of paint to cover "area" square feet."
 *
 * */


import java.util.Scanner;

public class Solution09
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the width of the room?");
        int width = input.nextInt();

        System.out.println("What is the length of the room?");
        int length = input.nextInt();

        final double sfPerGallon = 350;
        double area = width * length;

        int gallons = (int) Math.ceil(area / sfPerGallon);

        System.out.printf("You will need to purchase %d gallons of paint to cover %.0f square feet.\n", gallons, area);
    }

}
