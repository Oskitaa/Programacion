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

        /*Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los
        14 partidos y el pleno al quince (15 filas).*/
        int numquiniela;
        String apuesta;
        for (int i = 1; i < 16; i++) {

            numquiniela = (int) (Math.random() * 3);

            switch (numquiniela) {

                case 0:
                    apuesta = "X";
                    break;
                default:
                    apuesta = String.valueOf(numquiniela);

            }
            System.out.println(i+". Apuesta "+i+" ");
            

        }

    }

    public void ejercicio8() {
        
    }

    public void ejercicio9() {
    }

    public void ejercicio10() {
    }

    public void ejercicio11() {
    }

    public void ejercicio12() {
    }

    public void ejercicio13() {
    }

    public void ejercicio14() {
    }

}
