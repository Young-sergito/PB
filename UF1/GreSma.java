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
public class GreSma {

    private final static int MAX = 2;// constant max loop
    private final static String MSG_1 = "insert a number:"; // constant message
    private final static String MSG_2 = "the sum of the two first numbers is greater: "; // constant message
    private final static String MSG_3 = "the sum of the two first numbers is smaller: "; // constant message

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // method for user insert values 
        int num = 0, num2 = 0, i, sum = 0; // declare variables int
        for (i = 0; i < MAX; i++) { // loop for that insert 2 numbers
            System.out.println(MSG_1);// message
            num = sc.nextInt();  // can allow user insert values 
            sum += num;  // accumulation nums
        }
        System.out.println(MSG_1); // message
        num2 = sc.nextInt();// can allow user insert values
        if (sum > num2) { // condition 1
            System.out.println(MSG_2 + " " + sum);// show result
        } else { // condition 2
            System.out.println(MSG_3 + " " + sum); // show result
        }

    }

}
