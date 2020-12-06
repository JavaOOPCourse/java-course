import java.awt.*;

public class CardColor extends Color {
    private int assignedCardCount;

    public CardColor(int r, int g, int b) {
        super(r, g, b);
        assignedCardCount = 0;
    }

    public void assign() {
        assignedCardCount++;
    }

    public int getAssignedCardCount() {
        return assignedCardCount;
    }
}
