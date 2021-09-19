/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution21
 *  Copyright 2021 Juan Guarnizo
 */
/*
 * Pseudocode
 * Create scanner variable input
 * Print: "Please enter the number of the month: "
 * Save input in month
 *
 * switch (month) {
 *  case 1 :
 *                Print: "January"
 *                break;
 *  case 2 :
 *                Print: "February"
 * break;
 *  case 3 :
 *                Print: "March"
 * break;
 *  case 4 :
 *                Print: "April"
 * break;
 *  case 5 :
 *                Print: "May"
 * break;
 *  case 6 :
 *                Print: "June"
 * break;
 *  case 7 :
 *                Print: "July"
 * break;
 *  case 8 :
 *                Print: "August"
 * break;
 *  case 9 :
 *                Print: "September"
 * break;
 *  case 10 :
 *                Print: "October"
 * break;
 *  case 11 :
 *                Print: "November"
 * break;
 *  case 12 :
 *                Print: "December"
 * break;
 * default
 * Print: "Input is invalid. Please type an integer value from 1 to 12."
 * break;
 * }
 *
 *
 *
 */


import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of the month: ");
        int monthNum = input.nextInt();
        String month = "key";
        String warning = "";

        switch (monthNum) {
            case 1 :
               month = "January";
               break;
            case 2 :
                month = "February";
                break;
            case 3 :
                month = "March";
            case 4 :
                month = "April";
                break;
            case 5 :
                month = "May";
                break;
            case 6 :
                month = "June";
            case 7 :
                month = "July";
                break;
            case 8 :
                month = "August";
                break;
            case 9 :
                month = "September";
                break;
            case 10 :
                month = "October";
                break;
            case 11 :
                month = "November";
                break;
            case 12 :
                month = "December";
                break;
            default:
                warning = "Input is invalid. Please type an integer value from 1 to 12.";
                break;
        }//end switch statement
        if(month.equals("key")){
            System.out.println(warning);
        }
        else{
            System.out.printf("The name of the month is %s", month);
        }

    }//end main function
}//end of class
