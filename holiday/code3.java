//Find Greatest of Two Numbers using if-else

import java.util.Scanner;

class main{
    public static void main(String[] args){
        System.out.println("Enter two number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a>b){
            System.out.println(a + " is greater");
        }
        else{
            System.out.println(b + " is greater");
        }
    }
}
