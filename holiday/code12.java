// Find factorial of a number using for loop

import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int factorial = 1;
        
        for(int i=1; i<=num; i++){
            factorial = factorial * i;
        }
        
        System.out.println("Factorial is: " + factorial);
    }
}
