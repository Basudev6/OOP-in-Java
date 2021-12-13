
package super_keyword;


public class InMethod {
    
}
class Parent
{
    void eat()
    {
        System.out.println("Parent is eating");
    }
}
class Child extends Parent
{
    void eat()
    {
        System.out.println("Child is eating");
    }
    void display()
    {
        eat();
        super.eat();
    }
    public static void main(String[] args) {
        Child c= new Child();
        c.display();
    }
}

