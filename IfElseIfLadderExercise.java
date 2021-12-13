
package control_statement;

// Program to find obtained grade by students using if..else..if ladder.
public class IfElseIfLadderExercise {
    public static void main(String[] args)
    {
        float gpa=6f;
        String grade;
        if(gpa==4.0)
            grade="A+";
        else if(gpa<4.0 && gpa>=3.7)
            grade="A";
        else if(gpa<3.7 && gpa>=3.3)
            grade="B+";
        else if(gpa<3.3 && gpa>=3.0)
            grade="B";
        else if(gpa<3.0 && gpa>=2.7)
            grade="C+";
        else if(gpa<2.7 && gpa>=2.3)
            grade="C";
        else if(gpa<2.3 && gpa>=2.0)
            grade="D+";
        else if(gpa<2.0 && gpa>=1.7)
            grade="D";
        else if(gpa<1.7 && gpa>=1.3)
            grade="E";
        else if(gpa<1.3 && gpa>=0)
            grade="F";
        else
            grade="Incorrect Entry";
          
        System.out.println("Your grade is "+grade);       
    }
}
