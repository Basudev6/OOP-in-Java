
package super_keyword;


public class InVariable {
    
}
class Bike
{
    int cc=200;
}
class Bullet  extends Bike
{
    int cc= 500;
    void display()
    {
        System.out.println(cc);
        System.out.println(super.cc);
    }
    public static void main(String[] args) {
        Bullet c = new Bullet();
        c.display();
    }
}
