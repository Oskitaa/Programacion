/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesbucles;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Ejercicio16_30 {

    Scanner s = new Scanner(System.in);

    public void ejercicio16() {
        int numero = 0, contador = 2;
        boolean primo = true;
        numero = s.nextInt();
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) {
                primo = false;

            }
            contador++;
        }

    }

    public void ejercicio17() {

        int num, result = 0;
        System.out.println("Introduce un numero: ");
        num = s.nextInt();
        if (num >= 0) {
            for (int i = num; i <= num + 100; i++) {

                result += i;

            }
        } else {
            System.out.println("Introduce un numero correcto ");
        }

        System.out.println("El resultado es:  " + result);

    }

    public void ejercicio18() {

        int num1, num2;

        do {
            System.out.print("Introduzca un numero: ");
            num1 = s.nextInt();
            System.out.print("Introduzca un numero distinto: ");
            num2 = s.nextInt();

            if (num1 == num2) {
                System.out.println("Los números introducidos deben ser distintos.");
            }
        } while (num1 == num2);

        if (num1 > num2) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }

        for (int i = num1; i <= num2; i += 7) {
            System.out.print(i + " ");
        }
    }

    public void ejercicio19() {
    }

    public void ejercicio20() {
    }

    public void ejercicio21() {

        System.out.println("Por favor, vaya introduciendo números enteros.");

        int num_pedido,
                num_totl = 0,
                sumimp = 0,
                num_imp = 0,
                max_par = 0;

        do {
            num_pedido = s.nextInt();

            if (num_pedido >= 0) {
                num_totl++;
                if ((num_pedido % 2) == 1) {
                    sumimp += num_pedido;
                    num_imp++;
                } else {
                    if (num_pedido > max_par) {
                        max_par = num_pedido;
                    }
                }
            }
        } while (num_pedido >= 0);

        System.out.println("Ha introducido " + num_totl + " numeros");
        System.out.println("La media de los impares es " + sumimp / num_imp);
        System.out.println("El maximo par es " + max_par);
    }

    public void ejercicio22() {

        System.out.print("Numeros primos entre 2 y 100: ");

        boolean primo = true;

        for (int n = 2; n <= 100; n++) {

            primo = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.print(n + " ");
            }
        }
    }

    public void ejercicio23() {

        int num_total = 0,
                numpedi,
                numsum = 0;

        do {
            System.out.print("introduce numeros para sumar hasta 10.000: ");
            numpedi = s.nextInt();

            num_total++;
            numsum += numpedi;

        } while (numsum < 10000);

        System.out.println("Suma total:  " + numsum);
        System.out.println("Numeros introducidos:  " + num_total);
        System.out.println("Media todos los numeros:  " + numsum / num_total);
    }

    public void ejercicio24() {
    }

    public void ejercicio25() {
        System.out.print("Introduzca un numero: ");
        int numpedi = s.nextInt();

        int numero = numpedi;
        int reves = 0;

        while (numero > 0) {
            reves = (reves * 10) + (numero % 10);
            numero /= 10;
        }

        System.out.println("El numero " + numpedi + " al reves es " + reves);

    }

    public void ejercicio26() {

        System.out.print("Introduzca un numero: ");
        int numpedi = s.nextInt();
        System.out.print("Introduzca un digito: ");
        int digito = s.nextInt();

        System.out.print("El " + digito + " en las siguientes posiciones: ");

        int numero = numpedi;
        int reves = 0;
        int longitud = 0;
        int posicion = 1;

        if (numero == 0) {
            longitud = 1;
        }

        while (numero > 0) {
            reves = (reves * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        }

        while (reves > 0) {
            if ((reves % 10) == digito) {
                System.out.print(posicion + " ");
            }
            reves /= 10;
            posicion++;
        }
    }

    public void ejercicio27() {

        int num,
                cont = 0,
                sum = 0;

        System.out.print("Introduce un numero mayor que 0: ");
        num = s.nextInt();

        for (int i = 1; i < num; i++) {
            if ((i % 3) == 0) {
                System.out.print(i + " ");
                cont++;
                sum += i;
            }
        }

        System.out.println("Desde 1 hasta " + num + " hay " + cont);
        System.out.println(sum + ". Suma total de los multiplos de 3");
    }

    public void ejercicio28() {

        int numpedi;

        do {
            System.out.print("Introduzca un numero: ");
            numpedi = s.nextInt();

            if (numpedi < 0) {
                System.out.println("El numero introducido no es valido");
            }
        } while (numpedi < 0);

        int factorial = numpedi;

        if (numpedi == 0) {
            System.out.println("El factorial " + numpedi + " es 1");
        } else {
            for (int i = 1; i < numpedi; i++) {
                factorial *= i;
            }

            System.out.println(numpedi + " = " + factorial);
        }
    }

    public void ejercicio29() {

        System.out.print("Introduzca un numero grande: ");
        int numgran = s.nextInt();

        System.out.print("Introduzca un numero peuqeño: ");
        int numpeq = s.nextInt();

        System.out.print("Los numeros menores son:");

        int cuenta = 0, suma = 0;

        for (int i = 1; i < numgran; i++) {
            if ((i % numpeq) != 0) {
                System.out.println(i + " ");
            }
        }
    }

    public void ejercicio30() {
    }

}
