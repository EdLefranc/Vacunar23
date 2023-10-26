package vacunar23;

import AccesoADatos.CitaVacunacionData;
import AccesoADatos.CiudadanoData;
import AccesoADatos.Conexion;
import AccesoADatos.LaboratorioData;
import AccesoADatos.VacunaData;
import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import Entidades.Laboratorio;
import Entidades.Vacuna;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Ed Le Franc
 */
public class VacunAR23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion conex = new Conexion();
        
        Ciudadano citizen = new Ciudadano(30475221, "Juliana", "Hernandez", "julianaher@gmail.com", "1569326510", "", "Deportista", 38, true);
        CiudadanoData ciuData = new CiudadanoData();
        
        Laboratorio lab = new Laboratorio(284441288, "Dental Medrano", "Argentina", "Paraguay 436", "dmedrano@medrano.com", "+56395214");
        LaboratorioData labData = new LaboratorioData();
        
        LocalDate fecha = LocalDate.of(2032, 10, 10);
        LocalTime hora = LocalTime.of(10, 0);
        Vacuna vacu = new Vacuna(24926, 302569785, "Vapulix", "HonLab", 0.25, fecha, true);
        VacunaData vacudata = new VacunaData();
        
        CitaVacunacion turno = new CitaVacunacion(2334, citizen, "Dosis 1", "Centro TresaLab", fecha, hora, vacu, true);
        CitaVacunacionData citaVacuData = new CitaVacunacionData();
        
        
        //conex.Conexion_Maria();
        
        //ciuData.guardarCiudadano(citizen);
        //ciuData.buscarCiudadanoPorDni(30475221);
        //ciuData.listarCiudadanos();
        //ciuData.modificarCiudadano(citizen);
        //ciuData.eliminarCiudadano(30475221, false);
        
        //labData.guardarLaboratorio(lab);
        //labData.listarLaboratorios();
        //labData.buscarLaboratorioPorCuit(252341934); // debería devolver Umbrella
        //labData.modificarLaboratorio(lab, 284441288);
                
        //vacudata.guardarVacuna(vacu);
        //vacudata.obtenerVacuna(24926);
        //vacudata.listarVacunas();
        //vacudata.modificarVacuna(vacu);
        //vacudata.actualizarEstadoVacuna(20014);
        
        //citaVacuData.guardarCitaVacunacion(turno);
        //citaVacuData.buscarTurnoPorDniCiudadano(42055288); //ver por qué trae una vacuna entera en datos
        //citaVacuData.listarCitasVacunacion();
//        citaVacuData.modificarCitasVacunacion(turno);
        citaVacuData.eliminarCitasVacunacion(9128);
        
    }
    
}
