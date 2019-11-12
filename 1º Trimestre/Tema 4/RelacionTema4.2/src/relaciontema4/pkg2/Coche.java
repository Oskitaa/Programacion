/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciontema4.pkg2;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Coche {

    private int velocidad;

    Coche() {
        velocidad = 0;
    }

    public void acelera(int mas) {
        velocidad += mas;
    }

    public void frena(int menos) {
        velocidad -= menos;

        if (velocidad < menos) {
            System.out.println("Frenando...");
            System.out.println("Ahora vas a " + -1 * (getVelocidad()) + " km/h marcha atra");

        }

    }

    public int getVelocidad() {
        return velocidad;
    }

    ;
    
    public void pedirDatos() {

        Scanner s = new Scanner(System.in);

        int opc = 0;

        do {
            System.out.println("Seleccione una opcion: ");
            System.out.println("1.Velocidad actual. \n2.Acelerar. \n3.Frenar");
            opc = s.nextInt();

            switch (opc) {

                case 1:
                    if (getVelocidad() == 0) {
                        System.out.println("El coche esta parado.");

                    } else if (getVelocidad() < 0) {
                        System.out.println("El coche esta yendo marcha atras a " + getVelocidad() + " Km/h");
                    } else {
                        System.out.println("La velocidad actual es " + getVelocidad() + " Km/h");
                    }

                    break;
                case 2:
                    System.out.println("Introduce la velocidad: ");
                    int mas = s.nextInt();
                    acelera(mas);
                    break;
                case 3:
                    System.out.println("Introduce la velocidad: ");
                    int menos = s.nextInt();
                    frena(menos);
                    break;
                default:
                    System.out.println("Introduce un numero entre 1 y 3");
            }

        } while (opc != 0);

    }
}
