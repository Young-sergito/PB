/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Daw.InstitutMvm.Pb;

import java.util.Scanner;

/**
 *
 * @author YoungSxrgioo
 */
public class OddPO {

    private final static int SIZE = 5;
    private final static int EVEN = 2;
    private final static String MSG_1 = "insert a number: ";
    private final static String MSG_2 = "the numbers in a possition odd are:";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int numbers[] = new int[SIZE];
        for (i = 0; i < SIZE; i++) {
            System.out.println(MSG_1);
            numbers[i] = sc.nextInt();
        }
        System.out.println(MSG_2);
        for (i = 0; i < SIZE; i++) {
            if (i % EVEN != 0) {
                System.out.println(numbers[i]);
            }
        }

    }

}
