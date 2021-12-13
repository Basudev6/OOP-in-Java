
package assignment;

// Program to generate series of prime number up to n number.

import java.util.Scanner;
public class PrimeSeries {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter the n number");
        int n = sc.nextInt();
        System.out.println("Prime numbers up to " +n+" are:");
        for(i=1;i<=n;i++)
        {
            int count=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==2)
                System.out.println(i);    
        }
    }
}
