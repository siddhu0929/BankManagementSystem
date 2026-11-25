
import java.util.ArrayList;

public class Bank {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    // Add an account
    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account added successfully");
    }

    // Find an account using account number
    public BankAccount findAccount(long accountNumber) {

        for (BankAccount account : accounts) {

            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }

        return null;
    }

    // Withdraw money
    public void withdrawFromAccount(long accountNumber, double amount) {

        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    // Display all accounts
    public void displayAllAccounts() {

        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println("------------------");
        }
    }
}
