
package characterStreaming;

import java.io.*;
public class WriterTest {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("xyz.txt");
            fw.write(97);
            fw.write("Apple is good for health");
            char ch[]={'g','o','o','d'};
            fw.write(ch);
            fw.flush();
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }   
    }
}
