package JavaForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FourthFrame extends JFrame implements ActionListener {
    private Container container;
    private JLabel lbl;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;

    private ImageIcon greenIcon;
    private ImageIcon redIcon;
    private ImageIcon yellowIcon;

    FourthFrame() {
        String gi = "JavaForm/icons/g.png";
        String ri = "JavaForm/icons/r.png";
        String yi = "JavaForm/icons/y.png";

        greenIcon = new ImageIcon(gi);
        redIcon = new ImageIcon(ri);
        yellowIcon = new ImageIcon(yi);

        container = this.getContentPane();
        container.setLayout(null);

        lbl = new JLabel(greenIcon);
        lbl.setLocation(100, 100);
        lbl.setSize(greenIcon.getIconWidth(), greenIcon.getIconHeight());

        btn1 = new JButton("Red");
        btn2 = new JButton("Green");
        btn3 = new JButton("Yellow");

        btn1.setBounds(100, 400, 100, 30);
        btn2.setBounds(210, 400, 100, 30);
        btn3.setBounds(320, 400, 100, 30);

        btn1.setFocusPainted(false);
        btn2.setFocusPainted(false);
        btn3.setFocusPainted(false);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        container.add(btn1);
        container.add(btn2);
        container.add(btn3);
        container.add(lbl);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            lbl.setIcon(redIcon);
        } else if (e.getSource() == btn2) {
            lbl.setIcon(greenIcon);
        } else {
            lbl.setIcon(yellowIcon);
        }
    }


}
class ActionDemo{
    public static void main(String[] args) {
        FourthFrame frame = new FourthFrame();
        frame.setTitle("FourthFrame");
        frame.setBounds(500, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
