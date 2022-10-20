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
public class Abs {

    private final static int MIN = 0; // decalre constant min for condition
    private final static int NEG = -1; // declare constant neg for change sign
    private final static String MSG_1 = "insert a number: "; // declare constant message
    private final static String MSG_2 = "the result is: ";// declare constant message

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declare method can allow user insert values
        int num = 0; // declare variable int
        System.out.println(MSG_1); // message
        num = sc.nextInt(); // user insert value to variable
        if (num < MIN) { //condition 1
            System.out.println(MSG_2 + num * NEG); //show result
        } else { // condition 2
            System.out.println(MSG_2 + num);// show result
        }

    }

}
