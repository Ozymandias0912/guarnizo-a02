/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution22
 *  Copyright 2021 Juan Guarnizo
 */
/*
 * Pseudocode
 * Create scanner variable input
 * Print: "Enter the first number: "
 * Save input in array[0]
 *
 * Print: "Enter the second number: "
 * Save input in array[1]
 *
 * Print: "Enter the third number: "
 * Save input in array[2]
 *
 * if(((array[0] != array[1]) && (array[1] != array[2])) && (array[0] != array[2]))
 * then {
 * largestNumber = array[0];
 * i;
 * for (i = 0 ; i < 3 ; i++){
 * if(array[i] >= largestNumber){
 * largestNumber = array[i]
 * }//end if statement
 * }//end for loop
 * print: largestNumber
 *
 *
 * }//end if statement
 *
 *
 *
 *
 *
 */


import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = {0, 0, 0};
        int largestNumber = 0;

        System.out.println("Enter the first number: ");
        array[0] = input.nextInt();

        System.out.println("Enter the second number: ");
        array[1] = input.nextInt();

        System.out.println("Enter the third number: ");
        array[2] = input.nextInt();

        if(((array[0] != array[1]) && (array[1] != array[2])) && (array[0] != array[2])){
            largestNumber = array[0];
            int i = 0;
            for (i = 0 ; i < 3 ; i++){
                if(array[i] >= largestNumber){
                    largestNumber = array[i];
                }//end inner if
            }//end for loop
        }//end outer if

        System.out.printf("The largest number is %d", largestNumber);




    }//end main function
}//end class
