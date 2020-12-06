import javax.swing.*;

public class App {
    public static void main(String[] args) {
        MatchingGame game = new MatchingGame();

        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.pack();
        game.setVisible(true);
    }
}
