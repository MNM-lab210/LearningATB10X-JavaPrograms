package ex_02_TO;

import static java.lang.System.*;

public class Lab_006_Grademarks {
    public static void main(String[] args) {
        int mark = 69;
        String grade = (mark<=59)?"F": (mark<=69) ?"D": (mark<=79) ? "C":(mark<=89)? "B":"A";
       System. out.println(grade);
    }
}


//A: 90-100
//
//B: 80-89
//
//C: 70-79
//
//D: 60-69
//
//F: 0-59




