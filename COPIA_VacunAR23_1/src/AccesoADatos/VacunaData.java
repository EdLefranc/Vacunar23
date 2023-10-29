package AccesoADatos;

import Entidades.Vacuna;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VacunaData {

    Conexion conex = new Conexion();
    
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

    // Método para verificar si la vacuna ya existe
    private boolean existeVacuna(int nroSerieDosis) {
        String sql = "SELECT COUNT(*) FROM `vacuna` WHERE `nroSerieDosis` = ?";
        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setInt(1, nroSerieDosis);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0; // Devuelve true si la vacuna ya existe, false si no existe
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia de la vacuna: " + e.getMessage());
            System.out.println("Error al verificar la existencia de la vacuna: " + e.getMessage());
        }
        return false; // En caso de error, asumimos que la vacuna no existe
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
        System.out.println("Resultado de busqueda de vacuna:\n" + vacu);
        return vacu;
    }
        
    public List<Vacuna> listarVacunas() {
        List<Vacuna> vacunas = new ArrayList<>();
        String sql = "SELECT * FROM vacuna";

        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Vacuna vacuna = new Vacuna();
                vacuna.setNroSerieDosis(rs.getInt("nroSerieDosis"));
                vacuna.setCuitLaboratorio(rs.getInt("cuitLaboratorio")); // Ajusta el nombre de la columna según la base de datos
                vacuna.setNombreVacuna(rs.getString("nombreVacuna")); // Ajusta el nombre de la columna según la base de datos
                vacuna.setMarca(rs.getString("marca"));
                vacuna.setMedida(rs.getDouble("medida"));

                // Obtén la fecha de vencimiento de la base de datos (ajusta el nombre de la columna según la base de datos)
                LocalDate fechaVencimiento = rs.getDate("vencimiento").toLocalDate();
                vacuna.setVencimiento(fechaVencimiento);

                // Obtén el estado de aplicación de la base de datos (ajusta el nombre de la columna según la base de datos)
                boolean aplicada = rs.getBoolean("aplicacion");
                vacuna.setAplicacion(aplicada);

                // Establece otros atributos de la Vacuna según la estructura de tu base de datos

                vacunas.add(vacuna);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar las vacunas: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
        System.out.println(vacunas);
        return vacunas;
    }


    public void actualizarEstadoVacuna(int nroSerieDosis) {
        // Verificar si la vacuna existe antes de actualizar su estado
        if (!existeVacuna(nroSerieDosis)) {
            JOptionPane.showMessageDialog(null, "La vacuna con nroSerieDosis " + nroSerieDosis + " no existe.");
            return;
        }

        String sql = "UPDATE vacuna SET aplicacion = false WHERE nroSerieDosis = ? AND aplicacion = true";

        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setInt(1, nroSerieDosis);
            int exito = ps.executeUpdate();

            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "Estado de la vacuna con nroSerieDosis " + nroSerieDosis + " actualizado exitosamente.");
                System.out.println("Estado de la vacuna con nroSerieDosis " + nroSerieDosis + " actualizado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la vacuna con nroSerieDosis " + nroSerieDosis + " para actualizar.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el estado de la vacuna: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
    }

    
    public void modificarVacuna(int nroSerieDosis, Vacuna nuevaVacuna) {
        String sql = "UPDATE vacuna " +
                     "SET cuitLaboratorio = ?, nombreVacuna = ?, marca = ?, medida = ?, vencimiento = ?, aplicacion = ? " +
                     "WHERE nroSerieDosis = ?";

        try (PreparedStatement ps = conex.Conexion_Maria().prepareStatement(sql)) {
            ps.setInt(1, nuevaVacuna.getCuitLaboratorio());
            ps.setString(2, nuevaVacuna.getNombreVacuna());
            ps.setString(3, nuevaVacuna.getMarca());
            ps.setDouble(4, nuevaVacuna.getMedida());
            ps.setTimestamp(5, Timestamp.valueOf(nuevaVacuna.getVencimiento().atStartOfDay()));
            ps.setBoolean(6, nuevaVacuna.isAplicacion());
            ps.setInt(7, nroSerieDosis);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Vacuna modificada exitosamente.");
                System.out.println("Vacuna modificada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La vacuna no pudo ser modificada.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar la vacuna: " + ex.getMessage());
            System.out.println("Error: " + ex);
        }
    }      
}
