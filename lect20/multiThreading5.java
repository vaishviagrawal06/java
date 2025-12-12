
//multi threading - bydefault thread ka name main hota hai
import java.io.*;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("downloading file.... " + (i * 20) + "%");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }
}

    class hello {
        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            t1.start(); 
            for (int i = 1; i <= 5; i++) {
                System.out.println("Timer.... " + i);
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                }
            }

        }
    }

