package harry;

public class currentaccount extends Bankaccount implements Accounts {
    public currentaccount(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance, 0.02);
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
        System.out.println("Balance for Current Account: $" + balance);
    }
    public void applyOverdraft() {
        System.out.println("Overdraft is applied");
    }
}

