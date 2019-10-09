/*
 * Kieran Bates
 * October 9, 2019
 * This program calculates exponents when the user specifies the base and the exponent.  It also has an option to use a default exponent of 2 or 3.
 */

package exponentprogram;

import java.util.Scanner;

public class ExponentProgram {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int base; //Declare variables
        int exponent;
        int answer;
        int userInput;
        boolean programStop = false;
        Scanner input = new Scanner(System.in); //Start scanner
        
        while(programStop == false) //While programStop is false
        {
        System.out.println("EXPONENT CALCULATOR"); //Prompt user with calculation options
        System.out.println("\nPlease enter your choice");
        System.out.println("1 ... Find the value of a number squared");
        System.out.println("2 ... Find the value of a number cubed");
        System.out.println("3 ... Find the value of a number to any power");
        System.out.println("4 ... Exit");
        System.out.print("\nEnter choice here --> ");
        userInput = input.nextInt();
        
            if (userInput == 1) //If user input is 1
            {
                System.out.print("\nPlease enter the base --> "); //Prompt user to enter base
                base = input.nextInt(); //Obtain user input
                answer = base*base; //Calculate
                System.out.println("\nAnswer = " +answer +"\n"); //Output answer
                userInput = 0; //Reset user input
            }
            
            if (userInput == 2) //If user input is 2 follow the same process
            {
                System.out.print("\nPlease enter the base --> ");
                base = input.nextInt();
                answer = base*base*base;
                System.out.println("\nAnswer = " +answer +"\n");
                userInput = 0;
            }
            
            if (userInput == 3) //If user input is 3
            {
                System.out.print("\nPlease enter the base --> "); //Prompt user to enter base
                base = input.nextInt(); //Obtain user input and store in base
                answer = base; //Set the answer to the base for calculation
                System.out.print("\nPlease enter the exponent --> "); //Prompt the user to enter the exponent
                exponent = input.nextInt(); //Obtain user input and store in exponent
                
                for(int i = 1; i<exponent; i++) //loop until the value of the exponent has been reached
                {
                    answer = answer*base; //multiply the answer by the base
                }
                System.out.println("\nAnswer = "+answer +"\n"); //Output answer to display
                userInput = 0; //reset user input
            }
            
            if (userInput == 4) //If user input is 4
            {
                programStop = true; //Set program stop to true and terminate the program
            }
        }
    } 
}
