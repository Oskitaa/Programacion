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
        System.out.println("Este mensaje solo se mostrará una vez:\n0.Salir. \n1-14.Actividades");
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
                    default:
                        System.out.println("Pruebe con un nÃºmero entre 0 y 7");
                }

            } while (menu != 0);
        } catch (InputMismatchException e) {
            System.out.println("Introduce solo nÃºmeros.");
            s.next();
        }
    }

}
