/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciontema4.pkg2;

/**
 *
 * @author ese_b
 */
public class Temperatura {
    //arrays donde se guardan las temperaturas que a continuacion convertiremos

    private double[] celsius = {0, 15, 20};
    private double[] farenheit = {0, 40, 70};
    private double temp;

    //metodo el cual le pasamos un parameto con el valor de la temperatura para convertir
    private double farenheitToCelsius(double fartocel) {

        temp = (fartocel - 32) / 1.8;

        return temp;
    }

    //metodo el cual le pasamos un parameto con el valor de la temperatura para convertir
    private double celsiusToFarenheit(double celtofar) {

        temp = (1.8) * celtofar + 32;

        return temp;
    }

    //metodo que usaremos en el main para imprimir los datos 
    public void mostrarDatos() {

        //bucles que recorren todo el array e imprimen la temperatura convertida
        for (int i = 0; i < farenheit.length; i++) {
            temp = farenheitToCelsius(farenheit[i]);
            System.out.println(farenheit[i] + " grados Farenheit son " + temp + " grados Celsius");
        }

        for (int i = 0; i < celsius.length; i++) {
            temp = celsiusToFarenheit(celsius[i]);
            System.out.println(celsius[i] + " grados Celsius son " + temp + " grados Farenheit.");
        }

    }
}
