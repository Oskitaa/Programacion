/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesbucles;

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
        Ejercicios1_15 ej1_15 = new Ejercicios1_15();
        Ejercicio16_30 ej16_30 = new Ejercicio16_30();
        int menu;
        System.out.println("Este mensaje solo se mostrará una vez:\n0.Salir. \n1-7.Actividades");
        try {
            do {
                System.out.println("Elija una opción:");

                menu = s.nextInt();
                switch (menu) {
                    case 0:
                        break;
                    case 1:
                        ej1_15.ejercicio1();
                        break;
                    case 2:
                        ej1_15.ejercicio2();
                        break;
                    case 3:
                        ej1_15.ejercicio3();
                        break;
                    case 4:
                        ej1_15.ejercicio4();
                        break;
                    case 5:
                        ej1_15.ejercicio5();
                        break;
                    case 6:
                        ej1_15.ejercicio6();
                        break;
                    case 7:
                        ej1_15.ejercicio7();
                        break;
                    case 8:
                        ej1_15.ejercicio8();
                        break;
                    case 9:
                        ej1_15.ejercicio9();
                        break;
                    case 10:
                        ej1_15.ejercicio10();
                        break;
                    case 11:
                        ej1_15.ejercicio11();
                        break;
                    case 12:
                        ej1_15.ejercicio12();
                        break;
                    case 13:
                        ej1_15.ejercicio13();
                        break;
                    case 14:
                        ej1_15.ejercicio14();
                        break;
                    case 15:
                        ej1_15.ejercicio15();
                        break;
                    case 16:
                        ej16_30.ejercicio16();
                        break;
                    case 17:
                        ej16_30.ejercicio17();
                        break;
                    case 18:
                        ej16_30.ejercicio18();
                        break;
                    case 19:
                        ej16_30.ejercicio19();
                        break;
                    case 20:
                        ej16_30.ejercicio20();
                        break;
                    case 21:
                        ej16_30.ejercicio21();
                        break;
                    case 22:
                        ej16_30.ejercicio22();
                        break;
                    case 23:
                        ej16_30.ejercicio23();
                        break;
                    case 24:
                        ej16_30.ejercicio24();
                        break;
                    case 25:
                        ej16_30.ejercicio25();
                        break;
                    case 26:
                        ej16_30.ejercicio26();
                        break;
                    case 27:
                        ej16_30.ejercicio27();
                        break;
                    case 28:
                        ej16_30.ejercicio28();
                        break;
                    case 29:
                        ej16_30.ejercicio29();
                        break;
                    case 30:
                        ej16_30.ejercicio30();
                        break;
                    default:
                        System.out.println("Pruebe con un número entre 0 y 7");
                }

            } while (menu != 0);
        } catch (InputMismatchException e) {
            System.out.println("Introduce solo números.");
            s.next();
        }
    }

}
