package com.company;

import java.io.ObjectInputFilter;
import java.util.Random;
public class Craps {

    // create random number generate for use in method rollDice
    private static final Random randomNumbers= new Random();

    //enumeration with constant  that represent the games status
     private enum status { CONTINUE, WON, LOST};

     // constants that represent common  rolls of the dice
     private static final int SNAKE_EYES = 2;
     private static final int TREY = 3;
     private static final int SEVEN = 7;
     private static final int  YO_ELEVEN = 11;
     private static final int  BOX_CARS = 12;

     //plays one game of craps
    public static void main(String[] args) {
        int myPoint = 0;  // point if no win or loss on first role

        status gameStatus;   // cam contain CONTINUE , WON , LOST

        int sumOfDice = rollDice(); //first roll of the dice

        // determine games status and point base on first roll

        switch (sumOfDice) {
            case SEVEN:   //win with 7 on first role
            case YO_ELEVEN: //
                gameStatus = status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = status.LOST;
                break;
            default:
                gameStatus = status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d \n , myPoint");
                break;
        }  //end switch


        // while game is not complete
        while (gameStatus == status.CONTINUE) {
            sumOfDice = rollDice(); // role dice again
            //  determine the status
            if (sumOfDice == myPoint) gameStatus = status.WON;     //WIN BY MAKING  POINT
            else if (sumOfDice == SEVEN) gameStatus = status.LOST;
        }     // END while

        //display won or lost message
        if (gameStatus == status.WON) System.out.println("Player wins");
        else
            System.out.println("PLayer loses");

    } // end main

        //roll dice, calculation sum and display result
        public static int rollDice() {
              // pick a random die value
         int die1= 1 + randomNumbers.nextInt(6); // first die roll
         int die2 =1 + randomNumbers.nextInt(6); // second die roll

         int sum = die1 + die2; // sum of die value

        //display result of this roll
        System.out.printf("Player rolled %d + %d = %dn, die1, die2, sum");

        return sum; // return sum of dice
        }
}
