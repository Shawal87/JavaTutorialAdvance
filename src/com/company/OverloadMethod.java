package com.company;
   /*   method overload is multiple method  with a different parameter
         int myMethod()
         float myMethod()
         double myMethod ()

    */
public class OverloadMethod {
   static int plusMethodInt ( int x, int y){
       return x + y;
   }

   static double plusMethodDouble ( double x , double y) {
       return x + y ;
   }
   public static void main(String [] args){
       int myNynumber1 = plusMethodInt(8,7 );
       double myNumber2 = plusMethodDouble(42.5, 47.8);

      System.out.println("int :" + myNynumber1);
      System.out.println( "double: " + myNumber2);
   }

}
