import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * BankSystem class manages multiple bank accounts and provides the main interface
 * Demonstrates abstraction and system design
 */
public class BankSystem {
    private List<BankAccount> accounts;
    private Scanner scanner;
    private int nextAccountNumber;
    
    // Constructor
    public BankSystem() {
        this.accounts = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.nextAccountNumber = 1001; // Starting account number
    }
    
    /**
     * Main menu loop
     */
    public void start() {
        System.out.println("=================================");
        System.out.println("   WELCOME TO JAVA BANK SYSTEM  ");
        System.out.println("=================================");
        
        while (true) {
            displayMenu();
            int choice = getValidChoice();
            
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    viewTransactionHistory();
                    break;
                case 6:
                    listAllAccounts();
                    break;
                case 7:
                    System.out.println("\nThank you for using Java Bank System!");
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
            
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
        }
    }
    
    /**
     * Display main menu
     */
    private void displayMenu() {
        System.out.println("\n=== MAIN MENU ===");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Transaction History");
        System.out.println("6. List All Accounts");
        System.out.println("7. Exit");
        System.out.print("Choose an option (1-7): ");
    }
    
    /**
     * Get valid menu choice from user
     */
    private int getValidChoice() {
        try {
            int choice = Integer.parseInt(scanner.nextLine().trim());
            return choice;
        } catch (NumberFormatException e) {
            return -1; // Invalid choice
        }
    }
    
    /**
     * Create a new bank account
     */
    private void createAccount() {
        System.out.println("\n=== CREATE NEW ACCOUNT ===");
        
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine().trim();
        
        if (name.isEmpty()) {
            System.out.println("Error: Name cannot be empty!");
            return;
        }
        
        System.out.print("Enter initial deposit amount (minimum $0): $");
        double initialDeposit;
        
        try {
            initialDeposit = Double.parseDouble(scanner.nextLine().trim());
            if (initialDeposit < 0) {
                System.out.println("Error: Initial deposit cannot be negative!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid amount!");
            return;
        }
        
        String accountNumber = String.valueOf(nextAccountNumber++);
        BankAccount newAccount = new BankAccount(accountNumber, name, initialDeposit);
        accounts.add(newAccount);
        
        System.out.println("\n✓ Account created successfully!");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Initial Balance: $" + String.format("%.2f", initialDeposit));
    }
    
    /**
     * Deposit money to an account
     */
    private void deposit() {
        BankAccount account = selectAccount("DEPOSIT");
        if (account == null) return;
        
        System.out.print("Enter deposit amount: $");
        try {
            double amount = Double.parseDouble(scanner.nextLine().trim());
            account.deposit(amount);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid amount!");
        }
    }
    
    /**
     * Withdraw money from an account
     */
    private void withdraw() {
        BankAccount account = selectAccount("WITHDRAWAL");
        if (account == null) return;
        
        System.out.print("Enter withdrawal amount: $");
        try {
            double amount = Double.parseDouble(scanner.nextLine().trim());
            account.withdraw(amount);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid amount!");
        }
    }
    
    /**
     * Check account balance
     */
    private void checkBalance() {
        BankAccount account = selectAccount("BALANCE CHECK");
        if (account == null) return;
        
        account.checkBalance();
    }
    
    /**
     * View transaction history
     */
    private void viewTransactionHistory() {
        BankAccount account = selectAccount("TRANSACTION HISTORY");
        if (account == null) return;
        
        account.displayTransactionHistory();
    }
    
    /**
     * List all accounts in the system
     */
    private void listAllAccounts() {
        System.out.println("\n=== ALL ACCOUNTS ===");
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            for (int i = 0; i < accounts.size(); i++) {
                System.out.println((i + 1) + ". " + accounts.get(i));
            }
        }
        System.out.println("====================");
    }
    
    /**
     * Helper method to select an account
     */
    private BankAccount selectAccount(String operation) {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available. Please create an account first.");
            return null;
        }
        
        System.out.println("\n=== " + operation + " ===");
        listAllAccounts();
        
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine().trim();
        
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        
        System.out.println("Error: Account not found!");
        return null;
    }
}