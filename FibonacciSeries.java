
package assignment;

// Program to display fibonacci series up to n number.

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=0,b=1,c;
        System.out.println("Enter the n number");
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to "+n+" is:");
        while(a<=n)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
