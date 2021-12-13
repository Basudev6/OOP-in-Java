
package Inheritance;


public class HierarchicalInh {
    
}
class A
{
    int a=4;
    void eat()
    {
        System.out.println("This is Hierarchical Inheritance");
    }
}
class B extends A
{
    public static void main(String[] args) {
       B d = new B();
       d.eat();
    }  
}
class C extends A
{
    public static void main(String[] args) {
        C c = new C();
        c.eat();
    }
}
