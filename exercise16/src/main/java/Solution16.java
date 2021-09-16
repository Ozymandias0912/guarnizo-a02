/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
/*
* Pseudocode
* create scanner variable input
* Print:"What is your age?"
* Save input in age
*
* if (age >= 16 )
* then
*       Print: "You are old enough to legally drive."
* else
*       Print: "You are not old enough to legally drive."
*
* */


import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = input.nextInt();

        String legal = "You are old enough to legally drive.";
        String illegal = "You are not old enough to legally drive.";
        String print = "";

        String test;
        test = (age >= 16) ? (print = legal ): (print = illegal);
        System.out.println(print);
    }
}
