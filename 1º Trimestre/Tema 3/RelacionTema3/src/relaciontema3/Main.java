/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciontema3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ejercicios ej = new Ejercicios();
        int menu;
        System.out.println("Este mensaje solo se mostrará una vez:\n0.Salir. \n1-39.Actividades");
        try {
            do {
                System.out.println("Elija una opción:");

                menu = s.nextInt();
                switch (menu) {
                    case 0:
                        break;
                    case 1:
                        ej.ejercicio1();
                        break;
                    case 2:
                        ej.ejercicio2();
                        break;
                    case 3:
                        ej.ejercicio3();
                        break;
                    case 4:
                        ej.ejercicio4();
                        break;
                    case 5:
                        ej.ejercicio5();
                        break;
                    case 6:
                        ej.ejercicio6();
                        break;
                    case 7:
                        ej.ejercicio7();
                        break;
                    case 8:
                        ej.ejercicio8();
                        break;
                    case 9:
                        ej.ejercicio9();
                        break;
                    case 10:
                        ej.ejercicio10();
                        break;
                    case 11:
                        ej.ejercicio11();
                        break;
                    case 12:
                        ej.ejercicio12();
                        break;
                    case 13:
                        ej.ejercicio13();
                        break;
                    case 14:
                        ej.ejercicio14();
                        break;
                    case 15:
                        ej.ejercicio15();
                        break;
                    case 16:
                        ej.ejercicio16();
                        break;
                    case 17:
                        ej.ejercicio17();
                        break;
                    case 18:
                        ej.ejercicio18();
                        break;
                    case 19:
                        ej.ejercicio19();
                        break;
                    case 20:
                        ej.ejercicio20();
                        break;
                    case 21:
                        ej.ejercicio21();
                        break;
                    case 22:
                        ej.ejercicio22();
                        break;
                    case 23:
                        ej.ejercicio23();
                        break;
                    case 24:
                        ej.ejercicio24();
                        break;
                    case 25:
                        ej.ejercicio25();
                        break;
                    case 26:
                        ej.ejercicio26();
                        break;
                    case 27:
                        ej.ejercicio27();
                        break;
                    case 28:
                        ej.ejercicio28();
                        break;
                    case 29:
                        ej.ejercicio29();
                        break;
                    case 30:
                        ej.ejercicio30();
                        break;
                    case 31:
                        ej.ejercicio31();
                        break;
                    case 32:
                        ej.ejercicio32();
                        break;
                    case 33:
                        ej.ejercicio33();
                        break;
                    case 34:
                        ej.ejercicio34();
                        break;
                    case 35:
                        ej.ejercicio35();
                        break;
                    case 36:
                        ej.ejercicio36();
                        break;
                    case 37:
                        ej.ejercicio37();
                        break;
                    case 38:
                        ej.ejercicio38();
                        break;
                    case 39:
                        ej.ejercicio39();
                        break;

                    default:
                        System.out.println("Pruebe con un numero entre 0 y 39");
                }

            } while (menu != 0);
        } catch (InputMismatchException e) {
            System.out.println("Introduce solo numeros.");
            s.next();
        }
    }

}
