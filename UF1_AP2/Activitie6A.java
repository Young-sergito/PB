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
public class Activitie6A {

    private static final int EX1 = 4;
    private static final int EX2 = 100;
    private static final int EX3 = 400;
    private static final int EX4 = 8;
    private static final int MOD = 2;
    private static final String MSG_1 = "insert a  year: ";
    private static final String MSG_2 = "insert a  month: ";
    private static final String MSG_3 = "the month have: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month, year, day;
        do {
            System.out.println(MSG_1);
            year = sc.nextInt();
        } while (year < 0);
        do {
            System.out.println(MSG_2);
            month = sc.nextInt();
        } while (month < 1 || month > 12);
        if (month < EX4 && month % MOD != 0) {
            day = 31;
            System.out.println(MSG_3 + day + "days");
        } else if (month == 2) {
            if (year % EX1 == 0) {
                if (year % EX2 == 0) {
                    if (year % EX3 == 0) {
                        day = 29;
                        System.out.println(MSG_3 + day + "days");

                    } else {
                        day = 28;
                        System.out.println(MSG_3 + day + "days");

                    }
                } else {
                    day = 29;
                    System.out.println(MSG_3 + day + "days");

                }
            } else {
                day = 28;
                System.out.println(MSG_3 + day + "days");

            }
        } else {
            if (EX4 < month && MOD != 0) {
                day = 31;
                System.out.println(MSG_3 + day + "days");

            } else {
                day = 30;
                System.out.println(MSG_3 + day + "days");

            }
        }

    }
}
