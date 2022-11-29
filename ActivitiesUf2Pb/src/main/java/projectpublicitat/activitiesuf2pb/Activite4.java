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
public class Activite4 {
    //constant
    private final static int MIN = 0;
    private final static int MAX = 3;
    private final static String MSG_1 = "insert a number: ";
    private final static String MSG_2 = "the number inserted is: ";
    private final static String MSG_3 = "try again: ";
    private final static String MSG_4 = "the number tipped is weel! ";
    private final static String MSG_5 = "the result is:  ";
    private final static String MSG_6 = "the number tipped is wrong!  ";
    private final static String ER = "ERROR! ";

    public static void main(String[] args) {
        //local variables
        int num = 0;
        Activite4 method = new Activite4();//create obj method
        num = method.validate(); // call fucntion validate
        
        System.out.println((num > MIN)? MSG_5 + num : MSG_6); // show result
    }

    public int validate() {
        //variable
        boolean isIntger;
        int nu = 0, count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(MSG_1);
            isIntger = sc.hasNextInt(); //validate if is a integer number
            if (isIntger) {
                nu = sc.nextInt(); //add values to nu
                System.out.println((nu > MIN) ? MSG_4 : MSG_3); //show message

            } else {
                System.out.println(ER);
                sc.next();//clear buffer
            }
             count++; // aug count
        } while (!isIntger  && count < MAX); //endcondition
        
        sc.close();
        return nu;
    }

}
