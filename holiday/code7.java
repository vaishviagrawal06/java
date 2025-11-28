// Print multiplication table of a number using loop
//    Input: 5
//    Output: 5 10 15 20 ... 50

import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        for(int i = 1 ;i<=10;i++){
            System.out.print(num * i + " ");
        }
    }
}
