package Thread;

public class TestSleepMethod2 {

    public static void main(String[] args) {


        try{
         for (int j =0 ; j < 5 ; j ++)
         {
             // the main thread
             Thread.sleep(1000);

             //displaying the value of the variable
             System.out.println(j);
         }
         // catching the exception
        }catch (Exception expn){System.out.println(expn);
        }
    }
}
