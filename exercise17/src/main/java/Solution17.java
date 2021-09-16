/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution17
 *  Copyright 2021 Juan Guarnizo
 */
/*
 * Pseudocode
 * Create variables for the program:
 * Alcohol (in oz)
 * Weight (in pounds)
 * Ratio (alcohol distribution ratio)
 * ratio1 for men and ratio2 for women (0.73 for men and 0.66 for women)
 * Hours (since last drink)
 *
 * Print to the screen: " Enter a 1 is you are male or a 2 if you are female: "
 * Check if the input was an integer
 * If it was a string then:
 * Print to the screen: " "string" is not a valid input, try again."
 * Exit program
 * Else:
 *
 * If ( input == 1)
 * Then:
 *       Print to the screen: "How many ounces of alcohol did you have? "
 *       Save input in Alcohol
 *       Print to the screen: "What is your weight, in pounds? "
 *       Save input in Weight
 *       Print to the screen: "How many hours has it been since your last drink? "
 *       Save input in Hours
 *       Calculate BAC =( (Alcohol * 5.14) / (Weight * ratio1) ) - (0.15 * Hours)
 *
 *       Print to the screen: "Your BAC is "BAC" "
 *       If ( BAC <= 0.08)
 *       Then:
 *             Print to the screen: "It is legal for you to drive. "
 *       Else:
 *             Print to the screen: "It is not legal for you to drive. "
 * Else:
 *       If( input == 2 )
 *       Then:
 *       Print to the screen: "How many ounces of alcohol did you have? "
 *       Save input in Alcohol
 *       Print to the screen: "What is your weight, in pounds? "
 *       Save input in Weight
 *       Print to the screen: "How many hours has it been since your last drink? "
 *       Save input in Hours
 *       Calculate BAC =( (Alcohol * 5.14) / (Weight * ratio2) ) - (0.15 * Hours)
 *
 *       Print to the screen: "Your BAC is "BAC" "
 *       If ( BAC <= 0.08)
 *       Then:
 *             Print to the screen: "It is legal for you to drive. "
 *       Else:
 *             Print to the screen: "It is not legal for you to drive. "
 *
 *       Else:
 *            Print to the screen: "The input was not a valid number "

 */


import java.util.Scanner;

public class Solution17 {


 public static void main(String[] args) {

  double alcohol;
  double weight;
  final double ratio1 = 0.73;
  final double ratio2 = 0.66;
  double hours;
  int gender = 0;

  Scanner input = new Scanner(System.in);

  System.out.println("Enter a 1 is you are male or a 2 if you are female: ");
  if (input.hasNextInt())
      gender = input.nextInt();
  else
  {
      if (input.hasNext())
      {
          String string = input.next();
          System.out.printf("%s is not a valid input, try again.", string);
          System.exit(0);
      }
  }
  if (gender == 1) {
   System.out.println("How many ounces of alcohol did you have? ");
   alcohol = input.nextDouble();
   System.out.println("What is your weight, in pounds? ");
   weight = input.nextDouble();
   System.out.println("How many hours has it been since your last drink? ");
   hours = input.nextDouble();

   double BAC = (alcohol * 5.14 / weight * ratio1) - (0.015 * hours);
   System.out.printf("Your BAC is %.6f \n", BAC);

   if (BAC <= 0.08) {
    System.out.println("It is legal for you to drive. ");
   } else {
    System.out.println("It is not legal for you to drive. ");
   }


  }//end of first if statement where we run the case of a male.

  else//we run the case of a female
  {
   if (gender == 2) {
    System.out.println("How many ounces of alcohol did you have? ");
    alcohol = input.nextDouble();
    System.out.println("What is your weight, in pounds? ");
    weight = input.nextDouble();
    System.out.println("How many hours has it been since your last drink? ");
    hours = input.nextDouble();

    double BAC = (alcohol * 5.14 / weight * ratio1) - (0.015 * hours);
    System.out.printf("Your BAC is %.6f \n", BAC);

    if (BAC <= 0.08) {
     System.out.println("It is legal for you to drive. ");
    } else {
     System.out.println("It is not legal for you to drive. ");
    }
   }

   else //The input was not 1 nor 2.
       System.out.println("The input was not valid. ");

  }


 }

}
