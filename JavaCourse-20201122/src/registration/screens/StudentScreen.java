/*
 * Created by JFormDesigner on Thu Nov 26 20:02:56 TRT 2020
 */

package registration.screens;

import registration.models.Student;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class StudentScreen extends JFrame {
    public StudentScreen(Student student) {
        this.student = student;

        initComponents();
        lblWelcome.setText(String.format("Welcome %s %s", student.getName(), student.getSurname()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        lblWelcome = new JLabel();

        //======== this ========
        setTitle("Student Registration");
        setMinimumSize(new Dimension(350, 200));
        setResizable(false);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- lblWelcome ----
        lblWelcome.setText("Welcome ");
        contentPane.add(lblWelcome);
        lblWelcome.setBounds(15, 10, 300, 30);

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
    private JLabel lblWelcome;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private Student student;
}
