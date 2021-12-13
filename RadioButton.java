
package swing;

import javax.swing.*;
public class RadioButton {
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(10,20,80,30);
        f.add(r1);
        
        
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(10,60,80,30);
        f.add(r2);
        
        JRadioButton r3 = new JRadioButton("Female");
        r3.setBounds(10,100,80,30);
        f.add(r3);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
      
    }
}
