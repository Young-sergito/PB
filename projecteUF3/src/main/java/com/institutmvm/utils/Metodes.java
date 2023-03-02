/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.institutmvm.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author YoungSxrgioo
 */
public class Metodes {

    
    public int menuOpt(int opt, int min, int max) {
        return (opt > max) ? min : opt;
    }

    public void mostrarArticles(BufferedReader llegir) throws IOException {
        String aquestaLinea;
        try {
            while ((aquestaLinea = llegir.readLine()) != null) {
                System.out.println(aquestaLinea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (llegir != null) {
                    llegir.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void nouArticle(BufferedReader llegir, BufferedWriter escriure, String codi, String nom,
            String tipus, int quantitat, double preu) throws IOException {

        try {
            if (llegir.readLine() == null) {
                escriure.write(String.format("%12s,%12s,%12s,%12s,%12s \r\n", "codi ", " nom ", " tipus ", " quantitat ", " preu"));
            }
            escriure.write(String.format("%12s,%12s,%12s,%12d,%12f \r\n", codi, nom, tipus, quantitat, preu));
            escriure.newLine();
            escriure.close();

        } catch (IOException ex) {
            System.out.println("An error ocurred: ");
            ex.printStackTrace();
        } finally {
            System.out.println("El fitxer s'ha creat  correctament.");
        }
    }

    public void cantitatArticles(BufferedReader llegir) throws IOException {
        int lineas = -1;
        String linea;
        try {
            while ((linea = llegir.readLine()) != null) {
                if (!linea.isEmpty()) {
                    lineas++;
                }
            }
            llegir.close();
            System.out.printf("articles registrats: %d",lineas);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: ");
            e.printStackTrace();
        }
    }
}
