/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

import java.util.stream.Stream;

/**
 *
 * @author ese_b
 */
public enum Color {
    BLANCO("BLANCO"),
    NEGRO("NEGRO"),
    ROJO("ROJO"),
    AZUL("AZUL"),
    GRIS("GRIS");
    
    public String color;

    private Color(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public static Stream<Color> stream() {
        return Stream.of(Color.values());
    }


}
