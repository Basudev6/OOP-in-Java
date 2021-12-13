
package Inheritance;


public class OverRidingInJava {
    
}
class Bike
{
    void speed()
    {
        System.out.println("Bike speed is 60km/hr");
    }
}
class Bullet extends Bike
{
    void speed()
    {
        System.out.println("Bullet speed is 80km/hr");
    }
    public static void main(String[] args) {
        Bullet b= new Bullet();
        b.speed();
        
    }
}
