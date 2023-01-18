package Polymorphism;
  // Example of Method Overloading with TypePromotion

// reference
// As displayed in the above diagram, byte can be promoted to short, int, long,
// float or double. The short datatype can be promoted to int, long, float or double.
// The char datatype can be promoted to int,long,float or double and so on
 class Promote {
    void sum(int a, long b) {System.out.println(a+b);}
    void sum(int a, int b, int c) {System.out.println(a+b+c);
    }

      public static void main(String[] args) {
          Promote obj = new Promote();
          obj.sum(42,45);
          obj.sum(20,10,42);
      }
}
