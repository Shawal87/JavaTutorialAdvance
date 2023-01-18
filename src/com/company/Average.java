package com.company;

import java.util.Scanner;

public class Average {
    public static void main (String [] args){
        // create scanner
        Scanner input= new Scanner(System.in);

        float x; //first number input
        float y;  // second number input
        float z;   // third number input
        float result;  // average of number

        System.out.print("Enter first number");  //prompt for input
        x =input.nextFloat();

        System.out.print("Enter second number");
        y = input.nextFloat();

        System.out.print("Enter third number");
        z =input.nextFloat();

        result =(x+y+z)/3;

       System.out.printf("Average is %f\n", result);


    }
}
