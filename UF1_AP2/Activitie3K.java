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
public class Activitie3K {

    private static final String MSG_1 = "insert a number: ";
    private static final String MSG_2 = "is multiply";
    private static final String MSG_3 = "isnt multiply";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        System.out.println(MSG_1);
        num2 = sc.nextInt();
        if (num1 > num2) {
            if (num1 % num2 == 0) {
                System.out.println(MSG_2);
            } else {
                System.out.println(MSG_3);
            }
        } else {
            if (num2 % num1 == 0) {
                System.out.println(MSG_2);
            } else {
                System.out.println(MSG_3);
            }

        }
    }

}
