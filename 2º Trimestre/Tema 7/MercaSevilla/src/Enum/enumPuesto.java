/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

import java.util.stream.Stream;

/**
 *
 * @author ese_b
 */
public enum enumPuesto {

    A("Frutas Pepe", 1),
    B("La Mar de Cai", 2),
    C("Carnicas Molina", 3);

    private String nombreComercio;
    private int id;

    private enumPuesto(String nombreComercio, int id) {
        this.nombreComercio = nombreComercio;
        this.id = id;
    }

    public String getNombreComercio() {
        return nombreComercio;
    }

    public int getId() {
        return id;
    }

    public static Stream<enumPuesto> stream() {
        return Stream.of(enumPuesto.values());
    }

    @Override
    public String toString() {
        return getId()+". "+getNombreComercio();
    }
    
    

}
