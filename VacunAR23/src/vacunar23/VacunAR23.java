/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar23;

import AccesoADatos.CiudadanoData;
import AccesoADatos.Conexion;
import AccesoADatos.LaboratorioData;
import Entidades.Ciudadano;
import Entidades.Laboratorio;

/**
 *
 * @author Ed Le Franc
 */
public class VacunAR23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Conexion conex = new Conexion();
        
        Ciudadano citizen = new Ciudadano(40255063, "Darío", "Sergi", "dsergi@gamil.com", "155550630", "Ninguna", "Bombero", 25, true);
        CiudadanoData ciuData = new CiudadanoData();
        
        Laboratorio lab = new Laboratorio(285006038, "GoldLabs", "Canadá", "+1 Rob Carlson 793 Mo", "goldlabs.center@glabs.com", "+923622804");
        LaboratorioData labData = new LaboratorioData();
        
        //conex.Conexion_Maria();
        //ciuData.guardarCiudadano(citizen);
        //ciuData.buscarCiudadanoPorDni(39266240);
        //ciuData.listarCiudadanos();
        //ciuData.modificarCiudadano(citizen, 42266409);
        //ciuData.eliminarCiudadano(22403720, true);
        //labData.guardarLaboratorio(lab);
        //labData.listarLaboratorios();
    }
    
}
