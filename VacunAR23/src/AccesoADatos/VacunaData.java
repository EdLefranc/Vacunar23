package AccesoADatos;

import Entidades.Vacuna;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VacunaData {

    Conexion conex = new Conexion();
    
    public void guardarVacuna(Vacuna vacuna) {
        String sql = "INSERT INTO `vacuna`(`nroSerieDosis`, `cuitLaboratorio`, `nombreVacuna`, `marca`, `medida`, `vencimiento`, `aplicacion`) VALUES (?,?,?,?,?,?,?)";

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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la cita de vacunación: " + e.getMessage());
            System.out.println("Error al guardar la cita de vacunación: " + e.getMessage());
        }
    }

    public Vacuna obtenervacuna(int NroSerieDosis) {
        // se le pasa parametro
        Vacuna vacu = null;
        String sql = "SELECT * FROM vacuna WHERE `nroSerieDosis` = ?";
        PreparedStatement ps = null;
        try {
            ps = conex.Conexion_Maria().prepareStatement(sql);
            ps.setInt(1, NroSerieDosis); // cambia primer valor por numero dosis 
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                vacu = new Vacuna(); // hace desaparecer el estado null 
                Date vencimientoDate = rs.getDate("vencimiento"); // aqui convertimos

                vacu.setNroSerieDosis(rs.getInt("nroSerieDosis"));
                vacu.setCuitLaboratorio(rs.getInt("cuitLaboratorio"));
                vacu.setNombreVacuna(rs.getString("nombreVacuna"));
                vacu.setMarca(rs.getString("marca"));
                vacu.setMedida(rs.getDouble("medida"));
                vacu.setVencimiento(vencimientoDate.toLocalDate());// se convierte en LocalDate
                vacu.setAplicacion(rs.getBoolean("aplicacion"));
                System.out.println("Vacuna encontrada" + vacu);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna " + ex.getMessage());
        }
        System.out.println("Resulado de busqueda de vacuna:\n" + vacu);
        return vacu;

    }
    public Vacuna modificarVacuna (Vacuna vacuna, int nroSerieDosis){
        String sql = "UPDATE vacuna SET cuitLaboratorio = ?, nombreVacuna = ?, marca = ?, medida = ?, vencimiento = ?, aplicacion = ? WHERE nroSerieDosis = ?" + nroSerieDosis;
         PreparedStatement ps = null;
         try {
            ps = conex.Conexion_Maria().prepareStatement(sql);
            ps.setInt(1, vacuna.getCuitLaboratorio());            
            ps.setString(2, vacuna.getNombreVacuna());
            ps.setString(3, vacuna.getMarca());
            ps.setDouble(4, vacuna.getMedida());            
            ps.setString(5, vacuna.getVencimiento().toString());
            ps.setBoolean(6, vacuna.isAplicacion());
            ps.setInt(7, vacuna.getNroSerieDosis());
           
            int exito = ps.executeUpdate();

            if (exito == 0) {
                JOptionPane.showMessageDialog(null, "Vacuna modificada Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La vacuna no existe en los datos");
            }
        
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error al acceder a la vacunas "+ex.getMessage());
            System.out.println("Error: " + ex);
        } 
         return vacuna; 
    }
}

