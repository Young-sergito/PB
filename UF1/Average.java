
package com.Daw.InstitutMvm.Pb;

/**
 *
 * @author YoungSxrgioo
 */

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YoungSxrgioo
 */
public class Average {
    private static final int MAX = 5;
    private static final String MSG_1 = "introduce un número";
    private static final String MSG_2 = "la media es:";
    public static void main(String[] args) {
        int num = 0; // declare variable num 
        int i;  // declare variable i 
        int avg = 0; // declare variable avg  
        
        Scanner sc = new Scanner(System.in); // declare variable scanner
        for(i=0;i<MAX;i++){ // loop for append nums
            
            System.out.println(MSG_1);// message for request numbers
            num = sc.nextInt(); // variable num for save values
            avg += num; // variable avg for acummulation numbers
        }        
        System.out.println(MSG_2+" " +avg/MAX); // return avg of the differents 5 added numbers 
    }
    
}
