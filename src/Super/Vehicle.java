package Super;

// 3) super is used to invoke parent class constructor.
class Vehicle {
    Vehicle(){System.out.println("vehicle is creating");}
}

class Motor extends Vehicle{
    Motor(){
        super();
        System.out.println("Motor is creating");
    }
}

class Tester3 {
    public static void main(String[] args) {
        Motor m = new Motor();
    }
}
