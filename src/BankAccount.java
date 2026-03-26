import java.util.ArrayList;
import java.util.List;

/**
 * BankAccount class represents a bank account with basic operations
 * Demonstrates encapsulation and data validation
 */
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private List<Transaction> transactionHistory;
    
    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance >= 0 ? initialBalance : 0;
        this.transactionHistory = new ArrayList<>();
        
        // Add initial deposit transaction if balance > 0
        if (initialBalance > 0) {
            transactionHistory.add(new Transaction("DEPOSIT", initialBalance, "Initial deposit"));
        }
    }
    
    // Getter methods (Encapsulation)
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public List<Transaction> getTransactionHistory() {
        return new ArrayList<>(transactionHistory); // Return copy for security
    }
    
    /**
     * Deposit money into the account
     * @param amount Amount to deposit
     * @return true if successful, false otherwise
     */
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive!");
            return false;
        }
        
        balance += amount;
        transactionHistory.add(new Transaction("DEPOSIT", amount, "Cash deposit"));
        System.out.println("Successfully deposited $" + String.format("%.2f", amount));
        return true;
    }
    
    /**
     * Withdraw money from the account
     * @param amount Amount to withdraw
     * @return true if successful, false otherwise
     */
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive!");
            return false;
        }
        
        if (amount > balance) {
            System.out.println("Error: Insufficient funds! Current balance: $" + String.format("%.2f", balance));
            return false;
        }
        
        balance -= amount;
        transactionHistory.add(new Transaction("WITHDRAWAL", amount, "Cash withdrawal"));
        System.out.println("Successfully withdrew $" + String.format("%.2f", amount));
        return true;
    }
    
    /**
     * Display current account balance
     */
    public void checkBalance() {
        System.out.println("\n=== ACCOUNT BALANCE ===");
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + String.format("%.2f", balance));
        System.out.println("=======================");
    }
    
    /**
     * Display transaction history
     */
    public void displayTransactionHistory() {
        System.out.println("\n=== TRANSACTION HISTORY ===");
        System.out.println("Account: " + accountNumber + " (" + accountHolderName + ")");
        System.out.println("----------------------------");
        
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (int i = 0; i < transactionHistory.size(); i++) {
                System.out.println((i + 1) + ". " + transactionHistory.get(i));
            }
        }
        System.out.println("============================");
    }
    
    @Override
    public String toString() {
        return "Account: " + accountNumber + " | Holder: " + accountHolderName + " | Balance: $" + String.format("%.2f", balance);
    }
}