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
public class Millasmetros {

    private static final double METROSMILLA = 1852;

    public static double millasAMetros(double millas) {
        return millas * METROSMILLA;
    }

    public static double millasAKilometros(double millas) {
        return millas * METROSMILLA / 1000.0;
    }

    public static void mostrarDatos() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce cuantas millas quieres pasar a metros: ");
        double millas = s.nextDouble();
        millasAMetros(millas);
        System.out.println("Ahora millas a km introduce otro nuemro");
        millas = s.nextDouble();
        millasAKilometros(millas);

    }

}
