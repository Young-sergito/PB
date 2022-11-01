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
public class Activitie3J {

    private static final String MSG_1 = "insert a number: ";
    private static final String MSG_2 = " the max value is: ";

    public static void main(String[] args) {
        int num, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        System.out.println(MSG_1);
        num2 = sc.nextInt();
        System.out.println(MSG_1);
        num3 = sc.nextInt();
        if (num > num2) {
            if (num > num3) {
                System.out.println(MSG_2 + num);
            } else {
                System.out.println(MSG_2 + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println(MSG_2 + num2);
            } else {
                System.out.println(MSG_2 + num3);
            }
        }
    }
}
