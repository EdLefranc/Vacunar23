
package AccesoADatos;

import Entidades.Vacuna;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VacunaData {
   Conexion conex = new Conexion();
   
   //INSERT INTO `vacuna`(`nroSerieDosis`, `cuitLaboratorio`, `nombreVacuna`, `marca`, `medida`, `vencimiento`, `aplicacion`)
   //VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]')
   
   public void guardarVacuna(Vacuna vacuna){
        String sql = "INSERT INTO `vacuna`(`nroSerieDosis`, `cuitLaboratorio`, `nombreVacuna`, `marca`, `medida`, `vencimiento`, `aplicacion`) VALUES (?,?,?,?,?,?,?)";
        
        try (PreparedStatement ps =conex.Conexion_Maria().prepareStatement(sql)){
           ps.setInt(1,vacuna.getNroSerieDosis());
           ps.setInt(2,vacuna.getCuitLaboratorio());
           ps.setString(3,vacuna.getNombreVacuna());
           ps.setString(4,vacuna.getMarca());
           ps.setDouble(5,vacuna.getMedida());
           ps.setString(6,vacuna.getVencimiento().toString());
           ps.setBoolean(7,vacuna.isAplicacion());
           
            int filaCreada = ps.executeUpdate();

            if (filaCreada > 0) {
                JOptionPane.showMessageDialog(null, "!Excelente¡ La vacuna fue añadida con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo añadir la vacuna.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la cita de vacunación: " + e.getMessage());
        }
        }
    
  public List<Vacuna> obtenervacuna() {
           List<Vacuna> Vacunas = new ArrayList<>();
            try {
        String sql = "SELECT * FROM vacuna";
            try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Vacuna vacunar = new Vacuna();
                    Date vencimientoDate =rs.getDate("vencimiento"); // aqui convertimos
      
                    vacunar.setNroSerieDosis(rs.getInt("nroSerieDosis"));
                    vacunar.setCuitLaboratorio(rs.getInt("cuitLaboratorio"));
                    vacunar.setNombreVacuna(rs.getString("nombreVacuna"));
                    vacunar.setMarca(rs.getString("marca"));
                    vacunar.setMedida(rs.getDouble("medida"));
                    vacunar.setVencimiento(vencimientoDate.toLocalDate());// se convierte en LocalDate
                    vacunar.setAplicacion(rs.getBoolean("aplicacion"));

                     Vacunas.add(vacunar);
                }
                
            }        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna "+ex.getMessage());
        }
        System.out.println("Lista de vacuna:\n" + Vacunas);
        return Vacunas;   
           
  }
  }

