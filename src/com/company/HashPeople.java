package com.company;


/* create a Hashmap object called people that will store String  keys and Integer values:

                                                                                                                  */
import java.util.HashMap;

public class HashPeople {
    public static void main(String [] args){
        //create  a hashmap object call people
        HashMap<String , Integer > people= new HashMap<String, Integer>();

        // add keys and value
        people.put("John", 22);
        people.put("wick", 45);
        people.put("Alice", 25);

        for (String i : people.keySet()){
            System.out.println("Name: " + i + "Age: " + people.get(i));
        }
    }
}
