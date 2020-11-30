package registration.screens;

import helpers.DummyDatabase;
import registration.models.Instructor;
import registration.models.Student;
import registration.models.User;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Nov 22 20:34:34 EET 2020
 */



/**
 * @author unknown
 */
public class LoginScreen extends JFrame {
    public LoginScreen() {
        initComponents();
    }

    private void btnLoginActionPerformed(ActionEvent e) {
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());

        boolean success = false;

        for (User user: DummyDatabase.users) {

            if (user.login(username, password)) {
                JOptionPane.showMessageDialog(null, "Logged in successfully.");
                user.login();
                success = true;
                setVisible(false);
                break;
            }
        }

        if (!success) {
            JOptionPane.showMessageDialog(null, "Invalid attempt.");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        txtUsername = new JTextField();
        label2 = new JLabel();
        txtPassword = new JPasswordField();
        btnLogin = new JButton();

        //======== this ========
        setTitle("Registration Login");
        setResizable(false);
        setMinimumSize(new Dimension(270, 170));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Username: ");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(10, 35), label1.getPreferredSize()));
        contentPane.add(txtUsername);
        txtUsername.setBounds(85, 30, 170, txtUsername.getPreferredSize().height);

        //---- label2 ----
        label2.setText("Password: ");
        contentPane.add(label2);
        label2.setBounds(10, 65, 70, 16);
        contentPane.add(txtPassword);
        txtPassword.setBounds(85, 60, 170, txtPassword.getPreferredSize().height);

        //---- btnLogin ----
        btnLogin.setText("Login");
        btnLogin.addActionListener(e -> btnLoginActionPerformed(e));
        contentPane.add(btnLogin);
        btnLogin.setBounds(175, 90, 75, 30);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JTextField txtUsername;
    private JLabel label2;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
