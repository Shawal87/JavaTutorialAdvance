package com.company;

public class Day {
    public static void main (String [] args ){
        // switch  = statement that allow aa variable to be tsested fpor equality against a list of value
        String day = "Friday";

        switch (day){
            case"Sunday": System.out.println("Off day");
            break;
            case "Saturday":System.out.println("Offday");
            break;
            case "Friday": System.out.println("work");
            break;
            case "Thurday":System.out.println("work");
            break;
            case "Wednesday":System.out.println("work");
            break;
            case "Tuesday":System.out.println("work");
            break;
            case "Monday": System.out.println("work");
            break;
        }
    }
}
