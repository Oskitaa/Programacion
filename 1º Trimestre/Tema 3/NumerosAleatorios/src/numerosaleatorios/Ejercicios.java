/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosaleatorios;

/**
 *
 * @author ese_b
 */
public class Ejercicios {

    public void ejercicio1() {

        int suma = 0, rannum;
        for (int i = 1; i <= 30; i++) {

            rannum = (int) (Math.random() * 6) + 1;
            suma += rannum;
            System.out.println(i + ". " + rannum);

        }
        System.out.println("La suma total de los 3 dados es " + suma);

    }

    public void ejercicio2() {

        String carta, palo ="";
        int rand;

        System.out.println("El programa mostrara una carta de un palo aleatoriamente.");

        rand = (int) (Math.random() * 4) + 1;

        switch (rand) {

            case 1:
                palo = "picas";
                break;
            case 2:
                palo = "corazones";
                break;
            case 3:
                palo = "diamantes";
                break;
            case 4:
                palo = "treboles";
                break;

        }

        rand = (int) (Math.random() * 13) + 1;

        switch (rand) {

            case 1:
                carta = "As";
                break;
                case 11:
                carta = "Sota";
                break;
                case 12:
                carta = "Caballo";
                break;
                case 13:
                carta = "Rey";
                break;
                default:
                    carta = String.valueOf(rand);
                
        }
        
        System.out.println("Ha salido un "+carta+" de "+palo);

    }

    public void ejercicio3() {
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

    public void ejercicio9() {
    }

    public void ejercicio10() {
    }

    public void ejercicio11() {
    }

    public void ejercicio12() {
    }

    public void ejercicio13() {
    }

    public void ejercicio14() {
    }

}
