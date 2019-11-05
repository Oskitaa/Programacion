/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciontema4;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Ejercicios {

    Scanner s = new Scanner(System.in);

    public void ejercicio1() {

        System.out.println("Transforma el siguiente bucle for en un bucle while:");

        int i = 5;

        //bucle que mostrara el valor de i
        while (i < 15) {
            System.out.println(i);
            i++;

        }

    }

    public void ejercicio2() {

        System.out.println("Realiza un programa que muestre por pantalla los 5 primeros número pares");
        //bucle que muestra los primeros 5 numeros pares
        for (int i = 2; i < 11; i += 2) {
            System.out.println(i);
        }

    }

    public void ejercicio3() {
        int numpedido,
                aux,
                digito1,
                digito2,
                digito3,
                result;
        System.out.println("Realiza un método que, dado un número de tres cifras, averigüe si es un número Armstrong.");
        System.out.println("Introduce un numero: ");
        numpedido = s.nextInt();
        if (numpedido <= 999) {

            aux = numpedido;
            //nos daria el resto, que en este caso seria el ultimo digito
            digito3 = aux % 10;
            //al dividir aux entre 10, pasamos a hacer los mismo que antes para que nos de el ultimo digito
            //ejem: 125/10 = 12. 10%10 =2; 
            aux = aux / 10;
            digito2 = aux % 10;
            //volvemos a hacerlo para conseguir el primer digito
            aux = aux / 10;
            digito1 = aux % 10;
            //eleva los 3 numeros a 3 y los suma
            result = (int) Math.pow(digito1, 3) + (int) Math.pow(digito2, 3) + (int) Math.pow(digito3, 3);

            if (result == numpedido) {

                System.out.println("Enhorabuena, es un numero Amstrong");

            } else {
                System.out.println("No es un numero Amstrong");
            }
        } else {
            System.out.println("Introduce otro numero.");
        }

    }

    public void ejercicio4() {

        //inicializamos las variables, en este caso el nummax a menos infinito y nummin a mas infinito pera que asi cualquier numero quede dentro la primera vez
        double nummax = Double.NEGATIVE_INFINITY,
                nummin = Double.POSITIVE_INFINITY;
        //inicializamos array con 3 huecos para meter los numeros que pidamos al usuario
        int numeros[] = new int[3];

        System.out.println("introduce 3 numeros a continuacion, el programa dira el mayor y el menor: ");
        //pedimos 3 numeros y lo vamos guardando en las diferentes posiciones del array
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce un numero: ");
            numeros[i] = s.nextInt();
        }

        //con este for lo que hara sera recorrer todo el array completo
        for (int numero : numeros) {

//            condicional que hace que si el numero es mayor que nummax se guarda, si no sigue siendo igual, lo mismo para el nummin
//            if (numero > nummax) {
//                nummax = numero;
//            }
//
//            if (numero < nummin) {
//                nummin = numero;
//            }
            //condicional que hace que si el numero es mayor que nummax se guarda, si no sigue siendo igual, lo mismo para el nummin
            nummax = numero > nummax ? numero : nummax;
            nummin = numero < nummin ? numero : nummin;
        }

        System.out.println("El numero max es: " + nummax
                + "\n y el min es " + nummin);
    }

    public void ejercicio5() {

        System.out.println("El programa calcula tu numero lucky a traves de tu fecha de nacimiento.");
        //inicializamos las variables
        int dia, mes, anio, suma1, suma2 = 0, suma3 = 0, aux;

        System.out.println("Introduce el dia: ");
        dia = s.nextInt();
        System.out.println("Introduce el mes: ");
        mes = s.nextInt();
        System.out.println("Introduce el anio: ");
        anio = s.nextInt();
        suma1 = dia + mes + anio;
        aux = suma1;
        //reducimos asi la fecha de nacimiento a 2 digitos, cada vez que se hace el for suma la ultima cifra y luego lo divide para coger la siguiente cifra a sumar
        for (int i = 0; i < 4; i++) {
            suma2 += aux % 10;
            aux = aux / 10;
        }
        aux = suma2;
        //hacemos lo mismo que antes, asi que de 2 cifras pasamos a una que seria el lucky number
        for (int i = 0; i < 2; i++) {
            suma3 += aux % 10;
            aux = aux / 10;
        }

        System.out.println("Tu lucky number es " + suma3);

    }

    public void ejercicio6() {
        System.out.println("Introduzca un numero para convertirlo a numero romano: ");
        
        //inicializamos las variables
        String romans = "";
        int numpedido = s.nextInt();
        
        //bucle que se hace mientras sea distinto de 0, se va sumando/concatenando las diferentes letras hasta formar el numero completo en romano.
        do {
            if (numpedido >= 1000) {
                romans += "M";
                numpedido -= 1000;
            } else if (numpedido >= 900) {
                romans += "CM";
                numpedido -= 900;
            } else if (numpedido >= 500) {
                romans += "D";
                numpedido -= 500;
            } else if (numpedido >= 400) {
                romans += "CD";
                numpedido -= 400;
            } else if (numpedido >= 100) {
                romans += "C";
                numpedido -= 100;
            } else if (numpedido >= 90) {
                romans += "XC";
                numpedido -= 90;
            } else if (numpedido >= 50) {
                romans += "L";
                numpedido -= 50;
            } else if (numpedido >= 40) {
                romans += "XL";
                numpedido -= 40;
            } else if (numpedido >= 10) {
                romans += "X";
                numpedido -= 10;
            } else if (numpedido == 9) {
                romans += "IX";
                numpedido -= 9;
            } else if (numpedido >= 5) {
                romans += "V";
                numpedido -= 5;
            } else if (numpedido == 4) {
                romans += "IV";
                numpedido -= 4;
            } else if (numpedido <= 3) {
                romans += "I";
                numpedido--;
            }
        } while (numpedido != 0);

        System.out.println(romans);
    }

    public void ejercicio7() {

        System.out.println("Muestra los numeros del 0 a 100 sin mostrar los multiplos de 5");
        //bucle de 0 a 100
        for (int i = 0; i < 101; i++) {
            //condicional para que no muestre los multiplos de 5
            if (i % 5 != 0) {

                System.out.println(i);
            }
        }

    }

}
