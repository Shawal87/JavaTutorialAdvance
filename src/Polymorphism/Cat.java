package Polymorphism;

public class Cat extends  Animal{

   @Override
    public void speak(){
        System.out.println(" cat  goes * meow*");
    }

    public static void main(String[] args) {
         Cat object1 = new Cat();
         object1.speak();
    }
}
