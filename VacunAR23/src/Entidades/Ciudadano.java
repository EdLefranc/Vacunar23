/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Ed Le Franc
 */
public class Ciudadano {
    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private String celular;
    private String patologia;
    private String ocupacion;
    private int edad;
    private String responsableLegal;
    private boolean estado;

    public Ciudadano() {
    }

    public Ciudadano(int dni, String nombre, String apellido, String email, String celular, String patologia, String ocupacion, int edad, String responsableLegal, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.patologia = patologia;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.responsableLegal = responsableLegal;
        this.estado = estado;
    }
    
    public Ciudadano(int dni, String nombre, String apellido, String email, String celular, String patologia, int edad, String responsableLegal, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.patologia = patologia;
        this.edad = edad;
        this.responsableLegal = responsableLegal;
        this.estado = estado;
    }

    public Ciudadano(int dni, String nombre, String apellido, String email, String celular, String patologia, String ocupacion, int edad, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.patologia = patologia;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getResponsableLegal() {
        return responsableLegal;
    }

    public void setResponsableLegal(String responsableLegal) {
        this.responsableLegal = responsableLegal;
    }

    @Override
    public String toString() {
        return "| Ciudadano: | " + " dni: " + dni + "| nombre: " + nombre + "| apellido: " + apellido + "| celular:"
                + celular + "| edad:" + edad + " |\n";
    }
    
    
}
