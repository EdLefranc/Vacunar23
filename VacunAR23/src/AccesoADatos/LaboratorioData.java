package AccesoADatos;

import Entidades.Laboratorio;
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
public class LaboratorioData {
    Conexion conex = new Conexion();
    
    public void guardarLaboratorio(Laboratorio lab){
        String sql = "INSERT INTO laboratorio(`cuitLaboratorio`, `nombreLab`, `pais`, `domComercial`,"
                + " `mail`, `telefono`, `actividad`)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try(PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, lab.getCuitLaboratorio());
                ps.setString(2, lab.getNombreLab());
                ps.setString(3, lab.getPais());
                ps.setString(4, lab.getDomComercial());
                ps.setString(5, lab.getMail());                
                ps.setString(6, lab.getTelefono());
                ps.setBoolean(7, lab.isActivo());
                
                int filaCreada = ps.executeUpdate();
                //ResultSet rs = ps.getGeneratedKeys();
                if (filaCreada > 0) {                    
                    JOptionPane.showMessageDialog(null, "Laboratorio añadido con exito.");
                    System.out.println("Exito al guardar Lab!");
                    }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El laboratorio " + lab.getNombreLab() + " ya existe con estos datos.\nPrueba con 'modificar' algún dato.");
            System.out.println("Error: " + e);
        }
        
    }
    
    public Laboratorio buscarLaboratorioPorCuit(int cuit) {
        Laboratorio lab = null;
        String sql = "SELECT * FROM laboratorio WHERE cuitLaboratorio=? AND (actividad = 1 OR actividad = 0)";
        PreparedStatement ps = null;

        try {
            ps = conex.Conexion_Maria().prepareStatement(sql);
            ps.setInt(1, cuit);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                lab = new Laboratorio();
                lab.setCuitLaboratorio(rs.getInt("cuitLaboratorio"));
                lab.setNombreLab(rs.getString("nombreLab"));
                lab.setPais(rs.getString("pais"));
                lab.setDomComercial(rs.getString("domComercial"));
                lab.setMail(rs.getString("mail"));
                lab.setTelefono(rs.getString("telefono"));
                lab.setActivo(rs.getBoolean("actividad"));
                System.out.println(lab);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla laboratorio " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
        return lab;
    }
    
    public List<Laboratorio> listarLaboratorios() {
        List<Laboratorio> labs = new ArrayList<>();
        try {
            String sql = "SELECT * FROM laboratorio ORDER BY nombreLab ASC";
            try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Laboratorio lab = new Laboratorio();

                    lab.setCuitLaboratorio(rs.getInt("cuitLaboratorio"));
                    lab.setNombreLab(rs.getString("nombreLab"));
                    lab.setPais(rs.getString("pais"));
                    lab.setDomComercial(rs.getString("domComercial"));
                    lab.setMail(rs.getString("mail"));
                    lab.setTelefono(rs.getString("telefono"));

                    labs.add(lab);
                }
            }
        } catch (SQLException ex) {
            // JOptionPane.showMessageDialog(null, "Error al acceder a la tabla laboratorio " + ex.getMessage());
            System.out.println("Error al acceder a la tabla laboratorio " + ex.getMessage());
        }
        System.out.println("Lista de laboratorios:\n" + labs);
        return labs;
    }

    public void modificarLaboratorio(Laboratorio lab, int cuitLaboratorio) {
        String sql = "UPDATE laboratorio SET nombreLab = ?, pais = ?, domComercial = ?, mail = ?, telefono = ?, actividad = ? WHERE cuitLaboratorio = ?";
        PreparedStatement ps = null;

        try {
            ps = conex.Conexion_Maria().prepareStatement(sql);
            
            ps.setString(1, lab.getNombreLab());
            ps.setString(2, lab.getPais());
            ps.setString(3, lab.getDomComercial());
            ps.setString(4, lab.getMail());
            ps.setString(5, lab.getTelefono());
            ps.setBoolean(6, lab.isActivo());

            // Aquí solo se necesita configurar el parámetro una vez en la cláusula WHERE
            ps.setInt(7, cuitLaboratorio);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Laboratorio modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El laboratorio no existe en los datos");
            }

        } catch (SQLException ex) {
            // JOptionPane.showMessageDialog(null, "Error al acceder a la tabla laboratorio " + ex.getMessage());
            System.out.println("Error: " + ex);
        } 
    }
    
    public void cambiarEstadoLaboratorioo(int cuitLab) {
        String sql = "UPDATE laboratorio SET actividad = NOT actividad WHERE cuitLaboratorio = ?";
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setInt(1, cuitLab);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Estado del laboratorio actualizado exitosamente.");
                System.out.println("Estado del laboratorio actualizado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el estado del laboratorio.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el estado del laboratorio: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
    }
    
}
