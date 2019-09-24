package EjercicioSalidaporpantalla;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author ese_b
 */
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Ejercicios ej = new Ejercicios();
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
