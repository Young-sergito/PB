package com.Daw.InstitutMvm.Pb;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YoungSxrgioo
 */
public class Activities10 {
    private static final int MAX = 100;// constant range max for append number
    private static final int MIN = 1;// constant range min for append number
    private static final int COUNT = 3 ;
    private static final String MSG_1 = "append a number into 1 to 100:"; // constant message for explained user  
    private static final String MSG_2 = "the number append into 1 to 100:";// constant message for explained user
    public static void main(String[] args) {
        int num = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in); // method scanner for the user append numbers
        do { // loop do... while for validate if number is into 1 - 100 
            System.out.println(MSG_1);
            num = sc.nextInt();
            i++;        
        }while((num < MIN || num > MAX)&& i <= 3);   // condition for rep loop
        
        System.out.println(MSG_2+" " + num); // print message with result
        
    }
    
    }
