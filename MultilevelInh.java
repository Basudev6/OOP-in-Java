  
package Inheritance;


public class MultilevelInh {
    
}
class Cat
{
    int leg=4;
  
}
class Cow extends Cat
{
    void eat()
    {
        System.out.println("Animal eats");
    }
}
class Sheep extends Cow
{
    public static void main(String[] args) {
        Sheep c = new Sheep();
        c.eat();
        System.out.println(c.leg);
    }
}
