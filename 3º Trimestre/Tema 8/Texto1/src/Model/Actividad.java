/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import Utils.Utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.*;
import sun.dc.pr.PathStroker;

/**
 *
 * @author ese_b
 */
public class Actividad {

    public void ejercicio1() {

        try (FileReader fr = new FileReader(pedirRuta())) {
            int valor = fr.read();
            while (valor != -1) {
                if (valor != 32) {
                    System.out.print((char) valor);
                }
                valor = fr.read();
            }
        } catch (IOException e) {
            System.out.println("Problemas con el E/S " + e);
        }
    }

    public void ejercicio2() {
        System.out.println("Si no existe el fichero lo creara, si existe lo sobreescribira.");
        String a = pedirRuta();

        try (FileWriter fw = new FileWriter(a);
                FileReader fr = new FileReader(a)) {
            fw.write(Utils.getString("Introduce a continuacion el contenido del fichero"));

        } catch (IOException e) {
            System.out.println("Problemas con el E/S " + e);
        }

        try (FileReader fr = new FileReader(a)) {
            int valor = fr.read();
            while (valor != -1) {
                char caracter = (char) valor;
                if (caracter >= 97 && caracter <= 122) {
                    caracter -= 32;
                } else if (caracter >= 65 && caracter <= 90) {
                    caracter += 32;
                }
                System.out.print(caracter);
                valor = fr.read();
            }

        } catch (IOException e) {
            System.out.println("Problemas con el E/S " + e);
        }

    }

    public void ejercicio3() {

        System.out.println("Seleccione la ruta del fichero 1");
        String ruta1 = pedirRuta();
        System.out.println("Seleccione la ruta del fochero 2");
        String ruta2 = pedirRuta();
        String ruta12;
        String nomFinal;
        do {
            ruta12 = Utils.getString("Introduzca la ruta donde se guardara el archivo combinado");
        } while (!comprobarRuta(ruta12));

        File fi1e1 = new File(ruta1);
        File file2 = new File(ruta2);

        nomFinal = fi1e1.getName().substring(0, fi1e1.getName().length() - 4) + "_" + file2.getName();
        System.out.println(nomFinal);
        
        unirFichero(file2, file2, nomFinal);

    }

    private String pedirRuta() {
        JFileChooser ele = new JFileChooser();
        boolean salir = false;
        String nomFichero = "";
        //Puede ser que el JFileChooser se abre por detras del IDE.
        do {
            int seleccion = ele.showOpenDialog(ele);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                nomFichero = ele.getSelectedFile().getAbsolutePath();
                salir = true;
            }
        } while (salir != true);
        return nomFichero;
    }

    private boolean comprobarRuta(String ruta) {
        File a = new File(ruta);
        return a.isDirectory();
    }

    private void copiar(BufferedWriter bw, BufferedReader br) throws IOException {

        String linea = br.readLine();
        while (linea != null) {
            bw.write(linea);
            linea = br.readLine();
        }

    }

    private void unirFichero(File file1, File file2, String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(file1));
                BufferedReader br2 = new BufferedReader(new FileReader(file2))) {

            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));

            copiar(bw, br);
            copiar(bw, br2);

        } catch (IOException e) {
            System.out.println("Problemas con el E/S " + e);
        }

    }

}
