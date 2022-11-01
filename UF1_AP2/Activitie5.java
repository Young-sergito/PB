/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.UF1_AP2;

import java.util.Scanner;

/**
 *
 * @author YoungSxrgioo
 */
public class Activitie5 {

    private static final int EX1 = 4;
    private static final int EX2 = 100;
    private static final int EX3 = 400;
    private static final String MSG_1 = "insert a year: ";
    private static final String MSG_2 = " is a leap year ";
    private static final String MSG_3 = " isnt a leap year ";

    public static void main(String[] args) {
        int year = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        year = sc.nextInt();
        if (year % EX1 == 0) {
            if (year % EX2 == 0) {
                if (year % EX3 == 0) {
                    System.out.println(year + MSG_2  );
                } else {
                    System.out.println( year + MSG_3 );
                }
            } else {
                System.out.println(year + MSG_2  );
            }
        } else {

            System.out.println(year + MSG_3  );
        }

    }

}
