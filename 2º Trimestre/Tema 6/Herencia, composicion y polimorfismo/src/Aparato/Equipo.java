/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aparato;
import Utils.Utils;
/**
 *
 * @author ese_b
 */
public class Equipo extends Aparato {

    //Atributos
    
    private int cantidadCDs;

    //Constructores
    public Equipo() {
        super();
        this.cantidadCDs = 0;
    }

    public Equipo(int cantidadCDs, double precio, int voltaje) {
        super(precio, voltaje);
        this.cantidadCDs = cantidadCDs;
    }

    //Getters y setters
    public int getCantidadCDs() {
        return cantidadCDs;
    }

    public void setCantidadCDs(int cantidadCDs) {
        this.cantidadCDs = cantidadCDs;
    }

    //Metodos
    @Override
    public void capturar() {
        super.capturar();

        do {
            System.out.println("Introduce la cantidad de CDS");
            setCantidadCDs(Utils.getInt());
        } while (getCantidadCDs() < 0);

    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        
        System.out.println("Con una cantidad de CDs "+getCantidadCDs()+".");
    }

}
