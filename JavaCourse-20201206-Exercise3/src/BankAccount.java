public class BankAccount {
    public BankAccount(double initialBalance) {
       if (initialBalance < 0) {
          throw new IllegalArgumentException();
       }

        balance = initialBalance;
    }

    public void deposit(double amount) {
       if (amount < 0) {
          throw new IllegalArgumentException();
       }

        double newBalance = balance + amount;
        balance = newBalance;
    }

    public void withdraw(double amount) {
       if (amount > balance || amount < 0) {
          throw new IllegalArgumentException();
       }

        double newBalance = balance - amount;
        balance = newBalance;
    }

    public double getBalance() {
        return balance;
    }

    private double balance;
}
