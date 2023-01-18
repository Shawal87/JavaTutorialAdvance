package com.company;

  //Class
      public class GFG {

      //Main driver method
      public static void main(String[] args) {

          int day = 5;
          String dayString;

          //Switch statement with int data type
          switch (day) {

          // case
          case 1:
          dayString = "Monday";
          break;

          //case
          case 2:
          dayString = "Tuesday";
          break;

          //case
          case 3:
          dayString = "Wednesday";
          break;

          //case
          case 4:
          dayString = "Thursday";
          break;

          //case
          case 5:
          dayString = "Friday";
          break;

          //case
          case 6:
          dayString = "Saturday";
          break;

          //case
          case 7:
          dayString = "Sunday";
          break;

          // default case
          default:
          dayString = "invalid day";
      }

     System.out.println(dayString);
  }
}
