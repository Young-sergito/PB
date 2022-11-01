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
public class Activitie3I {
   
    private static final String MSG_1 = "insert a number: ";
    private static final String MSG_2 = " the max value is: ";
    public static void main(String[] args) {
        int num,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        System.out.println(MSG_1);
        num2 = sc.nextInt();
        if(num > num2){
            System.out.println(MSG_2+ num);
        }else{
            System.out.println(MSG_2+ num2);
        }
    }
    
}
