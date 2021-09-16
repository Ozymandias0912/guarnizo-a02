/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution15
 *  Copyright 2021 Juan Guarnizo
 */

/*
* Pseudocode
*
* Create key = abc$123
* Create scanner variable input
*
* Print: "What is the password?"
* Save input in password
*
* if (password.equals(key))
* Print: "Welcome!"
* else
* Print: "I don't know you."
*
* */


import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        String key = "abc$123";
        Scanner input = new Scanner(System.in);

        System.out.println("What is the password?");
        String password = input.next();

        if (password.equals(key))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }

    }


}
