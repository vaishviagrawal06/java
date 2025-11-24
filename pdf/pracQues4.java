/* Create an interface Shape with a method area().
 Then, create a class Circle that implements Shape and calculates the area using radius = 5.
 Print the area in the main method. */
 
 interface Shape {
    double area();   
}

class Circle implements Shape {
    private double radius = 5;  
    public double area() {
        return 3.14 * radius * radius;
    }
}

public class main {
    public static void main(String[] args) {

        Shape obj = new Circle();

        System.out.println("Area of Circle: " + obj.area());
    }
}
