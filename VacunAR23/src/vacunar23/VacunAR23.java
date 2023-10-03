/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar23;

import AccesoADatos.CiudadanoData;
import AccesoADatos.Conexion;
import Entidades.Ciudadano;

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
        
        //conex.Conexion_Maria();
        //ciuData.guardarCiudadano(citizen);
        //ciuData.buscarCiudadanoPorDni(39266240);
        ciuData.listarCiudadanos();
        //ciuData.modificarCiudadano(citizen, 42266409);
        //ciuData.eliminarCiudadano(22403720, true);
    }
    
}
