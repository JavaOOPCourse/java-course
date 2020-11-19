import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel pnlContainer;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnCalculate;
    private JTextField txtResult;

    //Class variable
    private static int x = 5;

    //Object variable
    int y;

    public App() {
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numString = txtNum1.getText();
                String num2String = txtNum2.getText();

                Integer num = Integer.parseInt(numString);
                Integer num2 = Integer.parseInt(num2String);

                Integer result = num + num2;
                txtResult.setText(result.toString());

            }
        });
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 600);

        App app = new App();

        window.setContentPane(app.pnlContainer);
    }
}
