
package byteStreaming;

import java.io.*;
public class InputTest1 {
    public static void main(String[] args) {
    
        try{
            FileInputStream fi = new FileInputStream("abc1.txt");
            int a=fi.read();
            System.out.println(a);
            fi.close();   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
