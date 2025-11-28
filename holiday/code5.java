// Print numbers from 1 to N using a for loop
//    Input: N
//    Output: 1 2 3 ... N
 import java.util.Scanner;
 class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N:");
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            System.out.print(i + " ");
        }
    }
 }