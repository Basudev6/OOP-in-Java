
package string;


public class GetCharsTest {
    public static void main(String[] args) {
        String s= "Welcome";
        int start=3;
        int end=5; 
        char ch[]=new char[end-start];
        s.getChars(start,end,ch,0);
        System.out.println(ch);
    }
}
