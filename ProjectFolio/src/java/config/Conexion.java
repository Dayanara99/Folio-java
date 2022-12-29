/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author daya_
 */
public class Conexion {
    Connection con;
    String url="jdbc:mysql://node123623-env-0100055.jelastic.saveincloud.net:3306/project";
    String user="root";
    String pass="MGQome88748";
    
    public Connection Conexion(){
        
        try {
            Class.forName ("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,user,pass);
           JOptionPane.showMessageDialog(null, "Conexion correcta");
        } catch (Exception e) {
         //   JOptionPane.showMessageDialog(null, "Problemas en la conexion"+e.toString());
        }
        return con;
    }
}
