
package control_statement;

// method types-->return and non-return type.
// Program to take a number and find the greatest among them using method.


import java.util.Scanner;
public class ReturnTest {
    
    int maxcheck(int a,int b)
    {
       if(a>b)
          return a;
       else
          return b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        ReturnTest d = new ReturnTest();
        int a = d.maxcheck(x, y);
        System.out.println("The maximum number is "+a);
    }
}