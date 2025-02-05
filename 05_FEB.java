// Create a BankAccount class that simulates a simple bank account. The class should have the following features:

// A static data member totalBalance to keep track of the total balance across all accounts.
// A constructor that takes an initial balance as a parameter and updates totalBalance accordingly.
// There are 2 BankAccounts in the Bank. Given the balance of both the accounts as input, create the object using constructor to update totalBalance and print totalBalance of Bank.



//codechef


import java.util.Scanner;

class BankAccount {
    public static int totalBalance;
    public int balance;

    public BankAccount(int amount) {
        totalBalance += amount;
    }
}


class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        BankAccount account1 = new BankAccount(amount);

        amount = scanner.nextInt();
        BankAccount account2 = new BankAccount(amount);

        System.out.println(BankAccount.totalBalance);

        scanner.close();
    }
}
