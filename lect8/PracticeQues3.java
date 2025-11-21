 class Shape {
    void draw() {
        System.out.println("drawing a sketch");
    }
 }
 class Circle extends Shape {
    void calculateArea() {
        System.out.println("Area of circle is r*r");
    }
 }
class main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.calculateArea();
    }
}