
package eventHandling;

import java.awt.event.*;
import javax.swing.*;
public class ActionEventDemo2 implements ActionListener 
{
    JFrame f;
    JButton b;
    JTextField tf1,tf2;
    ActionEventDemo2()
    {
        f= new JFrame("Frame");
        
       tf1 = new JTextField("T1");
       tf1.setBounds(100,80,120,30);
       
       tf2 = new JTextField("T2");
       tf2.setBounds(100,140,120,30);
       
       b = new JButton("Hit me");
       b.setBounds(150,200,80,30);
       
       f.add(b);
       f.add(tf1);
       f.add(tf2);
       
       
       // frame setting
       f.setSize(500,500);
       f.setVisible(true);
       f.setLayout(null);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       b.addActionListener(this);
    }    
    public void actionPerformed(ActionEvent ae)
    {
        String s = tf1.getText();
        tf2.setText(s);
    }
    public static void main(String[] args) {
        new ActionEventDemo2();
    }
}
