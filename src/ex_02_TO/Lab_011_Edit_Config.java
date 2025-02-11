package ex_02_TO;

import java.sql.SQLOutput;

public class Lab_011_Edit_Config {
    public static void main(String[] args) {
        String age_string = args [0];
        int age = Integer.parseInt(age_string);
        System.out.println(age);


        String canIGoGoa =age >=24 ? "Yes": "No";
        System.out.println(canIGoGoa);



    }
}
