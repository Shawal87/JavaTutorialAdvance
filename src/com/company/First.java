package com.company;
  // abstract class

  abstract class First {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); //abstract method
  }

    //subclass (inherit from First
     class Student extends First {
        public int graduationYear = 2018;

        public void study() {
            System.out.println("Studying all day long");
        }

        // end code filename, first.java

    }



