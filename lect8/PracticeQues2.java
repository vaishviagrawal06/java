//inheritance 
//extends keyword joins two classes for inheritance

class Person {
    void name() {
        System.out.println("Riya");
    }
}

class Student extends Person {
    void standard() {
        System.out.println("Student of class 10th");
    }
}

class Monitor extends Student {
    void monitor() {
        System.out.println("Monitor to maintain silence");
    }
}

class main {
    public static void main(String[] args) {
        Monitor m1 = new Monitor();
        m1.name();
        m1.standard();
        m1.monitor();
    }
}
