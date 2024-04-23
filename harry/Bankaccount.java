package harry;

interface Accounts {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    void viewBalance();
}
public class Bankaccount{
    protected String customerName;
    protected int accountNumber;
    protected String accountType;
    protected double balance;
    protected double interest;
    public Bankaccount(String customerName, int accountNumber, String accountType, double balance, double interest) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.interest = interest;
    }
}