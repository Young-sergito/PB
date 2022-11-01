/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.UF1_AP2;

import java.util.Scanner;

/**
 *
 * @author YoungSxrgioo
 */
public class Activitie8B {

     
    private static final int EX = 0; // declare exception 
    private static final String MSG_1 = "how much values do yo would like insert? "; //declare message
    private static final String MSG_2 = "insert a number: "; //declare message
    private static final String MSG_3 = "thanks the program is end "; //declare message
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int count = 0, i, num = 0;// declare variable int
    do{ // loop do
        System.out.println(MSG_1); //message
        i = sc.nextInt();     // user add value
    }while(i < EX); // end condtion
    while (count < i){ // loop while
        System.out.println(MSG_2); //message
        num = sc.nextInt(); //user add value
        count++; //accumulation count
    }
        System.out.println(MSG_3); //message
 }

}
