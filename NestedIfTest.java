
package control_statement;

// Program to find whether the given number is  greater then 10 or not and if greater then 10 , it is even or odd .
public class NestedIfTest {
    public static void main(String[] args) {
        int x= 25;
        if(x>10)
        {
            if(x%2==0)
                System.out.println("x is greater than 10 and even number");
            
            else
                System.out.println("x is geater than 10 but odd number");
        }
        else
            System.out.println("x is smaller than 10");
          
    }
  
}
