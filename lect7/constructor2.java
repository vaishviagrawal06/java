//this variable is instant  variable

class Car {
    Car(String str) {
        System.out.println(str);  
        
    }
}

class Main {
    public static void main(String[] args) {
       Car obj = new Car("hello");
        Car obj1 = new Car("hiii");
    }
}
