//multi threading - bydefault thread ka name main hota hai
import java.io.*;
class MyThread extends Thread{
    public void run(){
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName()); // current thread ka naam print karne ke liye

        for(int i = 0;i < 5;i++){
            System.out.println(i+" t1");
            
        }
    }
}
class hello{
    public static void main(String[] args) {
     MyThread t1 = new MyThread();
     t1.setName("namechange"); // thread ka naam change karne ke liye
     t1.start();
     try {
        t1.join(); // main thread waits for t1 to finish
     } catch (Exception e) {
       
     }
     for(int i = 0 ;i<5;i++){
        System.out.println(i+" main");
     }   
    }
}
