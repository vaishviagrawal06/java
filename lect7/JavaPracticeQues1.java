class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name,int rollNumber, double marks){
        this.name=name;
        this.rollNumber = rollNumber;
        this.marks = marks;

    }
    void display(){
        System.out.println("name is :" + name);
        System.out.println("rollNumber is :" + rollNumber);
        System.out.println("marks is :" + marks);
    }
}

 class Main {
    public static void main(String[] args) {

        Student s1 = new Student("tom", 101, 89.5);
        Student s2 = new Student("roy", 102, 76.0);
        Student s3 = new Student("joy", 103, 92.3);

        s1.display();
        s2.display();
        s3.display();
    }
}
































   