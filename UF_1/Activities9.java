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
public class Activities9 {
    private static final int MAX = 50;// constant range max for append number
    private static final int MIN = 5;// constant range min for append number
    private static final String MSG_1 = "append a number into 5 to 50:"; // constant message for explained user  
    private static final String MSG_2 = "the number append into 5 to 50:";// constant message for explained user
    public static void main(String[] args) {
        int num = 0; // variable num for append number
        Scanner sc = new Scanner(System.in); // method scanner for the user append numbers
        do { // loop do... while for validate if number is into 5 - 50 
            System.out.println(MSG_1);
            num = sc.nextInt();
        }while(num < MIN || num > MAX);   // condition for rep loop
        
        System.out.println(MSG_2+" " + num); // print message with result
        
    }
    
}
