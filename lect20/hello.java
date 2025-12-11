//multi threading - bydefault thread ka name main hota hai
import java.io.*;
class MyThread extends Thread{
    public void run(){
        System.out.println("hello");

        for(int i = 0;i < 5;i++){
            System.out.println(i+" t1");
        }
    }
}
class hello{
    public static void main(String[] args) {
     MyThread t1 = new MyThread();
     t1.start();
     for(int i = 0 ;i<5;i++){
        System.out.println(i+" main");
     }   
    }
}
