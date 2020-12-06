import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class App {

    public static ArrayList<BankAccount> readBankAccountsStream(String inputFile) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        try {
            ObjectInputStream stream = new ObjectInputStream(new FileInputStream(inputFile));

            Object accountObj = stream.readObject();
            while (accountObj != null) {
                BankAccount acc = (BankAccount) accountObj;
                accounts.add(acc);

                accountObj = stream.readObject();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return accounts;
    }


    public static void main(String[] args) {
    }
}
