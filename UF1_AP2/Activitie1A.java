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
public class Activitie1A {

    private static final String MSG_1 = "whats your name? ";
    private static final String MSG_2 = "your name is:  ";
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println(MSG_1);
        name = sc.next();
        System.out.println(MSG_2 + name);
       
    }

}
