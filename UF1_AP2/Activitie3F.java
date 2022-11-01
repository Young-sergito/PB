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
public class Activitie3F {

    private final static int MOD = 2;
    private final static int MAX = 15;
    private final static String MSG_1 = "insert a number: ";
    private final static String MSG_2 = "the number is smaller than 15: ";
    private final static String MSG_3 = "the number is greater than 15: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2 = 0;
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        System.out.println(MSG_1);
        num2 = sc.nextInt();
        num1 = (num1 % MOD);
        if (num1 * num2 < MAX) {
            System.out.println(MSG_2 + num1 * num2);

        } else {
            System.out.println(MSG_3 + num1 * num2);
        }

    }

}
