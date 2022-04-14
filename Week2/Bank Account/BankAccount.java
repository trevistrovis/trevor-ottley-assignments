public class BankAccount {
    private double checkingAccount;
    private double savingsAccount;
    public static int numOfAccounts = 0;
    public static double totalMoneys = 0;
    

    public double getCheckingAccount() {
        return this.checkingAccount; // getting rid of "set" 
    }

    public double getSavingsAccount() {
        return this.savingsAccount; // getting rid of "set"
    }
    // this is the constructor
    public BankAccount(){
        checkingAccount = 0;
        savingsAccount = 0;
        numOfAccounts ++;
    }
    // method for returning number of accounts present
    public int AccountCount(){
        return numOfAccounts;
    }

    public void Deposit(double amount, boolean ifAccount){
        boolean checkingAccount = true;
        boolean savingsAccount = false;

        if(ifAccount == checkingAccount){
            // add money into account
            this.checkingAccount += amount;
            
        }
        if(ifAccount == savingsAccount){
            // add money into account
            this.savingsAccount += amount;
        }
        // incrementing total money in account
        BankAccount.totalMoneys += amount;
    }

    public void Withdraw(double amount, boolean ifAccount){

        if(ifAccount == true){
            // take money out of account
            if(amount > this.checkingAccount){
                System.out.println("Insufficient Funds!!");
            }
            else{
                this.checkingAccount -= amount;  
            }
            
        }
        if(ifAccount == false){
            // add money into account
            if(amount > this.savingsAccount){
                System.out.println("Insufficient Funds!!");
            }
            else{
                this.savingsAccount -= amount;  
            }
        }
        // incrementing total money in account
        BankAccount.totalMoneys -= amount;
    }

    public void ViewAccountBalances(){
        System.out.printf(String.format("Checking Account: $%.2f \n Savings Account: $%.2f \n", this.checkingAccount, this.savingsAccount));
    }

}
