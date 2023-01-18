package com.company;

public class OverLMethod {

    public static void main (String [] args) {

        System.out.printf(" Square of integer 7 is %d\n", square(7));
        System.out.printf(" Square of double value  is %d\n",value(7.5));
    }

        //square method with int argument

        public static int square(int intValue){
            System.out.printf("\n Called square with int argument:%d\n", intValue);
            return intValue * intValue;
        } // end method square with int argument


       // Square method with double argument
       public static double value (double doubleValue) {

            System.out.printf(" \nCalled square with double argument: %f\n", doubleValue);
            return doubleValue * doubleValue;
        }
}
