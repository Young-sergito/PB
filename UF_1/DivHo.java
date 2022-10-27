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
public class DivHo {

    private final static int EX_1 = 0; // declare constant for exception
    private final static int EX_2 = 1; // declare constant for exception
    private final static int MAX = 2; // declare constant for exception
    private final static String MSG_1 = "insert a number: "; //declare constant message
    private final static String MSG_2 = "the number inserted is wrong, the number must be greater than 0 , try again: "; //declare constant message
    private final static String MSG_3 = "the result is: "; //declare constant message

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declared method for user can add values
        int num = 0, count = 0, div = 0; // declare variable int
        do { // loop do while for insert 2 numbers
            System.out.println(MSG_1); // message
            num = sc.nextInt(); // user add value
            if (count == EX_1){ // condition 
                div =+ num; // accumulation div
            } 
            while (count == EX_2 && num == EX_1) { // condition for meet exception
                System.out.println(MSG_2); //message
                num = sc.nextInt(); // user add value
            }
            count++; //accumulation 
        } while (count < MAX); // condition to end loop do while
        System.out.println(MSG_3 + (div / num)); // show result

    }

}
