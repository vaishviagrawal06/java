 /*Create two interfaces Walkable and Runnable. 
Each should have a method: walk() and run() respectively.
 Then, create a class Human that implements both interfaces and defines both methods.
 Create a main method where an object of Human is created and both methods are called.*/

 interface Walkable{
    void walk();

 }

 interface Runnable{
    void run();

 }
 class Human implements Walkable,Runnable{

    public void walk() {
        System.out.println("Interface walkable");
    }
    public void run() {
        System.out.println("Interface runnable");
    }
 }

class main{
    public static void main(String[] args) {
        Human a = new Human();
        a.walk();
        a.run();
        
    }
}