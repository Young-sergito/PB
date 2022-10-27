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
public class Activitie11A {
    private final static int DIV = 2;// the value that divide for get area
    private final static String MSG_1 = "input the high of triangle:" ; // message for the user input any value
    private final static String MSG_2 = "input the base of triangle:" ; //message for the user input any value
    private final static String MSG_3 = "the area of triangle is:" ; //message for show the area 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // method for the user append values
        int high = 0 ; // declare variable int
        int base = 0; // declare variable int
        do{ // loop do while for validate that the number append is integer
            System.out.println(MSG_1);// message for add value
            high = sc.nextInt(); //  user can add any value
        }while(high<0);
        do{ // loop do while for validate that the number append is integer
        System.out.println(MSG_2);// message for add value
        base = sc.nextInt(); //  user can add any value
        }while(base<0);
        System.out.println( MSG_3+" "+high*base/DIV); // message and operation for show result
        
        
    }
}
