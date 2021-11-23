package java_homework;
import java.util.List;


public interface IBank {
    public void OpenAccount(IAccount account);
    public void CloseAccount(int accountNumber);
    public List<IAccount> getAllAccounts();
    public List<IAccount> getAllAccountsInDebt();    
    public List<IAccount> getAllAccountsWithBalance(double balanceAbove);
    
}
