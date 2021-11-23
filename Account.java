package java_homework;

public class Account implements IAccount {

    int accountNumber;
    double creditLimit = - Double.MAX_VALUE;
    double accountBalance = 0;

    public Account(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void Deposit(double amount){
        this.accountBalance += amount;
    }

    public double Withdraw(double amount){
        double total = accountBalance - creditLimit;
        double withdrawMoney = 0;
        if (total == 0){} // Client has already reached his limit
        else if(total < amount){
            accountBalance = creditLimit; // Client is reaching his credit limit and can't withdraw more than accountBalance + creditLimit
            withdrawMoney = total;
        }
        else{
            this.accountBalance -= amount;
            withdrawMoney = amount;
        }
        return withdrawMoney;

    }

    public double GetCurrentBalance(){
        return accountBalance;
    }

    public int GetAccountNumber(){
        return this.accountNumber;
    }

    public String toString() {
        // Used for debugging purposed, also helps to print the details of the account object
        return "Account ID: " + accountNumber + ", Account type: " + this.getClass().getName()  +  
        ", Balance: " + accountBalance + ", Debt allowed: " + (creditLimit == - Double.MAX_VALUE ? "No Limit" : creditLimit);
    }
}
