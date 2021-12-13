
package swing;

import javax.swing.*;
public class MenuDemo {
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu Demo Program");
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar mb = new JMenuBar();
       
        JMenu menu = new JMenu("File");
         
        JMenu submenu = new JMenu("Open");
        
        JMenuItem i1 = new JMenuItem("Open File");
        JMenuItem i2 = new JMenuItem("Open Project");
        JMenuItem i3 = new JMenuItem("Close");
        JMenuItem i4 = new JMenuItem("Save");
        
        submenu.add(i1);
        submenu.add(i2);
        
        menu.add(submenu);
        menu.add(i3);
        menu.add(i4);
        
        
        mb.add(menu);
        
        f.setJMenuBar(mb);
        
        
        
        
        
        
        
                
        
        
        
    }
}
