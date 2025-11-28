// Sum of All Elements
//  Ek array lo user se input me, aur uske sare elements ka sum nikaalo.

import java.util.Scanner;
class main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
