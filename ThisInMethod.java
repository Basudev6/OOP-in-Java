
package assignment;

public class ThisInMethod {
    
    void display()
    {
        System.out.println("this keyword in method");
    }
    void method()
    {
        this.display();
    }
    public static void main(String[] args) {
        ThisInMethod t = new ThisInMethod();
        t.method();          
    }
}
