// public class bankingsystem {
//     private static final int MAX_ACCOUNTS = 100;
//     private Bankaccount[] accounts;
//     private int numAccounts;
//     public bankingsystem(){
//         accounts = new Bankaccount[MAX_ACCOUNTS];
//         numAccounts = 0;
//     }
//     public void addAccount(Bankaccount account) {
//         if (numAccounts < MAX_ACCOUNTS) {
//             accounts[numAccounts++] = account;
//         } else {
//             System.out.println("Cannot add more accounts. Maximum limit reached.");
//         }
//     }
//     public void displayAccounts() {
//         System.out.println("List of Bank Accounts:");
//         for (int i = 0; i < numAccounts; i++) {
//             System.out.println(accounts[i].customerName + " - " + accounts[i].accountType + " Account: $" + accounts[i].balance);
//         }
//     }
// }
