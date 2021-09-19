/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution23
 *  Copyright 2021 Juan Guarnizo
 */
/*
 * @startuml
if (Is the car silent when you turn the key?) then (yes)
    if (Are the battery terminals corroded?) then (yes)
        :Clean terminals and try starting again.;
        stop
    else (no)
        :Replace cables and try again.;
        stop
    endif
else (no)
    if (Does the car make a slicking noise?) then (yes)
        :Replace the battery.;
        stop
    else (no)
        if (Does the car crank up but fail to start?) then (yes)
            :Check spark plug connections.;
            stop
        else (no)
            if (Does the engine start and then die?) then (yes)
                if (Does you car have fuel injection?) then (yes)
                    :Get it in for service.;
                    stop
                else (no)
                    :Check to ensure the choke is opening and closing.;
                    stop
                endif
            else (no)
                :This should not be possible.;
                stop
            endif
        endif
    endif
endif
@enduml
 *
 *
 */


import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        System.out.println("Is the car silent when you turn the key?");
        answer = input.next();
        if(answer.equals("y") || (answer.equals("Y"))){
            System.out.println("Are the battery terminals corroded?");
            answer = input.next();
            if(answer.equals("y") || (answer.equals("Y"))){
                System.out.println("Clean terminals and try starting again");
            }//end second answer positive
            else{
                System.out.println("Replace cables and try again");
            }//end second answer negative
        }//end first answer positive
        else{
                System.out.println("Does the car make a slicking noise?");
                answer = input.next();
            if(answer.equals("y") || (answer.equals("Y"))){
                System.out.println("Replace the battery");
            }//end second answer positive
            else{
                System.out.println("Does the car crank up but fail to start?");
                answer = input.next();
                if(answer.equals("y") || (answer.equals("Y"))){
                    System.out.println("Check spark plug connections");
                }//end third answer positive
                else{
                    System.out.println("Does the engine start and then die?");
                    answer = input.next();
                    if(answer.equals("y") || (answer.equals("Y"))){
                        System.out.println("Does your car have fuel injection?");
                        answer = input.next();
                        if(answer.equals("y") || (answer.equals("Y"))){
                            System.out.println("Get it in for service");
                        }
                        else{
                            System.out.println("Check to ensure the choke is opening and closing");
                        }

                    }
                    else{
                        System.out.println("This should not be possible");
                    }
                }
            }//end second answer negative

        }//end first answer negative



    }//end of main function
}//end of class
