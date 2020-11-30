import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.RandomAccessFile;

public class App extends JFrame {

    public App(String title) {
        super(title);
        initForm();
    }

    void initForm() {
        setMinimumSize(new Dimension(700, 70));

        JPanel pnlPane = new JPanel();

        GridLayout layoutPnlPane = new GridLayout();
        layoutPnlPane.setColumns(1);
        layoutPnlPane.setRows(2);

        pnlPane.setLayout(layoutPnlPane);
        setContentPane(pnlPane);

        JPanel pnl = new JPanel();

        GridLayout layoutPnl = new GridLayout();
        layoutPnl.setColumns(3);
        layoutPnl.setRows(2);
        pnl.setLayout(layoutPnl);

        JLabel lblA = new JLabel();
        lblA.setText("AAAAAAAAAAAAA");
        pnl.add(lblA);

        JTextField txtOne = new JTextField();
        pnl.add(txtOne);

        JLabel lblB = new JLabel();
        lblB.setText("BBBBBBBBBBBBB");
        pnl.add(lblB);

        JTextField txtTwo = new JTextField();
        pnl.add(txtTwo);

        JLabel lblC = new JLabel();
        lblC.setText("CCCCCCCCCCCCC");
        pnl.add(lblC);

        JTextField txtThree = new JTextField();
        pnl.add(txtThree);

        pnlPane.add(pnl);

        JButton btn = new JButton();
        btn.setText("Do Button");
        pnlPane.add(btn);
    }

    public static void main(String[] args) {
        /*
        App application = new App("AA");

        application.setDefaultCloseOperation(EXIT_ON_CLOSE);
        application.pack();

        application.setVisible(true);

         */

        MiniConcatinator concatinator = new MiniConcatinator("MiniConcatinator");
        concatinator.setDefaultCloseOperation(EXIT_ON_CLOSE);
        concatinator.pack();
        concatinator.setVisible(true);
    }

    void readFromRandomAccessFile(String path, int m, int n) {
        try {
            RandomAccessFile raf = new RandomAccessFile(path, "r");
            raf.seek(m);
            byte[] buffer = new byte[n];
            raf.read(buffer);

            System.out.println(new String(buffer));

        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
