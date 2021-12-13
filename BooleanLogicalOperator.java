
package javaoperator;



public class BooleanLogicalOperator {
    public static void main(String [] args)
    {
        boolean a= true;
        boolean b= false;
        boolean c= a|b;
//        System.out.println(c);
        
        boolean d= a&b;
//        System.out.println(d);
        
        boolean e=a^b;
//        System.out.println(e);
    
    
        boolean f=!a;
//        System.out.println(f);
        
//        boolean g= (!a & b) | (a & !b);
//          System.out.println(g);
                
//        int h=12,i=2,j=15;
//        boolean k=(h<i && h<j);
//        System.out.println(k);
        
        
        int h=12,i=2,j=15;
        boolean k=(h<i || h<j);
        System.out.println(k);
        
        
    
    
    
    }
}
