package m4_activity3;



class ATMTransaction {

    // ====== Display constants ======
    private static final String FIXED_DATE = "January 19, 2026";
    private static final String RECEIPT_HEADER = "========= RECEIPT =========";
    private static final String RECEIPT_FOOTER = "===========================";

    // ANSI color codes (for consoles that support it)
    private static final String ANSI_RED   = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    // Toggle if your console doesn't display ANSI colors properly
    private static final boolean USE_COLOR = true;

    private static String red(String s) {
        return USE_COLOR ? ANSI_RED + s + ANSI_RESET : s;
    }

    public void checkBalance(String accountNumber, double balance) {
        System.out.println("Processing balance inquiry...");

        try {
            // *** Important order to ensure EMPTY string triggers StringIndexOutOfBoundsException ***
            // First touch index 0 (throws StringIndexOutOfBoundsException if empty)
            char type = accountNumber.charAt(0);

            // Then validate numeric (throws NumberFormatException if non-numeric)
            Integer.parseInt(accountNumber);

            // Determine account type from first digit
            String accountType =
                    (type == '1') ? "Savings" :
                    (type == '2') ? "Checking" : "Unknown";

            // Details (aligned labels)
            System.out.println("Account Type   : " + accountType);
            System.out.println("Account number : " + accountNumber);
            System.out.println("Current balance: ₱" + String.format("%.2f", balance));
            System.out.println("Balance inquiry successful!");

        } catch (StringIndexOutOfBoundsException e) {
            // Empty account number handled here (as requested)
            System.out.println(red("Error: Account Number is empty or invalid!"));
        } catch (NumberFormatException e) {
            // Non-numeric handled here
            System.out.println(red("Error: Invalid account number format! Account numbers must be numeric."));
        } finally {
            // Receipt (exact layout)
            System.out.println();
            System.out.println(RECEIPT_HEADER);
            System.out.println("Transaction Date: " + FIXED_DATE);
            System.out.println("Transaction Type: Balance Inquiry");
            System.out.println("ATM Location    : Main Branch");
            System.out.println("Thank you for banking with us!");
            System.out.println(RECEIPT_FOOTER);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        ATMTransaction atm = new ATMTransaction();

        System.out.println("=== ATM BALANCE INQUIRY SYSTEM ===");
        System.out.println();

        System.out.println("--- Test Case 1: Valid Savings Account ---");
        atm.checkBalance("100123456", 15000.00);

        System.out.println("--- Test Case 2: Valid Checking Account ---");
        atm.checkBalance("200987654", 25000.00);

        System.out.println("--- Test Case 3: Invalid account number format ---");
        atm.checkBalance("ABC12345", 15000.00);

        System.out.println("--- Test Case 4: Empty account number ---");
        atm.checkBalance("", 15000.00);
    }
}
