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
public class Activitie4A {
    private static final int MIN = 1;// declare constant min
    private static final int MAX = 12; // declare constant max
    private static final String MSG_1 = "insert a month: "; // declare message
    private static final String MSG_2 = "Error "; // declare message
    public static void main(String[] args) {
        int num; //declare variable int
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1); //message
        num = sc.nextInt(); //user add values
        if (num < MIN || num > MAX){ //condition
            System.out.println(MSG_2);// message
        }
        if (num == 1){ 
            System.out.println("Genuary");
        } else if (num == 2){
            System.out.println("February");
        } else if (num == 3){
            System.out.println("Mach");
        } else if (num == 4){
            System.out.println("April");
        } else if (num == 5){
            System.out.println("May");
        } else if (num == 6){
            System.out.println("June");
        } else if (num == 7){
            System.out.println("July");
        } else if (num == 8){
            System.out.println("August");
        } else if (num == 9){
            System.out.println("September");
        } else if (num == 10){
            System.out.println("October");
        } else if (num == 11){
            System.out.println("November");
        } else if (num == 12){
            System.out.println("December");
        }
    }
}
    