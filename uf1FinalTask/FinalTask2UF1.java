
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
public class FinalTask2UF1 {

    //declaro constantes
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
    private final static int MINRD = 0;
    private final static int MAXRD = 1;
    private final static int ENDCOUNT = 3;
    private final static String MSG_1 = "id: ";
    private final static String MSG_2 = "edat: ";
    private final static String MSG_3 = "venda lliure (0)\n" + "pensionista (1)\n"
            + "carnet jove (2)\n" + "soci (3)";
    private final static String MSG_4 = "cost: ";
    private final static String MSG_5 = "telèfon: ";
    private final static String MSG_6 = "Vols consultar per tipus de client?"
            + "(si: 1/ no:0)";
    private final static String MSG_7 = "Quin tipus de client?";
    private final static String MSG_8 = "Vols veure un resum estadístic de les dades? (si: 1/ no:0) ";
    private final static String NCLI = "número de clients introduïts: ";
    private final static String MED = "Mitjana d’edat:";
    private final static String NCT = "Número de clients per tipus:";
    private final static String ITA = "Import total acumulat: ";
    private final static String VL = "venda lliure";
    private final static String PE = "pensionista";
    private final static String CJ = "carnet jove";
    private final static String SO = "soci";
    private final static String ER = "error en dades!";
    private final static String ERF = "Programa finalitzat per error en dades";

    public static void main(String[] args) {
        //declaro variables y metodos
        boolean isInteger = false;
        int tipC = 0, ifC = 0, count = 0, resumen = 0,
                clients = 0, rda = 0, aux = 0,
                total = 0, venda = 0, pensionista = 0, jove = 0, soci = 0;
        float avgAg = 0f;
        Scanner sc = new Scanner(System.in);
        //para saber cuantos clientes quiere añadir el usuario
        System.out.println("quants clients vols introduir? ");
        isInteger = sc.hasNextInt();
        if (isInteger) { //valida valor entero
            clients = sc.nextInt();
        } else {
            System.out.println(ER);
            sc.next();
        }
        //declaro arrays 
        boolean[] histogram = new boolean[clients];
        int[] id = new int[clients];
        int[] edat = new int[clients];
        int[] tipusVenda = new int[clients];
        int[] cost = new int[clients];
        int[] telefon = new int[clients];
        String[] tipuseVendaStr = new String[clients];

        for (int i = 0; i < clients; i++) { //bucle para añadir tantos clientes como se desee
            do {
                System.out.println(MSG_1);

                isInteger = sc.hasNextInt();
                if (isInteger) { // valida valor entero
                    id[i] = sc.nextInt();
                    if (id[i] < MINID || id[i] > MAXID) {
                        System.out.println(ER);//mensaje de error por valor equivocado
                        count++; //augmenta el error en caso de equivocacion
                    }

                } else {
                    System.out.println(ER); //mensaje de error por valor equivocado
                    sc.next();

                }

            } while ((!isInteger || id[i] < MINID || id[i] > MAXID) && count < ENDCOUNT); //condicion de repeticion

            if (count < ENDCOUNT) { // condicion para reiniciar contador
                count = 0;
                do {
                    System.out.println(MSG_2);
                    isInteger = sc.hasNextInt();
                    if (isInteger) { //valida valor entero
                        edat[i] = sc.nextInt();
                        if (edat[i] < MINED || edat[i] > MAXED) {
                            System.out.println(ER);//mensaje de error por valor equivocado
                            count++; //augmenta el error en caso de equivocacion
                        }
                    } else {
                        System.out.println(ER);//mensaje de error por valor equivocado
                        sc.next();
                    }
                } while ((!isInteger || edat[i] < MINED || edat[i] > MAXED) && count < ENDCOUNT); //condicion de repeticion
            }
            if (count < ENDCOUNT) {  // condicion para reiniciar contador
                count = 0;
                do {
                    System.out.println(MSG_3);
                    isInteger = sc.hasNextInt();
                    if (isInteger) {//valida valor entero
                        tipusVenda[i] = sc.nextInt();
                        if (tipusVenda[i] < MINTI || tipusVenda[i] > MAXTI) {
                            System.out.println(ER);//mensaje de error por valor equivocado
                            count++;//augmenta el error en caso de equivocacion
                        }
                        switch (tipusVenda[i]) {
                            case 0:
                                tipuseVendaStr[i] = "venda lliure";
                                break;
                            case 1:
                                tipuseVendaStr[i] = "pensionista";
                                break;
                            case 2:
                                tipuseVendaStr[i] = "carnet jove";
                                break;
                            case 3:
                                tipuseVendaStr[i] = "soci";
                                break;
                        }

                    } else {
                        System.out.println(ER);//mensaje de error por valor equivocado
                        sc.next();
                    }

                } while ((!isInteger || tipusVenda[i] < MINTI || tipusVenda[i] > MAXTI) && count < ENDCOUNT);//condicion de repeticion
            }

            if (count < ENDCOUNT) { // condicion para reiniciar contador
                count = 0;
                do {
                    System.out.println(MSG_4);
                    isInteger = sc.hasNextInt();
                    if (isInteger) {//valida valor entero
                        cost[i] = sc.nextInt();
                        if (cost[i] < MINCO || cost[i] > MAXCO) {
                            System.out.println(ER);//mensaje de error por valor equivocado
                            count++;//augmenta el error en caso de equivocacion
                        }
                    } else {
                        System.out.println(ER);//mensaje de error por valor equivocado
                        sc.next();
                    }
                } while ((!isInteger || cost[i] < MINCO || cost[i] > MAXCO) && count < ENDCOUNT);//condicion de repeticion
            }
            if (count < ENDCOUNT) { // condicion para reiniciar contador
                count = 0;
                do {
                    System.out.println(MSG_5);
                    isInteger = sc.hasNextInt();
                    if (isInteger) {//valida valor entero
                        telefon[i] = sc.nextInt();
                        if (telefon[i] < MINTE || telefon[i] > MAXTE) {
                            System.out.println(ER);//mensaje de error por valor equivocado
                            count++;//augmenta el error en caso de equivocacion
                        }
                    } else {
                        System.out.println(ER);//mensaje de error por valor equivocado
                        sc.next();
                    }
                } while ((!isInteger || telefon[i] < MINTE || telefon[i] > MAXTE) && count < ENDCOUNT);//condicion de repeticion
            }

        }
        if (count == ENDCOUNT) {

            System.out.println(ERF);
        } else {
            do {
                System.out.println(MSG_6);
                isInteger = sc.hasNextInt();
                if (isInteger) {//valida valor entero
                    ifC = sc.nextInt();

                } else {
                    System.out.println(ER);//mensaje de error por valor equivocado
                    sc.next();
                }

            } while (!isInteger || ifC < MINRD || ifC > MAXRD);//condicion de repeticion
            if (ifC == MAXRD) {

                do {
                    System.out.println(MSG_7 + MSG_3);
                    isInteger = sc.hasNextInt();
                    if (isInteger) {//valida valor entero
                        tipC = sc.nextInt();
                        //muestra tabla ordenada de forma descendente fijandose la edad
                        System.out.printf("%12s|%12s|%12s|%12s|%12s|%n", "id", "edat", "tipusVenda", "cost", "telefon");
                        for (int i = 0; i < clients - 1; i++) {
                            for (int j = 0; j < clients - i - 1; j++) {
                                if (edat[j + 1] < edat[j]) {
                                    aux = edat[j];
                                    edat[j] = edat[j + 1];
                                    edat[j + 1] = aux;

                                }
                            }
                        }//muestra los valores de la tabla
                        for (int i = 0; i < clients; i++) {
                            if (tipusVenda[i] == tipC) {
                                System.out.printf("%12d|%12d|%12s|%12d|%12d|%n",
                                        id[i], edat[i], tipuseVendaStr[i],
                                        cost[i], telefon[i]);
                            }
                        }
                    } else {
                        System.out.println(ER);//mensaje de error por valor equivocado
                        sc.next();
                    }

                } while (!isInteger || tipC < MINTI || tipC > MAXTI);//condicion de repeticion

            } else {
                //muestra resultado en tabla
                System.out.printf("%12s|%12s|%12s|%12s|%12s|%n", "id", "edat", "tipusVenda", "cost", "telefon");
                for (int i = 0; i < clients; i++) {
                    System.out.printf("%12d|%12d|%12s|%12d|%12d|%n", id[i], edat[i], tipuseVendaStr[i], cost[i], telefon[i]);
                }
            }

            do {
                System.out.println(MSG_8);
                isInteger = sc.hasNextInt();
                if (isInteger) {//valida valor entero
                    resumen = sc.nextInt();

                } else {
                    System.out.println(ER);//mensaje de error por valor equivocado
                    sc.next();
                }

            } while (!isInteger || resumen < MINRD || resumen > MAXRD);//condicion de repeticion
            if (resumen == MAXRD) {
                //acumula los valores repetidos 
                for (int i = 0; i < clients; i++) {
                    avgAg += edat[i];
                    total += cost[i];
                    switch (tipusVenda[i]) {
                        case 0:
                            venda++;
                            break;
                        case 1:
                            pensionista++;
                            break;
                        case 2:
                            jove++;
                            break;
                        case 3:
                            soci++;
                            break;

                    }
                }
                //resumen de datos
                System.out.println(NCLI + clients);
                System.out.println(MED + avgAg / clients + " anys");
                System.out.println(NCT);
                System.out.println("c.jove:" + jove + "\n" + "pensionista: "
                        + +pensionista + "\n" + "v.lliure: " + venda + "\n"
                        + " soci: " + soci);
                System.out.println(ITA + total + "€");
                //histograma
                for (int i = 0; i <= 3; i++) {
                    int counthis = 0;
                    for (int j = 0; j < clients; j++) {
                        if (histogram[j] == true) {
                            continue;
                        }
                        if (tipusVenda[j] == i) {
                            histogram[j] = true;
                            counthis++;
                        }

                    }
                    System.out.print(i + ":");
                    for (int k = 0; k < counthis; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");

                }
            }

        }

    }
}
