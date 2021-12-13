
package assignment;


public class ThisInVariable {
    
    String name;
    int  id;
    
    ThisInVariable(String name, int id)
    {
        this.name= name;
        this.id = id;
    }
    void display()
    {
        System.out.println(name+id);
        
    }
    public static void main(String[] args) {
        ThisInVariable t1 = new ThisInVariable("Basu",4);
        ThisInVariable t2 = new ThisInVariable("Ram",2);
        t2.display();
        
    }
   
}
