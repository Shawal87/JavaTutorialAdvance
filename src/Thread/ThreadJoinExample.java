package Thread;

/* he following program shows the usage of the join() method.

 */

class ThreadJoin extends Thread{

    @Override
    public void run() {
        for (int j = 0; j < 6 ; j++)
        {
            try{Thread.sleep(300);
                System.out.println("The current thread name is " + Thread.currentThread().getName());} catch (Exception e) {
                System.out.println("The exception " + e);
            }
            System.out.println(j);
        }
    }
}


// main class
public class ThreadJoinExample {

     // main method
    public static void main(String[] args) {


        //  creating 3 thread
        ThreadJoin th1 = new ThreadJoin();
        ThreadJoin th2 = new ThreadJoin();
        ThreadJoin th3 = new ThreadJoin();

     // thread th1 start
        th1.start();


        try {
            System.out.println("The current thread name is " + Thread.currentThread().getName());
            // Invoking the join method
            th1.join();

        } catch(Exception e) {
            System.out.println(e);
        }

        // thread th2 start
        th2.start();

        try {
            System.out.println("The current thread name is " + Thread.currentThread().getName());
            // Invoking the join method
            th2.join();

        } catch(Exception e) {
            System.out.println(e);
        }

        th3.start();

        try {
            System.out.println("The current thread name is " + Thread.currentThread().getName());
            // Invoking the join method
            th3.join();

        } catch(Exception e) {
            System.out.println(e);
        }

    }






}
