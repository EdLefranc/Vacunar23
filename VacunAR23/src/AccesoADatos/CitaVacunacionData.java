package AccesoADatos;

import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import Entidades.Vacuna;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
//import java.util.ArrayList;
//import java.util.List;
import javax.swing.JOptionPane;

public class CitaVacunacionData {

    Conexion conex = new Conexion();

    public void guardarCitaVacunacion(CitaVacunacion citaVacunacion) {
        String sql = "INSERT INTO turnovacunacion(`codCita`, `dniCiudadano`, `codRefuerzo`, `centroVacunacion`, `fechaHoraColoca`, `nroSerieDosis`) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) { 
            ps.setInt(1, citaVacunacion.getCodCita());
            ps.setInt(2, citaVacunacion.getDniCiudadano());
            ps.setInt(3, citaVacunacion.getCodRefuerzo());            
            ps.setString(4, citaVacunacion.getCentroVacunacion());
            ps.setString(5, citaVacunacion.getFechaHoraColoca().toString());
            ps.setInt(6, citaVacunacion.getNroSerieDosis());

            int filaCreada = ps.executeUpdate();

            if (filaCreada > 0) {
                JOptionPane.showMessageDialog(null, "!Excelente¡ Su cita de vacunación fue añadida con éxito.");
                System.out.println("!Excelente¡ Su cita de vacunación fue añadida con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "!Error¡ No se pudo añadir la cita de vacunación.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la cita de vacunación: " + e.getMessage());
            System.out.println("Error al guardar la cita de vacunación: " + e.getMessage());
        }
    }
<<<<<<< Updated upstream
    
    /*public CitaVacunacion buscarTurnoPorDni(int dniCiudadano) {
         lab = null;
        String sql = "SELECT * FROM laboratorio WHERE dniCiudadano=?";
=======

    public CitaVacunacion buscarTurnoPorDniCiudadano(int dniCiudadano) {
        CitaVacunacion turno = null;
        String sql = "SELECT * FROM turnovacunacion " +
             "JOIN ciudadano ON turnovacunacion.dniCiudadano = ciudadano.dni " +
             "JOIN vacuna ON turnovacunacion.nroSerieDosis = vacuna.nroSerieDosis " +
             "WHERE turnovacunacion.dniCiudadano = ?";

>>>>>>> Stashed changes
        PreparedStatement ps = null;

        try {
            ps = conex.Conexion_Maria().prepareStatement(sql);
            ps.setInt(1, dniCiudadano);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                turno = new CitaVacunacion();
                turno.setCodCita(rs.getInt("codCita"));
                turno.setCodRefuerzo(rs.getInt("codRefuerzo"));
                turno.setCentroVacunacion(rs.getString("centroVacunacion"));
                turno.setFechaHoraColoca(rs.getTimestamp("fechaHoraColoca").toLocalDateTime().toLocalDate());

                // Obtener valores de Ciudadano y Vacuna según la estructura de la base de datos
                int dniCiudadanoDB = rs.getInt("dni"); // Ajusta el nombre de las columnas según la base de datos
                int nroSerieDosisDB = rs.getInt("nroSerieDosis"); // Ajusta el nombre de las columnas según la base de datos

                // Establecer los valores en la instancia de CitaVacunacion
                turno.setDniCiudadano(dniCiudadanoDB);
                turno.setNroSerieDosis(nroSerieDosisDB);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla turnovacunacion " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
        System.out.println(turno);
        return turno;
    }

    public List<CitaVacunacion> listarCitasVacunacion() {
        List<CitaVacunacion> citas = new ArrayList<>();
        String sql = "SELECT * FROM turnovacunacion " +
                     "JOIN ciudadano ON turnovacunacion.dniCiudadano = ciudadano.dni " +
                     "JOIN vacuna ON turnovacunacion.nroSerieDosis = vacuna.nroSerieDosis";

        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                CitaVacunacion turno = new CitaVacunacion();
                turno.setCodCita(rs.getInt("codCita"));
                turno.setCodRefuerzo(rs.getInt("codRefuerzo"));
                turno.setCentroVacunacion(rs.getString("centroVacunacion"));
                turno.setFechaHoraColoca(rs.getTimestamp("fechaHoraColoca").toLocalDateTime().toLocalDate());

                // Obtener valores de Ciudadano y Vacuna según la estructura de la base de datos
                int dniCiudadanoDB = rs.getInt("dni"); // Ajusta el nombre de las columnas según la base de datos
                int nroSerieDosisDB = rs.getInt("nroSerieDosis"); // Ajusta el nombre de las columnas según la base de datos

                // Establecer los valores en la instancia de CitaVacunacion
                turno.setDniCiudadano(dniCiudadanoDB);
                turno.setNroSerieDosis(nroSerieDosisDB);

                citas.add(turno);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla turnovacunacion " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
        System.out.println(citas);
        return citas;
    }

    public void modificarCitasVacunacion(CitaVacunacion citaModificada) {
        String sql = "UPDATE turnovacunacion " +
                     "SET codRefuerzo = ?, centroVacunacion = ?, fechaHoraColoca = ?, nroSerieDosis = ? " +
                     "WHERE codCita = ?";
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setInt(1, citaModificada.getCodRefuerzo());
            ps.setString(2, citaModificada.getCentroVacunacion());
            ps.setTimestamp(3, Timestamp.valueOf(citaModificada.getFechaHoraColoca().atStartOfDay()));
            ps.setInt(4, citaModificada.getNroSerieDosis());
            ps.setInt(5, citaModificada.getCodCita());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Turno de vacunación modificado exitosamente.");
                System.out.println("Turno de vacunación modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El turno de vacunación no pudo ser modificado.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el turno de vacunación: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
    }

    public void eliminarCitasVacunacion(int codCita) {
        String sql = "DELETE FROM turnovacunacion WHERE codCita = ?";
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setInt(1, codCita);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Turno de vacunación eliminado exitosamente.");
                System.out.println("Turno de vacunación eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El turno de vacunación no pudo ser eliminado.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el turno de vacunación: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
<<<<<<< Updated upstream
        return lab;
    }*/
=======
    }
>>>>>>> Stashed changes
    
}
