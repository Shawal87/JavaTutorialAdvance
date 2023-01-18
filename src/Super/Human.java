package Super;

 class Human {
     void eat(){System.out.println(" eating..");}
}

class People extends Human{
     void eat(){System.out.println("eating bread");}
     void bark() {System.out.println(" barking...");}
     void work(){
         super.eat();
         bark();

     }
}

 class TestSuper2 {
     public static void main(String[] args) {
      People p = new People();
      p.work();
     }

}
