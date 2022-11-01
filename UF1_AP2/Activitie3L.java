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
public class Activitie3L {

    private final static int WAT = 6;
    private final static int FIL = 50;
    private final static int SEL = 200;
    private final static float SEP =  (float) 0.1;
    private final static float THP = (float) 0.3;
    private final static String MSG_1 = "insert liters of water: ";
    private final static String MSG_2 = "the cost of water is: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liters;
        System.out.println(MSG_1);
        liters = sc.nextInt();
        if (liters <= FIL) {
            System.out.println(MSG_2 + liters * WAT);

        } else if (FIL < liters && liters <= SEL) {
            System.out.println(MSG_2 + liters * WAT * SEP);

        } else {
            System.out.println(MSG_2 + liters * WAT * THP);
        }

    }
}
