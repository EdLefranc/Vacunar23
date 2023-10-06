/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Ciudadano;
import java.sql.Date;
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
    // Verificar si el ciudadano ya existe por DNI
    Ciudadano ciudadanoExistente = buscarCiudadanoPorDni(ciudadano.getDni());
    
    if (ciudadanoExistente != null) {
        // El ciudadano ya existe, mostrar mensaje al usuario
        JOptionPane.showMessageDialog(null, "El paciente con el DNI " + ciudadano.getDni() + " ya está registrado.");
        // Aquí podrías dar la opción de actualizar los datos existentes si es necesario
    } else {
        // El ciudadano no existe, realizar la inserción
        String sql = "INSERT INTO ciudadano(`dni`, `nombre`, `apellido`, `email`,"
                + " `celular`, `patologia`, `ocupacion`, `edad`, `responsableLegal`, `estado`)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
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
            ps.setBoolean(10, true);
            int filaCreada = ps.executeUpdate();
            
            if (filaCreada > 0) {                    
                // JOptionPane.showMessageDialog(null, "Paciente añadido con exito.");
                System.out.println("Exito!");
            }
        } catch (SQLException e) {
            // Excepción de clave primaria duplicada
            JOptionPane.showMessageDialog(null, "El paciente ya existe con estos datos.\nPrueba con 'modificar' algún dato.");
            System.out.println("Error: " + e);
        }
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
                citizen.setEstado(true);
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
        String sql = "SELECT * FROM ciudadano ORDER BY edad DESC";
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
                    citizen.setEstado(true);
                    
                    ciudadanos.add(citizen);
                }
                
            }        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudadano "+ex.getMessage());
        }
        System.out.println("Lista de ciudadanos:\n" + ciudadanos);
        return ciudadanos;        
    }
    
    
    public void modificarCiudadano(Ciudadano ciudadano) {
    String sql = "UPDATE ciudadano SET nombre=?, apellido=?, email=?, celular=?, patologia=?, ocupacion=?, edad=?, responsableLegal=?, estado=? WHERE dni=?";
    try {
        PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql);
        ps.setString(1, ciudadano.getNombre());
        ps.setString(2, ciudadano.getApellido());
        ps.setString(3, ciudadano.getEmail());
        ps.setString(4, ciudadano.getCelular());
        ps.setString(5, ciudadano.getPatologia());
        ps.setString(6, ciudadano.getOcupacion());
        ps.setInt(7, ciudadano.getEdad());
        ps.setString(8, ciudadano.getResponsableLegal());
        ps.setBoolean(9, ciudadano.isEstado());
        ps.setInt(10, ciudadano.getDni());

        int exito = ps.executeUpdate();

        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Paciente modificado Exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El paciente no existe en los datos");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al modificar el ciudadano: " + ex.getMessage());
        System.out.println("Error: " + ex);
    }
}

    
    public void eliminarCiudadano(int dni, boolean estado){
        try {
        String sql = "UPDATE ciudadano SET estado = " + estado + " WHERE dni = ?;";
        PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql);
        //PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dni);
        int fila=ps.executeUpdate();
        
        if(fila==1){
            JOptionPane.showMessageDialog(null, "Se cambió estado del paciente");
            System.out.println("Se cambió estado del paciente");
        }
        ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla ciudadano");
            System.out.println("Error: " + e);
        }
    }
    
}
