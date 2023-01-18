package com.company;

import java.util.Scanner;

public class Input {
    public static void main (String [] args){
        Scanner myObj = new Scanner (System.in);  // create scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine(); // read user input
        System.out.println("Username is:" + userName);

    }
}
