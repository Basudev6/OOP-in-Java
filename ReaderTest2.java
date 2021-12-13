
package characterStreaming;

import java.io.*;
public class ReaderTest2 {
    public static void main(String[] args) {
        try{
            File f = new File("xyz.txt");
            char[]ch = new char[(int) f.length()];
            FileReader fr = new FileReader(f);
            fr.read(ch);
            for(char ch1:ch)
                System.out.print(ch1);
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
