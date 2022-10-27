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
public class Activitie28 {

    private final static int STUDENTS = 10; //declare constant for rows
    private final static int SUBJECTS = 6; //declare constant for cols
    private final static String MSG_1 = "insert a mark:"; //declare constant message
    private final static String MSG_2 = "the average is: "; //declare constant message

    public static void main(String[] args) {
        float[][] marks = new float[STUDENTS][SUBJECTS]; //declare matrice for table
        float[] avg = new float[STUDENTS]; // declare array for average
        Scanner sc = new Scanner(System.in); // declared method for user can add values
        int i, j = 0; // declare variable int
        for (i = 0; i < STUDENTS; i++) { // loop for move by rows
            for (j = 0; j < SUBJECTS; j++) { // loop for move by rows
                do {
                    System.out.println(MSG_1); // message
                    marks[i][j] = sc.nextFloat(); // user insert value
                } while (marks[i][j] < 0 || marks[i][j] > 10);
                avg[i] += marks[i][j]; //accumulation the marks a student
            }
            System.out.println(MSG_2 + avg[i] / SUBJECTS); //show the average 
        }

    }
}
