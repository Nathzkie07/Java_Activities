package m4_activity5;


class InvalidAccountNumberException extends Exception {
 public InvalidAccountNumberException(String message) {
     super(message);
 }
}

class InvalidAccountFormatException extends RuntimeException {
 public InvalidAccountFormatException(String message) {
     super(message);
 }
}

//Validator class
class AccountValidator {
 public void validateAccountNumber(String accountNumber)
         throws InvalidAccountNumberException {

     // 1. Check null
     if (accountNumber == null) {
         throw new NullPointerException("Account number cannot be null");
     }

     // 2. Check digits only
     for (char c : accountNumber.toCharArray()) {
         if (!Character.isDigit(c)) {
             throw new InvalidAccountFormatException("Account number must contain only digits");
         }
     }

     // 3. Check length = 10
     if (accountNumber.length() != 10) {
         throw new InvalidAccountNumberException("Account number must be exactly 10 digits");
     }
 }
}

public class Main {

 // ANSI color codes
 private static final String RED     = "\u001B[31m";  // for Warnings
 private static final String YELLOW  = "\u001B[33m";  // for Errors
 private static final String RESET   = "\u001B[0m";

 public static void testValidation(String testName, String accountNumber) {
     AccountValidator validator = new AccountValidator();
     System.out.println(testName);

     try {
         validator.validateAccountNumber(accountNumber);
         System.out.println("Valid account number: " + accountNumber);
     } catch (InvalidAccountNumberException e) {
         System.out.println(YELLOW + "Error: " + e.getMessage() + RESET);
     } catch (InvalidAccountFormatException | NullPointerException e) {
         System.out.println(RED + "Warning: " + e.getMessage() + RESET);
     }

     System.out.println();
 }

 public static void main(String[] args) {
     System.out.println("=== Account Number Validation Test ===\n");

     testValidation("Test 1: Valid account (1234567890)", "1234567890");
     testValidation("Test 2: Too short (123)", "123");
     testValidation("Test 3: Contains letters (12345ABC90)", "12345ABC90");
     testValidation("Test 4: Contains space (1234 567890)", "1234 567890");
     testValidation("Test 5: Null value", null);
 }
}
