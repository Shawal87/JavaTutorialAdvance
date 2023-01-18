package com.company;


/* variable only accesible inside the region they are created . this call scope   */



/* block of code may exist on its own or it can belong to an if , while, or for statement , variable declared in the
statement itself a re also available in side the block's scope */

public class Scope {
   public static void main(String [] args){

       // code here  can't use x

       {  // this is a block and can't use x here

           int x = 100;

           // code here can use x
           System.out.println(x);

       }  // end a block

   }
}
