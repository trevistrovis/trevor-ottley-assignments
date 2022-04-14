public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.Deposit(1000, true);
        bankAccount1.Withdraw(100, true);
        bankAccount1.Withdraw(100, true);
        bankAccount1.Deposit(500, false);
        bankAccount1.Withdraw(300, false);
        bankAccount1.ViewAccountBalances();
        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.Deposit(500, false);
        bankAccount2.Deposit(500, true);
        bankAccount2.Withdraw(400, false);
        bankAccount2.ViewAccountBalances();
        // System.out.println(BankAccount.numOfAccounts);
        // System.out.println(bankAccount1.getCheckingAccount() );
        // System.out.println(bankAccount1.getSavingsAccount() );
        // System.out.println(bankAccount2.getCheckingAccount() );
        // System.out.println(bankAccount2.getSavingsAccount() );
        

        

    }
    
}
