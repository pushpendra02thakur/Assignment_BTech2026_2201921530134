// This code demonstrates a basic implementation of a bank account system using object-oriented programming (OOP) principles in Java. Here's an explanation of the code:

// BankAccount Class:

// This class represents a bank account.
// It has three private attributes: accountNumber, accountHolder and balance
// The class includes a constructor to initialize the attributes when creating a new account.
// Deposit Method (deposit): This method allows you to deposit a specified amount into the account.

// Withdraw Method (withdraw): This method allows you to withdraw a specified amount from the account.

// Get Account Information Method (getAccountInfo):

// This method displays the account information, including the account number, account holder's name, and the current balance.


class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private int balance;

    // Constructor to initialize the attributes
    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0; // Initial balance is 0
    }

    // Deposit method
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Withdraw method
    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    // Display account information
    public void getAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance); 
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account=new BankAccount(12345,"John Doe");
        account.deposit(1000);
        account.withdraw(500);
        account.deposit(200);
        account.getAccountInfo();
        
    }
}
