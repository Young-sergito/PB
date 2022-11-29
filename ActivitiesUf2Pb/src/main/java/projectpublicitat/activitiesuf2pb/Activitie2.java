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
//2.  Demanar un nombre per teclat i indicar per pantalla si aquest nombre és positiu i menor que 100.
public class Activitie2 {
    //declare constant
    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final String MSG_1 = "insert a number";
    private static final String MSG_2 = "the number is: " ;
    private static final String ER = "Error!"; 
    public static void main(String[] args) {
        //declare local variable
        int possitive = 0;
        Activitie2 method = new Activitie2(); //declare obj method
        possitive = method.possitive(); // called possitive function
        System.out.println(MSG_2 + possitive); // show result
    }
    public int possitive(){
        //declare variables
        boolean isInteger;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println(MSG_2);
            isInteger = sc.hasNextInt(); //validate if is a integer num
            if (isInteger) {
                num = sc.nextInt(); //add value to num
                
            }
            else{
                System.out.println(ER); //error
                sc.hasNext();//clean buffer
            }
        }while(!isInteger || num < MIN || num >= MAX  );//endcondition
        sc.close();
        return num;
    }
}
