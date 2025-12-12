//runnable keyword ka use karke thread crreate karna
import java.io.*;

class myThread implements Runnable{
    public void run (){
       for(int i = 0;i<5 ; i++){
        System.out.println(i);
         try{
                Thread.sleep(2000);
       }
       catch(Exception e){
        System.out.println(e);
       }
    }
}
}
class hello{
    public static void main(String[] args) {
        myThread task = new myThread();
        Thread t1 = new Thread (task);
        t1.start();
        
    }
}
