/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosaleatorios;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Ejercicios {

    Scanner s = new Scanner(System.in);

    public void ejercicio1() {

        int suma = 0, rannum;
        for (int i = 1; i <= 30; i++) {

            rannum = (int) (Math.random() * 6) + 1;
            suma += rannum;
            System.out.println(i + ". " + rannum);

        }
        System.out.println("La suma total de los 3 dados es " + suma);

    }

    public void ejercicio2() {

        String carta, palo = "";
        int rand;

        System.out.println("El programa mostrara una carta de un palo aleatoriamente.");

        rand = (int) (Math.random() * 4) + 1;

        switch (rand) {

            case 1:
                palo = "picas";
                break;
            case 2:
                palo = "corazones";
                break;
            case 3:
                palo = "diamantes";
                break;
            case 4:
                palo = "treboles";
                break;

        }

        rand = (int) (Math.random() * 13) + 1;

        switch (rand) {

            case 1:
                carta = "As";
                break;
            case 11:
                carta = "Sota";
                break;
            case 12:
                carta = "Caballo";
                break;
            case 13:
                carta = "Rey";
                break;
            default:
                carta = String.valueOf(rand);

        }

        System.out.println("Ha salido un " + carta + " de " + palo);

    }

    public void ejercicio3() {

        String carta, palo = "";
        int rand;

        System.out.println("El programa mostrara una carta de un palo aleatoriamente.");

        rand = (int) (Math.random() * 4) + 1;

        switch (rand) {

            case 1:
                palo = "espadas";
                break;
            case 2:
                palo = "oros";
                break;
            case 3:
                palo = "bastos";
                break;
            case 4:
                palo = "copas";
                break;

        }

        rand = (int) (Math.random() * 10) + 1;

        switch (rand) {

            case 1:
                carta = "As";
                break;
            case 8:
                carta = "Sota";
                break;
            case 9:
                carta = "Caballo";
                break;
            case 10:
                carta = "Rey";
                break;
            default:
                carta = String.valueOf(rand);

        }

        System.out.println("Ha salido un " + carta + " de " + palo);
    }

    public void ejercicio4() {

        System.out.println("Muestra 20 numeros aleatorios entre 0 y 10");

        for (int i = 0; i < 20; i++) {
            System.out.print((int) (Math.random() * 11) + " ");
        }

    }

    public void ejercicio5() {
        int nummax = 0,
                nummin = 0,
                numrandom,
                media = 0,
                result;

        System.out.println("Muestra 50 numeros aleatorios entre 100 y 199, el num max, el num min y la media.");
        for (int i = 1; i <= 50; i++) {
            numrandom = (int) (Math.random() * 100) + 100;
            System.out.print(numrandom + " ");

            if (numrandom >= nummax) {
                nummax = numrandom;
            }
            if (numrandom <= nummin) {
                nummin = numrandom;
            }
            media += numrandom;

        }
        result = media / 50;
        System.out.println("El numero maximo " + nummax + ", el minimo " + nummin + " y la media es " + result);
    }

    public void ejercicio6() {

        int secretnum = (int) (Math.random() * 101);
        for (int i = 4; i >= 0; i--) {

            System.out.println("Introduzca la combinacion correcta de 0 a 100. ");

            int combi = s.nextInt();

            if (secretnum == combi) {

                System.out.println("Enhorabuena has acertado");
                i -= 5;

            } else if (secretnum < combi) {
                System.out.println("El numero que has introducido es mayor y te quedan " + i + " intentos");
            } else if (secretnum > combi) {
                System.out.println("El numero que has introducido es menor y te quedan " + i + " intentos");
            }

        }

    }

    public void ejercicio7() {

        int numquiniela,
                columnas = 3;
        String apuesta = "";

        for (int i = 1; i < 16; i++) {
            System.out.printf("%4d. |", i);
            if (i == 15) {
                columnas = 1;

            }

            for (int j = 1; j <= columnas; j++) {

                numquiniela = (int) (Math.random() * 3);

                switch (numquiniela) {

                    case 0:
                        System.out.print("   | X |    || ");
                        break;
                    case 1:
                        System.out.print(" 1 |   |    || ");
                        break;
                    case 2:
                        System.out.print("   |   | 2  || ");
                        break;
                }

            }
            System.out.println("");
        }

    }

    public void ejercicio8() {

        int numquiniela,
                columnas = 3;
        String apuesta = "";

        for (int i = 1; i < 16; i++) {
            System.out.printf("%4d. |", i);
            if (i == 15) {
                columnas = 1;

            }

            for (int j = 1; j <= columnas; j++) {

                numquiniela = (int) (Math.random() * 6);

                switch (numquiniela) {

                    case 0:
                        System.out.print("   | X |    || ");
                        break;
                    case 1:
                    case 2:
                    case 3:
                        System.out.print(" 1 |   |    || ");
                        break;
                    case 4:
                    case 5:
                        System.out.print("   |   | 2  || ");
                        break;
                }

            }
            System.out.println("");
        }

    }

    public void ejercicio9() {
        int numram, contador = 0;

        do {
            numram = (int) (Math.random() * 51) * 2;
            System.out.println(numram);
            contador++;
        } while (numram != 24);
        System.out.println("Hasta que ha salido el 24, han pasado " + contador);
    }

    public void ejercicio10() {

        String carac = "";
        int lineas, numcarac;

        for (int i = 0; i < 10; i++) {

            lineas = (int) (Math.random() * 6);
            numcarac = (int) (Math.random() * 40 + 1);
            switch (lineas) {
                case 0:
                    carac = "*";
                    break;
                case 1:
                    carac = "-";
                    break;
                case 2:
                    carac = "=";
                    break;
                case 3:
                    carac = ".";
                    break;
                case 4:
                    carac = "|";
                    break;
                case 5:
                    carac = "@";
                    break;

            }
            for (int j = 0; j < numcarac; j++) {
                System.out.print(carac);
            }

            System.out.println();
        }
    }

    public void ejercicio11() {

        int nota,
                suspensos = 0,
                suficientes = 0,
                bienes = 0,
                notables = 0,
                sobresalientes = 0;

        for (int i = 0; i < 20; i++) {

            nota = (int) (Math.random() * 5);

            switch (nota) {
                case 0:
                    System.out.println("suspenso ");
                    suspensos++;
                    break;
                case 1:
                    System.out.println("suficiente ");
                    suficientes++;
                    break;
                case 2:
                    System.out.println("bien ");
                    bienes++;
                    break;
                case 3:
                    System.out.println("notable ");
                    notables++;
                    break;
                case 4:
                    System.out.println("sobresaliente ");
                    sobresalientes++;
                    break;
                default:
            }

        }

        System.out.println("Suspensos totales: " + suspensos);
        System.out.println("Suficientes totales: " + suficientes);
        System.out.println("Bienes totales: " + bienes);
        System.out.println("Notables totales: " + notables);
        System.out.println("Sobresalientes totales: " + sobresalientes);

    }

    public void ejercicio12() {

        int linea = 0;

        for (int i = 0; i < 8000; i++) {
            System.out.print((char) (Math.random() * (126 - 32 + 1) + 32));

            if (linea++ == 60) {
                linea = 0;
                System.out.println();
            }
        }
    }

    public void ejercicio13() {

        int dado1 = 0,
                dado2 = 0;

        do {
            dado1 = (int) (Math.random() * 6 + 1);
            dado2 = (int) (Math.random() * 6 + 1);

            System.out.println("Dado1 ha sacado :" + dado1 + "\nDado2 ha sacado : " + dado2);
        } while (dado1 != dado2);

    }

    public void ejercicio14() {

        int intento = 5,
                numrandom,
                numpen,
                nummin = 0,
                nummax = 100;
                
        boolean correct = false;

        System.out.println("Piensa un numero y el programa intentara adivinarlo.");

        do {
            numrandom = (int) (Math.random() * (nummax - nummin) + nummin);
            System.out.println("Es este numero?" + numrandom);
            System.out.println("Inserta :\n1) Si es mayor \n2) Si es menor \n3) Correcto: ");
            numpen = s.nextInt();

            intento--;

            if (intento > 0) {
                switch (numpen) {
                    case 1:
                        nummin = numrandom + 1;
                        break;
                    case 2:
                        nummax = numrandom - 1;
                        break;
                    case 3:
                        correct = true;
                        System.out.println("Sabia que seria ese");
                        break;
                }
            }

        } while (!correct && (intento > 0));

    }

}
