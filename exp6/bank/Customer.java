package bank;

import java.util.Scanner;

public class Customer {
    private String name;
    private int accNo;
    private int balance;

    public Customer(String name, int accNo) {
        this.name = name;
        this.accNo = accNo;
        this.balance = 0;  // Initial balance
    }

    public void creditTransaction(int amount) {
        Scanner input = new Scanner(System.in);
        try {
            if (amount < 0) {
                throw new InvalidCredit();  // Throw custom exception
            } else {
                balance += amount;  // Update balance
                System.out.println("Amount credited successfully!");
            }
        } catch (InvalidCredit e) {
            System.out.println(e.getMessage());
            System.out.print("Enter a valid amount: ");
            creditTransaction(input.nextInt());  // Retry on exception
        }
    }

    public void debitTransaction(int amount) {
        Scanner input = new Scanner(System.in);
        try {
            if (amount > balance) {
                throw new InvalidDebit();  // Throw custom exception
            } else {
                balance -= amount;  // Update balance
                System.out.println("Amount debited successfully!");
            }
        } catch (InvalidDebit e) {
            System.out.println(e.getMessage());
            System.out.print("Enter a valid amount: ");
            debitTransaction(input.nextInt());  // Retry on exception
        }
    }

    public void displayDetails() {
        System.out.println("\nCustomer Details");
        System.out.println("****************");
        System.out.println("Customer Name: " + name);
        System.out.println("Customer AccNo: " + accNo);
        System.out.println("Customer Current Balance: " + balance);
    }
}
