
 /*
  primitive type arrays  - implicitly promoted to declared type
  object type array - either declared type object or it's child class objects
  abstract class type arrays  - it child-class objects are allowed
  interface type arrays  - implementation class objects are allowed


  */
public class GGF {
    public static void main (String [] args)
    {
        // declares an array of integers.
        int[] arr;

        //allocating memory for 5 integers.
        arr = new int[6];


        // initialize the first elements of the array
        arr[0] =68;


        // initialize the first elements of the array
        arr[1] =98;

        // so on
        arr[2] =78;
        arr[3] =63;
        arr[4] =68;
        arr[5] =55;
      // loop function array
        for ( int i =0 ; i < arr.length; i++) System.out.println("Element at index" + i +":" + arr[i]);

    }

}
