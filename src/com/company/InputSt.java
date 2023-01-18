package com.company;


/* username enter name, age  and salary  */

import java.util.Scanner;

class InputSt {
    public static void main(String [] args){
        Scanner myObject = new Scanner(System.in);

        System.out.println("Enter name, age, salary");

        // String input and  read input for name
        String name = myObject.nextLine();

        // Numerical input
        int age = myObject.nextInt();
        double salary = myObject.nextDouble();

        // output  input by user
        System.out.println("Name is: "+ name );
        System.out.println( "Age is:" + age);
        System.out.println(" Salary is :" + salary);


    }
}
