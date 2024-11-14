import java.util.Scanner;          // Import the Scanner class
import bank.Customer;              // Import the Customer class from the bank package

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        String name;
        int acc_no;

        // Get customer name and account number
        System.out.println("Enter Customer Name:");
        name = input.next();

        System.out.println("Enter account number:");
        acc_no = input.nextInt();

        // Create a new Customer instance
        Customer aCustomer = new Customer(name, acc_no);
        int choice = 0;

        // Menu loop
        while (choice != 4) {
            System.out.println("\n1. Add Money\n2. Get Money\n3. Details\n4. Exit");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount:");
                    aCustomer.creditTransaction(input.nextInt());
                    break;
                case 2:
                    System.out.println("Enter the amount:");
                    aCustomer.debitTransaction(input.nextInt());
                    break;
                case 3:
                    aCustomer.displayDetails();
                    break;
                case 4:
                    System.out.println("Thank You!!!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        input.close(); // Close the scanner
    }
}
