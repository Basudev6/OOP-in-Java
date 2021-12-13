
package characterStreaming;

import java.io.*;
public class ReaderTest1 {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("xyz.txt");
            int a = fr.read();
            while(a!=-1)
            {
                System.out.print((char)a);
                a=fr.read();
            }
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
