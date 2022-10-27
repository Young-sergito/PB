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
public class Activities11B {
    private final static int DOB = 2;// the value that multiply to get double
    private final static int TR = 3;// the value that multiply to get triple
    private final static String MSG_1 = "input a number:"; // message for user
    private final static String MSG_2 = "the double is: "; // message for user
    private final static String MSG_3 = "the triple is: "; // message for user
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // method that can allow input values to user
    int num = 0; // declare variable integer
    System.out.println(MSG_1); // show message for user
    num = sc.nextInt(); // can allow input vslues to user
    System.out.println(MSG_2 + " " +num * DOB); // show the double 
    System.out.println(MSG_3 + " "+num * TR); // show the triple
    }
    
}
