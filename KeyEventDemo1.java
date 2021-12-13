
package eventHandling;

import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
public class KeyEventDemo1 extends JFrame implements KeyListener
{
    JLabel l1,l2;
    private JTextField t1,t2;
    
    KeyEventDemo1()
    {
        l1=new JLabel("First number");
        l2=new JLabel("Second number");
        
        t1= new JTextField(10);
        t2= new JTextField(10);
        
        setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addKeyListener(this);
        setFocusable(true);
    } 
    public void keyPressed(KeyEvent ke)
    {
        int key = ke.getKeyCode();
        if(key==KeyEvent.VK_RIGHT)
        {
            String s = t1.getText();
            t2.setText(s);
            
        }
    }
    public void keyTyped(KeyEvent ke)
    {
        
    }
    public void keyReleased(KeyEvent ke)
    {
        
    }
    public static void main(String args[]){
        KeyEventDemo1 ke = new KeyEventDemo1();
    }
            
            
    
    
}
