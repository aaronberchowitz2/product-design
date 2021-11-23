package java_homework;
import java.util.List;


public interface IBank {
    public void OpenAccount(IAccount account);
    public void CloseAccount(int accountNumber);
    public List<IAccount> GetAllAccounts();
    public List<IAccount> GetAllAccountsInDebt();    
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove);
    
}
