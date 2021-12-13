
package assignment;
// Program to check if the given number is palindrome or not.

import java.util.Scanner;
public class PalindromeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp=n,rev=0,r;
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(temp==rev)
            System.out.println(temp+" is a palindrome number");
        else
            System.out.println(temp+" is not a palindrome number");
    }
}
