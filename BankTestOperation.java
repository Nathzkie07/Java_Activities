package m4_activity6;

@FunctionalInterface
public interface BankTestOperation {
    void execute() throws InvalidAmountException, InsufficientFundsException;
}
