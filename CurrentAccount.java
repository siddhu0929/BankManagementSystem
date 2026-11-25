
public class CurrentAccount extends BankAccount {

    private double overdraftLimit = 5000;

    public CurrentAccount(String name, long number, double balance) {
        super(name, number, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 && amount <= getBalance() + overdraftLimit) {

            debit(amount);
            System.out.println("Current account withdrawal successful");

        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}
