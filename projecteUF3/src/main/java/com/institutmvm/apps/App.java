/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.institutmvm.apps;

import com.institutmvm.utils.Metodes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author YoungSxrgioo
 */
public class App {

    private final static String ER = "Eror de dades!";
    private final static String FOLDER = "Files\\";
    private final static String EX = ".txt";
    private final static String MSG_1 = "BENVINGUT";
    private final static String MSG_2 = "\n(1) veure articles"
            + "\n(2) Enregistrar un nou article" + "\n (3)Mostrar total d'articles"
            + "\n (4)Sortir"
            + "\n Escull una opció valida:";
    private final static String MSG_3 = "introdueix el codi de l'article: ";
    private final static String MSG_4 = "introdueix el nom de l'article: ";
    private final static String MSG_5 = "introdueix el tipus de l'article: ";
    private final static String MSG_6 = "introdueix la quantitat d'articles: ";
    private final static String MSG_7 = "introdueix el preu d'articles: ";
    private final static String MSG_FILE_NAME = "Indica el nom del document: ";
    private final static String ART = "ART";
    private final static String FI = "el programa ha finalitzat per petició d'usuari!";
    private final static int CON_OP = 0;
    private final static int MAX_OP = 4;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String codi, nom, tipus, path = "";
        int quantitat, opcio;
        double preu;
        Metodes met = new Metodes();
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        System.out.println(MSG_FILE_NAME);
        path = FOLDER + sc.next() + EX;
        BufferedReader llegir = new BufferedReader(new FileReader(path));
        BufferedWriter escriure = new BufferedWriter(new FileWriter(path, true));

        do {

            System.out.println(MSG_2);
            opcio = sc.nextInt();
            opcio = met.menuOpt(opcio, CON_OP, MAX_OP);
            if (opcio <= CON_OP) {
                System.out.println(ER);
            }
        } while (opcio <= CON_OP);
        switch (opcio) {
            case 1:
                met.mostrarArticles(llegir);
                break;
            case 2:
                System.out.println(MSG_3);
                codi = ART + sc.next();
                System.out.println(MSG_4);
                nom = sc.next();
                System.out.println(MSG_5);
                tipus = sc.next();
                System.out.println(MSG_6);
                quantitat = sc.nextInt();
                System.out.println(MSG_7);
                preu = sc.nextDouble();
                met.nouArticle(llegir, escriure, codi, nom, tipus, quantitat, preu);
                break;
            case 3:
                met.cantitatArticles(llegir);
                break;
            case 4:
                System.out.println(FI);
                break;
        }

    }
}
