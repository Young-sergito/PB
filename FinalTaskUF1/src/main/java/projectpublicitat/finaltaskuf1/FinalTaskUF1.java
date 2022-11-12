
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package projectpublicitat.finaltaskuf1;

import java.util.Scanner;

/**
 *
 * @author YoungSxrgioo
 */
public class FinalTaskUF1 {

    private final static int MINID = 111;
    private final static int MAXID = 999;
    private final static int MAXTI = 3;
    private final static int MINTI = 0;
    private final static int MAXED = 120;
    private final static int MINED = 14;
    private final static int MINCO = 0;
    private final static int MAXCO = 1000;
    private final static int MAXTE = 999999999;
    private final static int MINTE = 111111111;
    private final static int ENDCOUNT = 3;
    private final static String MSG_1 = "inserta un nombre entre 111 i 999 inclsosos: ";
    private final static String MSG_2 = "inserta un nombre entre 14 i 120 inclsosos: ";
    private final static String MSG_3 = "venda lliure (0)\n" + "pensionista (1)\n" + "carnet jove (2)\n" + "soci (3)";
    private final static String MSG_4 = "inserta un nombre entre 0 i 1000 inclsosos: ";
    private final static String MSG_5 = "inserta un Telefon de 9 xifres: ";
    private final static String ER = "error en dades!";
    private final static String ERF = "Programa finalitzat per error en dades";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0, edat = 0, tipusVenda = 0, cost = 0, telefon = 0, count = 0;
        boolean isInteger = false;
        do {
            System.out.println(MSG_1);

            isInteger = sc.hasNextInt();
            if (isInteger) {
                id = sc.nextInt();
                if (id < MINID || id > MAXID) {
                    System.out.println(ER);
                    count++;
                }
                
            } else {
                System.out.println(ER);
                sc.next();

            }

        } while ((!isInteger || id < MINID || id > MAXID) && count < ENDCOUNT);

        if (count < ENDCOUNT) {
            count = 0;
            do {
                System.out.println(MSG_2);
                isInteger = sc.hasNextInt();
                if (isInteger) {
                    edat = sc.nextInt();
                    if (edat < MINED || edat > MAXED) {
                        System.out.println(ER);
                        count++;
                    }
                } else {
                    System.out.println(ER);
                    sc.next();
                }
            } while ((!isInteger || edat < MINED || edat > MAXED) && count < ENDCOUNT);
        }
        if (count < ENDCOUNT) {
            count = 0;
            do {
                System.out.println(MSG_3);
                isInteger = sc.hasNextInt();
                if (isInteger) {
                    tipusVenda = sc.nextInt();
                    if (tipusVenda < MINTI || tipusVenda > MAXTI) {
                        System.out.println(ER);
                        count++;
                    }
                    switch (tipusVenda) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                } else {
                    System.out.println(ER);
                    sc.next();
                }

            } while ((!isInteger || tipusVenda < MINTI || tipusVenda > MAXTI) && count < ENDCOUNT);
        }

        if (count < ENDCOUNT) {
            count = 0;
            do {
                System.out.println(MSG_4);
                isInteger = sc.hasNextInt();
                if (isInteger) {
                    cost = sc.nextInt();
                    if (cost < MINCO || cost > MAXCO) {
                        System.out.println(ER);
                        count++;
                    }
                } else {
                    System.out.println(ER);
                    sc.next();
                }
            } while ((!isInteger || cost < MINCO || cost > MAXCO) && cost < ENDCOUNT);
        }
        if (count < ENDCOUNT) {
            count = 0;
            do {
                System.out.println(MSG_5);
                isInteger = sc.hasNextInt();
                if (isInteger) {
                    telefon = sc.nextInt();
                    if (telefon < MINTE || telefon > MAXTE) {
                        System.out.println(ER);
                        count++;
                    }
                } else {
                    System.out.println(ER);
                    sc.next();
                }
            } while ((!isInteger || telefon < MINTE || telefon > MAXTE) && count < ENDCOUNT);
        }

        if (count == 3) {

            System.out.println(ERF);
        }
        else{
            System.out.printf("|%12s|%12s|%12s|%12s|%12s|%n","id","edat","tipusVenda","cost","telefon");
            System.out.printf("%12d|%12d|%12s|%12d|%12d|%n",id,edat,tipusVenda,cost,telefon);
            
        }
    }

}
