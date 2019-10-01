/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesrelaciontema2;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Ejercicios {

    Scanner s = new Scanner(System.in);

    public void ejercicio1() {

        System.out.println("Introduce un numero entero y el programa lo multiplicara x2: ");
        int vara, result;
        vara = s.nextInt();
        result = vara * 2;
        System.out.println("El numero multiplicado x2 es " + result);

    }

    public void ejercicio2() {

        System.out.println("Introduce 3 numeros reales y se muestrara en la pantalla los valores y la suma de los mismos");
        double num1 = s.nextDouble(),
                num2 = s.nextDouble(),
                num3 = s.nextDouble();
        double result = num1 + num2 + num3;
        System.out.println("Tus numeros son: " + num1 + ", " + num2 + ", " + num3 + " y la suma de ellos es :" + result);

    }

    public void ejercicio3() {

        System.out.println("Introduce dos numeros y el programa los intercambiara: ");
        double numa = s.nextDouble(),
                numb = s.nextDouble(),
                aux;

        aux = numa;
        numa = numb;
        numb = aux;

        System.out.println(" Tus numeros son :" + numa + ", " + numb);
    }

    public void ejercicio4() {

        int ninos, ninas, total_alumnos;
        System.out.println("El siguiente programa te muestra el porcentaje de niños y niñas que hay en una clase: ");
        System.out.println("Cantidad de niños: ");
        ninos = s.nextInt();
        System.out.println("Cantidad de niñas");
        ninas = s.nextInt();
        double porcentaje;
        total_alumnos = ninos + ninas;
        porcentaje = (ninas * 100) / total_alumnos;
        System.out.println("Hay " + (100 - porcentaje) + "% niños");
        System.out.println("Hay " + porcentaje + "% ninñas");

    }

    public void ejercicio5() {

        double radio, volumen, area;
        System.out.println("introduce el radio de una esfera para calcular su area y su volumen.");
        radio = s.nextDouble();
        area = 4 * Math.PI * Math.pow(radio, 2);
        volumen = (4 * Math.PI * Math.pow(radio, 3)) / 3;
        System.out.println("El area de tu esfera es: " + area
                + "\ty el volumen es " + volumen);
    }

    public void ejercicio6() {

        double peso, altura, imc;

        System.out.println("Introduce su peso:");
        peso = s.nextDouble();
        System.out.println("Introduce su altura (en metros: ejem: 1,8) ");
        altura = s.nextDouble();
        imc = peso / Math.pow(altura, 2);
        System.out.println("Su IMC es " + imc);

    }

    public void ejercicio7() {

        /*Construir un programa que, dado un número total de horas, devuelve el número de
        semanas, días y horas equivalentes. Por ejemplo, dado un total de 1000 horas debe mostrar
        5 semanas, 6 días y 16 horas    */
        int semanas, dias, horas, horas_pido;

        System.out.println("El siguiente programa devuelve el numero de semanas , dias y horas que tienen X horas.");
        System.out.println("Introduzca el numero de horas: ");
        horas_pido = s.nextInt();

        semanas = horas_pido / 168;
        dias = (horas_pido % 168) / 24;
        horas = horas_pido % 24;
        System.out.println(horas_pido + " horas son " + semanas + " semanas " + dias + " dias " + horas + " horas.");
    }

}
