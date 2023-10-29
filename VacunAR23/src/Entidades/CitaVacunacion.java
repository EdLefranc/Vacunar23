
package Entidades;

import java.time.LocalDate;
import java.time.LocalTime;


public class CitaVacunacion {
    
    private int codCita;
    private Ciudadano ciudadano; //Relaciona con dni de ciudadano
    private String codRefuerzo;    
    private String centroVacunacion;
    private LocalDate fechaHoraColoca;
    private LocalTime hora;
    private Vacuna nroSerieDosis; //Relaciona con nroSerieDosis de vacuna
    private boolean turnoActivo;
    
    public CitaVacunacion() {
    }

    public CitaVacunacion(Ciudadano ciudadano, String codRefuerzo, String centroVacunacion, LocalDate fechaHoraColoca, LocalTime hora, Vacuna nroSerieDosis, boolean turnoActivo) {
        this.ciudadano = ciudadano;
        this.codRefuerzo = codRefuerzo;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoca = fechaHoraColoca;
        this.hora = hora;
        this.nroSerieDosis = nroSerieDosis;
        this.turnoActivo = turnoActivo;
    }
    
    
    
    public CitaVacunacion(int codCita, Ciudadano ciudadano, String codRefuerzo, String centroVacunacion, LocalDate fechaHoraColoca, LocalTime hora, Vacuna nroSerieDosis, boolean turnoActivo) {
        this.codCita = codCita;
        this.ciudadano = ciudadano;
        this.codRefuerzo = codRefuerzo;        
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoca = fechaHoraColoca;
        this.hora = hora;
        this.nroSerieDosis = nroSerieDosis;
        this.turnoActivo = turnoActivo;
    }

    public boolean isTurnoActivo() {
        return turnoActivo;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setTurnoActivo(boolean turnoActivo) {
        this.turnoActivo = turnoActivo;
    }

//    public CitaVacunacion(int i, int i0, int i1, String orenseLab, LocalDate fecha, int i2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public int getCodCita() {
        return codCita;
    }

    public void setCodCita(int codCita) {
        this.codCita = codCita;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public String getCodRefuerzo() {
        return codRefuerzo;
    }

    public void setCodRefuerzo(String codRefuerzo) {
        this.codRefuerzo = codRefuerzo;
    }

    public String getCentroVacunacion() {
        return centroVacunacion;
    }

    public void setCentroVacunacion(String centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }

    public LocalDate getFechaHoraColoca() {
        return fechaHoraColoca;
    }

    public void setFechaHoraColoca(LocalDate fechaHoraColoca) {
        this.fechaHoraColoca = fechaHoraColoca;
    }

    public Vacuna getNroSerieDosis() {
        return nroSerieDosis;
    }

    public void setNroSerieDosis(Vacuna nroSerieDosis) {
        this.nroSerieDosis = nroSerieDosis;
    }

    @Override
    public String toString() {
        return "| CitaVacunacion: " + "codCita: " + codCita + " | ciudadano: " + ciudadano.getDni() + " | codRefuerzo: " + codRefuerzo 
                + " | fechaHoraCita: " + " | centroVacunacion: " + centroVacunacion + " | fecha Colocación: " 
                + fechaHoraColoca + " | hora: " + hora + " | nroSerieDosis: " + nroSerieDosis + " | estado: " + isTurnoActivo() + " | ";
    }
    
    
    
    
    
}
