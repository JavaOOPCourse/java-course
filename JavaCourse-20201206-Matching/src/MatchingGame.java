import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class MatchingGame extends JFrame {
    private int cardCount;
    private ArrayList<CardColor> colors;
    private Card[] cards;

    public MatchingGame() {
        cardCount = 6;

        colors = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < cardCount / 2; i++) {
            int r = rnd.nextInt(255);
            int g = rnd.nextInt(255);
            int b = rnd.nextInt(255);
            colors.add(new CardColor(r, g, b));
        }

        cards = new Card[cardCount];

        initComponents();
    }

    private void initComponents() {
        setPreferredSize(new Dimension(450, 300));
        JPanel pnlContentPane = new JPanel();

        GridLayout layout = new GridLayout();
        layout.setColumns(cardCount / 2);
        layout.setRows(2);

        pnlContentPane.setLayout(layout);
        setContentPane(pnlContentPane);

        Random rnd = new Random();
        for (int i = 0; i < cardCount; i++) {
            int colorIndex = rnd.nextInt(colors.size());
            CardColor color = colors.get(colorIndex);
            color.assign();
            if (color.getAssignedCardCount() == 2) {
                colors.remove(colorIndex);
            }

            Card card = new Card(color);
            pnlContentPane.add(card);
        }

    }
}
