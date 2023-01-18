package Polymorphism;

// Covariant return type specifies that the return type may vary in the same direction as the subclass.

 class A {
     A get(){return this;}
}

class B1 extends A{
     B1 get(){return this;}
    void message(){
        System.out.println("Welcome to covariant return type");
    }

    public static void main(String[] args) {
        new B1().get().message();
    }
}
