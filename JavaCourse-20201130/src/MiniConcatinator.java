import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniConcatinator extends JFrame {

    public MiniConcatinator(String title) {
        super(title);
        initComponents();
    }

    void initComponents() {
        setResizable(false);
        setMinimumSize(new Dimension(600, 200));

        JPanel pnlContentPane = new JPanel();

        BoxLayout layoutContentPane = new BoxLayout(pnlContentPane, BoxLayout.Y_AXIS);
        pnlContentPane.setLayout(layoutContentPane);

        JPanel pnlForm = new JPanel();

        GridLayout layoutForm = new GridLayout();
        layoutForm.setRows(3);
        layoutForm.setColumns(2);

        pnlForm.setLayout(layoutForm);

        JLabel lblFirstString = new JLabel();
        lblFirstString.setText("Enter a string");

        Font lblFont = lblFirstString.getFont();
        Font boldLblFont = new Font(lblFont.getName(), Font.BOLD, lblFont.getSize());

        lblFirstString.setFont(boldLblFont);
        pnlForm.add(lblFirstString);

        JTextField txtFirstString = new JTextField();
        pnlForm.add(txtFirstString);

        JLabel lblSecondString = new JLabel();
        lblSecondString.setText("Enter a string");
        lblSecondString.setFont(boldLblFont);
        pnlForm.add(lblSecondString);

        JTextField txtSecondString = new JTextField();
        pnlForm.add(txtSecondString);

        JLabel lblResult = new JLabel();
        lblResult.setText("Result");
        lblResult.setFont(boldLblFont);
        pnlForm.add(lblResult);

        JTextField txtResult = new JTextField();
        pnlForm.add(txtResult);
        pnlContentPane.add(pnlForm);


        EmptyBorder border = new EmptyBorder(100, 0, 0 , 0);
        JLabel lblMargin = new JLabel();
        lblMargin.setBorder(border);
        pnlContentPane.add(lblMargin);

        JButton btnConcatenate = new JButton();
        btnConcatenate.setText("Concatenate");
        btnConcatenate.setFont(boldLblFont);
        btnConcatenate.addActionListener(new Concatinator(txtFirstString, txtSecondString, txtResult));
       /*btnConcatenate.addActionListener(e -> {
                txtResult.setText(txtFirstString.getText() + txtSecondString.getText());
        });

        */

        pnlContentPane.add(btnConcatenate);

        setContentPane(pnlContentPane);
    }

    class Concatinator implements ActionListener{
        private JTextField txtFirstString;
        private JTextField txtSecondString;
        private JTextField txtResult;

        public Concatinator(JTextField txtFirstString, JTextField txtSecondString, JTextField txtResult) {
            this.txtFirstString = txtFirstString;
            this.txtSecondString = txtSecondString;
            this.txtResult = txtResult;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            txtResult.setText(txtFirstString.getText() + txtSecondString.getText());
        }
    }
}
