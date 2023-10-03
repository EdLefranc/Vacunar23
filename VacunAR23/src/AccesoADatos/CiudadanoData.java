/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Ciudadano;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ed Le Franc
 */
public class CiudadanoData {
    
    Conexion conex = new Conexion();
    
    public void guardarCiudadano(Ciudadano ciudadano){
        String sql = "INSERT INTO ciudadano(`dni`, `nombre`, `apellido`, `email`,"
                + " `celular`, `patologia`, `ocupacion`, `edad`, `responsableLegal`)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try(PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, ciudadano.getDni());
                ps.setString(2, ciudadano.getNombre());
                ps.setString(3, ciudadano.getApellido());
                ps.setString(4, ciudadano.getEmail());
                ps.setString(5, ciudadano.getCelular());
                ps.setString(6, ciudadano.getPatologia());
                ps.setString(7, ciudadano.getOcupacion());
                ps.setInt(8, ciudadano.getEdad());
                ps.setString(9, ciudadano.getResponsableLegal());
                int filaCreada = ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (filaCreada > 0) {                    
                    //JOptionPane.showMessageDialog(null, "Paciente añadido con exito.");
                    System.out.println("Exito!");
                    }
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "El paciente ya existe con estos datos.\nPrueba con 'modificar' algún dato.");
            System.out.println("Error: " + e);
        }
        
    }
    
    
    public Ciudadano buscarCiudadanoPorDni(int dni) {
        Ciudadano citizen = null;
        String sql = "SELECT * FROM ciudadano WHERE dni=?";
        PreparedStatement ps = null;

        try {
            ps = conex.Conexion_Maria().prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                citizen = new Ciudadano();
                citizen.setDni(rs.getInt("dni"));
                citizen.setNombre(rs.getString("nombre"));
                citizen.setApellido(rs.getString("apellido"));
                citizen.setEmail(rs.getString("email"));
                citizen.setCelular(rs.getString("celular"));
                citizen.setPatologia(rs.getString("patologia"));
                citizen.setOcupacion(rs.getString("ocupacion"));
                citizen.setEdad(rs.getInt("edad"));
                citizen.setResponsableLegal(rs.getString("responsableLegal"));
                System.out.println(citizen);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudadano " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
        return citizen;
    }

    
    
    public List<Ciudadano> listarCiudadanos(){
        List<Ciudadano> ciudadanos = new ArrayList<>();
        try {
        String sql = "SELECT * FROM ciudadano";
            try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Ciudadano citizen = new Ciudadano();
                                        
                    citizen.setDni(rs.getInt("dni"));                    
                    citizen.setNombre(rs.getString("nombre"));                    
                    citizen.setApellido(rs.getString("apellido"));
                    citizen.setEmail(rs.getString("email"));
                    citizen.setCelular(rs.getString("celular"));
                    citizen.setPatologia(rs.getString("patologia"));
                    citizen.setOcupacion(rs.getString("ocupacion"));
                    citizen.setEdad(rs.getInt("edad"));
                    citizen.setResponsableLegal(rs.getString("responsableLegal"));
                    
                    ciudadanos.add(citizen);
                }
                
            }        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudadano "+ex.getMessage());
        }
        System.out.println("Lista de ciudadanos:\n" + ciudadanos);
        return ciudadanos;
        
    }
    public void modificarCiudadano(){
        
    }
    
    public void eliminarCiudadano(){
        
    }
}
