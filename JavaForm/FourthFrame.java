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

    FourthFrame(){
        String  imgPath;
        ImageIcon icon= new ImageIcon(imgPath);
        container= this.getContentPane();
        container.setLayout(null);

        lbl= new JLabel();

    }
    public void actionPerformed(ActionEvent e){

    }
}

class ActionDemo{
    public static void main(String[] args) {

    }
}
