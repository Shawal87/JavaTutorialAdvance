package com.company;

/* common error
  equality error (==) and operator (=) cause logic error
  if(number 1 == number2) ; // logic error , ; consider empty statement ,
  if statement is consider true and no tasks is performed
  System.out.printf("%d == %d\n",number1,number2);

 */

import java.util.Scanner;

public class Comparison {
    // main method
    public static void main(String[] args){

        //create scanner to obtain input
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter first integer");
        number1 = input.nextInt();//read first input from user

        System.out.print("Enter second integer");
        number2 = input.nextInt();// read second  input  from user

        if( number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);

        if(number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);

        if(number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);

        if(number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);

        if(number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);

        if(number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);

    }   // end method
}    // end class
