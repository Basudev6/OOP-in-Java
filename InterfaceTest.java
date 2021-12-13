
package abstraction;


public class InterfaceTest {
    
}
interface A
{
    int a =23;
    void meth();
}
class B implements A
{
   public void meth()
    {
        System.out.println("method");
    }
    public static void main(String[] args) {
        B  c = new B();
        c.meth();
        System.out.println(c.a);
    }
}

