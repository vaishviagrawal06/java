//constructor chaining
// this keyword


class hello{
    public hello(){
        this(5);
        System.out.println("heyyy");
    }
    public hello(int x){
        this (5,6);
        System.out.println(x);
    }
    public hello(int x,int y){
       System.out.println(x + " " + y);  
    }
}

class main{
    public static void main(String[] args){
        hello obj = new hello();
    }
}