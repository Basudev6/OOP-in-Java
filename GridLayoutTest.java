
package swing;

import java.awt.*;
import javax.swing.*;
public class GridLayoutTest {
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        
        GridLayout g = new GridLayout(2,2);
        f.setLayout(g);
    }
}
