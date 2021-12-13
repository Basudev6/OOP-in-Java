
package assignment;


public class ThisInConstructor {
    ThisInConstructor()
    {
        System.out.println("this keyword in constructor");
    }
    ThisInConstructor(int a)
    {
        this();
        System.out.println(a);
    }
    public static void main(String[] args) {
        ThisInConstructor t = new ThisInConstructor(10);
                  
    }
}
