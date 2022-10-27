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
public class Activities19 {

    private final static int EVEN = 2;//declare constant for know is even
    private final static int SIZE = 20;// declare constan for size
    private final static String MSG_1 = "insert a number: ";// declare constant message
    private final static String MSG_2 = "the even numbers are: ";// declare constant message
    private final static String MSG_3 = "the odd numbers are: ";// declare constant message

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// declare method for user insert values
        int even = 0, odd = 0, counteven = 0, i; // declare variables int
        int[] numbers = new int[SIZE]; // declare array int
        for (i = 0; i < SIZE; i++) { //loop for that add values in array
            System.out.println(MSG_1);// message
            numbers[i] = sc.nextInt(); // add values to array
        }
        for (i = 0; i < SIZE; i++) { // loop for that count even
            if (numbers[i] % EVEN == 0) { // condition 1
                counteven++; // counter even
            }
        }
        System.out.println(MSG_2 + counteven + "\n" + MSG_3 + (SIZE - counteven)); //show results
    }

}
