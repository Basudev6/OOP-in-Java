
package assignment;

import java.util.Scanner;
public class FactorialSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter n number");
        int n= sc.nextInt();
        System.out.println("Factorials of number upto "+n+" is:");
        for(i=1;i<=n;i++)
        {
            int f=1;
            for(j=1;j<=i;j++)
                f=f*j;
            System.out.println(f);
        }
        
    }
}
