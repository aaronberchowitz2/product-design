package java_homework;

public class BasicAccount extends Account { // implements IAccount since inherits from Account (implementing would be redundant)

    public BasicAccount(int accountNumber) {
        super(accountNumber);
        creditLimit = 0;
    }
}
