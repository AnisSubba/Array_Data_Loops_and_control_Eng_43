package com.spartagloabal.Array_Data_Loops_And_Control;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class calculatorBirthday {
    double month;
    double day;

    public void calBirthday(){
        Scanner birthdayDay = new Scanner(System.in);
        System.out.println("What is your birthday day? ");
        day = birthdayDay.nextDouble();


        Scanner birthdayMonth = new Scanner(System.in);
        System.out.println("WHat is your birthday month?");
        month = birthdayMonth.nextDouble();
    }
    public void birthDate(){
        calBirthday();

        double a = (((((((((((7 * month)-1)*13)+day)+3)*11)-month)-day)/10)+11)/100);
        System.out.println(a);
    }
}
