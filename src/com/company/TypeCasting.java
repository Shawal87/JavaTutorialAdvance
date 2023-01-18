package com.company;
/* widening casting byte short char int long float double  (automatically)
  narrowing casting double float long int char short byte   ( manually)
 */
public class TypeCasting {
    public static void main(String [] args){
        int myInt = 9;
        double myDouble = myInt;   //Automate casting : int to double

        System.out.println(myInt);
        System.out.println( myDouble);

    }
}
