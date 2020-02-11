/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.Empleado;
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

        Utils uts = new Utils();
        Empleado emp1 = new Empleado();

        int opc = 0;

        do {
            System.out.println("Introduce una opción: ");
            System.out.println("0.Salir \n1.Crear Empleado \n2.Modificar hora entrada"
                    + " \n3.Modificar hora de salida \n4.Mostrar datos");
            opc = uts.getInt();

            switch (opc) {

                case 0:
                    System.out.println("Adios.");
                    break;

                case 1:
                    emp1.capturarEmpleado();
                    break;

                case 2:

                    do {
                        System.out.println("Introduce una hora de entrada: ");
                        emp1.setHoraEntrada(emp1.capturarHora());
                    } while (emp1.valida() == true);

                    break;

                case 3:

                    do {
                        System.out.println("Introduce una hora de salida: ");
                        emp1.setHoraSalida(emp1.capturarHora());

                    } while (emp1.valida() == true);
                    break;

                case 4:
                    System.out.println(emp1.toString());
                    break;
                default:
                    System.out.println("Prueba a introducir otro numero. :)");
                    break;
            }

        } while (opc != 0);

    }

}
