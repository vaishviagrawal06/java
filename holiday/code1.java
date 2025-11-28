// Check Even or Odd using if-else
//    Input: Any integer
//    Output: "Even" or "Odd"

import java.util.Scanner;

class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: "); 
        int num = sc.nextInt(); // Read user input
       
        if (num % 2 == 0) 
        {
            System.out.println("Even");
        } else 
        {
            System.out.println("Odd");
        }
    }

}
