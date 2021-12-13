 
package object_oriented_programming;
/*   

If a class has multiple methods having same name, it is known as method overloading.

 method overloading by number of parameter.
*/ 

public class MethOlByNum {
    void add()
    {
        int a=20;
        int b=30;
        System.out.println(a+b);
    }
    void add(int a)
    {
        int b= 50;
        System.out.println(a+b);
    }
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        MethOlByNum m = new MethOlByNum();
        m.add();
        m.add(60);
        m.add(70,80); 
    }
    
}
