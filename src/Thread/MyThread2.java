package Thread;

    //  Using the Thread Class: Thread(String Name)

 class MyThread2 {

     public static void main(String[] args) {


         // creating an object of the thread class using the constructor Thread(String name)
         Thread  t = new Thread(" My first thread");

         //the start() method moves the thread to the active state
         t.start();

         // getting the thread name by invoking the getName() method
         String str = t.getName();

         System.out.println(str);
     }
}
