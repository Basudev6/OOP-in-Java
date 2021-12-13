
package byteStreaming;

import java.io.*;
public class InputTest2 {
    public static void main(String[] args) {
        try{
            FileInputStream fi = new FileInputStream("abc2.txt");
            int i=fi.read();
            while(i!=-1)
            {
                System.out.print((char)i);
                i=fi.read();
            }
            fi.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}
