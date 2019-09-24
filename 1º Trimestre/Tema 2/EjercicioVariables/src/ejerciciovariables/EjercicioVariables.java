/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovariables;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class EjercicioVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ejercicios ej = new Ejercicios();
        int menu = 0;
        System.out.println("Este mensaje solo se mostrará una vez:\n0.Salir. \n1-6.Actividades");

        do {
            try {
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

                    default:
                        System.out.println("Pruebe con un número entre 0 y 7");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce solo números.");
                s.next();
                menu = 1;
            }

        } while (menu != 0);

    }

}
