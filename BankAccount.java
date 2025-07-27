
class BankAccount {
    int balance = 1000;

    void checkBalance() {
        System.out.println("Your balance: ₹" + balance);
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited.");
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn.");
        } else {
            System.out.println("Not enough balance!");
        }
    }
}


