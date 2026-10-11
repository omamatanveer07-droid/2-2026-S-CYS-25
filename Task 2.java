///Task 2
//
//import java.util.Scanner;
//
//class BankAccount {
//    private double balance;
//
//    // Constructor
//    public BankAccount(double balance) {
//        this.balance = balance;
//    }
//
//    // (a) Deposit money
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//            System.out.println("Money deposited successfully!");
//        } else {
//            System.out.println("Amount must be greater than zero.");
//        }
//    }
//
//    // (b) Withdraw money
//    public void withdraw(double amount) {
//        if (amount <= 0) {
//            System.out.println("Amount must be greater than zero.");
//        } else if (amount > balance) {
//            System.out.println("Insufficient balance!");
//        } else {
//            balance -= amount;
//            System.out.println("Money withdrawn successfully!");
//        }
//    }
//
//    // (c) Check balance
//    public void checkBalance() {
//        System.out.printf("Current Balance: %.2f%n", balance);
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        BankAccount account = new BankAccount(1000.0);
//
//        int choice;
//
//        do {
//            System.out.println("\n===== BANK MENU =====");
//            System.out.println("1. Deposit Money");
//            System.out.println("2. Withdraw Money");
//            System.out.println("3. Check Balance");
//            System.out.println("4. Exit");
//            System.out.print("Enter your choice: ");
//
//            choice = input.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter deposit amount: ");
//                    double depositAmount = input.nextDouble();
//                    account.deposit(depositAmount);
//                    break;
//
//                case 2:
//                    System.out.print("Enter withdrawal amount: ");
//                    double withdrawAmount = input.nextDouble();
//                    account.withdraw(withdrawAmount);
//                    break;
//
//                case 3:
//                    account.checkBalance();
//                    break;
//
//                case 4:
//                    System.out.println("Thank you for using our bank!");
//                    break;
//
//                default:
//                    System.out.println("Invalid choice! Try again.");
//            }
//
//        } while (choice != 4);
//
//        input.close();
//    }
//}
//