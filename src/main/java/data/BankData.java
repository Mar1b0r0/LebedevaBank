package data;
import java.util.ArrayList;
import java.util.List;
public class BankData {
    private static List<BankAccount> accountList = new ArrayList<>();

    public static List<BankAccount> getAccountList() {
        return accountList;
    }

    public static void addAccount(BankAccount account) {
        accountList.add(account);
    }

    public static void deleteAccount(BankAccount account) {
        accountList.remove(account);
    }
}
