/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Persona.*;
/**
 *
 * @author ese_b
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante estudent = new Estudiante();
        
        estudent.establecerEstudiante();
        estudent.imprimirEstudiante();
        
    }
    
}

