package AccesoADatos;

import Entidades.Vacuna;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VacunaData {
    Conexion conex = new Conexion();

    public VacunaData() {
        conex = new Conexion();
    }

    public List<Vacuna> listarVacunas() {
        List<Vacuna> vacunas = new ArrayList<>();
        String sql = "SELECT * FROM vacuna";

        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Vacuna vacuna = new Vacuna();
                vacuna.setNroSerieDosis(rs.getInt("nroSerieDosis"));
                vacuna.setCuitLaboratorio(rs.getInt("cuitLaboratorio"));
                vacuna.setNombreVacuna(rs.getString("nombreVacuna"));
                vacuna.setMarca(rs.getString("marca"));
                vacuna.setMedida(rs.getDouble("medida"));

                // Establecer la fecha de vencimiento como LocalDate
                Date fechaVencimiento = rs.getDate("vencimiento");
                vacuna.setVencimiento(fechaVencimiento.toLocalDate());

                // Establecer el estado de aplicación como boolean
                vacuna.setAplicacion(rs.getBoolean("aplicacion"));

                vacunas.add(vacuna);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar las vacunas: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
        System.out.println(vacunas);
        return vacunas;
    }

    public void eliminarVacuna(int nroSerieDosis) {
        String sql = "DELETE FROM vacuna WHERE nroSerieDosis = ?";
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setInt(1, nroSerieDosis);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Vacuna eliminada exitosamente.");
                System.out.println("Vacuna eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La vacuna no pudo ser eliminada.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la vacuna: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
    }

    public void modificarVacuna(Vacuna vacu) {
        String sql = "UPDATE vacuna SET cuitLaboratorio = ?, nombreVacuna = ?, marca = ?, medida = ?, vencimiento = ?, aplicacion = ? WHERE nroSerieDosis = ?";
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            
            // Establecer la fecha de vencimiento como LocalDate
            
            ps.setInt(1, vacu.getCuitLaboratorio());
            ps.setString(2, vacu.getNombreVacuna());
            ps.setString(3, vacu.getMarca());
            ps.setDouble(4, vacu.getMedida());            
            ps.setDate(5, Date.valueOf(vacu.getVencimiento()));
            ps.setBoolean(6, vacu.isAplicacion());
            
            ps.setInt(7, vacu.getNroSerieDosis());
                        
            int exito = ps.executeUpdate();

            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "Vacuna actualizada exitosamente.");
                System.out.println("Vacuna actualizada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La vacuna no pudo ser encontrada para actualizar.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la vacuna: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
    }

    public boolean existeVacuna(int nroSerieDosis) {
        String sql = "SELECT COUNT(*) FROM vacuna WHERE nroSerieDosis = ?";
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setInt(1, nroSerieDosis);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar si la vacuna existe: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
        return false;
    }

    public void guardarVacuna(Vacuna vacuna) {
        // Verificar si la vacuna ya existe
        if (existeVacuna(vacuna.getNroSerieDosis())) {
            JOptionPane.showMessageDialog(null, "La vacuna ya existe en la base de datos.");
            return; // Salir del método si la vacuna ya existe
        }

        try {
            String sql = "INSERT INTO vacuna"
                    + "(`nroSerieDosis`, `cuitLaboratorio`, `nombreVacuna`, `marca`, `medida`, `vencimiento`, `aplicacion`)"
                    + " VALUES (?,?,?,?,?,?,?);";

            try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
                ps.setInt(1, vacuna.getNroSerieDosis());
                ps.setInt(2, vacuna.getCuitLaboratorio());
                ps.setString(3, vacuna.getNombreVacuna());
                ps.setString(4, vacuna.getMarca());
                ps.setDouble(5, vacuna.getMedida());
                ps.setString(6, vacuna.getVencimiento().toString());
                ps.setBoolean(7, vacuna.isAplicacion());

                int filaCreada = ps.executeUpdate();

                if (filaCreada > 0) {
                    JOptionPane.showMessageDialog(null, "!Excelente¡ La vacuna fue añadida con éxito.");
                    System.out.println("!Excelente¡ La vacuna fue añadida con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo añadir la vacuna.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la vacuna: " + e.getMessage());
            System.out.println("Error al guardar la vacuna: " + e.getMessage());
        }
    }
    
    public void actualizarEstadoVacuna(int nroSerieDosis) {
        // Verificar si la vacuna existe antes de actualizar su estado
        if (!existeVacuna(nroSerieDosis)) {
            JOptionPane.showMessageDialog(null, "La vacuna no existe en la base de datos.");
            return; // Salir del método si la vacuna no existe
        }

        String sql = "UPDATE vacuna SET aplicacion = false WHERE nroSerieDosis = ?";
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setInt(1, nroSerieDosis);

            int exito = ps.executeUpdate();

            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "Estado de la vacuna actualizado exitosamente.");
                System.out.println("Estado de la vacuna actualizado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La vacuna no pudo ser encontrada para actualizar.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el estado de la vacuna: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
    }
    
    public Vacuna obtenerVacuna(int nroSerieDosis) {
        Vacuna vacuna = null;
        String sql = "SELECT * FROM vacuna WHERE nroSerieDosis = ?";

        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setInt(1, nroSerieDosis);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                vacuna = new Vacuna();
                vacuna.setNroSerieDosis(rs.getInt("nroSerieDosis"));
                vacuna.setCuitLaboratorio(rs.getInt("cuitLaboratorio"));
                vacuna.setNombreVacuna(rs.getString("nombreVacuna"));
                vacuna.setMarca(rs.getString("marca"));
                vacuna.setMedida(rs.getDouble("medida"));
                vacuna.setVencimiento(LocalDate.parse(rs.getString("vencimiento")));
                vacuna.setAplicacion(rs.getBoolean("aplicacion"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la vacuna: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
        System.out.println(vacuna);
        return vacuna;
    }
    
}
