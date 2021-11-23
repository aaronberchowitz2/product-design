package java_homework;

import java.util.LinkedList;

public class Bank implements IBank{

    LinkedList<IAccount> listAccounts = new LinkedList<IAccount>();

    public Bank() {
    }

    public void OpenAccount(IAccount account) {
        this.listAccounts.add(account);
    }

    public void CloseAccount(int accountNumber) {
        for (IAccount account : this.listAccounts) {
            if (accountNumber == account.GetAccountNumber()) {
                if (account.GetCurrentBalance() >= 0) {
                    this.listAccounts.remove(account);
                } else {
                    System.out.println("The account with ID: " + accountNumber + " is not closed due to debt");
                }
                return; // we found the element we wanted so can end the loop
            }
        }
        System.out.println("There is no such account with ID: " + accountNumber + " in the bank.");
    }

    public LinkedList<IAccount> getAllAccounts() {
        return this.listAccounts;
    }

    public LinkedList<IAccount> getAllAccountsInDebt() {
        LinkedList<IAccount> listAccountsInDebt = new LinkedList<IAccount>();
        for (IAccount account : this.listAccounts) {
            if (account.GetCurrentBalance() < 0) {
                listAccountsInDebt.add(account);
            }
        }
        return listAccountsInDebt;
    }

    public LinkedList<IAccount> getAllAccountsWithBalance(double balanceAbove) {
        LinkedList<IAccount> listAccountsAboveBalance = new LinkedList<IAccount>();
        for (IAccount account : this.listAccounts) {
            if (account.GetCurrentBalance() > balanceAbove) {
                listAccountsAboveBalance.add(account);
            }
        }
        return listAccountsAboveBalance;
    }


}
