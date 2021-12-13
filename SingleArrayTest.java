
package Javaarray;
// This is one dimensional array.
public class SingleArrayTest 
{
    public static void main(String[] args)
    {
//        int a[]={1,2,3,5,9};
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.println(a[i]);
//        }  
        int a[]= new int[5];
        a[0]=1;
        a[1]=4;
        a[2]=6;
        a[3]=5;
        a[4]=9;
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}
