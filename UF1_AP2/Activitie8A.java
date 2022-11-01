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
public class Activitie8A {

    private static final int EX = 0; // declare exception
    private static final String MSG_1 = "insert a value: "; //declare message
    private static final String MSG_2 = "the number added is : "; //declare message
    private static final String MSG_3 = "the program is end; you inserted  0: "; //declare message

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1; // declare variable int
        while (num != EX) { //loop while
            do { //loop do while
                System.out.println(MSG_1); //message
                num = sc.nextInt();  // user add value
            } while (num < EX); //end condition
            System.out.println(MSG_2 + num);//show result

        }
        System.out.println(MSG_3);//message
    }

}
