/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

import java.util.stream.*;

/**
 *
 * @author ese_b
 */
public enum Consumo {

    A('A', 100),
    B('B', 80),
    C('C', 60),
    D('D', 50),
    E('E', 30),
    F('F', 10);

    public char consumo;
    public double precioConsumo;

    private Consumo(char consumo, double precioConsumo) {
        this.consumo = consumo;
        this.precioConsumo = precioConsumo;
    }

    public double getPrecioConsumo() {
        return precioConsumo;
    }

    public char getConsumo() {
        return consumo;
    }

    public static Stream<Consumo> stream() {
        return Stream.of(Consumo.values());
    }

}
