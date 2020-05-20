/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ese_b
 */
public class ConexionBBDD {
    
    public static Connection conexion() {
        
        Connection conect = null;
        
        try{
            
            conect = DriverManager.getConnection("jdbc:mysql://localhost/hollywood", "root", "");
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        
        return conect;
        
    }
    
}
