public class App {

    private void TestWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(200);
        account.withdraw(-100);
    }

    private void TestWithdrawAmountWhichExceedsBalance() {
        BankAccount account = new BankAccount(200);
        account.withdraw(300);
    }

    private void TestNegativeAmountDeposited() {
        BankAccount account = new BankAccount(200);
        account.deposit(-150);
    }

    private void TestNegativeInitialBalance() {
        BankAccount account = new BankAccount(-5);
    }

    private void RunTests() {

        try {
            TestNegativeInitialBalance();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }

        try {
            TestNegativeAmountDeposited();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }

        try {
            TestWithdrawAmountWhichExceedsBalance();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }

        try {
            TestWithdrawNegativeAmount();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.RunTests();
    }
}
