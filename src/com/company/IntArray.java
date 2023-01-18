package com.company;

public class IntArray {
    public static void main ( String [] args ){

        int [] array;  //declare array
        array  = new int [10];

        System.out.printf("%s%8s\n", "index", "value"); // column heading

        for( int counter= 0; counter <array.length;counter++)
        System.out.printf("%5d%8d\n", counter, array [counter]);

    }  //end main
}    // end class
