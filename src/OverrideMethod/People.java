package OverrideMethod;

//As displayed in the above diagram, byte can be promoted to short, int, long, float or double.
// The short datatype can be promoted to int, long, float or double. The char datatype can be promoted
// to int,long,float or double and so on

// creating a parent class
class People
{
    // defining a method
    void run(){System.out.println("People is running");}
}

// creating a child  class
class Army extends People
{
    // defining a method as in the parent class
    void run() {System.out.println(" army is running faster and courageous");
    }

    public static void main(String[] args) {
        Army obj = new Army();   // ceating a object
        obj.run();  // calling a method
        People obj2 = new People();
        obj2.run();
    }
}

