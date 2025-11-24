 //Encapsulation
/* abstraction code ka implementation hide karta hai.. 
but encapsulation data ko hide karta hai, data security provide karta hai.
PRIVATE ko access karne ke liye getter or setter method use karte hai 
Getter = value read karne ke liye
Setter = value update/change karne ke liye
*/
// new random har baar new no. generate karta hai

import java.util.ArrayList;
import java.util.Scanner;

class Atm {
    private int TotalBalance = 10000000;

    public void getTotal() {
        System.out.println("Your Total Balance: " + TotalBalance);
    }

    public void withdraw(int amount) {
        if (amount > 0 && TotalBalance >= amount) {
            TotalBalance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
            return;
        }
        System.out.println("Remaining Balance: " + TotalBalance);
    }

    public void deposit(int amount) {
        if (amount > 0) {
            TotalBalance += amount;
            System.out.println("Deposit Successful!");
            System.out.println("Updated Balance: " + TotalBalance);
        } else {
            System.out.println("Invalid amount!");
        }
    }
}

class main {

    static class User {
        String name;
        String accNumber;
        String password;
        Atm account;   

        User(String name, String accNumber, String password) {
            this.name = name;
            this.accNumber = accNumber;
            this.password = password;
            this.account = new Atm();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        System.out.println("===== ATM SYSTEM =====");
        System.out.println("1. New User");
        System.out.println("2. Existing User");
        System.out.print("Choose Option: ");
        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) 
        {
            System.out.print("Enter Your Name: ");
            String name = sc.nextLine();

            System.out.print("Create Account Number: ");
            String acc = sc.nextLine();

           
            for (User u : users) {
                if (u.accNumber.equals(acc)) {
                    System.out.println("Account Number Already Exists!");
                    return;
                }
            }

            System.out.print("Create Password: ");
            String pass = sc.nextLine();

            users.add(new User(name, acc, pass));
            System.out.println("Account Created Successfully!");

            return;
        }

        else if (ch == 2) 
        {
            if (users.isEmpty()) {
                System.out.println("No Users Found! Create new user first.");
                return;
            }

            System.out.print("Enter Account Number: ");
            String acc = sc.nextLine();

            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            User currentUser = null;

            // search 
            for (User u : users) {
                if (u.accNumber.equals(acc) && u.password.equals(pass)) {
                    currentUser = u;
                    break;
                }
            }

            if (currentUser == null) {
                System.out.println("Incorrect Account Number or Password!");
                return;
            }

            System.out.println("Login Successful! Welcome " + currentUser.name);
            
            System.out.println("\n1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.print("Choose Option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                currentUser.account.getTotal();
            } 
            else if (choice == 2) {
                System.out.print("Enter Withdrawal Amount: ");
                int amount = sc.nextInt();
                currentUser.account.withdraw(amount);
            } 
            else if (choice == 3) {
                System.out.print("Enter Deposit Amount: ");
                int amount = sc.nextInt();
                currentUser.account.deposit(amount);
            } 
            else {
                System.out.println("Invalid Choice!");
            }
        }

        else {
            System.out.println("Invalid Option!");
        }

        sc.close();
    }
}

