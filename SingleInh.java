
package Inheritance;


public class SingleInh {
    
}
class Animal
{
    int leg=4;
    void eat()
    {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal
{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

