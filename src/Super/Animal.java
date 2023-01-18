package Super;
  /*  usage of super keywords
    1. refer immediate parent class instance variable.
    2. super use to invoke immediate parent class method
    3. super() can be use to invoke immediate parent class constructor

   */
// We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.
 class Animal {
    String color = "white";
}


 class Dog  extends Animal{

     String color = "black";
     void printColor(){
         System.out.println(color);
         System.out.println(super.color);
     }
 }

 class TestSuper1{
     public static void main(String[] args) {
         Dog d = new Dog();
         d.printColor();
     }

 }