package Modifier;
/*
 access modifier  |   within class   |    within package  |  outside package by subclass   |  outside package
  Private         |        Y         |         N          |              N                 |        N
  Default         |        Y         |         Y          |              N                 |        N
  Protected       |        Y         |         Y          |              Y                 |        N
  Public          |        Y         |         Y          |              Y                 |        Y
 */

// Private access modifies is accessible within the class
    class Simple {
    private int data = 40;

    private void msg() {
        System.out.println("Hello Java");
    }
}



    public class A {
        public static void main(String[] args) {
            Simple obj = new Simple();
           // System.out.println(obj.data);  // compile time error
           // obj.msg();  //  compile time error

        }

    }
