
package swing;

import java.awt.*;
import javax.swing.*;    
public class BorderLayoutTest {
    
        public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        
        f.add(b1, BorderLayout.WEST);
        f.add(b2, BorderLayout.SOUTH);
    
    } 
}
