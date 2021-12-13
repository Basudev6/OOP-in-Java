
package super_keyword;


public class InConstructor {
    
}
class P
{
    P()
    {
        System.out.println("Parent constructor");
    }
}
class C extends P
{
    C()
    {
        super();
        System.out.println("Child constructor");
    }
    public static void main(String[] args) {
        C c = new C();
    }
}
