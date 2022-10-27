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
/*32. El nostre client és un magatzem a l'engròs de productes que està començant a vendre per Internet. 
La web no genera encara tota la informació que l'usuari necessita, i la botiga està rebent moltes trucades sobre alguns dubtes.
Per a solucionar-ho ens demanen que desenvolupem ràpidament una aplicació que els serveixi per a donar resposta a les preguntes més habituals.
 */
public class Activities32 {

    private final static int MAX = 3;
    private final static int MIN = 0;
    private final static int MAXC = 6;
    private final static int MINC = 1;
    private final static int IVA1 = 4;
    private final static int IVA2 = 4;
    private final static int IVA3 = 8;
    private final static int IVA4 = 8;
    private final static int IVA5 = 21;
    private final static int IVA6 = 21;
    private final static int PER = 100;
    private final static int SHIP1 = 3;
    private final static int SHIP2 = 20;
    private final static int SHIP3 = 50;
    private final static int PR1 = 100;
    private final static int PR2 = 501;
    private final static String MSG_1 = "choose a option:\n(1)Calcul del preu final:; (2)Mostrar IVA aplicat;(3)Cost de l'enviament. ";
    private final static String MSG_2 = "insert a price: ";
    private final static String MSG_3 = "insert the units you want to buy: ";
    private final static String MSG_4 = "insert the category of the product;\n1 (Medicaments), 2 (Farines), 3 (Medicaments veterinaris), 4 (Aigues), 5 (Cosmètics), 6 (Begudes alcohòliques).t: ";
    private final static String MSG_5 = "the cost of the shipment is:  ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int category, menu, products = 0;
        float cost = 0;

        do {
            System.out.println(MSG_1);
            menu = sc.nextInt();
        } while (menu < MIN || menu > MAX);
        switch (menu) {
            case 1:
                do {
                    System.out.println(MSG_2);
                    cost = sc.nextFloat();
                } while (cost < 0);
                do {
                    System.out.println(MSG_3);
                    products = sc.nextInt();
                } while (products < 0);

                break;
            case 2:
                do {
                    System.out.println(MSG_4);
                    category = sc.nextInt();
                } while (category < MINC || category > MAXC);
                switch (category) {
                    case 1:
                        cost = cost + ((cost * IVA1) / 100);
                        System.out.println("the price is: " + cost * products);
                        break;
                    case 2:
                        cost = cost + ((cost * IVA2) / 100);
                        System.out.println("the price is: " + cost * products);
                        break;
                    case 3:
                        cost = cost + ((cost * IVA3) / 100);
                        System.out.println("the price is: " + cost * products);
                        break;
                    case 4:
                        cost = cost + ((cost * IVA4) / 100);
                        System.out.println("the price is: " + cost * products);
                        break;
                    case 5:
                        cost = cost + ((cost * IVA5) / 100);
                        System.out.println("the price is: " + cost * products);
                        break;
                    case 6:
                        cost = cost + ((cost * IVA6) / 100);
                        System.out.println("the price is: " + cost * products);
                        break;
                }
                break;
            case 3:
                System.out.println(MSG_2);
                cost = sc.nextFloat();
                System.out.println(MSG_3);
                products = sc.nextInt();
                if (cost * products <= PR1) {
                    System.out.println(MSG_5 + SHIP1);
                } else if (cost * products > PR1 && cost * products < PR2) {
                    System.out.println(MSG_5 + SHIP2);
                } else if (cost * products > PR2) {
                    System.out.println(MSG_5 + SHIP3);

                }
                break;

        }
    }
}    
