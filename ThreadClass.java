 
package thread;


public class ThreadClass extends Thread {
    
    
    public void run()
    {
        System.out.println("Child Thread");
    }
    
    public static void main(String[] args) {
        ThreadClass t = new ThreadClass();
        t.start();
        System.out.println("Main Thread");
    }
}
