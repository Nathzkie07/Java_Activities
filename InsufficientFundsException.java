package m4_activity6;

public class InsufficientFundsException extends Exception {

    private final double balance;
    private final double amount;

    public InsufficientFundsException(String message, double balance, double amount) {
        super(message);
        this.balance = balance;
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getAmount() {
        return amount;
    }
}
