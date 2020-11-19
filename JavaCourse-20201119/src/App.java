import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Nov 19 20:31:00 EET 2020
 */



/**
 * @author unknown
 */
public class App extends JPanel {
    private Shape s;

    public App() {
        initComponents();
    }

    private void btnChooseActionPerformed(ActionEvent e) {
        // TODO add your code here

        btnCalculate.setEnabled(true);
        if (cmbShapes.getSelectedIndex() == 0) {
            s = new RectangleA();

            pnlRectangle.setVisible(true);
            pnlCircle.setVisible(false);
            pnlTriangle.setVisible(false);
        } else if (cmbShapes.getSelectedIndex() == 1) {
            s = new Triangle();

            pnlRectangle.setVisible(false);
            pnlCircle.setVisible(false);
            pnlTriangle.setVisible(true);
        } else if (cmbShapes.getSelectedIndex() == 2) {
            s = new Circle();

            pnlRectangle.setVisible(false);
            pnlCircle.setVisible(true);
            pnlTriangle.setVisible(false);
        }

    }

    private void btnCalculateActionPerformed(ActionEvent e) {

        if (cmbShapes.getSelectedIndex() == 0) {
             s = new RectangleA(Integer.parseInt(txtX.getText()), Integer.parseInt(txtY.getText()));
        } else if (cmbShapes.getSelectedIndex() == 1) {
            s = new Triangle(Integer.parseInt(txtHeight.getText()), Integer.parseInt(txtBase.getText()));
        } else if (cmbShapes.getSelectedIndex() == 2) {
            s = new Circle(Integer.parseInt(txtRadius.getText()));
        }
        print(s);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        cmbShapes = new JComboBox();
        pnlTriangle = new JPanel();
        txtHeight = new JTextField();
        label4 = new JLabel();
        txtBase = new JTextField();
        label5 = new JLabel();
        pnlCircle = new JPanel();
        txtRadius = new JTextField();
        label1 = new JLabel();
        pnlRectangle = new JPanel();
        txtX = new JTextField();
        label2 = new JLabel();
        txtY = new JTextField();
        label3 = new JLabel();
        btnChoose = new JButton();
        btnCalculate = new JButton();
        lblArea = new JLabel();
        lblPerimeter = new JLabel();

        //======== this ========
        setPreferredSize(new Dimension(0, 0));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing.
        border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER
        ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font
        . BOLD ,12 ) ,java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener(
        new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r"
        .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
        setLayout(null);
        add(cmbShapes);
        cmbShapes.setBounds(15, 15, 235, cmbShapes.getPreferredSize().height);

        //======== pnlTriangle ========
        {
            pnlTriangle.setVisible(false);
            pnlTriangle.setLayout(null);
            pnlTriangle.add(txtHeight);
            txtHeight.setBounds(50, 0, 140, 26);

            //---- label4 ----
            label4.setText("Height");
            pnlTriangle.add(label4);
            label4.setBounds(0, 5, 42, 16);
            pnlTriangle.add(txtBase);
            txtBase.setBounds(50, 31, 140, 26);

            //---- label5 ----
            label5.setText("Base");
            pnlTriangle.add(label5);
            label5.setBounds(0, 36, 42, 16);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < pnlTriangle.getComponentCount(); i++) {
                    Rectangle bounds = pnlTriangle.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = pnlTriangle.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                pnlTriangle.setMinimumSize(preferredSize);
                pnlTriangle.setPreferredSize(preferredSize);
            }
        }
        add(pnlTriangle);
        pnlTriangle.setBounds(20, 40, 220, 80);

        //======== pnlCircle ========
        {
            pnlCircle.setVisible(false);
            pnlCircle.setLayout(null);
            pnlCircle.add(txtRadius);
            txtRadius.setBounds(65, 10, 140, txtRadius.getPreferredSize().height);

            //---- label1 ----
            label1.setText("Radius");
            pnlCircle.add(label1);
            label1.setBounds(new Rectangle(new Point(15, 15), label1.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < pnlCircle.getComponentCount(); i++) {
                    Rectangle bounds = pnlCircle.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = pnlCircle.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                pnlCircle.setMinimumSize(preferredSize);
                pnlCircle.setPreferredSize(preferredSize);
            }
        }
        add(pnlCircle);
        pnlCircle.setBounds(15, 55, 220, 45);

        //======== pnlRectangle ========
        {
            pnlRectangle.setVisible(false);
            pnlRectangle.setLayout(null);
            pnlRectangle.add(txtX);
            txtX.setBounds(50, 0, 140, 26);

            //---- label2 ----
            label2.setText("X");
            pnlRectangle.add(label2);
            label2.setBounds(0, 5, 42, 16);
            pnlRectangle.add(txtY);
            txtY.setBounds(50, 31, 140, 26);

            //---- label3 ----
            label3.setText("Y");
            pnlRectangle.add(label3);
            label3.setBounds(0, 36, 42, 16);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < pnlRectangle.getComponentCount(); i++) {
                    Rectangle bounds = pnlRectangle.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = pnlRectangle.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                pnlRectangle.setMinimumSize(preferredSize);
                pnlRectangle.setPreferredSize(preferredSize);
            }
        }
        add(pnlRectangle);
        pnlRectangle.setBounds(20, 40, 220, 80);

        //---- btnChoose ----
        btnChoose.setText("Choose");
        btnChoose.addActionListener(e -> btnChooseActionPerformed(e));
        add(btnChoose);
        btnChoose.setBounds(250, 15, 95, 25);

        //---- btnCalculate ----
        btnCalculate.setText("Calculate");
        btnCalculate.setEnabled(false);
        btnCalculate.addActionListener(e -> btnCalculateActionPerformed(e));
        add(btnCalculate);
        btnCalculate.setBounds(20, 140, 95, 25);

        //---- lblArea ----
        lblArea.setText("Area: ");
        add(lblArea);
        lblArea.setBounds(20, 175, 260, lblArea.getPreferredSize().height);

        //---- lblPerimeter ----
        lblPerimeter.setText("Perimeter: ");
        add(lblPerimeter);
        lblPerimeter.setBounds(20, 200, 260, 16);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JComboBox cmbShapes;
    private JPanel pnlTriangle;
    private JTextField txtHeight;
    private JLabel label4;
    private JTextField txtBase;
    private JLabel label5;
    private JPanel pnlCircle;
    private JTextField txtRadius;
    private JLabel label1;
    private JPanel pnlRectangle;
    private JTextField txtX;
    private JLabel label2;
    private JTextField txtY;
    private JLabel label3;
    private JButton btnChoose;
    private JButton btnCalculate;
    private JLabel lblArea;
    private JLabel lblPerimeter;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        JFrame fr = new JFrame("Application");
        App app = new App();

        fr.setContentPane(app);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.pack();
        fr.setSize(700, 300);
        fr.setVisible(true);

        app.cmbShapes.addItem("Rectangle");
        app.cmbShapes.addItem("Triangle");
        app.cmbShapes.addItem("Circle");
    }

    private void print(Shape shape) {
        lblArea.setText("Area is " + shape.calculateArea());
        lblPerimeter.setText("Perimeter is " + shape.calculatePerimeter());
    }
}
