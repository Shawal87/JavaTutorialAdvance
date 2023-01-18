package Aggregation;


/* etc  class employee has a relationship with address  ( use for reusability)
   class Employee {
   int id;
   String name;
   Address address; // Address is a class
   }
  public class Address {
   String city, state, country;

   public Address(String city, String state, String country)
   {
     this.city = city;
     this.state = state;
     this.country = country;
   }
  }


 */
class Operation {
    int square (int n){
        return n*n;
    }
}

class Circle{
    Operation op; // aggregation
    double pi = 3.14;

    double area(int radius){
        op = new Operation();
        int rsquare = op.square(radius); // code reusability (i.e.delegate the method call)
        return pi*rsquare;
    }


    public static void main(String args [])
    {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }

}
