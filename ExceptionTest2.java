
package exception_handling;


public class ExceptionTest2 {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[10]=30; 

        }
       
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
 
        finally
        {
            System.out.println("finally block is always executed"); 
        }
        System.out.println("rest of the code....");
    }
}
