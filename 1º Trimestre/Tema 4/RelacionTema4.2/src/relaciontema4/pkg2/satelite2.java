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
public class satelite2 {

    private double meridiano;
    private double paralelo;
    private double distancia_tierra;

    satelite2(double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }

    satelite2() {
        meridiano = paralelo = distancia_tierra = 0;
    }

    public void setPosicion(double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }

    public void printPosicion() {
        System.out.println("El satélite se encuentra en el paralelo " + paralelo + " Meridiano " + meridiano + " a una distancia de la tierra de " + distancia_tierra + " Kilómetros");
    }

    public void variaAltura(double desplazamiento) {
        this.distancia_tierra = desplazamiento;
    }

    public boolean enOrbita() {
        return distancia_tierra != 0;
    }

    public void variaPosicion(double variap, double variam) {
        this.meridiano = variam;
        this.paralelo = variap;
    }

}
