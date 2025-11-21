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

class main{

    public static void main(String[] args){
        Dog s1 = new Dog();
        s1.bark();
        s1.eat();
    }
}
