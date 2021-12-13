
package javadatatype;

/*
 Variables Types:
1. local variable
2. instance
3. static/class

*/



public class JavaVariables 
{        
    String college="inderni"; // intance variable
    static String address="Bharatput"; // static variable
   
    public static void main( String[] args)
    {        
   
        int c=12, g=10; // Direct initialized.
        int f= c*g;     // Dynamically initialized.
        
        int a= 6; //local variable
        System.out.println(a);
        System.out.println(address);
        
    }
    void display()
    {
        System.out.println(college);
        System.out.println(address);
       
     }
    
         
        
   
        

    
    
    
    
    
}
