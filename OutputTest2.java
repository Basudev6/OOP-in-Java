
package byteStreaming;

import java.io.*;
public class OutputTest2 {
    public static void main(String args[])
    {
        try{
            FileOutputStream fout = new FileOutputStream("abc2.txt");
            String s = "Welcome to java";
            byte b[]= s.getBytes();
            fout.write(b);
            fout.flush();
            fout.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
    