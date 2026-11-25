
public class SavingsAccount extends BankAccount {

    private double minimumBalance = 1000;

    public SavingsAccount(String name, long number, double balance) {
        super(name, number, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 && getBalance() - amount >= minimumBalance) {

            debit(amount);
            System.out.println("Savings withdrawal successful");

        } else {
            System.out.println("Minimum balance of 1000 must be maintained");
        }
    }
}
