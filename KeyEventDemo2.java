
package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyEventDemo2 extends JFrame implements KeyListener
{
    JLabel l1,l2,l3;
    private JTextField t1,t2,t3;
    JButton b;
    
    KeyEventDemo2()
    {
        l1=new JLabel("First number");
        l2=new JLabel("Second number");
        l3=new JLabel("Result");
        
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        
        b=new JButton("Calculate");
        FlowLayout fl= new FlowLayout(FlowLayout.LEFT,150,10);
        setLayout(fl);
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b.addKeyListener(this);
        
    }
    public void keyPressed(KeyEvent ke)
    {
        int x,y,z;
        x=Integer.parseInt(t1.getText());
        y=Integer.parseInt(t2.getText());
        
        if(ke.getKeyChar()=='a')
        {
            z=x+y;
        }
        else if(ke.getKeyChar()=='s')
        {
            z=x-y;
        }
        else
        {
            t3.setText("Press a or s");
            return;
        }
        
        t3.setText(String.valueOf(z));
    }
    public void keyTyped(KeyEvent ke)
    {
        
    }  
    public void keyReleased(KeyEvent ke)
    {
      
    }  
    public static void main(String[] args) {
        
        KeyEventDemo2 ke = new KeyEventDemo2();
    }
}
