
package thread;


public class SynchronizationTest {
    
}

class Table{
    synchronized void printTable(int n)
    {
        for(int i=1;i<=10;i++)
            System.out.print(n*i+" ");
    }
}


class MyThread1 extends Thread{
     Table t;
     MyThread1(Table t) 
     {
         this.t=t;
     }
     public void run()
     {
        t.printTable(3);
     }
}

class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t)
    {
        this.t= t;
    }
    public void run()
    {
        t.printTable(5);
    }
}
    

class Test
{
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start(); 
    }
}
