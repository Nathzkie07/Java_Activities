package m4_activity8;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Test 1
        BankAccount.runTest(() -> account.deposit(5000), "Deposit");

        // Test 2
        BankAccount.runTest(() -> account.withdraw(3000), "Withdrawal");

        // Test 3
        BankAccount.runTest(() -> account.deposit(-500), "Deposit");

        // Test 4
        BankAccount.runTest(() -> account.withdraw(20000), "Withdrawal");

        // Test 5
        BankAccount.runTest(() -> account.deposit(60000), "Deposit");
    }
}
