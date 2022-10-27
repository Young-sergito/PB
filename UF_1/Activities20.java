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
public class Activities20 {

    private final static int MIN = 0;// declare constant min 
    private final static double KG = 0.45359237; // declare constant convert to kg
    private final static String MSG_1 = "insert a weight: "; // declare constant message
    private final static String MSG_2 = "the weigth is: "; // declare constant message
    private final static String MSG_3 = "do you want end? input 0."; // declare constant message

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //method for user insert values
        int weight, exit = 0; // declare variables int

        do { // loop do while that validate weigth and exit
            System.out.println(MSG_1); // message
            weight = sc.nextInt();// user insert values
            System.out.println(MSG_3);//message
            exit = sc.nextInt(); //user insert values
        } while ((weight < MIN) && (exit == 0)); // condition to end
        System.out.println(MSG_2 + weight * KG);  // show results

    }

}
