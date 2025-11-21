//inheritance 
//extend keyword jo do inheritance ko join karta hai

class Animal{
    void eat(){
        System.out.println(" animal eat food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println(" dog barks");
    }

}
class cat extends Animal{
    void voice(){
        System.out.println(" cat meow");
    }

}
class Lion extends Animal {
    void roar() {
        System.out.println("lion Roarrr");
    }
}

class main{

    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        
        Lion l1 = new Lion();
        l1.roar();
        l1.eat(); 
        
        cat c1 = new cat();
        c1.voice();
        c1.eat();
    }
}
