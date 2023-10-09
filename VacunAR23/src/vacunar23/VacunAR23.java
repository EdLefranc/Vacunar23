/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
        //Ciudadano citizen = new Ciudadano(40255063, "Darío", "Sergi", "dsergi@gamil.com", "155550630", "Ninguna", "Bombero", 25, true);
        //CiudadanoData ciuData = new CiudadanoData();
        
        Laboratorio lab = new Laboratorio(285006038, "GoldLabs", "Canadá", "+1 Rob Carlson 793 MoNTREAL", "goldlabs.center@glabs.com", "+923622804");
        LaboratorioData labData = new LaboratorioData();
        
        LocalDate fecha = LocalDate.of(2026, 8, 15);
        Vacuna vacu = new Vacuna(23748, 302569785, "Garzol500", "HonLab", 0.5, fecha, true);
        VacunaData vacudata = new VacunaData();
        
        CitaVacunacion turno = new CitaVacunacion(123, 35890004, 2, "OrenseLab", fecha, 20014);
        CitaVacunacionData citaVacuData = new CitaVacunacionData();
        
        
        //conex.Conexion_Maria();
        
        //ciuData.guardarCiudadano(citizen);
        //Laboratorio lab = new Laboratorio(285006038, "GoldLabs", "Canadá", "+1 Rob Carlson 793 Mo", "goldlabs.center@glabs.com", "+923622804");
        //LaboratorioData labData = new LaboratorioData();
       // LocalDate fecha = LocalDate.of(2026, 8, 15);
        //Vacuna vacu = new Vacuna(64851, 3688547, "AliviarDolor", "FocusLab", 0.5, fecha, true);
        //VacunaData vacudata = new VacunaData();
        
        conex.Conexion_Maria();
       // ciuData.guardarCiudadano(citizen);
        //ciuData.buscarCiudadanoPorDni(39266240);
        //ciuData.listarCiudadanos();
        //ciuData.modificarCiudadano(citizen, 42266409);
        //ciuData.eliminarCiudadano(22403720, true);
        
        //labData.guardarLaboratorio(lab);
        //labData.listarLaboratorios();
        //labData.buscarLaboratorioPorCuit(285006038); // debería devolver GoldLabs
        //labData.modificarLaboratorio(lab, 285006038);
        //vacudata.guardarVacuna(vacu);
        //vacudata.obtenervacuna(64851);
        
        //vacudata.guardarVacuna(vacu);
        //vacudata.obtenervacuna(64851);
        //vacudata.listarVacunas();
        //vacudata.modificarVacuna(23040, vacu);
        //vacudata.actualizarEstadoVacuna(20014);
        
        //citaVacuData.guardarCitaVacunacion(turno);
        //citaVacuData.buscarTurnoPorDniCiudadano(35890004);
        //citaVacuData.listarCitasVacunacion();
        //citaVacuData.modificarCitasVacunacion(turno);
        //citaVacuData.eliminarCitasVacunacion(123);
    }
    
}
