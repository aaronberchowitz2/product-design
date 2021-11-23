package java_homework;

public class test {
    public static void main(String args[]){
        Bank bank = new Bank();
        System.out.println("Open Accounts a1 and a2: ");
        PremiumAccount a1 = new PremiumAccount(1);
        bank.OpenAccount(a1);
        System.out.println(a1);
        PremiumAccount a2 = new PremiumAccount(2);
        bank.OpenAccount(a2);
        System.out.println(a2);
        System.out.println("Withdraw from a1: " + a1.Withdraw(100000));
        System.out.println("Close Accounts a1 and a2: ");
        bank.CloseAccount(2);
        bank.CloseAccount(1);
        StandardAccount a3 = new StandardAccount(3, -2000);
        bank.OpenAccount(a3);
        System.out.println("Withdraw from a3: " +  a3.Withdraw(1999));
        System.out.println("Withdraw from a3: " + a3.Withdraw(2000) + " but attempted to withdraw 1999");
        bank.CloseAccount(3);
        BasicAccount a4 = new BasicAccount(4);
        bank.OpenAccount(a4);
        a1.Deposit(200000);
        System.out.println("Accounts above Balance: -1999");
        for(IAccount accountItem : bank.getAllAccountsWithBalance(-1999))
            System.out.println(accountItem);
        System.out.println("Accounts above Balance: -5000");
        for(IAccount accountItem : bank.getAllAccountsWithBalance(-5000))
            System.out.println(accountItem);
        System.out.println("All accounts:");
        for(IAccount accountItem : bank.getAllAccounts())
            System.out.println(accountItem);
        System.out.println("Close accounts 2,1,4:");
        bank.CloseAccount(2);
        bank.CloseAccount(1);
        bank.CloseAccount(4);
        System.out.println("All accounts:");
        for(IAccount accountItem : bank.getAllAccounts())
            System.out.println(accountItem);
    }
}
