package com.company;
 // nest  switch case statement
public class DHF {

    //main driver method
    public static void main (String [] args ){
        //Custom input  string
        String Branch = "VSE";
        int year = 2;

        //switch case

        switch (year){
            //case
            case 1: System.out.println( "elective course: Advance english, Algelbra");
            break;

            //break statement to hault execution here
            // itself if case is matched

            // case
            case 2:

                // switch inside a switch a
                // nested switch
                switch( Branch) {


                    case "VSE":
                    case "VVE":
                        System.out.println("elective course: Machine learning, Big Data");
                        break;
                    case "VVR":
                        System.out.println("Anteena Engineering");
                        break;

                    default:
                        System.out.println("Elective course: Optimization");
                }
        }
    }
}
