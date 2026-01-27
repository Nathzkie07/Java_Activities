package m4_activity8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BankAccount {
	private static final String RED     = "\u001B[31m";  // for Warnings
	private static final String RESET   = "\u001B[0m";
    private static final Logger log = LoggerFactory.getLogger(BankAccount.class);

    private double balance = 10000.0;

    private static String p(double value) {
        return String.format("P%.1f", value);
    }

    // === WITHDRAW ===
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        log.info("Withdrawal requested: {}", p(amount));

        if (amount <= 0) {
            log.error("Invalid amount: {}", p(amount));
            throw new InvalidAmountException("Withdrawal amount must be positive");
        }

        if (amount > balance) {
            log.warn("Insufficient funds: {} available", p(balance));
            throw new InsufficientFundsException("Insufficient funds for withdrawal", balance, amount);
        }

        balance -= amount;
        log.info("Withdrawal completed: {}, New balance: {}", p(amount), p(balance));
    }



	 // === DEPOSIT ===
	 public void deposit(double amount) throws InvalidAmountException {
	     log.info("Deposit requested: {}", p(amount));
	
	     if (amount <= 0) {
	         log.error("Invalid deposit amount: {}", p(amount));
	         throw new InvalidAmountException("Deposit amount must be positive");
	     }
	
	     if (amount > 50000) {
	         log.warn("Large deposit: {} - requires verification", p(amount));
	     }
	
	     balance += amount;
	     log.info("Deposit completed: {}, New balance: {}", p(amount), p(balance));
	 }


    
    
    // === runTest helper ===
    public static void runTest(BankTestOperation operation, String operationName) {
        try {
            operation.execute();
        } catch (InvalidAmountException e) {
            Logger log = LoggerFactory.getLogger(BankAccount.class);
            log.error("{} failed: {}", operationName, e.getMessage(), e);
        } catch (InsufficientFundsException e) {
            Logger log = LoggerFactory.getLogger(BankAccount.class);
            log.error("{} failed: {}", operationName, e.getMessage(), e);
        }
    }
}