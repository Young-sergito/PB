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
public class NatVal {
    private final static int TOP = 3; // declare constant for condition
    private final static int MIN = 0; // declare constant for condition
    private final static String MSG_1 = " inser a number:"; // declare constant message
    private final static String MSG_2 = " the result is: "; // declare constant message
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); // method for user add values
      int num,count = 0; // declare variable int
      do { // loop do while that validate number
          System.out.println(MSG_1); //message
          num = sc.nextInt(); // user insert value
          count ++; // acumulation count
      }while(num < MIN && count < TOP ); // end condition
        System.out.println(MSG_2 + num ); // show result
              
        
        
    }
    
    
}