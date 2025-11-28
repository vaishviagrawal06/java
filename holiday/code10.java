// Type casting example: Convert float to int and print both

import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float number: ");
        float floatNum = sc.nextFloat();
        
        int intNum = (int) floatNum; // Type casting from float to int
        
        System.out.println("Float number: " + floatNum);
        System.out.println("Converted integer number: " + intNum);
    }
} 
