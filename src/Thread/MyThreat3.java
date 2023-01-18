package Thread;

// 4) Using the Thread Class: Thread(Runnable r, String name)

public class MyThreat3 implements Runnable {


    @Override
    public void run() {
        System.out.println("Now the thread is running");
    }

    public static void main(String[] args) {

        // creating an object of the class MyThread3
        Runnable r1 = new MyThreat3();

        // creating an object of the class Thread using Thread(Runnable r, String name)
        Thread th1  = new Thread(r1, "My new thread");

        // the start() method moves the thread to tge active state
        th1.start();

        //getting the thread name by invoking the getName() method
        String str = th1.getName();

    }
}
