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
public class Marks8 {

    private final static int SIZE = 8;//declare constant for size
    private final static int FAILED = 4; // declare constant for view if failed
    private final static int MIN = 0; // declare constant for view if ouit of range
    private final static int MAX = 10; // declare constant for view if ouit of range
    private final static String MSG_1 = "insert a mark: "; //declare constant message
    private final static String MSG_2 = "the average passed are: "; //declare constant message
    private final static String MSG_3 = "the average failed are: "; //declare constant message

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// method for user insert values
        int  avgfail = 0, avgpass = 0, fail = 0, i;// declare variables int 
        int[] marks = new int[SIZE]; // declare array int
        for (i = 0; i < SIZE; i++) { //loop for that insert values to array
            do { // loop do while for validate values 
                System.out.println(MSG_1); // message
                marks[i] = sc.nextInt(); // user insert value to array
            } while (marks[i] < MIN || marks[i] > MAX); // condition for ending
        }
        for (i = 0; i < SIZE; i++) {//loop for that accumulation faileds and passed
            if (marks[i] <= FAILED) { // condition 1
                fail++; // recount failded
                avgfail += marks[i]; // accumulation failed
            } else { //condition 2
                avgpass += marks[i]; //accumulation passed
            }
        }
        System.out.println(MSG_2 + avgfail / fail + "\n" + MSG_3 + avgpass / (SIZE - fail));// show result
    }

}
