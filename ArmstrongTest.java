 
package assignment;

// Program to test given number is armstrong or not.

import java.util.Scanner;
import java.lang.Math;
public class ArmstrongTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int r,temp1,temp2,count=0,sum=0;
        temp1=n;
        temp2=n;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        while(temp1!=0)
        {
            r=temp1%10;
            sum=sum+(int)Math.pow(r, count);
            temp1=temp1/10;
        }
        if(temp2==sum)
            System.out.println(temp2+" is armstrong number");
        else
            System.out.println(temp2+" is not armstrong number");       
    }
}
