/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Daw.InstitutMvm.Pb;

/**
 *
 * @author YoungSxrgioo
 */
public class Activities23 {

    private final static int SIZE = 8;// declare constant for size the array
    private final static int FAILED = 4;// declare constant for evaluate if failed
    private final static String MSG_1 = "insert a mark: "; //declare constant message
    private final static String MSG_2 = "the avg passed are:"; //declare constant message
    private final static String MSG_3 = "the avg failed are:"; //declare constant message

    public static void main(String[] args) {
        int i, avgPass = 0, avgFail = 0, countPass = 0; //declare variable int
        int marks[] = {4, 6, 8, 3, 0, 7, 10, 1}; // declare array int
        for (i = 0; i < SIZE; i++) { // loop for that evaluate if mark is passed 
            if (marks[i] <= FAILED) { // condition 1
                avgFail += marks[i]; // accumulation the marks faileds 

            } else { //condition 2
                avgPass += marks[i]; // accumulation the marks passed
                countPass++; // counter marks passed
            }
        }
        System.out.println(MSG_2 + avgPass / countPass + "\n" + MSG_3 + avgFail / (SIZE - countPass)); //show result
    }
}
