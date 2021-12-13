
package exception_handling;


public class ExceptionTest {
    public static void main(String args[])
    {
        try{
            int a=12/0;
            System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
