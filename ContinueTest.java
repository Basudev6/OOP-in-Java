
package control_statement;


public class ContinueTest {
    public static void main(String[] args) {
       int i;
       for(i=1;i<=6;i++)
       {
           if(i==5)
               continue;
           System.out.println(i);
       }
    }
}
