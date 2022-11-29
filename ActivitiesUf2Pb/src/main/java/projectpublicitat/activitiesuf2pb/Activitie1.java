/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpublicitat.activitiesuf2pb;

import java.util.Scanner;

/**
 *
 * @author YoungSxrgioo
 */
public class Activitie1 {
    //declare constants
    private static final int MAX = 0;
    private static final String MSG_1 = "insert a number: ";
    private static final String MSG_2 = "the negative number is: ";
    private static final String ER = "Error!: ";

    public static void main(String[] args) {
        //declare global variables 
        int negative;
        Activitie1 method = new Activitie1(); //declare obj method
        negative = method.negative(); // call a method negative
        System.out.println(MSG_2 + negative); // print result
    }

    public int negative() {
        //declare variable
        boolean isNegative;
        int num = 0;
        Scanner sc = new Scanner(System.in); //declare method scanner
        do {
            System.out.println(MSG_1);
            isNegative = sc.hasNextInt(); // add value and validate is integer 
            if (isNegative) {
                num = sc.nextInt(); // add if is a integer number

            } else {
                System.out.println(ER); // print error
                sc.next(); //clean buffer
            }
        } while (!isNegative || num > MAX); //endcondition 
        sc.close(); 
        return num;
    }

}
