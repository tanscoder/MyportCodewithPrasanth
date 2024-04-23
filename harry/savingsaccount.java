package harry;

public class savingsaccount extends Bankaccount implements Accounts {
    public savingsaccount(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance, 0.05);
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double calculateInterest() {
        return balance * interest;
    }

    @Override
    public void viewBalance() {
        System.out.println("Balance for Savings Account: $" + balance);
    }
    public void applyCompoundInterest() {
        double interestEarned = calculateInterest();
        balance += interestEarned;
    }
}

