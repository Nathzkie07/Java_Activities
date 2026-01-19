package m4_activity4;


public class AccountValidator {

    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void validateAccountNumber(String accountNumber) throws Exception {

        if (accountNumber == null) {
            throw new NullPointerException("Cannot be null");
        }

        if (accountNumber.length() != 10) {
            throw new Exception("Must be 10 digits");
        }

        System.out.println("Valid account: " + accountNumber);
    }

    public static void main(String[] args) {

        String[] testCases = { "1234567890", "123", null };

        for (String number : testCases) {
            try {
                validateAccountNumber(number);
            } catch (Exception e) {
                System.out.println(RED + "Error: " + e.getMessage() + RESET);
            }
        }
    }
}