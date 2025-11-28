// Take a character input and print its ASCII value (Type casting)

import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        int asciiValue = (int) ch; // Type casting from char to int
        
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
    }
}
