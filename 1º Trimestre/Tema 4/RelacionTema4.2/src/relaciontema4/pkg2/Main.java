/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciontema4.pkg2;

/**
 *
 * @author ese_b
 */
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
        Temperatura temp = new Temperatura();
        Coche coche = new Coche();
        int menu;

        try {
            do {
                System.out.println("0.Salir. \n1-7.Actividades");
                System.out.println("Elija una opción:");

                menu = s.nextInt();
                switch (menu) {
                    case 0:
                        break;
                    case 1:
                       temp.mostrarDatos();
                        break;
                    case 2:
                        coche.mostrarDatos();
                        break;
                    /*case 3:
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
                        break;*/
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
