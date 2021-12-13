
package object_oriented_programming;

// Parameterized Constructor

public class P_Constructor {
    
    P_Constructor(String name,int roll ){
        System.out.println(name+roll);  
    }
   
    public static void main(String[] args) {
        P_Constructor pc = new P_Constructor("Basu",10);
    }
}
