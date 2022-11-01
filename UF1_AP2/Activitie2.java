/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.UF1_AP2;

//Sergio Serrano Cesar
import java.util.Scanner;

public class Activitie2 {

    private static final int MAXD = 31;
    private static final int MIND = 1;
    private static final int MAXM = 12;
    private static final int MINM = 1;
    private static final int MINY = 0;
    private static final String INS = "INS Manuel Vázquez Montalbán";
    private static final String MSG_1 = "insert your name: ";
    private static final String MSG_2 = "insert your first surname: ";
    private static final String MSG_3 = "insert your second surname: ";
    private static final String MSG_4 = "insert the day: ";
    private static final String MSG_5 = "insert the month: ";
    private static final String MSG_6 = "insert the year: ";
    private static final String MSG_7 = "insert the name of grade: ";
    private static final String MSG_8 = "insert the name of lesson: ";
    private static final String NM = "the name is: ";
    private static final String SR = "the surname is: ";
    private static final String DATE = "the date is: ";
    private static final String NG = "the name of grade is: ";
    private static final String NL = "the name of subject is: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, surname1, surname2, ng, nl;
        int day, month, year;
        System.out.println(MSG_1);
        name = sc.next();
        System.out.println(MSG_2);
        surname1 = sc.next();
        System.out.println(MSG_3);
        surname2 = sc.next();
        do {
            System.out.println(MSG_4);
            day = sc.nextInt();
        } while (day < MIND || day > MAXD);
        do {
            System.out.println(MSG_5);
            month = sc.nextInt();
        } while (month < MINM || month > MAXM);
        do {
            System.out.println(MSG_6);
            year = sc.nextInt();
        } while (year < MINY);
        System.out.println(MSG_7);
        ng = sc.next();
        System.out.println(MSG_8);
        nl = sc.next();
        System.out.println(NM + name+ " \n" + SR + surname1+" " +surname2+ " \n"+ DATE+ day+ " /" + month+ " /"+ year+" \n" + INS+" \n" + NG+ ng+" \n" + NL+  nl);
    }

}
