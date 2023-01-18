package Modifier;
/*
If you make any class constructor private,
you cannot create the instance of that class from outside the class. For example:
 */

class B {
    private B() {}   //private constructor
    void message() {System.out.println("Helloo Java");}
}
public class Beast {
    public static void main(String[] args) {
    //    B obj  = new B();   // compile time error

    }
}

/* save time  : default error  -  default outside package
package pack;
class A{
  void msg(){System.out.println("Hello");}
}

package mypack;
import pack.*;
class B{
  public static void main(String args[]){
   A obj = new A();//Compile Time Error
   obj.msg();//Compile Time Error
  }
}




 */
