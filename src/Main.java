/**
 * Main class - Entry point for the Java Banking System
 * 
 * This console-based banking system demonstrates:
 * - Object-Oriented Programming principles
 * - Encapsulation and data validation
 * - Menu-driven program flow
 * - Exception handling
 * - ArrayList usage for data management
 * 
 * @author Your Name
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Create and start the banking system
            BankSystem bankSystem = new BankSystem();
            bankSystem.start();
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            System.err.println("Please restart the application.");
        }
    }
}