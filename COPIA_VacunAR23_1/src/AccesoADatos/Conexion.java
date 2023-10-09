/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ed Le Franc
 */
public class Conexion {
    Connection conexion_inst = null;

    public Conexion() {
    }

    public Connection getConexion_inst() {
        return conexion_inst;
    }

    public void setConexion_inst(Connection conexion_inst) {
        this.conexion_inst = conexion_inst;
    }
    
    private static String usuario = "root";
    private static String contraseña = "";
    private static String url = "jdbc:mysql://localhost:3306/vacunar23";
    private static String driver = "org.mariadb.jdbc.Driver";
    
    public Connection Conexion_Maria() {
    try {
        
        this.conexion_inst = DriverManager.getConnection(url, usuario, contraseña);
        System.out.println("Conectado!!");
    } catch (SQLException ex) {
        System.out.println("Error al conectar " + ex);
        this.conexion_inst = null; // Establece la conexión como null en caso de error
    }
        return conexion_inst;
    }
    
    public Connection conectar() throws ClassNotFoundException{
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/vacunar23", "root", "");
            System.out.println("Conected to data base!");                            
        } catch (SQLException e) {
            System.out.println("No conected");
        }
        Connection cn = null;
        return cn;       
    }
    
}
