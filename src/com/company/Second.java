package com.company;

class Second  {
  public static void main (String [] args){
    // create an object
   Student myObjt =new Student();

   System.out.println("Name:" + myObjt.fname);
   System.out.println("Age:" + myObjt.age);
   System.out.println("Graduation Year:" +myObjt.graduationYear);
   myObjt.study(); // call abstract method
  }
}
