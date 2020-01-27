/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
Crear una clase Empleado que modele la información que una empresa
mantiene sobre cada empleado: NIF, sueldo base, pago por hora extra, horas extra
realizadas en el mes, tipo (porcentaje) de IRPF, casado o no y número de hijos. La clase
debe contemplar accedentes y mutadores para todos los atributos. Al crear los objetos se
podrá proporcionar, si se quiere, el número de DNI. Los demás servicios que deberán
proporcionar los objetos de la clase serán los siguientes:*/
package Main;

import empleado.Empleado;
import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double pago_hextra;
      
        
        Empleado emp1 = new Empleado();
        Utils uts = new Utils();
        System.out.println("Introduce su nif");
        emp1.setNif(uts.getString());
        System.out.println("Introduce el sueldo base:");
        emp1.setSueldo_base(uts.getDouble());
        System.out.println("Introduce las horas extras:");
        emp1.setNum_hextra(uts.getInt());
        System.out.println("Numero de hijos:");
        emp1.setNum_hijos(uts.getInt());
        System.out.println("Estas casado? Si o no.");
        String casado = uts.getString();
        
        if (casado.equalsIgnoreCase("si")) {
            emp1.setCasado(true);
        } else {
            emp1.setCasado(false);
        }
        System.out.println("Cuanto te pagan por hora extra: ");
        emp1.setPago_hextra(uts.getDouble());
        
        emp1.println();
        emp1.printAll();
        
    }
    
}
