
package object_oriented_programming;


public class PassingByRef {
    int data =50;
    
    void add(PassingByRef p)
    {
       p.data=p.data+10; 
    }
    public static void main(String args[])
    {
        PassingByRef p = new PassingByRef();
        System.out.println(p.data);
        p.add(p);
        System.out.println(p.data);
    }
}
