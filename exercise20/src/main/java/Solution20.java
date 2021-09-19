/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution20
 *  Copyright 2021 Juan Guarnizo
 */
/*
 * Pseudocode
 * Create scanner variable input
 * Print: "What is the order amount?"
 * Save input in order
 * Print: "What state do you live in?"
 * Save input in state
 * Create tax variable
 *
 * switch (state) {
 *      case state.equals("Wisconsin") :
 *                                      tax = 0.05
 *                                      Print: "What county do you live in?"
 *                                      Save input in county
 *                                      switch (county) {
 *                                      case county.equals("Eau Claire") : tax = tax + 0.005
 *                                      case county.equals("Dunn") : tax = tax + 0.004
 *                                      default: break
 *                                      }
 *      case state.equals("Illinois") :
 *                                       tax = 0.08
 *      default: break
 *
 * Print: "The tax is $tax.\nThe total is $(order + tax)."
 */

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double order = input.nextDouble();
        System.out.println("What state do you live in?");
        String state = input.next();
        double tax = 0;
        String county;

  switch (state)
  {
      case "Wisconsin":
          tax = 0.05;
          System.out.println("What county do you live in?");
          input.nextLine();
          county = input.nextLine();
          switch (county)
          {
              case "Eau Claire":
                  tax = tax + 0.005;
                  break;
              case "Dunn":
                  tax = tax + 0.004;
                  break;
              default:
                  break;
          }
          break;
      case "Illinois":
          tax = 0.08;
          break;
      default:
          break;
  }
  double total = (order * tax) + order;
  double totalRounded = Math.floor((total * 100) + 0.5) / 100;
 System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", (order * tax), totalRounded);
    }//end of main function
}//end of class Solution20
