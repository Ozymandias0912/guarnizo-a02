/*
 *   UCF COP 3330 Fall 2021 Assignment 2
 *   Solution 08
 *   Copyright 2021 Juan Guarnizo
 *
 * */


/*
 * Pseudocode
 * Ask the user: "How many people? ".
 * Save the user input as "people".
 *
 * Ask the user: "How many pizzas do you have? ".
 * Save the user input as "pizzas".
 *
 * Ask the user: "How many slices per pizza? ".
 * Save the user input as "slices".
 *
 * Print to the screen: ""people" people with "pizzas" pizzas ("slices"*"pizzas" slices)"
 * Calculate integer portion = ("slices"*"pizzas") / "people"
 * Print to the screen: "Each person gets "portion" pieces of pizza."
 * Calculate integer leftover = ("slices"*"pizzas") % "people"
 * Print to the screen: "There are "leftover" leftover pieces"
 *
 * */


import java.util.Scanner;

public class Solution08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people?");
        int people = input.nextInt();

        System.out.println("How many pizzas do you have?");
        int pizzas = input.nextInt();

        System.out.println("How many slices per pizza?");
        int slices = input.nextInt();

        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizzas, (slices * pizzas));
        int portion = (slices * pizzas) / people;
        System.out.printf("Each person gets %d pieces of pizza\n", portion);

        int leftovers = (slices * pizzas) % people;
        System.out.printf("There are %d leftover pieces", leftovers);

    }
}
