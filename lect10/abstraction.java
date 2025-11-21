// Create an abstract class 'Shape' with an abstract method 'area()'. Implement two subclasses
//'Circle' and 'Rectangle'
// Abstract class
abstract class Shape {
   
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class Main {
    public static void main(String[] args) {
        Shape c = new Circle(5);        
        Shape r = new Rectangle(4, 6);  

        System.out.println("Circle Area = " + c.area());
        System.out.println("Rectangle Area = " + r.area());
    }
}
