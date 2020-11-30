/*
 * Created by JFormDesigner on Thu Nov 26 20:03:15 TRT 2020
 */

package registration.screens;

import registration.models.Instructor;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class InstructorScreen extends JFrame {
    public InstructorScreen(Instructor instructor) {
        this.instructor = instructor;

        initComponents();

        lblWelcome.setText(String.format("Welcome %s %s", instructor.getName(), instructor.getSurname()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        lblWelcome = new JLabel();

        //======== this ========
        setTitle("Instructor Registration");
        setMinimumSize(new Dimension(200, 200));
        setResizable(false);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- lblWelcome ----
        lblWelcome.setText("Welcome ");
        contentPane.add(lblWelcome);
        lblWelcome.setBounds(5, 10, 300, 30);

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

    private Instructor instructor;
}
