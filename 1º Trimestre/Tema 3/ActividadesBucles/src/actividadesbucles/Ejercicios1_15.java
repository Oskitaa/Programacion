package actividadesbucles;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ese_b
 */
public class Ejercicios1_15 {

    Scanner s = new Scanner(System.in);

    public void ejercicio1() {
        System.out.println("Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.");
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }

        }

    }

    public void ejercicio2() {
        System.out.println("Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.");
        int i = 0;
        while (i <= 100) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }

    public void ejercicio3() {
        System.out.println("Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.");
        int i = 0;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;

        } while (i <= 100);

    }

    public void ejercicio4() {
        System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un\n"
                + "bucle for.");

        for (int i = 320; i >= 160; i -= 20) {

            System.out.println(i);
        }

    }

    public void ejercicio5() {
        System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un\n"
                + "bucle while");

        int i = 320;

        while (i >= 160) {
            System.out.println(i);
            i -= 20;
        }

    }

    public void ejercicio6() {
        System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.");

        int i = 320;

        do {
            System.out.println(i);
            i -= 20;
        } while (i >= 160);
    }

    public void ejercicio7() {
        System.out.println("Realiza el control de acceso a una caja fuerte. La combinación será un número de 4\n"
                + "cifras. El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos\n"
                + "mostrará el mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá\n"
                + "“La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para\n"
                + "abrir la caja fuerte.");
        int num_secret;
        for (int i = 0; i <= 4; i++) {

            System.out.println("Introduce la clave de 4 digitos para abrir la caja.");
            num_secret = s.nextInt();

            if (num_secret == 1234) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                i += 4;
            } else {

                System.out.println("Lo siento, esa no es la combinación");
                i++;
            }

        }

    }

    public void ejercicio8() {
        System.out.println("Muestra la tabla de multiplicar de un número introducido por teclado.");

        int i;

        System.out.println("Introduce un numero para la tabla de multilicar");
        i = s.nextInt();
        for (int j = 0; j <= 10; j++) {

            System.out.println(i + "x" + j + "=" + (i * j));
        }

    }

    public void ejercicio9() {

        System.out.println("Realiza un programa que nos diga cuántos dígitos tiene un número introducido por\n"
                + "teclado.\nIntroduce un numero: ");
        int digi_total = 0,
                i = s.nextInt();

        while (i > 0) {
            i /= 10;
            digi_total++;
        }
        System.out.println("Tu numero tiene " + digi_total);

    }

    public void ejercicio10() {
        System.out.println("Escribe un programa que calcule la media de un conjunto de números positivos\n"
                + "introducidos por teclado. A priori, el programa no sabe cuántos números se\n"
                + "introducirán. El usuario indicará que ha terminado de introducir los datos cuando meta\n"
                + "un número negativo.");

        int contador = -1, num = 0, sum = 0, media;

        System.out.println("introduce numeros y calculara la media, pon un negativo para salir");

        do {

            sum += num;
            contador++;
            num = s.nextInt();

        } while (num > 0);

        media = sum / contador;

        System.out.println("La media es " + media);
    }

    public void ejercicio11() {
        System.out.println("Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5\n"
                + "primeros números enteros a partir de uno que se introduce por teclado.");
        int cuadrado, cubo, num = s.nextInt();

        for (int i = 0; i < 5; i++) {
            num++;
            cuadrado = (int) Math.pow(num, 2);
            cubo = (int) Math.pow(num, 3);
            System.out.println(num + " " + cuadrado + " " + cubo);

        }
    }

    public void ejercicio12() {
        System.out.println("Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El\n"
                + "primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula\n"
                + "sumando los dos anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5,\n"
                + "8, 13, 21, 34, 55, 89, 144… El número n se debe introducir por teclado.");

        int sum = 0, sum2 = 1, aux, num = s.nextInt();

        for (int i = 1; i <= num; i++) {
      if (i == 1) {
        System.out.print(sum + ", ");
      } else if (i == 2) {
        System.out.print(sum2 + ", ");
      } else {
        System.out.print((sum + sum2) + ", ");
        aux = sum2;
        sum2 += sum;
        sum = aux;
      }
      }
    }

    public void ejercicio13() {

        int base, poten, result;

        System.out.println("Escribe un programa que pida una base y un exponente (entero positivo) y que calcule\n"
                + "la potencia.");

        System.out.println("introduce la base: ");
        base = s.nextInt();
        result = base;
        System.out.println("Introduce la potencia: ");
        poten = s.nextInt();

        for (int i = 1; i < poten; i++) {

            result = result * base;
        }
        System.out.println("La potencia de "+base+"^"+poten+" = "+result);
    }

    public void ejercicio14() {

        int num, cont_pos = 0, cont_neg = 0;

        System.out.println("Introcue 10 numeros, el programa dira cuantos son negativos y cuantos posivivos");

        for (int i = 0; i < 10; i++) {
            num = s.nextInt();
            if (num > 0) {
                cont_pos++;
            }
            if (num < 0) {
                cont_neg++;

            }
            if (num == 0) {
                System.out.println("0 no es negativo ni positivo");
            }
        }

        System.out.println("Hay " + cont_pos + " positivos y " + cont_neg + " negativos");
    }

    public void ejercicio15() {
        
        
    }

}
