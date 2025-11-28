import java.util.ArrayList;
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int rollno;

    public Student(int rollno, String name) {
        this.name = name;
        this.rollno = rollno;
    }


    public int compareTo(Student s1) {
        return this.rollno - s1.rollno;  
    }

    public String toString() {
        return rollno + " " + name;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3, "Riya"));
        list.add(new Student(1, "Amit"));

        Collections.sort(list);  

        System.out.println(list);
    }
}
