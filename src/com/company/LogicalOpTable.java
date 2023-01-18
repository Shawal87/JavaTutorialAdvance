package com.company;

public class LogicalOpTable {
    public static void main(String args[]){
        boolean p,q;
        System.out.println("P\tQ \tAND \tOR \tXOR \tXOR \tNOT");

        p=true; q=true;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));


        p= true ; q =false;
        System.out.println(p +"\t" + q + "\t");
        System.out.println((p&q) + "\t" +(p|q) + "\t");
        System.out.println((p^q)  + "\t" +(!q));

        p=false ; q=true;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p=false; q=false;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p&q) + "\t" +(p|q) + "\t");
        System.out.println((p^q)  + "\t" +(!q));

    }
}
