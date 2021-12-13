
package assignment;

// Program to find grade of students using switch statement .

import java.util.Scanner;
public class SwitchTest {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
//        System.out.println("---choose option for following---");
//        System.out.println("1 for marks less then 26");
//        System.out.println("2 for marks between 26 to 45");
//        System.out.println("3 for marks between 46 to 50");
//        System.out.println("4 for marks between 51 to 60");
//        System.out.println("5 for marks between 61 to 80");
//        System.out.println("6 for marks between 81 to 100");
//        System.out.println("Enter your option");
//        int ch = sc.nextInt();
//        switch(ch)
//        {
//            case 1:
//              System.out.println("Grade is F");
//              break;
//            case 2:
//              System.out.println("Grade is E");
//              break;
//            case 3:
//              System.out.println("Grade is D");
//              break;
//            case 4:
//              System.out.println("Grade is C");
//              break;  
//            case 5:
//              System.out.println("Grade is B");
//              break;
//            case 6:
//              System.out.println("Grade is A");
//              break;
//            default:
//                System.out.println("Invalid Input");         
//        }       
//  }
//
// -----------------------------------------------------------------------------
    
        System.out.println("Enter your marks");
        int ch = sc.nextInt();
        switch(ch/10)
        {
            case 1:
            case 2:
            case 3:
              System.out.println("Grade is E");
              break;
            case 4:
              System.out.println("Grade is D");
              break;
            case 5:
              System.out.println("Grade is C");
              break;
            case 6:
              System.out.println("Grade is B");
              break;  
            case 7:
              System.out.println("Grade is B+");
              break;
            case 8:
            case 9:
              System.out.println("Grade is A");
              break;
            default:
              System.out.println("Invalid Input");         
        }       
    
    }
     
}
