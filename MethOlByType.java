
package object_oriented_programming;

// method overloading by type of parameter.
public class MethOlByType {
    void display(char a)
    {
        System.out.println(a);
    }
    void display (int a)
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        MethOlByType m = new MethOlByType();
        m.display('H');
        m.display(10);
    }
}
