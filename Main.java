
public class Main {

    public static void main(String[] args) {

        // Create Bank
        Bank bank = new Bank();

        // Create different account objects
        BankAccount savings =
            new SavingsAccount("Siddhu", 101, 10000);

        BankAccount current =
            new CurrentAccount("Rahul", 102, 15000);

        // Add accounts to bank
        bank.addAccount(savings);
        bank.addAccount(current);

        System.out.println("\n--- Deposit Operations ---");

        savings.deposit(2000);
        current.deposit(3000);

        System.out.println("\n--- Withdrawal Operations ---");

        bank.withdrawFromAccount(101, 5000);
        bank.withdrawFromAccount(102, 19000);

        System.out.println("\n--- All Account Details ---");

        bank.displayAllAccounts();
    }
}
 
