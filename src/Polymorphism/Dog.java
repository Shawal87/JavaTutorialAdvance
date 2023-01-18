package Polymorphism;

public class Dog extends  Animal{
    @Override
    public void speak() {
        System.out.println(" dog  goes * bark*");
    }

    public static void main(String[] args) {
        Dog object3 = new Dog();
        object3.speak();
    }

}
