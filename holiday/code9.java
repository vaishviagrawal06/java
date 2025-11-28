// Check whether a number is a multiple of 3 or not using if-else

import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if(num % 3 == 0){
            System.out.println(num + " is a multiple of 3");
        }
        else{
            System.out.println(num + " is not a multiple of 3");
        }
    }
}

