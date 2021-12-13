
package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ReadFile{
    void read() throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("d:/xyz.docx");
        
    } 
}


public class ThrowsTest {
    public static void main(String[] args)
    {
      ReadFile rf = new ReadFile();
      try
        {    
           rf.read();
        }
      catch(Exception e)
        {
           System.out.println(e);
        }
        System.out.println("rest of the code.....");
        
    }
}
  
