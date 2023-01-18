package com.company;


/*
  The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y).
  When we call the constructor, we pass a parameter to the constructor (10), which will set the value of x to 10:
*/

public class ObjAdd {
    int x;

     public ObjAdd (int y){
         x = y;
     }

     public static void main (String [] args){

         ObjAdd myObjAdd  = new ObjAdd(10);
         System.out.println(myObjAdd.x);
     }

}
