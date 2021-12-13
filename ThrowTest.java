
package exception_handling;

public class ThrowTest {
    static void validate(int age){
        if(age<18)
            throw new ArithmeticException("You can not vote");
        else 
            System.out.println("You can vote");
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code....");
    }
}
