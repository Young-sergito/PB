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
public class Activities27 {

    private final static int SIZE = 5;//declare constant for size
    private final static int EVEN = 2;// declare constant for evaluate if  number is even
    private final static String MSG_1 = "insert a number: ";//declare constant for message
    private final static String MSG_2 = "the numbers in a possition odd are:";//declare constant for message

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// declare method for user can add values to variable
        int i;// declare variable int
        int numbers[] = new int[SIZE];// declare array int
        for (i = 0; i < SIZE; i++) {// loop for that added values to array
            System.out.println(MSG_1);//message
            numbers[i] = sc.nextInt(); // user add values to array
        }
        System.out.println(MSG_2);//message
        for (i = 0; i < SIZE; i++) { //loop for that move to array
            if (i % EVEN != 0) { //condition
                System.out.println(numbers[i]);//show result
            }
        }

    }

}
