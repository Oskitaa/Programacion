/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Pez.Peces;


/**
 *
 * @author ese_b
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Peces pez1 = new Peces("Sardina");
        Peces pez2 = new Peces("Atún");
        Peces pez3 = new Peces("Acedías");
        Peces pez4 = new Peces(pez3);
        
        
    }
    
}
