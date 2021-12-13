
package assignment;


public class Test {
    static void Parent()
    {
        System.out.println("This is parent class");
    }
    
    static class Test2{
        void Child()
        {
            System.out.println("This is child class");
            Parent();
        }   
        
    }         
}
class SubClassDemo{
    public static void main(String[] args) {
        
        Test t1= new Test();
        t1.Parent();
        
       Test.Test2 t2 = new Test.Test2();
       t2.Child();
       
       
      
       
       
       
       
    }
}
