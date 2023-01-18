package RealExampleMethodOverriding;
/* scenario
Consider a scenario where Bank is a class that provides functionality to get the rate of interest.
However, the rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks could
provide 8%, 7%, and 9% rate of interest.
 */

// //Creating a parent class.
class Bank {
    int getRateOfInterest() {return 0;}
}

class SBI extends Bank{
    int getRateOfInterest()  { return 8;}
}

class ICICI extends  Bank {
    int getRateOfInterest() { return 7;}
}

class AXIS extends Bank {
    int getRateOfInterest() { return  9;}
}

class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI c = new ICICI();
        AXIS x = new AXIS();

        System.out.println("SBI Rate of Interest " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest " + c.getRateOfInterest());
        System.out.println("AXIS Rate of Interest " + x.getRateOfInterest());
    }

}


