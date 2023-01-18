package com.company;

class bicycle {
    // bicycle class has two fields
    public int gear;
    public int speed;

    //  bicycle class has one constructor
    public bicycle (int gear, int speed ) {
        this.gear = gear;
        this.speed = speed;
    }

    // bicycle class has three methods
    public void applyBrake (int  decrement){
        speed -= decrement;
    }
    public void speedUp( int increment){
        speed += increment;
    }
    // toString() method to print info of bicycle
    public String toString(){
        return (" No of gear are " + gear + "\n" + " speed of bicycle is " + speed);
    }
}
   // derive class
    class Mountainbike extends bicycle {

        //the mountainbike subclass add one more fields
       public int seatHeight;

       // the mountainbike subclass has one constructor
        public Mountainbike (int gear, int speed, int startHeight){
            // invoking base-class (bicycle) consructor
            super(gear, speed);
            seatHeight = startHeight;
        }

        //the mountainbike subclass adds one more method
       public void setHeigh (int newValue){
            seatHeight = newValue;
       }

       //overriding toString() method
       //of bicyle to print more info
       @Override public String toString(){
            return  (super.toString() + "\nseat height is " + seatHeight);
       }
    }
