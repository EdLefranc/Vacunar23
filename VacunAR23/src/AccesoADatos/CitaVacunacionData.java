
package AccesoADatos;

import Entidades.CitaVacunacion;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
import javax.swing.JOptionPane;

public class CitaVacunacionData {
    Conexion conex = new Conexion();

 public void guardarCitaVacunacion(CitaVacunacion citaVacunacion){
     String sql = "INSERT INTO `citavacunacion`(`codCita`, `ciudadano`, `codRefuerzo`, `centroVacunacion`, `fechaHoraColoca`, `nroSerieDosis`) VALUES (?,?,?,?,?,?)";
    try (PreparedStatement ps =conex.Conexion_Maria().prepareStatement(sql)){ //aqui nos conectamos y abajo le damos valores a la tabla citavacunacion
        ps.setInt(1, citaVacunacion.getCodCita());
        ps.setInt(2, citaVacunacion.getCiudadano().getDni()); //
        ps.setInt(3, citaVacunacion.getCodRefuerzo());
        ps.setString(4, citaVacunacion.getFechaHoraCita());
        ps.setString(5, citaVacunacion.getCentroVacunacion());
        ps.setString(6, citaVacunacion.getFechaHoraColoca().toString()); //aqui toca pasar el localDate a string, hay que asignarle formato 
        ps.setInt(7, citaVacunacion.getNroSerieDosis().getNroSerieDosis());
        
         int filaCreada = ps.executeUpdate();

            if (filaCreada > 0) {
                JOptionPane.showMessageDialog(null, "!Excelente¡ Su cita de vacunación fue añadida con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "!Error¡ No se pudo añadir la cita de vacunación.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la cita de vacunación: " + e.getMessage());
        }
    } 
 }
//guardar cita 
 // buscar vacuna
 //listar citas
 //modificar citas
 //eliminar citas

