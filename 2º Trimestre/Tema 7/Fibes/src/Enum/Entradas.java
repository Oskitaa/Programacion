package Enum;


import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ese_b
 */
public enum Entradas {
    
    PALCO ("PALCO" , 20, 1),
    VIP ("VIP" , 40, 2),
    RESERVADAS ("RESERVADAS" , 10, 3),
    GALLINERO("GALLINERO", 200, 4);
    
    private String tipo;
    private int maxima;
    private int codigo;

    private Entradas(String tipo,int maxima, int codigo) {
        this.tipo = tipo;
        this.maxima = maxima;
        this.codigo = codigo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public int getMaxima(){
        return maxima;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
     public static Stream<Entradas> stream() {
        return Stream.of(Entradas.values());
    }
     
}
