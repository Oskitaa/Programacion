/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import Utils.Utils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ese_b
 */
public class Actividad {

    public void ejercicio5() {

        System.out.println("Introduce el maximo de numeros aleatorios a generar.");
        int numMax = Utils.getInt();
        System.out.println("A continuacion introduce la ruta: ");
        String ruta = pedirRuta();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta, true));
                DataInputStream dis = new DataInputStream(new FileInputStream(ruta))) {

            for (int i = 0; i < numMax; i++) {
                dos.writeInt((int) (Math.random() * 101));
            }

            while (true) {
                System.out.println(dis.readInt());
            }
        } catch (EOFException e) {
            System.out.println("Fin del fichero");

        } catch (IOException e) {
            System.out.println("Error E/S" + e);
        }

    }

    public void ejercicio6() {

        String matricula, marca, modelo, ruta;
        double deposito;

        System.out.println("Introduce la ruta: ");
        ruta = pedirRuta();

        matricula = Utils.getString("Introduce la matricula: ");
        marca = Utils.getString("Introduce la marca: ");
        modelo = Utils.getString("Introduce el modelo: ");
        System.out.println("Introduce el deposito: ");
        deposito = Utils.getDouble();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta, true));
                DataInputStream dis = new DataInputStream(new FileInputStream(ruta))) {

            dos.writeUTF(matricula);
            dos.writeUTF(marca);
            dos.writeDouble(deposito);
            dos.writeUTF(modelo);

            while (true) {
                System.out.println("La matricula del coche es" + dis.readUTF() + ", su marca es " + dis.readUTF() + ", el tamaño del deposito es " + dis.readDouble() + "litros y su modelo es " + dis.readUTF());
            }

        } catch (EOFException e) {
            System.out.println("Fin del fichero");

        } catch (IOException e) {
            System.out.println("Error E/S" + e);
        }

    }

    private String pedirRuta() {
        JFileChooser ele = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.ddr", "ddr");
        ele.setFileFilter(filtro);
        ele.setAcceptAllFileFilterUsed(false);
        boolean salir = false;
        String nomFichero = "";
        //Puede ser que el JFileChooser se abre por detras del IDE.
        do {
            int seleccion = ele.showOpenDialog(ele);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                if (ele.getSelectedFile().getAbsolutePath().contains(".ddr")) {
                    nomFichero = ele.getSelectedFile().getAbsolutePath();
                    salir = true;
                } else {
                    System.out.println("Error. Ejemplo: C://tuarchivo.ddr");
                }

            }
        } while (salir != true);
        return nomFichero;
    }

}
