/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Daw.InstitutMvm.Pb;

/**
 *
 * @author YoungSxrgioo
 */
public class EvenF100 {

    private final static int MAX = 100; // declare constant for max of loop
    private final static int EVEN = 2; // declare constant for evaluate if  number is even
    private final static String MSG_1 = "the first 100 even numbers are: "; // declare constant message

    public static void main(String[] args) {
        int i; //declare variable int
        System.out.println(MSG_1); // message
        for (i = 0; i <= MAX; i++) { //loop for that move to the range
            if (i % EVEN == 0) {// condition for knows if is even number
                System.out.println(i);// show result
            }
        }
    }

}
