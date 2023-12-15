package JavaForm;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class SecondFrame {
    public static void main(String[] args) {
//        Creating frame
        JFrame frame= new JFrame();
        frame.setTitle("JTextField");
        frame.setBounds(500,20,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//        Creating Container
        Container con= frame.getContentPane();
        con.setLayout(null);

//        Creating Font
        Font font = new Font("Arial",Font.ITALIC,15);

//          lable for username
        JLabel username= new JLabel("Username:");
        username.setBounds(100,180,300,30);
        con.add(username);

//        creating JTextField
        JTextField text= new JTextField();
        text.setFont(font);
        text.setBounds(100,210,300,30);
        con.add(text);

//                  lable for username
        JLabel password= new JLabel("Password:");
        password.setBounds(100,260,300,30);
        con.add(password);

//        Creating passwooord field
        JPasswordField pf= new JPasswordField();
        pf.setBounds(100,290,300,30);
//        pf.setEchoChar('#'); //hide password
        pf.setEchoChar((char)0); //show password
        con.add(pf);

//        creating button
        JButton btn= new JButton(new ImageIcon("JavaForm/submit-document-icon.png"));
        btn.setBounds(300,350,50,50);
//        btn.setText("Submit");
//        btn.setBackground(Color.GREEN);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setBorder(null);
        con.add(btn);



        frame.setVisible(true);



    }
}
