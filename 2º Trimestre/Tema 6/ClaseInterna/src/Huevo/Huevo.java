/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huevo;

/**
 *
 * @author ese_b
 */
public class Huevo {

    public class llema {

        public llema() {
            System.out.println("Llema creada");
        }

    }

    public class clara {

        public clara() {
            System.out.println("Clara creada");
        }

    }

    public llema hazLlema(){
        return new llema();
    }
    
    public clara hazClara(){
        return new clara();
    }
    
    
}
