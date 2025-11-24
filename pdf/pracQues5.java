/*. Create an interface Vehicle with a default method start() that prints "Vehicle is starting...".
 Create a class Car that implements Vehicle.
 Call the default method from an object of Car in the main method */

 interface Vehicle{
    default void start(){
       System.out.println("Vehicle is starting...");
    }
 }
 class car implements Vehicle{

 }
 class main{
    public static void main(String[] args) {
        car c = new car();
        c.start();
    }
 }