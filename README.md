# Java Banking System 🏦

A console-based banking system that simulates real-world bank operations using Object-Oriented Programming principles. This project demonstrates core Java concepts including encapsulation, abstraction, data validation, and menu-driven program flow.

## 📋 Description

This banking system provides a complete simulation of basic banking operations through a user-friendly console interface. It's designed as a learning project to understand OOP concepts while building a practical application that mirrors real banking functionality.

## ✨ Features

- **Account Management**
  - Create new bank accounts with unique account numbers
  - Store account holder information securely
  - Automatic account number generation

- **Banking Operations**
  - Deposit money with validation
  - Withdraw money with insufficient funds checking
  - Real-time balance checking
  - Complete transaction history tracking

- **Data Validation**
  - Input validation for all operations
  - Error handling for invalid amounts
  - Boundary checking for withdrawals

- **User Interface**
  - Clean, intuitive console menu
  - Clear error messages and confirmations
  - Formatted output for better readability

## 🎯 Learning Outcomes

After studying this project, you will understand:

- **OOP Principles**: Encapsulation, abstraction, and proper class design
- **Data Validation**: Input sanitization and error handling
- **Program Flow**: Menu-driven systems and user interaction
- **Data Structures**: ArrayList usage for dynamic data storage
- **Exception Handling**: Try-catch blocks and error management
- **Code Organization**: Separation of concerns and modular design

## 🛠️ Technologies Used

- **Java SE 8+** - Core programming language
- **ArrayList** - Dynamic data storage
- **Scanner** - User input handling
- **LocalDateTime** - Timestamp management
- **Exception Handling** - Error management

## 📦 Installation

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line interface (Terminal/Command Prompt)

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/Shme-CS/java-banking-system.git
   cd java-banking-system
   ```

2. Compile the Java files:
   ```bash
   javac -d . src/*.java
   ```

3. Run the application:
   ```bash
   java Main
   ```

## 🚀 How to Run

### Windows
```batch
cd src
javac *.java
java Main
```

### Linux/Mac
```bash
cd src
javac *.java
java Main
```

## 💡 Example Usage

### Creating an Account
```
=== CREATE NEW ACCOUNT ===
Enter account holder name: John Doe
Enter initial deposit amount (minimum $0): $1000
✓ Account created successfully!
Account Number: 1001
Account Holder: John Doe
Initial Balance: $1000.00
```

### Making a Deposit
```
=== DEPOSIT ===
Enter account number: 1001
Enter deposit amount: $500
Successfully deposited $500.00
```

### Checking Balance
```
=== ACCOUNT BALANCE ===
Account: 1001
Holder: John Doe
Current Balance: $1500.00
=======================
```

## 📊 Sample Output

```
=================================
   WELCOME TO JAVA BANK SYSTEM  
=================================

=== MAIN MENU ===
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Transaction History
6. List All Accounts
7. Exit
Choose an option (1-7): 1

=== CREATE NEW ACCOUNT ===
Enter account holder name: Alice Smith
Enter initial deposit amount (minimum $0): $2500

✓ Account created successfully!
Account Number: 1001
Account Holder: Alice Smith
Initial Balance: $2500.00

Press Enter to continue...

=== MAIN MENU ===
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Transaction History
6. List All Accounts
7. Exit
Choose an option (1-7): 2

=== DEPOSIT ===
=== ALL ACCOUNTS ===
1. Account: 1001 | Holder: Alice Smith | Balance: $2500.00
====================
Enter account number: 1001
Enter deposit amount: $750
Successfully deposited $750.00

Press Enter to continue...

=== MAIN MENU ===
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Transaction History
6. List All Accounts
7. Exit
Choose an option (1-7): 5

=== TRANSACTION HISTORY ===
Account: 1001 (Alice Smith)
----------------------------
1. 2024-03-26 10:30:15 | DEPOSIT: $2500.00 | Initial deposit | (+)
2. 2024-03-26 10:32:45 | DEPOSIT: $750.00 | Cash deposit | (+)
============================
```

## 📁 Project Structure

```
java-banking-system/
├── src/
│   ├── Main.java              # Entry point and main class
│   ├── BankSystem.java        # System management and UI
│   ├── BankAccount.java       # Account operations and data
│   └── Transaction.java       # Transaction record keeping
├── README.md                  # Project documentation
├── .gitignore                # Git ignore rules
├── LICENSE                   # MIT License
└── run.bat                   # Windows run script
```

## 🏗️ Class Explanations

### 1. **Main.java**
- **Purpose**: Entry point of the application
- **Responsibility**: Initialize and start the banking system
- **Key Features**: Exception handling for system-level errors

### 2. **BankSystem.java**
- **Purpose**: System controller and user interface manager
- **Responsibility**: Handle menu operations and coordinate between classes
- **Key Features**: 
  - Menu-driven interface
  - Account selection logic
  - Input validation
  - System-wide account management

### 3. **BankAccount.java**
- **Purpose**: Represents individual bank accounts
- **Responsibility**: Account operations and data management
- **Key Features**:
  - Encapsulated account data
  - Deposit/withdrawal operations
  - Balance management
  - Transaction history integration

### 4. **Transaction.java**
- **Purpose**: Represents individual banking transactions
- **Responsibility**: Store transaction details immutably
- **Key Features**:
  - Immutable transaction records
  - Timestamp management
  - Formatted output for history

## 🔮 Future Improvements

### Phase 1: Enhanced Features
- [ ] **Account Types**: Savings, Checking, Business accounts
- [ ] **Interest Calculation**: Automatic interest for savings accounts
- [ ] **Account Statements**: Monthly/yearly statement generation
- [ ] **Transfer Between Accounts**: Internal money transfers

### Phase 2: Advanced Banking
- [ ] **Loan Management**: Personal and business loans
- [ ] **Credit/Debit Cards**: Card-based transactions
- [ ] **ATM Simulation**: ATM-style interface
- [ ] **Multi-currency Support**: Handle different currencies

### Phase 3: Technical Enhancements
- [ ] **Database Integration**: MySQL/PostgreSQL for data persistence
- [ ] **GUI Application**: JavaFX or Swing interface
- [ ] **REST API**: Web service endpoints
- [ ] **Security Features**: Encryption and authentication

### Phase 4: Enterprise Features
- [ ] **Multi-branch Support**: Handle multiple bank branches
- [ ] **Admin Panel**: Bank manager operations
- [ ] **Reporting System**: Analytics and reports
- [ ] **Audit Trail**: Complete transaction auditing

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork the repository**
2. **Create a feature branch**: `git checkout -b feature/AmazingFeature`
3. **Commit your changes**: `git commit -m 'Add some AmazingFeature'`
4. **Push to the branch**: `git push origin feature/AmazingFeature`
5. **Open a Pull Request**

### Contribution Guidelines
- Follow Java naming conventions
- Add comments for complex logic
- Include error handling
- Test your changes thoroughly
- Update documentation as needed

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Your Name**
- GitHub: [@Shme-CS](https://github.com/Shme-CS)
- LinkedIn: [LinkedIn](https://linkedin.com/in/your)
- Email: shme.solo@gmail.com

## 🙏 Acknowledgments

- Inspired by real-world banking systems
- Built for educational purposes
- Thanks to the Java community for best practices
- Special thanks to contributors and reviewers

---

⭐ **Star this repository if you found it helpful!**

📚 **Perfect for**: Java beginners, OOP learning, console application development, banking system understanding
