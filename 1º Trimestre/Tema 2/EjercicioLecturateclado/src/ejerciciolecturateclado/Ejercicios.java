/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolecturateclado;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Ejercicios {

    Scanner s = new Scanner(System.in);

    public void ejercicio1() {

        System.out.println("Introduce 2 numeros y se mostrara la multiplicacion de ellos:");
        double num1, num2, result;
        num1 = s.nextDouble();
        num2 = s.nextDouble();

        result = num1 * num2;

        System.out.println("El resultado de la multiplicacion es: " + result);

    }

    public void ejercicio2() {

        double pesetas, euros, resultado;

        pesetas = 166.386; //Valor aproximado de un euro en pesetas.

        System.out.println("El programa convierte monedas de euros a pesetas.\nIntroduzca la cantidad de euros a convertir.");
        euros = s.nextDouble();
        resultado = euros * pesetas;
        System.out.println(euros + " euros son " + resultado + " pesetas");

    }

    public void ejercicio3() {

        double pesetas, euros, resultado;

        euros = 0.006; //Valor aproximado de una peseta en euros.

        System.out.println("El programa convierte monedas de pesetas a euros.\nIntroduzca la cantidad de pesetas a convertir.");
        pesetas = s.nextDouble();
        resultado = pesetas * euros;
        System.out.println(pesetas + " pesetas son " + resultado + " euros");

    }

    public void ejercicio4() {

        double x, y, resultado;

        System.out.println("Introduzca dos numeros y el programa mostrara su suma, resta multiplicacion y division: ");

        x = s.nextDouble();
        y = s.nextDouble();
        resultado = x + y;
        System.out.println("La suma es " + resultado);
        resultado = x - y;
        System.out.println("La resta es " + resultado);
        resultado = x * y;
        System.out.println("La multiplicación es " + resultado);
        resultado = (double) x / y;
        System.out.println("La división es " + resultado);

    }

    public void ejercicio5() {

        double altura, base, area;

        System.out.println("Introduce la altura y base de un rectangulo para calcular se area:");
        System.out.println("Altura: ");
        altura = s.nextDouble();
        System.out.println("Base");
        base = s.nextDouble();
        area = base * altura;
        System.out.println("El area de este rectangulo es: " + area);

    }

    public void ejercicio6() {

        double altura, base, area;

        System.out.println("Introduce la altura y base de un triangulo para calcular se area:");
        System.out.println("Altura: ");
        altura = s.nextDouble();
        System.out.println("Base");
        base = s.nextDouble();
        area = (base * altura) / 2;
        System.out.println("El area de este triangulo es: " + area);

    }

    public void ejercicio7() {

        double base_imp, total, iva;
        iva = 1.21;

        System.out.println("A continuación introduce una base imponible para calcular el IVA correspondiente: ");
        base_imp = s.nextDouble();
        total = base_imp * iva;
        System.out.println("El total de la factura son: " + total + "€.");
    }

    public void ejercicio8() {

        int precio_hora = 12;
        double hora, total_salario;
        System.out.println("Introduce el numero de horas trabajadas para calcular el salario semanal: ");
        hora = s.nextDouble();
        total_salario = hora * precio_hora;
        System.out.println("Tu salario semanal es: " + total_salario + "€.");

    }

    public void ejercicio9() {

        double altura, radio, vol_total;

        System.out.println("Introduce la altura y el radio para calcular el volumen del cono: ");
        System.out.println("Altura: ");
        altura = s.nextDouble();
        System.out.println("Radio: ");
        radio = s.nextDouble();
        vol_total = (Math.PI * Math.pow(radio, 2) * altura) / 3;
        System.out.println("El volumen del cono es: " + vol_total);

    }

    public void ejercicio10() {

        double kilobyte, megabyte, result;
        kilobyte = 1000;
        System.out.println("Conversor de mb a kb, introduzca los mb: ");
        megabyte = s.nextDouble();
        result = megabyte * kilobyte;
        System.out.println(megabyte + " mb son " + result + " kb");

    }

    public void ejercicio11() {

        double kilobyte, megabyte, result;
        megabyte = 0.001;
        System.out.println("Conversor de mb a kb, introduzca los mb: ");
        kilobyte = s.nextDouble();
        result = megabyte * kilobyte;
        System.out.println(megabyte + " mb son " + result + " kb");

    }

}
