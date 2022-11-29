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
public class Activitie3 {
    // constant
    private static final int MIN = 0;
    private static final int PR1 = 6;
    private static final float PR2 = 0.1f;
    private static final float PR3 = 0.3f;
    private static final int LI1 = 50;
    private static final int LI2 = 200;
    private static final String MSG_1 = "insert a liters: ";
    private static final String MSG_2 = "the price of the bill is: ";
    private static final String ER = "Error: ";

    public static void main(String[] args) {
        //local variable
        float liters, waterBill;
        Activitie3 method = new Activitie3(); // create obj for methods
        liters = method.validate(); // call function validate
        waterBill = method.waterBill(liters); // call function waterBill
        System.out.println(MSG_2+ waterBill); // show result
        
    }

    public float validate() {
        //variale
        boolean isFloat;
        float num = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(MSG_1);
            isFloat = sc.hasNextFloat(); //validate if is float number
            if (isFloat) {
                num = sc.nextFloat(); //add value to num

            } else {
                System.out.println(ER);
                sc.next();//clean buffer
            }
        } while (!isFloat || num < MIN); //end condition
        sc.close();
        return num;
    }

    public float waterBill(float liters) {
        if (liters <= LI1) {
            liters *= PR1;
        } else if (liters > LI1 && LI2 > liters) {
            liters = liters * PR1 * PR2;

        } else if (liters >= LI2) {
            liters = liters * PR1 * PR3;
        }
        return liters;
    }

}
