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
public class Activities29 {

    /*29. Especifica un algorisme que demani 20 nombres enters (compresos entre 1 i 9 inclosos) per teclat. 
    Cal que l’algorisme imprimeixi els valors de dreta a esquerra i després d’esquerra a dreta.*/

    private final static int SIZE = 3;
    private final static int MAX = 9;
    private final static int MIN = 1;
    private final static String MSG_1 = "insert number: ";
    private final static String MSG_2 = "the numbers entered: ";
    private final static String MSG_3 = "the entered numbers of inverted order ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[SIZE];
        int i = 0;
        for (i = 0; i < SIZE; i++) {
            do {
                System.out.println(MSG_1);
                numbers[i] = sc.nextInt();
            } while (numbers[i] > MAX || numbers[i] < MIN);
        }
        System.out.println(MSG_2);
        for (i = 0; i < SIZE; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(MSG_3);
        for (i = SIZE; i > 0; i--) {
            System.out.println(numbers[i]);
        }
    }

}
