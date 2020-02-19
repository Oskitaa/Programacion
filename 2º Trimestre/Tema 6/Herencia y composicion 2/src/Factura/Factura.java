/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura;

import Aparato.*;
import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class Factura extends Aparato {

    private String numFra;
    private TV televisor;
    private Equipo equipoSonido;
    private double pctdescuento;

    public Factura() {
        this.numFra = randomFra();
        this.pctdescuento = 0;
    }

    public Factura(double pctdescuento) {
        this.numFra = randomFra();
        this.pctdescuento = pctdescuento;
    }

    public void capturarFactTV() {
        Utils uts = new Utils();
        TV tele = new TV();

        int tv;
        double precio_total;

        System.out.println("Bienvenido, cuantos TVs quieres comprar?");
        tv = uts.getInt();
        tele.capturarTV();
         precio_total = (tele.getPrecio()*tv) - (Descuento()*tv);

        System.out.println("Ha comprado "+tv+" televisores, de un voltaje "+tele.getVoltaje()+", de "+tele.getTamanio()+" pulgadas"
        +"y de "+precio_total+"€");

    }

    public void capturarFactEquipo() {
        Utils uts = new Utils();
        Equipo equisonido = new Equipo();

        int equipo = 0;
        double precio_total;

        System.out.println("Bienvenido, cuantos equipos quieres comprar?");
        equipo = uts.getInt();
        equisonido.capturarEquipo();
        precio_total = (getPrecio()*equipo) - (Descuento()*equipo);
        
        System.out.println("Ha comprado "+equipo+" de voltaje "+equisonido.getVoltaje()+", de "+equisonido.getCantidadCds()+" Cds"
        +"y de "+precio_total+"€");
        
    }

    

    public double Descuento() {

        Utils uts = new Utils();
        boolean salir1 = false;
        boolean salir2 = false;

        String answer = "";

        do {
            System.out.println("Tiene algun descuento el producto? Si o no.");
            answer = uts.getString();

            if (answer.equalsIgnoreCase("si")) {
                do {

                    System.out.println("Introduce la cantidad de descuento: ");
                    setPctdescuento(uts.getDouble());

                    if (getPctdescuento() < 0 || getPctdescuento() > 50) {
                        System.out.println("No se puede hacer ese descuento, intentelo de nuevo.");
                    } else {
                        salir1 = true;
                    }
                    salir2 = true;

                } while (salir2 != true);

            }
            if (answer.equalsIgnoreCase("no")) {
                salir1 = true;
                salir2 = true;
            }

        } while (salir1 != true && salir2 != true);

        return super.calcularDescuento(getPctdescuento());
    }

    public String getNumFra() {
        return numFra;
    }

    public void setNumFra(String numFra) {
        this.numFra = numFra;
    }

    public TV getTelevisor() {
        return televisor;
    }

    public void setTelevisor(TV televisor) {
        this.televisor = televisor;
    }

    public Equipo getEquipoSonido() {
        return equipoSonido;
    }

    public void setEquipoSonido(Equipo equipoSonido) {
        this.equipoSonido = equipoSonido;
    }

    public double getPctdescuento() {
        return pctdescuento;
    }

    public void setPctdescuento(double pctdescuento) {
        this.pctdescuento = pctdescuento;
    }

    public String randomFra() {

        String randomnum = "ABC";

        for (int i = 0; i < 10; i++) {

            int numale = (int) (Math.random() * 10);
            randomnum += String.valueOf(numale);

        }

        return randomnum;

    }

}
