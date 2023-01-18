package com.company;

public class ScopeL {
    //  field that is accesible to all method  of this class

    private static int x = 1;

    // method main create and initialize local variable x
    // and call method useLocalvariable and useField'
    public static  void main (String [] args) {
        int x = 5; // method's local variable x shadows field x

        System.out.printf("Local x in main  is %d\n", x);

        useLocalVariable();  //useLocalVariable  has local x
        useField();  // useField uses class Scope's field
        useLocalVariable();  //useLocalVariable reinitialized its value
        useField();  //Class Scope's field x retains its value

        System.out.printf("\nlocal x in main is %d\n", x); //
    } // end main

        // create and  initialize local variable x during each call
        public static void useLocalVariable() {
            int x = 25;
            System.out.printf("\nlocal x on entering useLocal Variable is %d\n", x);
            ++x;   // modified this method's local variable

            System.out.printf("Local x before exiting method useLocal is %d\n", x);
        }  // end method  use local variable


        //modify class scope's  field x during each call

        public static void useField() {
            System.out.printf("\nfield x on entering method useField is %d\n", x);
            x *= 10; // modified class Scope's field x

        System.out.printf("field x before existing method useField is %d\n",x);
        }
}
