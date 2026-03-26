# Example Terminal Output

## Complete Banking System Session

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
Enter account holder name: Alice Johnson
Enter initial deposit amount (minimum $0): $2500

✓ Account created successfully!
Account Number: 1001
Account Holder: Alice Johnson
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
Choose an option (1-7): 1

=== CREATE NEW ACCOUNT ===
Enter account holder name: Bob Smith
Enter initial deposit amount (minimum $0): $1000

✓ Account created successfully!
Account Number: 1002
Account Holder: Bob Smith
Initial Balance: $1000.00

Press Enter to continue...

=== MAIN MENU ===
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Transaction History
6. List All Accounts
7. Exit
Choose an option (1-7): 6

=== ALL ACCOUNTS ===
1. Account: 1001 | Holder: Alice Johnson | Balance: $2500.00
2. Account: 1002 | Holder: Bob Smith | Balance: $1000.00
====================

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
1. Account: 1001 | Holder: Alice Johnson | Balance: $2500.00
2. Account: 1002 | Holder: Bob Smith | Balance: $1000.00
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
Choose an option (1-7): 3

=== WITHDRAWAL ===
=== ALL ACCOUNTS ===
1. Account: 1001 | Holder: Alice Johnson | Balance: $3250.00
2. Account: 1002 | Holder: Bob Smith | Balance: $1000.00
====================
Enter account number: 1002
Enter withdrawal amount: $200
Successfully withdrew $200.00

Press Enter to continue...

=== MAIN MENU ===
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Transaction History
6. List All Accounts
7. Exit
Choose an option (1-7): 4

=== BALANCE CHECK ===
=== ALL ACCOUNTS ===
1. Account: 1001 | Holder: Alice Johnson | Balance: $3250.00
2. Account: 1002 | Holder: Bob Smith | Balance: $800.00
====================
Enter account number: 1001

=== ACCOUNT BALANCE ===
Account: 1001
Holder: Alice Johnson
Current Balance: $3250.00
=======================

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
=== ALL ACCOUNTS ===
1. Account: 1001 | Holder: Alice Johnson | Balance: $3250.00
2. Account: 1002 | Holder: Bob Smith | Balance: $800.00
====================
Enter account number: 1001

=== TRANSACTION HISTORY ===
Account: 1001 (Alice Johnson)
----------------------------
1. 2024-03-26 10:30:15 | DEPOSIT: $2500.00 | Initial deposit | (+)
2. 2024-03-26 10:35:22 | DEPOSIT: $750.00 | Cash deposit | (+)
============================

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
=== ALL ACCOUNTS ===
1. Account: 1001 | Holder: Alice Johnson | Balance: $3250.00
2. Account: 1002 | Holder: Bob Smith | Balance: $800.00
====================
Enter account number: 1002

=== TRANSACTION HISTORY ===
Account: 1002 (Bob Smith)
----------------------------
1. 2024-03-26 10:32:45 | DEPOSIT: $1000.00 | Initial deposit | (+)
2. 2024-03-26 10:37:18 | WITHDRAWAL: $200.00 | Cash withdrawal | (-)
============================

Press Enter to continue...

=== MAIN MENU ===
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Transaction History
6. List All Accounts
7. Exit
Choose an option (1-7): 3

=== WITHDRAWAL ===
=== ALL ACCOUNTS ===
1. Account: 1001 | Holder: Alice Johnson | Balance: $3250.00
2. Account: 1002 | Holder: Bob Smith | Balance: $800.00
====================
Enter account number: 1002
Enter withdrawal amount: $1000
Error: Insufficient funds! Current balance: $800.00

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
1. Account: 1001 | Holder: Alice Johnson | Balance: $3250.00
2. Account: 1002 | Holder: Bob Smith | Balance: $800.00
====================
Enter account number: 1003
Error: Account not found!

Press Enter to continue...

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
Enter account holder name: 
Error: Name cannot be empty!

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
1. Account: 1001 | Holder: Alice Johnson | Balance: $3250.00
2. Account: 1002 | Holder: Bob Smith | Balance: $800.00
====================
Enter account number: 1001
Enter deposit amount: $-50
Error: Deposit amount must be positive!

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
1. Account: 1001 | Holder: Alice Johnson | Balance: $3250.00
2. Account: 1002 | Holder: Bob Smith | Balance: $800.00
====================
Enter account number: 1001
Enter deposit amount: $abc
Error: Please enter a valid amount!

Press Enter to continue...

=== MAIN MENU ===
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Transaction History
6. List All Accounts
7. Exit
Choose an option (1-7): 7

Thank you for using Java Bank System!
Goodbye!
```

## Error Handling Examples

### Invalid Menu Choice
```
=== MAIN MENU ===
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Transaction History
6. List All Accounts
7. Exit
Choose an option (1-7): 9
Invalid option! Please try again.

Press Enter to continue...
```

### Invalid Amount Input
```
Enter deposit amount: $xyz
Error: Please enter a valid amount!
```

### Negative Amount
```
Enter withdrawal amount: $-100
Error: Withdrawal amount must be positive!
```

### Insufficient Funds
```
Enter withdrawal amount: $5000
Error: Insufficient funds! Current balance: $800.00
```

### Account Not Found
```
Enter account number: 9999
Error: Account not found!
```

### Empty Name Input
```
Enter account holder name: 
Error: Name cannot be empty!
```

## System Startup
```
D:\Java Project\java-banking-system\src>java Main
=================================
   WELCOME TO JAVA BANK SYSTEM  
=================================
```

## System Shutdown
```
Thank you for using Java Bank System!
Goodbye!

D:\Java Project\java-banking-system\src>
```