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
public class Activitie3H {

    private static final int MOD = 2;
    private static final String MSG_1 = "insert a number: ";
    private static final String MSG_2 = "the number is odd : ";
    private static final String MSG_3 = "the number is even: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num % MOD == 0) {
            System.out.println(MSG_2 + num * num);
        } else {
            System.out.println(MSG_3 + num * num * num);
        }
    }

}
