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
public class Activitie6B {

    private static final int EX1 = 4; //declare exception
    private static final int EX2 = 100; //declare exception
    private static final int EX3 = 400; //declare exception
    private static final int EX4 = 8; //declare exception
    private static final int MOD = 2; // declare mod
    private static final int MONTH = 12; //declare month
    private static final String MSG_1 = "insert a  year: "; // declare message
    private static final String MSG_2 = "insert a  month: ";// declare message
    private static final String MSG_3 = "the month have: ";// declare message

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month, year, day; //declare variable int
        do { // loop do while
            System.out.println(MSG_1); //message
            year = sc.nextInt(); //user add value
        } while (year < 0); // end condition
        do { //loop do while
            System.out.println(MSG_2); //message
            month = sc.nextInt(); //user add value
        } while (month < 1 || month > 12); //end condition

        switch (month) {//switch case
            case 1:
                day = 31;
                System.out.println(MSG_3 + day + " days");
                break;
            case 2:
                if (year % EX1 == 0) {
                    if (year % EX2 == 0) {
                        if (year % EX3 == 0) {
                            day = 29;
                            System.out.println(MSG_3 + day + " days");

                        } else {
                            day = 28;
                            System.out.println(MSG_3 + day + " days");

                        }
                    } else {
                        day = 29;
                        System.out.println(MSG_3 + day + " days");

                    }
                } else {
                    day = 28;
                    System.out.println(MSG_3 + day + " days");

                }
                break;

            case 3:
                day = 31;
                System.out.println(MSG_3 + day + " days");
                break;
            case 4:
                day = 30;
                System.out.println(MSG_3 + day + " days");
                break;
            case 5:
                day = 31;
                System.out.println(MSG_3 + day + " days");
                break;
            case 6:
                day = 30;
                System.out.println(MSG_3 + day + " days");
                break;
            case 7:
                day = 31;
                System.out.println(MSG_3 + day + " days");
                break;
            case 8:
                day = 31;
                System.out.println(MSG_3 + day + " days");
                break;
            case 9:
                day = 30;
                System.out.println(MSG_3 + day + " days");
                break;
            case 10:
                day = 31;
                System.out.println(MSG_3 + day + " days");
                break;
            case 11:
                day = 30;
                System.out.println(MSG_3 + day + " days");
                break;
            case 12:
                day = 31;
                System.out.println(MSG_3 + day + " days");
                break;

        }
    }
}
