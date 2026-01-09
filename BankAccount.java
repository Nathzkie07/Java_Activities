package m4_activity1;

public class BankAccount {

    // Method to get account name based on account number
    public static String getAccountName(String accountNumber) {
        if ("ACC-001".equals(accountNumber)) {
            return "Juan Dela Cruz";
        } else if ("ACC-002".equals(accountNumber)) {
            return "Maria Santos";
        } else {
            return null;
        }
    }

    // Method to test the account lookup
    public static void testCase(String accountNumber) {
        System.out.println("\nLooking up account: " + accountNumber);
        try {
            String name = getAccountName(accountNumber);
            // Convert to uppercase and print
            System.out.println("Account holder: " + name.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Error: Account not found!");
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("=== Bank Account Name Display ===");

        // Test valid account
        testCase("ACC-001");

        // Test invalid account
        testCase("ACC-999");

        System.out.println("\n=== Program completed successfully! ===");
    }
}
