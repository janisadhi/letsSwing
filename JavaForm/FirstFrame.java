package JavaForm;

import javax.swing.*;
import java.awt.*;

public class FirstFrame {
    public static void main(String[] args) {
//        Frame properties
        JFrame firstFrame = new JFrame();
        firstFrame.setBounds(100, 30, 500, 500);
        firstFrame.setVisible(true);
        firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstFrame.setTitle("This is Dog sh!t");

//        container  properties
        Container container = firstFrame.getContentPane();
        container.setBackground(new Color(50, 13, 109));

//        Icon properties
        String imgPath = "JavaForm/dog.png";
        ImageIcon icon = new ImageIcon(imgPath);

//        font properties
        Font font = new Font("Arial", Font.ITALIC, 30);

//        label properties
        JLabel dogName = new JLabel("This is a Dog \nand \nYou  are Dog Sh!t", icon, JLabel.CENTER);
        dogName.setSize(icon.getIconWidth() + 100, icon.getIconHeight() + 100);
        dogName.setFont(font);
        dogName.setForeground(Color.WHITE);
        container.add(dogName);


    }
}