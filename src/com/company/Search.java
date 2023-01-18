package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {
    public static void main(String [] args){
        Pattern pattern = Pattern.compile("Learning  Java programming",   Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(" love JAVA!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println(" Match Found");
        }else{
                System.out.println("Match not found");
        }
    }
}
