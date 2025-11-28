import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int rollno;

    public Student(int rollno, String name) {
        this.name = name;
        this.rollno = rollno;
    }

  
    public int compareTo(Student s) {
        return this.rollno - s.rollno;
    }

   
    public String toString() {
        return rollno + " " + name;
    }
}

class NameSorted implements Comparator<Student> {
 
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3, "Ravi"));
        list.add(new Student(1, "Ankit"));
     
        Collections.sort(list, new NameSorted());
       for(Student s: list){
        System.out.println(s.rollno+ " "+s.name);
       }
    }
}
