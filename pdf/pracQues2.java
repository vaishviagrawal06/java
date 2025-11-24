 /*Create two interfaces A and B. Both interfaces should have a method named display().
 Then, create a class Demo that implements both interfaces.
 Implement the display() method and call it in the main method using a Demo object.*/
 interface A{
 void display();

 }
 interface B{
    void display();

 }

 class demo implements A,B{
     public void display(){
        System.out.println("implementing diaplay a");

 }
}

 class main{
    public static void main(String[] args) {
        demo d = new demo();
        d.display();
    }
 }