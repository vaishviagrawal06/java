class Rectangle {
    double length;
    double breadth;

  Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double calculateArea(){
        return length*breadth;
    }
    double calculatePerimeter() {
        return 2 * (length + breadth);
    }
 
}
class Main{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(8.5, 6.2);
        Rectangle r3 = new Rectangle(4, 3);
   
        System.out.println("rectangle 1");
        System.out.println("Area = " + r1.calculateArea());
        System.out.println("Perimeter = " + r1.calculatePerimeter());

        System.out.println("rectangle 2");
        System.out.println("Area = " + r2.calculateArea());
        System.out.println("Perimeter = " + r2.calculatePerimeter());

        System.out.println("rectangle 3");
        System.out.println("Area = " + r3.calculateArea());
        System.out.println("Perimeter = " + r3.calculatePerimeter());
    }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 