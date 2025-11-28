import java.util.*;
class fun{
    static void fun(int a){    
        if(a>0){     
            fun(--a);   //function call
            System.out.println(a);    
            fun(--a);   //function call
        }
    }
    public static void main(String[] args){
        fun(5);   
    }
}