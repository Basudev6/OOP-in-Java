
package assignment;


public class InvokeTest {
    void sum()
    {
        int a = 30;
        int b = 50;
        int s = a+b;
        System.out.println("The sum is "+s);
    }
    public static void main(String[] args) {
        InvokeTest i = new InvokeTest();
        i.sum();
    }
}
