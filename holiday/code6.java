// Sum of first N natural numbers using while loop

import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= N){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is: " + sum);
    }
    }

