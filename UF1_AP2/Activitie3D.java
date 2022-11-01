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
public class Activitie3D {
    private final static int MAX = 27; //declare constant max 
    private final static int MIN = -3; //declare constant min
    private final static String MSG_1 = "insert a number: "; //declare constant message
    private final static String MSG_2 = " the number is into -3 and 27 "; //declare constant message
    private final static String MSG_3 = " the number isnt  into -3 and 27 "; //declare constant message
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //declare method that user addd values to variable
        int num; //declare variable int
        System.out.println(MSG_1); // message
        num = sc.nextInt(); // user add value 
        if(num <= MAX && num >= MIN){ //condition1
            System.out.println(MSG_2+ num); //show result
        }
        else{ //condition 2
            System.out.println(MSG_3); //show result
        }
        
    }
    
    
}
