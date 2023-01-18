package Thread;

class Multi3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is runinng");
    }


    public static void main(String[] args) {
        Multi3 m1 = new Multi3();

        // passing the object in Thread
        Thread t1 = new Thread(m1);

        t1.start();
    }
}
