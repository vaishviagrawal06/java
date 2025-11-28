// Use switch-case to build a simple calculator (Add, Sub, Mul, Div)
    // Input: Two numbers and an operator
    // Output: Result

import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();
        System.out.print("Enter an operator (+, -, *, /): ");
        char ch = sc.next().charAt(0);
        double result;
        switch(ch)
        {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if(num2 != 0){
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Not possible");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }    
    }
}