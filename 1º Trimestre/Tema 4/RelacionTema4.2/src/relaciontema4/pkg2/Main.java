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
        pajaro pajaro1 = new pajaro();
        satelite satelite1 = new satelite(0, 0, 0);
        rebajas rebajas1 = new rebajas();
        numero numero1 = new numero();
                satelite2 satelite2 = new satelite2(0, 0, 0);

        int menu;

        try {
            do {
                System.out.println("0.Salir. \n1-14.Actividades");
                System.out.println("Elija una opción:");

                menu = s.nextInt();
                switch (menu) {
                    case 0:
                        break;
                    case 1:
                        temp.mostrarDatos();
                        break;
                    case 2:
                        coche.pedirDatos();
                        break;
                    case 3:
                        pajaro1.setEdad(4);
                        pajaro1.printEdad();
                        break;
                    case 4:
                        satelite1.setPosicion(8.6, 6.7, 7.4);
                        satelite1.printPosicion();
                        break;
                    case 5:
                        rebajas1.pedirDatos();
                        break;
                    case 6:

                        finanzas finanzas1 = new finanzas();
                        System.out.println("Tasa actual " + finanzas1.getEurodolar() + "");
                        System.out.println("Desea cambiar? Si o no");
                        String respuesta = s.next();
                        if (respuesta.equalsIgnoreCase("si")) {

                            System.out.println("Introduzca un nuevo tipo de cambio: ");
                            double cambio = s.nextDouble();
                            finanzas finazas2 = new finanzas(cambio);
                            finazas2.pedirDatos();
                        } else {
                            finanzas1.pedirDatos();
                        }

                        break;
                    case 7:
                        System.out.println("introduce un numero y el prorgrama devovlera el doble, triple y cuadruple: ");
                        int num = s.nextInt();
                        minumero num1 = new minumero(num);
                        num1.mostrarDatos();
                        break;

                    case 8:
                        numero1.mostrarDatos();
                        break;

                    case 9:
                        
                        satelite2.setPosicion(10, 23, 123);
                        satelite2.enOrbita();
                        satelite2.printPosicion();
                        break;

                    case 10:
                        break;

                    case 11:
                        break;

                    case 12:
                        break;

                    case 13:
                        break;

                    case 14:
                        break;
                    default:
                        System.out.println("Pruebe con un número entre 0 y 14");
                }

            } while (menu != 0);
        } catch (InputMismatchException e) {
            System.out.println("Introduce solo números.");
            s.next();
        }
    }

}
