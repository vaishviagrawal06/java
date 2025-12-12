
//multi threading - bydefault thread ka name main hota hai
import java.io.*;

class Bank{
    int balance = 1000;
    synchronized void withdraw(int amount)
{
    System.out.println(Thread.currentThread().getName() +"checking balance");
    if (balance>=amount){
        System.out.println(Thread.currentThread().getName() +"going to withdraw");
        balance = balance - amount;
        System.out.println(Thread.currentThread().getName() +"withdraw completed");
    }
    else{
        System.out.println("insufficient balance for "+Thread.currentThread().getName());

    }
}}
class hello extends Thread{
    public void run(){
        Bank b = new Bank();
        b.withdraw(1000);

    }
    public static void main(String[] args) {
        hello t1 = new hello();
        hello t2 = new hello();
        t1.setName("OM"+ " ");
        t2.setName("Shiv"+" ");
        t1.start();
        t2.start();

    }
}