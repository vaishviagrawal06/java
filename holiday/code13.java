//  Write a program to reverse a number using while loop
//     Input: 1234
//     Output: 4321

import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversedNum = 0;
        
        while(num != 0){
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }
        
        System.out.println("Reversed Number is: " + reversedNum);
    }
}
