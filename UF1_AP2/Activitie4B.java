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
public class Activitie4B {
    
    private static final int MIN = 1;// declare constant min
    private static final int MAX = 12; // declare constant max
    private static final String MSG_1 = "Insert a month: ";//declare constant message
    private static final String MSG_2 = "Error ";//declare constant message

    public static void main(String[] args) {
        int num; // variable int
        Scanner sc = new Scanner(System.in);// method for add values
        System.out.println(MSG_1); // message
        num = sc.nextInt(); // user add value
        if (num < MIN || num > MAX) { //condition
            System.out.println(MSG_2); //message
        }
        switch (num) { //switch case for differents options
            case 1:
                System.out.println("Genuary");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }
}

