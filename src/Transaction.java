import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Transaction class represents a single banking transaction
 * Demonstrates encapsulation and immutable design
 */
public class Transaction {
    private final String type;
    private final double amount;
    private final String description;
    private final LocalDateTime timestamp;
    
    // Constructor
    public Transaction(String type, double amount, String description) {
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.timestamp = LocalDateTime.now();
    }
    
    // Getter methods (Encapsulation)
    public String getType() {
        return type;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public String getDescription() {
        return description;
    }
    
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    
    /**
     * Get formatted timestamp string
     * @return Formatted date and time
     */
    public String getFormattedTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return timestamp.format(formatter);
    }
    
    @Override
    public String toString() {
        return String.format("%s | %s: $%.2f | %s | %s", 
                getFormattedTimestamp(), type, amount, description, 
                type.equals("WITHDRAWAL") ? "(-)" : "(+)");
    }
}