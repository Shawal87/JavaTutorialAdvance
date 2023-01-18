package com.company;
  // using array initializer

public class InitArray {
    public static void main(String [] args){

        // initializer list specifies the value for each element
        int [] array = {32,27, 64, 18, 95, 14,90, 70, 60,17};

        System.out.printf("%s%8s\n", "index", "value");  // column heading


        // output each array element's value

        /*    

              */
        for (int counter =0 ; counter < array.length; counter++)
            System.out.printf("%5d%8d\n",counter, array[counter]);
    }
}
