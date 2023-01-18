package com.company;

public class Obj {

    int x;    // create a class attribute

    // create a class constructor for the main class
    public Obj() {
        x = 5;
    }

    public static void main(String [] args){
        Obj myObj = new Obj();                   // create object of class main ( call the constructor)
        System.out.println( myObj.x);  // print value of x
    }
}