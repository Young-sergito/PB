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
public class RangeNu {

    private final static int MAX = 10; // declare constant max 
    private final static int MIN = 0; // declare constant min
    private final static String MSG_1 = "input a number:"; // declare constant message 
    private final static String MSG_2 = "the number added is:"; // declare  constant  message

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // method for the user insert values
        int num = 0; // declare variable int
        do { // loop do while that  validate num
            System.out.println(MSG_1); // message for user
            num = sc.nextInt(); // user add value to variable
        } while (num > MAX || num < MIN); // condition to end loop
        System.out.println(MSG_2 + " " + num); // return result
    }

}
