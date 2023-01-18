package com.company;

import java.util.HashMap;

public class Map {
    public static void main (String [] args){
        HashMap <String,String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("United State of America", "Washington");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Malaysia", "Kuala Lumpur");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));

        for( String i : capitalCities.values()){
            System.out.println(i);
        }
    }
}
