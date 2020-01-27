/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackfriday;

import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class BlackFriday {

    //Atributos 
    private String tamanio;
    private String color;
    private String modelo;
    private double precio;

    //constantes de los precios iniciales de las impresoras
    static final double MULTIFUNCION_6332 = 59.90;
    static final double MULTIFUNCION_3720 = 79.90;
    static final double MULTIFUNCION_3735 = 69.90;
    static final double MULTIFUNCION_LASER = 179;

    public BlackFriday() {
        this.tamanio = "";
        this.color = "Negro";
        this.modelo = "";
        this.precio = 0;
    }

    public BlackFriday(String tamanio, String color, String modelo, double precio) {
        this.tamanio = tamanio;
        this.color = "Negro";
        this.modelo = modelo;
        this.precio = precio;
    }

    public BlackFriday(BlackFriday blafri) {
        this.tamanio = blafri.tamanio;
        this.color = blafri.color;
        this.modelo = "Negro";
        this.precio = blafri.precio;

    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double elegirImpresora(String opc) {

        switch (opc.toLowerCase()) {

            case "a":
                precio += MULTIFUNCION_6332;
                break;
            case "b":
                precio += MULTIFUNCION_3720;
                break;
            case "c":
                precio += MULTIFUNCION_3735;
                break;
            case "d":
                precio += MULTIFUNCION_LASER;
                break;
            default:
                System.out.println("Introduzca una letra entre a y d");
        }
        return precio;

    }

    public double elegirColor(String color) {
        switch (color.toLowerCase()) {

            case "blanco":
                precio += 10;
                break;
            case "azul":
                precio += 15;
                break;
            case "rosa":
                precio += 25;
                break;
            default:
                System.out.println("Introduzca un color válido, blanco, azul o rosa.");
        }
        return precio;
    }

    public void comprar() {

        Utils uts = new Utils();

        System.out.println("A continuacion elija una de nuestras impresoras: ");
        String opc = "";
        do {

            System.out.println("a) Modelo Multifunción 6332 ......................................................59.90 €\n"
                    + "b) Modelo Multifunción 3720 WIFI e impresión móvil ...............79.90 €\n"
                    + "c) Modelo Multifunción WIFI 3735 WIFI....................................69.90 €\n"
                    + "d) Modelo Multifunción Láser......................................................179 €");
            opc = uts.getString();
            elegirImpresora(opc);
        } while (!opc.equalsIgnoreCase("a") && !opc.equalsIgnoreCase("b") && !opc.equalsIgnoreCase("c") && !opc.equalsIgnoreCase("d"));

        System.out.println("¿Desea elegir color (Ponga si o no)? Si no eliges el color predeterminado es negro.");

        opc = uts.getString();
        String opccolor;
        if (opc.equalsIgnoreCase("si")) {
            do {

                System.out.println("Blanco: aumenta 10 € el precio del producto\n"
                        + "Azul: aumenta en 15 € el precio del producto\n"
                        + "Rosa: aumenta en 25 € el precio del producto");
                System.out.println("Escriba uno de los anteriores colores:");

                opccolor = uts.getString();
                elegirColor(opccolor);
            } while (!opccolor.equalsIgnoreCase("blanco") && !opccolor.equalsIgnoreCase("azul") && !opccolor.equalsIgnoreCase("rosa"));
        }

        System.out.println("Elija un tamaño: (no supone aumento de precio: )");
        tamanio = uts.getString();

    }

    @Override
    public String toString() {
        return "El modelo elegido ha sido "+ modelo +", de color" + color + " y de tamaño "+ tamanio+", con un precio total de "+precio;
    }

}
