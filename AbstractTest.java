
package abstraction;
public class AbstractTest{
    
}

abstract class Animal 
{
    void eat()
    {
        System.out.println("eating");
    }
   abstract void move();
}
class child extends Animal
{
    void move()
    {
        System.out.println("moving");
    }
    public static void main(String[] args) {
        child c =new child();
        c.move();
        c.eat(); 
    }
}
