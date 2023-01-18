package com.company;

public class Error {
    public static void main (String [] args){
        try{
            int [] myNumbers ={45,47,75};
            System.out.println(myNumbers[100]);
        }
        catch (Exception e){
            System.out.println("Something went error");
        }
    }
}
