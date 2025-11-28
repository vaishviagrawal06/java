// Check Positive, Negative or Zero
//    Input: Any integer
//    Output: "Positive", "Negative" or "Zero"

import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        if(num>0)
        {
            System.out.println("Positive");
        }
        else if(num<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }

    }
}