
package byteStreaming;

import java.io.*;
public class OutputTest1 {
    public static void main(String args[])
    {
        try{
            FileOutputStream fout= new FileOutputStream("abc1.txt");
            fout.write(65);
            fout.flush();
            fout.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
