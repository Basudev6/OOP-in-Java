
package assignment;

import java.util.Scanner;
public class TowerOfHanoi {
    
    void TOH(int n,char src,char dest,char helper)
    {
        if(n>0)
        {
            TOH(n-1,src,helper,dest);
            System.out.println("Move disc "+n+" from "+src+" to "+dest);
            TOH(n-1,helper,dest,src);
        }
    }
    
    public static void main(String[] args) {
        TowerOfHanoi d = new TowerOfHanoi();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of discs");
        int n=sc.nextInt();
        d.TOH(n,'S','D','A');
    }
    
}
