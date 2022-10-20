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
public class Div {

    private final static int DIV1 = 5; //declare constant know if divisible 
    private final static int DIV2 = 3; //declare constant know if divisible 
    private final static int SIZE = 20; //declare constant for size
    private final static int SUM = 3; //declare constant for sum
    private final static int REST = -2; //declare constant for sum
    private final static String MSG_1 = "insert a number: "; //declare constant for message
    private final static String MSG_2 = "the number is divisible to 5: "; //declare constant for message
    private final static String MSG_3 = "the number is divisible to 3: "; //declare constant for message
    private final static String MSG_4 = "the number is: "; //declare constant for message

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declare method for user can add values to variable
        int num, i = 0;  // declare variable int
        int storage[] = new int[SIZE]; // declare array int
        for (i = 0; i < SIZE; i++) { // loop for that added values to array
            System.out.println(MSG_1); //message
            storage[i] = sc.nextInt(); // user add values to array
        }
        for (i = 0; i < SIZE; i++) { // for loop that know is divisible 
            if (storage[i] % DIV1 == 0) { //condition 1
                storage[i] += SUM; // sum value to array
                System.out.println(MSG_2 + storage[i]); // show result
            } else if (storage[i] % DIV2 == 0) { //condition 2
                storage[i] += REST; // rest value to array
                System.out.println(MSG_3 + storage[i]);// show result
            } else { //condition 3
                System.out.println(MSG_4 + storage[i]);// show result
            }
        }
    }

}
