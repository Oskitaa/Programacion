/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.Model;
import Utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ese_b
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here

        
        File arc = new File("ProgramData.dat");
        Model mo = cargarDatos(arc);

        int opc = 0;
        do {

            Utils.menu("1.- Vender producto", "2.- Dato un producto, mostrar los clientes que han comprado dicho producto.", "3.- Mostrar el total que se ha gastado un cliente determinado.", "0.- Salir");
            opc = Utils.getInt();
            switch (opc) {

                case 0:
                    try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(arc))) {
                        OOS.writeObject(mo);
                    }
                    System.out.println("Adios");
                    break;
                case 1:
                    mo.venderProducto();
                    break;
                case 2:
                    mo.datosProducto();
                    break;
                case 3:
                    mo.mostrarTotalPersona();
                    break;
                default:
                    System.out.println("Error");

            }

        } while (opc != 0);

    }

    public static Model cargarDatos(File arc) throws FileNotFoundException, IOException, ClassNotFoundException {

        try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(arc));) {
            Model mod = (Model) OIS.readObject();
            return mod;
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {
        }
        return new Model();
    }

}
