import helpers.DummyDatabase;
import registration.screens.LoginScreen;

public class RegistrationApp {
    public static void main(String[] args) {
        new DummyDatabase();

        LoginScreen ls = new LoginScreen();

        ls.pack();
        ls.setSize(275,170);
        ls.setVisible(true);
    }
}
