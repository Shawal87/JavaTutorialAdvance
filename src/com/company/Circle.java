package com.company;

import java.util.Scanner;

public class Circle {

    public static void main ( String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        double radius = input.nextDouble();
        System.out.printf("Area is %f\n", circleArea(radius));
    }  // end method

    //calculate and return circle area
    public static  double circleArea(double radius){
        double area = Math.PI * Math.pow ( radius,2);
        return area;
    }  //end method circle Area
}  // end clas cirlce
