//inheritance 
//extend keyword jo do inheritance ko join karta hai

class Employee{
    void work(){
        System.out.println("exployee is working hard");
    }
}

class Manager extends Employee{
    void attending_meeting (){
        System.out.println("manager is attending meeting");
    }
}
class main{

    public static void main(String[] args){
        Manager m1 = new Manager();
        m1.attending_meeting();
        m1.work();
    }
}
