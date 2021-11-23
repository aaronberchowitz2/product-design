package java_homework;

public class StandardAccount extends Account {  // implements IAccount since inherits from Account (implementing would be redundant)

    public StandardAccount(int accountNumber, double creditLimit) {
        super(accountNumber);
        this.creditLimit = creditLimit;
    }   
}
