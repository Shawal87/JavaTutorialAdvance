package com.company;

public class ParaObj {
    int modelYear;
    String modelName;

     public ParaObj (int year, String name){
         modelYear = year;
         modelName = name;
     }

     public static void main(String [] args){

         ParaObj myCar = new ParaObj(1697, "Mustang");
         System.out.println(myCar.modelYear +" "+ myCar.modelName);
     }


}
