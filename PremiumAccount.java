package java_homework;

public class PremiumAccount extends Account {

    public PremiumAccount(int accountNumber){ // Alias for Account, implements IAccount since inherits from Account (implementing would be redundant)
       super(accountNumber);
    }
}
