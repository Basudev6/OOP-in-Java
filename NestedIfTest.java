
package assignment;


public class NestedIfTest {
    public static void main(String[] args) {
        int x= 25;
        if(x>10)
        {
            if(x%2==0)
                System.out.println("x is greater than 10 and even number");
            
            else
                System.out.println("x is greater than 10 but odd number");
        }
        else
            System.out.println("x is smaller than 10");
          
    }
  
}


