//runnable keyword ka use karke thread crreate karna
import java.io.*;

class myThread implements Runnable{
    public void run (){
        System.out.println("heyyy");
    }
}
class hello{
    public static void main(String[] args) {
        myThread task = new myThread();
        Thread t1 = new Thread (task);
        Thread t2 = new Thread (task);
        t1.start();
        t2.start();
    }
}
