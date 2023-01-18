package com.company;


/*
  method must call inside class, it can pass data know as parameter: to define once , use it many times.
    myMethod() is the name of the method
    static means the method belong to the main class and not object of the main class.
    void means that method does have return value

 */
public class JavaMethod {
    static void myMethod(){
      System.out.println("I just got executed");
    }
   public static void main(String [] args) {
   myMethod();

   }
}