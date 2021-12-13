 
package assignment;

// Program to find grade of students using if...else...if ladder.
import java.util.Scanner;
public class IfElseIfLadder {
    public static void main(String args [])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks");
        float a= sc.nextFloat();
        if(a<=25.0)
            System.out.println("Grade is F");
        else if(a<=45.0 && a>=26.0)
            System.out.println("Grade is E");
        else if(a<=50.0 && a>=46.0)
            System.out.println("Grade is D");
        else if(a<=60.0 && a>=51.0)
            System.out.println("Grade is C");
        else if(a<=80.0 && a>=61.0)
            System.out.println("Grade is B");       
        else if(a<=100.0 && a>=81.0)
            System.out.println("Grade is A");
        else
            System.out.println("Invalid Input");
    }
        
}
