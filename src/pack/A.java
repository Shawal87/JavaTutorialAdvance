package pack;
//The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.

 /* created the two packages pack and mypack. The A class of pack package is public, so can be accessed
 from outside the package. But msg method of this package is declared as protected, so it can be accessed
 from outside the class only through inheritance.
  */

public class A {
    protected void message() {System.out.println(" Hello Java Developer");
    }
}
