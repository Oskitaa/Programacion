/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovariables;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author ese_b
 */
public class Ejercicios {

    public void ejercicio1() {

        int x, y;
        double resultado;
        x = 144;
        y = 999;
        System.out.println("El valor de x es " + x + " y el valor de y es " + y);
        resultado = x + y;
        System.out.println("La suma es " + resultado);
        resultado = x - y;
        System.out.println("La resta es " + resultado);
        resultado = x * y;
        System.out.println("La multiplicación es " + resultado);
        resultado = (double) x / y;
        System.out.println("La división es " + resultado);

    }

    public void ejercicio2() {

        String nombre = "Óscar Carballar Bocanegra";
        System.out.println(nombre);

    }

    public void ejercicio3() {

        String nombre, direccion;
        int telefono;
        nombre = "Óscar";
        direccion = "Calle Lobo, 19";
        telefono = 685514455;

        System.out.println("Mi nombre es " + nombre + " vivo en " + direccion + " y mi número de telefono es " + telefono);
    }

    public void ejercicio4() {
        try {

            Scanner s = new Scanner(System.in);

            double pesetas, euros, resultado;

            pesetas = 166.386; //Valor aproximado de un euro en pesetas.

            System.out.println("El programa convierte monedas de euros a pesetas.\nIntroduzca la cantidad de euros a convertir.");
            euros = s.nextDouble();
            resultado = euros * pesetas;
            System.out.println(euros + " euros son " + resultado + " pesetas");
        } catch (InputMismatchException e) {
            System.out.println("Solo debe introducir número. \nEjemplo 100 o 13,39");
        }
    }

    public void ejercicio5() {

        try {
            Scanner s = new Scanner(System.in);

            double pesetas, euros, resultado;

            euros = 0.006; //Valor aproximado de una peseta en euros.

            System.out.println("El programa convierte monedas de euros a pesetas.\nIntroduzca la cantidad de euros a convertir.");
            pesetas = s.nextDouble();
            resultado = pesetas * euros;
            System.out.println(pesetas + " pesetas son " + resultado + " euros");
        } catch (InputMismatchException e) {
            System.out.println("Solo debe introducir número. \nEjemplo 100 o 13,39");

        }
    }

    public void ejercicio6() {
        try {
            Scanner s = new Scanner(System.in);

            double bi, total, iva;
            iva = 1.21;

            System.out.println("A continuación introduce un base imponible para calcular el IVA correspondiente: ");
            bi = s.nextDouble();
            total = bi * iva;
            System.out.println("El total de la factura son: " + total + "€.");
        } catch (InputMismatchException e) {
            System.out.println("Solo debe introducir número. \nEjemplo 100 o 13,39");
        }

    }
}
