/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciontema3;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Ejercicios {

    Scanner s = new Scanner(System.in);

    public void ejercicio1() {

        System.out.println(".- Escribir un programa que detecte si un número introducido desde teclado es positivo o negativo");

        int num = s.nextInt();

        if (num > 0) {
            System.out.println("Es positivo");
        } else if (num < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("O no es positivo ni negativo");
        }

    }

    public void ejercicio2() {

        System.out.println("Escribir un programa que detecte si un número leído desde el teclado es mayor o menor que 100.");

        int num = s.nextInt();
        String  a;
        if (num > 100) {
            System.out.println("Es mayor que 100");
        } else if (num < 100) {
            System.out.println("Es menor que 100");

        } else {
            System.out.println("Es 100");
        }

    }

    public void ejercicio3() {

    }

    public void ejercicio4() {

        System.out.println("Algoritmo que lea dos números, calculando y escribiendo el valor de su suma, resta producto y división");

        System.out.println("Escriba el primer numero:");
        int num1 = s.nextInt();
        System.out.println("Escriba el segundo numero:");
        int num2 = s.nextInt();
        int result;
        result = num1 + num2;
        System.out.println("La suma es: " + result);
        result = num1 - num2;
        System.out.println("La resta es: " + result);
        result = num1 * num2;
        System.out.println("La multiplicacion es: " + result);
        result = num1 / num2;
        System.out.println("La division es: " + result);

    }

    public void ejercicio5() {

        System.out.println("Algoritmo que lea dos números y nos diga cuál de ellos es mayor o bien si son iguales");

        System.out.println("Escriba el primer numero:");
        int num1 = s.nextInt();
        System.out.println("Escriba el segundo numero:");
        int num2 = s.nextInt();

        if (num1 > num2) {

            System.out.println("El numero " + num1 + " es mayor");

        } else if (num1 < num2) {
            System.out.println("El numero " + num2 + " es mayor");
        } else {
            System.out.println("Son iguales");
        }

    }

    public void ejercicio6() {

        System.out.println("Algoritmo que lea tres números distintos y nos diga cuál de ellos es el mayor");

        System.out.println("Escriba el primer numero:");
        int num1 = s.nextInt();
        System.out.println("Escriba el segundo numero:");
        int num2 = s.nextInt();
        System.out.println("Escriba el tercer numero:");
        int num3 = s.nextInt();

        if (num1 > num2 && num1 > num3) {

            System.out.println("El numero " + num1 + " es mayor");

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero " + num2 + " es mayor");
        } else {
            System.out.println("El numero " + num3 + " es mayor");
        }

    }

    public void ejercicio7() {

        System.out.println("Diseñar un algoritmo que pida por teclado tres números; si el primero es negativo, debe imprimir el producto de los tres y si no lo es, imprimirá la suma.");

        System.out.println("Escriba el primer numero:");
        int num1 = s.nextInt();
        System.out.println("Escriba el segundo numero:");
        int num2 = s.nextInt();
        System.out.println("Escriba el tercer numero:");
        int num3 = s.nextInt();

        if (num1 < 0) {

            System.out.println(num1 * num2 * num3);

        } else {
            System.out.println(num1 + num2 + num3);
        }

    }

    public void ejercicio8() {
    }

    public void ejercicio9() {

        System.out.println(" Una tienda ofrece un descuento del 15% sobre el total de la compra durante el mes de octubre. "
                + "Dado un mes y un importe, calcular cuál es la cantidad que se debe cobrar al cliente.");
        System.out.println("Introduce un mes: ");
        int mes = s.nextInt();
        System.out.println("Introduce un importe: ");
        double importe = s.nextDouble();

        if (mes >= 1 && mes <= 12) {

            switch (mes) {

                case 10:
                    System.out.println("El importe total es:" + (importe * 1.15));
                    break;
                default:
                    System.out.println("El importe total es: " + importe);

            }

        } else {
            System.out.println("Mes equivocado");
        }

    }

    public void ejercicio10() {

        System.out.println("- Realizar un algoritmo que dado un número entero, visualice en pantalla si es par o impar.\n"
                + "En el caso de ser 0, debe visualizar “el número no es par ni impar” (para que un número sea\n"
                + "par, se debe dividir entre dos y que su resto sea 0)");

        int num = s.nextInt();

        if (num == 0) {
            System.out.println("El numero no es par ni impar");
        } else if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par");

        } else {
            System.out.println("El numero " + num + " es impar");
        }

    }

    public void ejercicio11() {

        System.out.println("Escribir un programa que lea dos números enteros A y B, y obtenga los valores A dividido por B y su resto.");
        System.out.println("Introduce un numero: ");
        int numa = s.nextInt();
        System.out.println("Introduce otro numero: ");
        int numb = s.nextInt();
        int result;

        result = numa / numb;
        System.out.println("La division de a entre b es: " + result);
        result = numb / numa;
        System.out.println("La division de b entre a es: " + result);
        result = numa % numb;
        System.out.println("La resto de a entre b es:" + result);
        result = numb % numa;
        System.out.println("La resto de b entre a es: " + result);
    }

    public void ejercicio12() {
    }

    public void ejercicio13() {
    }

    public void ejercicio14() {
    }

}
