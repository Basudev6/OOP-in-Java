 
package thread;

class ThreadA extends Thread{
    public void run()
    {
        System.out.println("This is thread 1");
    }
}
class ThreadB extends Thread{
    public void run()
    {
        System.out.println("This is thread 2");
    }
}
class ThreadC extends Thread{
     public void run()
    {
        System.out.println("This is thread 3");
    }
}
public class PriorityTest {
    public static void main(String[] args) {
        
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        ThreadC t3 = new ThreadC();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(8);
        t3.setPriority(5);
        t1.start();
        t2.start();
        t3.start();
        
        
    }
  
}
