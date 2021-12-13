
package eventHandling;

import javax.swing.*;
import java.awt.event.*;
public class ActionEventDemo1 implements ActionListener
{
    JTextField t1,t2;
    JButton b;
    ActionEventDemo1()
    {
        JFrame f= new JFrame();
        f.setSize(500,400);
        f.setVisible(true);
        f.setLayout(null);
        
        t1 = new JTextField();
        t1.setBounds(100,80,120,30);
        t2= new JTextField();
        t2.setBounds(100,140,120,30);
        
        b= new JButton("Click");
        b.setBounds(100,180,80,30);
        
        f.add(t1);
        f.add(t2);
        f.add(b);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s = t1.getText();
        t2.setText(s);
        
    }
    public static void main(String[] args) {
        new ActionEventDemo1();
    }
}
