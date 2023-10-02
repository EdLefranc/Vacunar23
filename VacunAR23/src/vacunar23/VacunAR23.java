/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar23;

import AccesoADatos.Conexion;

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
        
        conex.Conexion_Maria();
        
    }
    
}
