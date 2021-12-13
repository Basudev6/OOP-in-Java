
package swing;

import javax.swing.*;
public class Test {
    
    public static void main(String[] args) {
        JFrame f = new JFrame();   // creating a frame.
        
        // set frame properties.
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // creating components.
        
        JLabel l = new JLabel("Username: ");
        l.setBounds(20,60,100,30);
        f.add(l);
        
        JTextField t = new JTextField();
        t.setBounds(140,60,140,30);
        f.add(t);
        
        JLabel l2 = new JLabel("Password: ");
        l2.setBounds(20,120,100,30);
        f.add(l2);
        
        JPasswordField p = new JPasswordField();
        p.setBounds(140,120,140,30);
        f.add(p);
        
        JButton b = new JButton("login");
        b.setBounds(150,180,80,30);
        f.add(b);
        
        JCheckBox c = new JCheckBox("C");
        c.setBounds(80,220,60,30);
        f.add(c);
        
        JCheckBox c2 = new JCheckBox("C++");
        c2.setBounds(80,260,60,30);
        f.add(c2);
        
        JCheckBox c3 = new JCheckBox("Java");
        c3.setBounds(80,300,60,30);
        f.add(c3);
                  
    }
    
}
