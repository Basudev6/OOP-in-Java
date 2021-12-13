
package javaoperator;

/*
Relational Operator : Operands --> determines the relationship that one operand has to the other..
return value:boolean (true/false)
1. == equal to
2. != not equal to
3. > greater than
4. < less than
5. >= greater than or equal to
6. <= less than or equal to 
 */
public class RelationalOperator {
    public static void main(String[] args)
    {
         int age = 18;
         
        // == operator
        if(age==18)
       
             System.out.println("Eligible to vote");  
        
         // != operator
        if(age!=18)
       
             System.out.println(" Not eligible to vote"); 
 
        // > operator
        if(age>18)
       
             System.out.println("Eligible to vote");
        // < operator
        
        if(age<18)
       
             System.out.println("Not eligible to vote");
        // >= operator
        if(age>=18)
       
         System.out.println("Eligible to vote");       
        
         // <= operator
        if(age<=18)
       
         System.out.println(" Not eligible to vote");       
        
        
        
        
        
        
        
        
        
        // add the odd number till 10;
        
        int n, add=0;
        for(int i=0;i<10;i++ )
        {
            if(i%2!=0)
                add=add+i;
            
        }
          System.out.println(add);   
    }
    
}
