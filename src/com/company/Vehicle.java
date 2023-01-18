package com.company;

public class Vehicle {
    protected String brand ="Tesla";  // vehicle attribute
    public void  honk () {   // vehicle method
        System.out.println("Electrical vehicle");

    }
}

class Car extends Vehicle {
    private String modelName ="model 3"; // Car attribute
    public static void main (String [] args) {

        // create a myCar Object
        Car myCar = new Car();

        // Call the honk() method (from the vehicle class) on the mycar object
        myCar.honk();

        //Display the value of the brand attribute (from the vehicle class) and the value of the model name from the car class
        System.out.println(myCar.brand + " " + myCar.modelName);

    }
}