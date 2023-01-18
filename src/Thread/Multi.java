package Thread;


/*   Java thread example by extending Thread class


 */
class Multi  extends Thread{
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        Multi T1 = new Multi();
        T1.run();
    }
}
