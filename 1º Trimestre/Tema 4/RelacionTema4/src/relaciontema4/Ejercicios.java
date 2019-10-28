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
        
        result = (int) Math.pow(digito1, 3) + (int) Math.pow(digito2, 3) + (int) Math.pow(digito3, 3);

        if (result == numpedido) {

            System.out.println("Enhorabuena, es un numero Amstrong");

        } else {
            System.out.println("No es un numero Amstrong");
        }

    }

    public void ejercicio4() {
    }

    public void ejercicio5() {
    }

    public void ejercicio6() {
    }

    public void ejercicio7() {
    }

    public void ejercicio8() {
    }

}
