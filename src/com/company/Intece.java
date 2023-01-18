package com.company;

// interface animal
interface Motor {
 public void speed();
 public void broken ();
}

 // pig " implements the animal interface
 class Ducati implements  Motor {

 // Constructor
 public void speed() {
  // the body of is provided here
  System.out.println("the motor : speed up above 150 kn per/h");
 }
  public void broken(){
  // the body  of broken  () is provided here
   System.out.println("Motor ducati is broken down due to technical error");
  }
 }


// Inteface require to have object, so create one

class Intece {
 public static void main (String [] args){
  Ducati myDucati = new Ducati(); // create a pig object
   myDucati.speed();
   myDucati.broken();
 }
}
