package Thread;

/*
 the join() method that whenever the interruption of the thread occurs,
 it leads to the throwing of InterruptedException. The following example shows the same.
 */


class EDF extends Thread{
    Thread threadToInterrupt;

    // overriding the run() method
    @Override
    public void run()
    {
        // invoking the method interrupt
        threadToInterrupt.interrupt();
    }
}

public class ThreadJoinExample1 {

    // main method
    public static void main(String[] args) {

    try
    {
        EDF th1 = new EDF();  //creating an object
        th1.threadToInterrupt = Thread.currentThread();
        th1.start();


        th1.join();
    }
    catch (Exception ex){
        System.out.println(" The exception has been caught " + ex);
    }

    }
}
