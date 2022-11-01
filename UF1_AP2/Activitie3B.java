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
public class Activitie3B {
        private static final int EX = 35; //declare constant ex
    private static final String MSG_1 = "insert a number: ";//declare constant msg
    private static final String MSG_2 = "the number inserted is greater than 35. ";//declare constant msg
    private static final String MSG_3 = "the number inserted is smaller than 35. ";//declare constant msg


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; 
        num = sc.nextInt();
        if (num > EX) {//condition
            System.out.println(MSG_2);//message
        } else {//condition
            System.out.println(MSG_3);//message
        }
    }
}
