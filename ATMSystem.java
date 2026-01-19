package m4_activity2;


public class ATMSystem {

    private static final boolean USE_COLOR = true;

    // ANSI color codes
    private static final String RED   = USE_COLOR ? "\u001B[31m" : "";
    private static final String RESET = USE_COLOR ? "\u001B[0m"  : "";

    // Array of account balances
    double[] accounts = {10000, 15000, 20000};

    public void processWithdrawal(String accountIndexInput, String amountInput) {

        System.out.println("Account=" + accountIndexInput + ", Amount=" + amountInput);

        try {
            
            int index = Integer.parseInt(accountIndexInput);
            double balance = accounts[index];                 
            double amount = Double.parseDouble(amountInput); 

            System.out.println("Current balance: ₱" + String.format("%.2f", balance));
            System.out.println("Withdrawal: ₱" + String.format("%.2f", amount));

            // Insufficient funds path (no new balance line)
            if (amount > balance) {
                System.out.println(RED + "Insufficient funds! Cannot withdraw ₱" 
                                   + String.format("%.2f", amount) + RESET);
                return;
            }

            // Success path
            accounts[index] = balance - amount;
            System.out.println("New balance: ₱" + String.format("%.2f", accounts[index]));
            System.out.println("Withdrawal successful!");

        } catch (NumberFormatException e) {
            System.out.println(RED + "Error: Invalid input!" + RESET);
            System.out.println(RED + "Please enter valid numbers." + RESET);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(RED + "Error: Account not found!" + RESET);
            System.out.println(RED + "Invalid account index." + RESET);
        }
    }

    public static void main(String[] args) {

        System.out.println("=== ATM Withdrawal System ===");
        System.out.println();

        System.out.println("--- Test 1: Valid Withdrawal ---");
        new ATMSystem().processWithdrawal("1", "5000"); // fresh instance
        System.out.println();

        System.out.println("--- Test 2: Invalid Account Index ---");
        new ATMSystem().processWithdrawal("abc", "5000"); // fresh instance
        System.out.println();

        System.out.println("--- Test 3: Account Not Found ---");
        new ATMSystem().processWithdrawal("10", "5000"); // fresh instance
        System.out.println();

        System.out.println("--- Test 4: Insufficient Funds ---");
        new ATMSystem().processWithdrawal("1", "20000"); // fresh instance
        System.out.println();

        System.out.println("=== All tests completed! ===");
    }
}
