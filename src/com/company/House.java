package com.company;

public class House {  // superclass (parent)

    public void houseGarage(){
        System.out.println(" house have garage");
    }
}

  class Apartment extends House {
      public void houseGarage(){
          super.houseGarage(); // call the superclass method
          System.out.println("apartment have garage sales");
      }
  }


