//inheritance extend keyword jo do inheritance ko join kata hai

class Animal{
    void eat(){
        System.out.println("pizza");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("hehhee");
    }

}
class cat extends Dog{
    void voice(){
        System.out.println("meow");
    }

}

class main{

    public static void main(String[] args){
        cat s1 = new cat();
        s1.voice();
        s1.bark();
        s1.eat();
    }
}
