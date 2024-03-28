package L_ExceptionHandling;

// Custom WithdrawException
class WithdrawException extends Exception {
    public WithdrawException(String message) {
        super(message);
    }
}
// Account class with withdraw method
class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws WithdrawException {
        if (amount > balance) {
            throw new WithdrawException("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Remaining balance: " + balance);
        }
    }
}

public class Banks {
    public static void main(String[] args) {
        Account acc = new Account(1000); // Initialize account with balance 1000

        try {
            acc.withdraw(1500); // Try to withdraw an amount greater than the balance
        } catch (WithdrawException e) {
            System.out.println("Exception: " + e.getMessage()); // Handle the WithdrawException
        }
    }
}
