package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatTimeDate {

    public static void main( String [] args){
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting  "  + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting" + formattedDate);

    }
}
