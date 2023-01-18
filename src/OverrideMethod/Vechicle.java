package OverrideMethod;


//usage of method overriding : provide specific implementation of a method which is alreaday provided by its superclass
//usage of method ovverding : run polymorphim

/*  Rules for java method overrding
1. method have the same name as in the parent class
2. method must have the same parameter as in the paremt class
3. there must be an IS-A relationship(inhertitance)

 */

// creating a parent class
class Vechicle {
    void run()
    {
        System.out.println("Vehicle is running");
    }
}
// creatimng a child class
class Bike extends Vechicle
{
    public static void main(String[] args) {
        // creating an instance of child class
        Bike obj = new Bike();
        // calling  the method with child class instance
        obj.run();
    }
}