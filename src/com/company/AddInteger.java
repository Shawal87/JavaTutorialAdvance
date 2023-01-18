package com.company;

import java.util.Scanner;


/* %g c formatter to use either %f or %e, whichever is shorter
   %h   hash code of the argument
   %d decimal integer
   %c character
 */

public class AddInteger {
    public static void main(String [] args){
        // create a scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1;  // first number to add;
        int number2; // second number to add;
        int sum;  //

        System.out.print("Enter first integer:"); //prompt
        number1 =input.nextInt(); // read first number from user

        System.out.print("Enter second integer"); // prompt
        number2 =input.nextInt(); // read second number from user

          sum = number1 + number2;
        // display sum
        System.out.printf("Sum is %d\n", sum);
    }
}
