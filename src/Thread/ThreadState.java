package Thread;


/*  Life cycle of a thread (new, active, block, timed waiting, terminated)
  CREATING THREAD USING RUNNABLE INTERFACE

  THERE ARE 2 WAYS TO CREATED THREAD:
   1)  extending thread class
   2)  By implementing runnable interface
   */
import org.w3c.dom.ls.LSOutput;

class ABC implements  Runnable{


    @Override
    public void run() {
     // catch and block
        try {
            //moving thread t2 to the state time waiting
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//
public class ThreadState implements Runnable {

    public static Thread t1;     //
    public static ThreadState obj;


    // main method
    public static void main(String[] args) {
        // creating an object of the class ThreadState inside the main
        obj = new ThreadState();

        // passing the objc to the thread in main()
        t1 = new Thread(obj);


        //thread t1 spawned
        //Thread t1 is currently in the NEW state
        System.out.println("The state of thread t1 after spawning it" + t1.getState());


        //invoking the start method on
        //the thread t1
        t1.start();

        // thread t1 is moved to the Runnable state
        System.out.println("The state of thread t1 after invoking the method start() on it");

    }

    @Override
    public void run() {
      ABC myObj = new ABC();
      Thread t2 = new Thread(myObj);


        //thread t2 is created and is currently in the NEW state
        System.out.println("The state of the thread t1 after spawing it" + t1.getState());

        // try and catch block

        try{
        Thread.sleep(200);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

        System.out.println("The state of thread2, after invoking the method sleep on it" + t2.getState());


        try{
            t2.join();
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }

        System.out.println("The state of thread t2 when it has completed it's execution" + t2.getState());



    }
}
