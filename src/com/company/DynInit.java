package com.company;


//Demonstrate dynamic initialization

public class DynInit {
  public static void main (String args[]){
      double radius =4, height =7;

      //dynamically initialize volume
    double volume = 3.1416 * radius * radius * height;

    System.out.println(" Volume is " + volume);
  }

}
