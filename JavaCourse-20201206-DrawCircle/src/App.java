import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class App extends JFrame {
    private int center;
    private int radius;
    private int n;

    public App(int n) {
        center = 200;
        radius = 20;
        this.n = n;
    }

    public void paint(Graphics g) {
        Graphics2D ga = (Graphics2D)g;
        ga.setPaint(Color.red);

        for (int i = 1; i <= n; i++) {
            ga.drawOval(center - (i * (radius / 2)) ,center - (i * (radius / 2)),radius * i,radius * i);
        }
    }

    public static void main(String args[])
    {
        int n = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of circles: ");
        n = scan.nextInt();

        App frame = new App(n);
        frame.addWindowListener(
                new WindowAdapter()
                {
                    public void windowClosing(WindowEvent we)
                    {
                        System.exit(0);
                    }
                }
        );

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
