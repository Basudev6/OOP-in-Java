
package assignment;

// Program to reverse a string.

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String rev="";
        int a= str.length();
        for(int i=a-1;i>=0;i--)
            rev=rev+str.charAt(i);
        System.out.println("Reverse is "+rev);
        
    }
}
