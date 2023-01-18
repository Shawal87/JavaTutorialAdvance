package com.company;
  /*  use recursion to add all
 when sum() function is called, it add parameter k to the sum of all number smaller than k
 and returns the result. when k become 0, the function just return 0 ,
 10 +sum(9)
 10 + (9+ sum(8) )
 10 + (9 + (8 + sum(7)))
 .....
 10+9+8+7+6+5+4+3+2+1+sum(0)
 10+9+8+7+6+5+4+3+2+1+0
  */

public class Recursion {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
