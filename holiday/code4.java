// Check whether a character is vowel or consonant using switch-case
import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel");
                break;
            default:
                System.out.println(ch + " is a Consonant");
        }
    }
}
