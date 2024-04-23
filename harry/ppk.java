package harry;
public class ppk{
    public static void main(String[] args) {
        bankingsystem bank = new bankingsystem();
        savingsaccount savingsAccount = new savingsaccount("Alice", 1001, 5000.0);
        bank.addAccount(savingsAccount);
        currentaccount currentAccount = new currentaccount("Bob", 1002, 3000.0);
        bank.addAccount(currentAccount);
        bank.displayAccounts();
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(1000);
        currentAccount.deposit(1500);
        currentAccount.withdraw(500);
        System.out.println("Updated Balances:");
        bank.displayAccounts();
        savingsAccount.applyCompoundInterest();
        System.out.println("Balance after applying interest:");
        savingsAccount.viewBalance();
    }
}
