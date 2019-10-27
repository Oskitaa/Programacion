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
        String a;
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

        double numa, numb, numc, div1, div2, result;

        System.out.print("Escribir un programa que evalúe la siguiente expresión:\n"
                + "(a+7*c)/(b+2-a)+2*b");

        System.out.print("Introduce el valor de a: ");
        numa = s.nextDouble();
        System.out.print("Introduce el valor de b: ");
        numb = s.nextDouble();
        System.out.print("Introduce el valor de c: ");
        numc = s.nextDouble();

        div1 = (numa + 7 * numc);
        div2 = (numb + 2 - numa) + 2 * numb;

        if (div2 > 0) {
            result = div1 / div2;

            System.out.println("El resultado es: " + result);
        } else {
            System.out.println("No se puede dividir entre 0");
        }

    }

    public void ejercicio13() {
    }

    public void ejercicio14() {

        System.out.println("- Escribir un programa que solicite la longitud y anchura de una habitación y a continuación muestre su superficie. Comprueba que ninguno de los valores introducidos es 0 o menor que 0.");

        double longitud,
                anchura,
                result;

        System.out.print("Introduce la longitud: ");
        longitud = s.nextDouble();

        System.out.print("Introduce la anchura: ");
        anchura = s.nextDouble();

        if (longitud > 0 && anchura > 0) {
            result = longitud * anchura;
            System.out.println("La superficie total es: " + result + " metros2.");
        } else {
            System.out.println("Prueba otros numeros");
        }

    }

    public void ejercicio15() {
        System.out.println("- Escribir un programa que calcule la longitud y el área de una circunferencia teniendo en cuenta que los datos introducidos sean válidos:");
        double radio, longitud, area;

        System.out.print("Introduce el radio");
        radio = s.nextDouble();

        if (radio > 0) {
            longitud = 2 * (Math.PI * radio);
            area = Math.PI * Math.pow(radio, 2);

            System.out.println("La longitud es " + longitud);
            System.out.println("El area es " + area);
        } else {
            System.out.println("Prueba otros numeros");
        }
    }

    public void ejercicio16() {

        System.out.println("Escribe un programa que calcule la superficie y el volumen de una esfera cuyo radio se lea del teclado (superficie = 4*π*radio2 , volumen = 4/3*π*radio3 ).");

        double radio, area, volume;

        System.out.print("Introduce el radio: ");
        radio = s.nextDouble();

        if (radio > 0) {
            area = 4 * Math.PI * Math.pow(radio, 2);
            volume = 4 / 3 * Math.PI * Math.pow(radio, 3);

            System.out.println("El area es: " + area);
            System.out.println("El volumen es: " + volume);
        } else {
            System.out.println("Prueba otros numeros");
        }

    }

    public void ejercicio17() {
        System.out.println("Escribir un programa que calcule el volumen de una esfera:");

        double radio, result;

        System.out.println("Introduce el radio:");
        radio = s.nextDouble();

        if (radio > 0) {
            result = 4 / 3 * Math.PI * Math.pow(radio, 3);
            System.out.println("El volumen es: " + result);
        } else {
            System.out.println("Prueba otros numeros");
        }

    }

    public void ejercicio18() {
        System.out.println("Escribe un programa para calcular el salario neto de un trabajador en función del número\n"
                + "de horas trabajadas, precio de la hora de trabajo y considerando unos descuentos fijos al\n"
                + "sueldo en concepto de impuestos de un 20%:");

        double sbruto, sneto, preciohora;
        int horas;

        System.out.print("Horas trabajadas: ");
        horas = s.nextInt();
        System.out.print("Precio por hora: ");
        preciohora = s.nextDouble();

        if (horas > 0 && preciohora > 0) {
            sbruto = horas * preciohora;
            sneto = sbruto * 0.80;
            System.out.println("El salario bruto es " + sbruto);
            System.out.println("El salario neto es: " + sneto);
        } else {
            System.out.println("Prueba otros numeros");
        }

    }

    public void ejercicio19() {
        System.out.println("Escribir un programa que lea los valores de los catetos de un triángulo rectángulo y calcule\n"
                + "cuál es la hipotenusa, el área y el perímetro del triángulo mediante las siguientes expresiones:");

        double cat1, cat2, area, hipotenusa, perimetro;

        System.out.print("Cateto 1: ");
        cat1 = s.nextDouble();

        System.out.print("Cateto 2: ");
        cat2 = s.nextDouble();

        area = (cat1 * cat2) / 2;
        hipotenusa = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
        perimetro = hipotenusa + cat1 + cat2;

        System.out.println("El area es: " + area);
        System.out.println("La hipotenusa es: " + hipotenusa);
        System.out.println("El perimetro es: " + perimetro);

    }

    public void ejercicio20() {
        System.out.println("- Escribir un programa que lea desde teclado el importe bruto de una factura y determine el\n"
                + "importe neto según los siguientes criterios.");

        double precio, descuento;

        System.out.print("Importe fra.:");
        precio = s.nextDouble();

        if (precio > 20000) {
            descuento = 1.21 * (0.85 * precio);

            System.out.println("El total con desceunto es: " + descuento);
        } else {
            precio = precio * 1.21;
            System.out.println("El total de la factura es: " + precio);
        }

    }

    public void ejercicio21() {
    }

    public void ejercicio22() {

        double peso, altura, result;

        System.out.println("Calculadora de IMC ");

        System.out.print("Introduce tu altura: ");
        altura = s.nextDouble();

        System.out.print("Introduce tu peso: ");
        peso = s.nextDouble();

        if (peso > 0 && altura > 0) {
            result = peso / Math.pow(altura, 2);

            if (result < 16) {
                System.out.println("Criterio de ingreso en hospital");
            } else if (result >= 16 && result < 17) {
                System.out.println("Infrapeso");
            } else if (result >= 17 && result < 18) {
                System.out.println("Peso bajo");
            } else if (result >= 18 && result < 25) {
                System.out.println("Peso normal(Saludable)");
            } else if (result >= 25 && result < 30) {
                System.out.println("Sobrepeso (Obesidad de grado I)");
            } else if (result >= 30 && result < 35) {
                System.out.println("Sobrepeso Crónico(Obesidad de grado II)");
            } else if (result >= 35 && result < 40) {
                System.out.println("Obesidad Premorbida (Obesidad de grado III)");
            } else if (result > 40) {
                System.out.println("Obesidad Morbida(Obesidad de grado IV)");
            }
        } else {
            System.out.println("Prueba otros numeros");
        }

    }

    public void ejercicio23() {
    }

    public void ejercicio24() {
    }

    public void ejercicio25() {
        System.out.println("Escribir un programa que realice un bucle con Para (for) y muestre en pantalla del 1 al 10.\n"
                + "Repítelo mostrando lo números en orden inverso.");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

    }

    public void ejercicio26() {
        System.out.println("Escribir un programa que realice un bucle con Mientras (While) y muestre en pantalla del 1\n"
                + "al 10. Repítelo mostrando lo números en orden inverso");

        int i1 = 1, i2 = 10;
        while (i1 <= 10) {
            System.out.print(i1 + " ");
            i1++;
        }

        System.out.println();

        while (i2 >= 1) {
            System.out.print(i2 + " ");
            i2--;
        }
    }

    public void ejercicio27() {
        System.out.println("Escribir un programa que realice un bucle con Hasta (do..while) y muestre en pantalla del 1\n"
                + "al 10. Repítelo mostrando lo números en orden inverso.");

        int i1 = 1;
        int i2 = 10;

        do {
            System.out.print(i1 + " ");
            i1++;
        } while (i1 <= 10);

        System.out.println();

        do {
            System.out.print(i2 + " ");
            i2--;
        } while (i2 >= 1);

    }

    public void ejercicio28() {
        System.out.println("Escribir un programa que visualice en pantalla los números múltiplos de 5 comprendidos\n"
                + "entre 1 y 100");
        for (int i = 5; i <= 100; i += 5) {
            System.out.println(i);
        }

    }

    public void ejercicio29() {
        System.out.println("Escribir un programa que sume los números comprendidos entre 1 y 10.");

        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result += i;
        }

        System.out.println("Resultado: " + result);
    }

    public void ejercicio30() {
        System.out.println("Escribir un programa que realice la pregunta ¿Desea continuar S/N? y que no deje de\n"
                + "hacerla hasta que el usuario teclee N");
        String resp = "";

        do {
            System.out.print("¿Desea continuar S/N?: ");
            resp = s.nextLine();

        } while (!"N".equalsIgnoreCase(resp));

    }

    public void ejercicio31() {
        System.out.println("Modificar el ejercicio 10 de condicionales, de forma que si se teclea un cero, se vuelva a\n"
                + "pedir el número por teclado (así hasta que se teclee un número mayor que cero) (recuerda la\n"
                + "estructura mientras).");
        int num;
        do {

            num = s.nextInt();

            if (num == 0) {
                System.out.println("El numero no es par ni impar");
            } else if (num % 2 == 0) {
                System.out.println("El numero " + num + " es par");

            } else {
                System.out.println("El numero " + num + " es impar");
            }

        } while (num == 0);

    }

    public void ejercicio32() {
        System.out.println("Escribir un programa que escriba los números comprendidos entre 1 y 1000. El programa\n"
                + "escribirá en la pantalla los números en grupos de 20, solicitando al usuario si quiere o no\n"
                + "continuar visualizando el siguiente grupo de números");
    }

    public void ejercicio33() {
        System.out.println("Escribir un programa que calcule, independientemente, la suma y la media de los números\n"
                + "pares e impares comprendidos entre 1 y 200.");

        double numimp = 0,
                mediaimp = 0,
                numpar = 0,
                mediapares = 0;

        for (int i = 0; i <= 200; i += 2) {
            numpar += i;
            mediapares++;
        }
        for (int i = 1; i <= 200; i += 2) {
            numimp += i;
            mediaimp++;
        }

        System.out.println("Suma numeros pares es : " + numpar + " y la media es: " + (numpar / mediapares));
        System.out.println("Suma numeros imppares es : : " + numimp + " y la media es " + (numimp / mediaimp));

    }

    public void ejercicio34() {
        System.out.println("Indicar la salida por pantalla del siguiente programa:");
        int j = 1;
        for (int i = -13; i <= -10; i++) {
            j++;
        }
        System.out.println(j);

        /* Muestra al valor total de J despues del bulce, el bucle va incrementando el valor de j desde 1 hasta 5*/
    }

    public void ejercicio35() {
        System.out.println("Indicar la salida por pantalla del siguiente programa:");

        int i = 0;
        int j = 6;
        while (i < 0) {
            i++;
            j++;
        }
        System.out.println(j);

        // no hace nada ya que no entra en el bucle
    }

    public void ejercicio36() {
        System.out.println("Indicar la salida por pantalla del siguiente programa:");

        int i = 0;
        int j = 8;
        do {
            i++;
            j++;
        } while (i <= -1);

        System.out.println(j);

        //otra vez no se cumple la condicion, pero al ser un do while siempre se mete, asi que incrementa el valor de i e j en +1 y luego lo muestra por pantalla
    }

    public void ejercicio37() {
        System.out.println("Construir un programa que visualice por pantalla todos los caracteres correspondientes a\n"
                + "letras minúsculas");

        for (int i = 97; i <= 122; i++) {
            char letters = (char) i;
            System.out.print(letters + " ");
        }

    }

    public void ejercicio38() {
        System.out.println("Construir un programa que calcule el factorial de un valor numérico introducido como\n"
                + "parámetro o argumento en la línea de comandos.");

        for (int i = 1; i <= 10; i++) {
            int f = 1;
            for (int j = 2; j <= i; j++) {
                f *= j;
            }
            System.out.println("El factorial de " + i + " es: " + f);
        }
    }

    public void ejercicio39() {
        System.out.println("Construir un programa que calcule y visualice por pantalla el factorial de todos los valores\n"
                + "numéricos enteros entre 1 y 10.");
    }
}
