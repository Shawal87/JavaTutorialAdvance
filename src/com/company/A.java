package com.company;

public class A {
    private int x = 10;
      class B{
          private int x = 20;
          class C {
              private int x =30;
              public void allTheX(){
                  System.out.print(x);

              }
          }
      }

      public static void main(String [] args) {
          A a = new A();
          A.B b = a.new B();

      }
}
