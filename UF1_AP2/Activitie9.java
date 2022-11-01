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
public class Activitie9 {
    private final static int EX = 0;// declare constant EX
    private final static String MSG_1 = "insert a value:"; //declare constant message 
    private final static String MSG_2 = "the average is:"; //declare constant message
    
    
    public static void main(String[] args) {
        
        int count = 0;// declsre variable int
        float avg = 0,value = 1; // declsre variable int
        Scanner sc = new Scanner (System.in); // declsre method user add values
        while (value != 0 ){ // loop while + condition
            System.out.println(MSG_1); // message
            value = sc.nextFloat();// add value
            count++; //accumulation count
            avg += value; //accumulation avg
        }
        System.out.println(MSG_2+ avg/count); //show result
        
    }
    
}
