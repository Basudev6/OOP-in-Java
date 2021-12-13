
package javaoperator;

public class BitwiseOperator {
    
    public static void main(String[] args)
    {
        int a=60;  // Binary form change --> a= 0011 1100
        int b=13;  //                        b= 0000 1101
        // (&,|,^,<<,>>)
        System.out.println(a|b);
        System.out.println(a^b);
        
        
        // Binary left shift
        System.out.println(a<<2);
        
        
        // Binary right shift
        System.out.println(a>>2);
    }
}
