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
        
        Ciudadano citizen = new Ciudadano(42266409, "Mariana", "Delfos", "marianadelfos@gmail.com", "150596690", "Covid", 25, "Mariana Delfos");
        CiudadanoData ciuData = new CiudadanoData();
        
        //conex.Conexion_Maria();
        //ciuData.guardarCiudadano(citizen);
        ciuData.buscarCiudadanoPorDni(39266240);
    }
    
}
