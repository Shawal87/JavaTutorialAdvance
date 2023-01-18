package com.company;
  //  other way to achieve abtraction is Interface
 class Animal {

    public void animalSound(){
        System.out.println("animal maskes  a sound");
    }
}

  class Pig extends Animal {
     public void animalSound(){
         System.out.println("the pig says : wee wee");
      }
  }

  class Dog extends Animal {
     public void animalSound(){
         System.out.println("the dog says: bark bark");
      }
  }

  class Pet{
     public static void main (String [] args){
         Animal myAnimal = new Animal(); // create animal object
         Animal myPig = new Pig(); // create a pig object
         Animal myDog = new Dog(); // create a dog project
         myAnimal.animalSound();  //object + constructor
         myPig.animalSound();      // object + constructor
         myDog.animalSound();     // object + constructor
     }
  }