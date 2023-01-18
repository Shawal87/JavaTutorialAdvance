package com.company;

public class ParaMethod {
    static void myMethod(String fname){
        System.out.println( fname + "Wick");
    }
    public static void main(String [] args){
     myMethod( "John");
     myMethod("Freddy");
     myMethod("Michael");
    }
}
