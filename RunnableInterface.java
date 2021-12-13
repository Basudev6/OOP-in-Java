
package thread;

public class RunnableInterface {
    
}
class ThreadTest implements Runnable
{
    public void run()
    {
        System.out.println("Child Thread");
    }
    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        Thread th = new Thread(t);
        th.start();
        System.out.println("Main thread");
    }     
}
