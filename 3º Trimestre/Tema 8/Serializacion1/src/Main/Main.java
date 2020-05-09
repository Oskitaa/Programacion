/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.Coche;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import MiObjectOutputStream.MiObjectOutputStream;
/**
 *
 * @author ese_b
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File fichero = new File("C:coches.ddr");
        
        Coche coche1 = new Coche("0147 XCV", "Seat", "Ibiza", 50);
        Coche coche2 = new Coche("2342 SDF", "Seat", "Cordoba", 60);
        Coche coche3 = new Coche("5464 SDF", "Seat", "Leon", 30);
        
         try {
            if (fichero.exists()) {
                MiObjectOutputStream moos = new MiObjectOutputStream(new FileOutputStream(fichero, true));
                moos.writeObject(coche1);
                moos.writeObject(coche2);
                moos.writeObject(coche3);
            } else {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
                oos.writeObject(coche1);
                oos.writeObject(coche2);
                oos.writeObject(coche3);
            }
            

        } catch (IOException e) {

            System.out.println("Error");
        }
         
         
         try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:coches.ddr"))) {
            while (true) {
                Coche aux = (Coche) ois.readObject();
                System.out.println(aux.getMarca());
                System.out.println(aux.getModelo());
                System.out.println(aux.getMatricula());
                System.out.println("");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            System.out.println("Error E/S");
        }
        
    }
    
}
