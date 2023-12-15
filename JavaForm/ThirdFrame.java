package JavaForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ThirdFrame extends JFrame implements ActionListener {
    private final Container container;
    private final JButton btn;

    public ThirdFrame() {
        container = this.getContentPane();
        container.setLayout(null);

        btn = new JButton();
        btn.setText("Change Color");
        btn.setBounds(100, 100, 150, 30);
        btn.addActionListener(this);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));


        container.add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!(btn.getBackground().equals(Color.WHITE))) {
            Random random = new Random();
            container.setBackground(
                    new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256))
            );
        }
    }
}

class DemoAction {
    public static void main(String[] args) {
        ThirdFrame thirdFrame = new ThirdFrame();
        thirdFrame.setTitle("ThirdFrame");
        thirdFrame.setBounds(500, 50, 700, 500);
        thirdFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thirdFrame.setVisible(true);
    }
}
