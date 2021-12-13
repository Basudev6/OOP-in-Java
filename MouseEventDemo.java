
package eventHandling;

import java.awt.event.*;
import javax.swing.*;
public class MouseEventDemo implements MouseListener {
    

        JLabel l;
        MouseEventDemo(){
         
            JFrame f = new JFrame();
            f.setSize(400,300);
            f.setLayout(null);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
            l= new JLabel();
            l.setBounds(20,40,100,20);
            f.add(l);
         
            f.addMouseListener(this);
        }
        
        public void mouseClicked(MouseEvent me)
        {
            l.setText("Mouse Clicked");
        }
        
        public void mouseEntered(MouseEvent me)
        {
            l.setText("Mouse Entered");
        }
        
        public void mouseExited(MouseEvent me)
        {
            l.setText("Mouse Exited");
        }
        
        public void mousePressed(MouseEvent me)
        {
            l.setText("Mouse Presses");
        }
        
        public void mouseReleased(MouseEvent me)
        {
            l.setText("Mouse Released");
        }
        
        public static void main(String[] args) {
        
            MouseEventDemo md = new MouseEventDemo();
    }
}
