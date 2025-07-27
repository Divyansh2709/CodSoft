# CodSoft
# TASK 01 : NUBER GAME

## 🎮 Number Guessing Game (Java)

This is a simple **Number Guessing Game** built in Java, designed for beginners to understand basic programming concepts such as:

* Conditional logic
* Looping
* Random number generation
* User input handling
* Console-based interaction

### 📌 Features

* The system randomly generates a number between a specified range.
* The user has a limited number of attempts to guess the correct number.
* After each guess, the user is informed whether their guess is **too high**, **too low**, or **correct**.
* Displays the total number of attempts taken to guess correctly.
* Option to play again after finishing a round.

### 🛠️ Technologies Used

* Java (Core Java)
* Java Util Library (`Scanner`, `Random`)

### 💡 Use Case

This project is ideal for:

* Java beginners learning basic syntax and logic
* Practice with input/output and loops
* Understanding how to implement simple game logic in the console

### 📄 File Structure

* `NumberGame.java` – Main class that contains all the game logic and runs in the terminal.


# TASK 02 : GRADE CALCULATOR

.

🧮 Grade Calculator (Java)
This is a simple Grade Calculator application written in Java. It allows students to enter marks for different subjects and calculates the average score and corresponding grade.

📌 Features
Takes input for multiple subject marks.

Calculates the total and average percentage.

Assigns a letter grade based on the average score.

Simple and interactive console-based UI.

💡 Grade Criteria (Example)
Percentage (%)	Grade
 90–100	A
 80–89	B
 70–79	C
 60–69	D
 Below 60	F

(Note: Actual grade thresholds may be adjusted in the code logic.)

🛠️ Technologies Used
Java (Core Java)

Java Util Library (Scanner)

🎯 Ideal For
Beginners in Java who want to practice input handling, arithmetic operations, and conditional logic.

Students building academic or utility-based Java programs.


#TASK 03 : ATM INTERFACE

This project is a console-based ATM interface simulation developed in Java, fulfilling the objectives outlined in Task 3: ATM Interface. It demonstrates the interaction between an ATM and a user's bank account using object-oriented principles.

✅ Task Objectives Covered
This project meets all the requirements listed in the task image:

ATM Machine Class

ATMMachine.java acts as the main interface controller.

User Interface with Options

Console-based UI offering:

Check Balance

Deposit Amount

Withdraw Amount

Exit

Implemented Methods

checkBalance(), deposit(amount), withdraw(amount) methods in BankAccount.java.

Bank Account Class

BankAccount.java stores:

Account number

PIN

Balance

ATM ↔ BankAccount Connection

The ATM class verifies account details and calls bank account methods to access and modify balance.

Input Validation

Ensures sufficient balance during withdrawals

Prevents depositing/withdrawing negative or zero amounts

User Feedback Messages

Displays messages for success/failure of each transaction with current balance.

📂 File Structure

├── BankAccount.java     // BankAccount class with balance and authentication logic
├── ATMMachine.java      // ATM interface for user interactions
├── README.md            // Project overview

🧠 Core Java Concepts Used
Classes & Objects

Encapsulation

Method abstraction

Conditionals & Loops

Basic input handling with Scanner

🖥️ Sample Output

Welcome to the ATM!
Enter your account number: 12345
Enter your PIN: 1234

1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice: 2
Enter amount to deposit: 1000
Deposit successful. New balance: ₹6000.0

