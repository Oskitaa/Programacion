/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hollywood;

import DataBase.ActorService;
import java.sql.SQLException;
import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class hollywood {

    public static void main(String[] arg) throws SQLException {

        ActorService a = new ActorService();
        int opc = 0;

        do {

            Utils.menu("0.Salir", "1.Añadir actor", "2.Eliminar actor", "3.Mostrar todos los actores", "4.Mostras solo actrices", "5.Mostrar actor mas joven", "6.Mostrar actor/actriz mas pagado", "7.");
            opc =  Utils.getInt();
            switch (opc) {
                case 0:
                    System.out.println("Adioooos!!!");
                    break;
                case 1:
                    a.crearActor();
                    break;
                case 2:
                    a.eliminarActor();
                    break;
                case 3:
                    a.getAllActores();
                    break;
                case 4:
                    a.getActrices();
                    break;
                case 5:
                    a.getActorJoven();
                    break;
                case 6:
                    a.getActoresPagados();
                    break;
                case 7:
                    a.obtenerActores();
                    break;
            }

        } while (opc != 0);

    }

}
