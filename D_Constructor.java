
package object_oriented_programming;

// special type of method, used to initialize the object, no return type, AM allowed, should be the name of class
// Default Constructor;
public class D_Constructor {
    
    D_Constructor()
    {
        System.out.println("This is a Constructor");
    }
    public static void main(String args[])
    {
        D_Constructor c = new D_Constructor();
    }
}
