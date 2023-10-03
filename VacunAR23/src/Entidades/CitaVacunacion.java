
package Entidades;

import java.time.LocalDate;


public class CitaVacunacion {
    
    private int codCita;
    private Ciudadano ciudadano; //Relaciona con dni de ciudadano
    private int codRefuerzo;
    private String fechaHoraCita;
    private String centroVacunacion;
    private LocalDate fechaHoraColoca;
    private Vacuna nroSerieDosis; //Relaciona con nroSerieDosis de vacuna

    public CitaVacunacion() {
    }

    public CitaVacunacion(int codCita, Ciudadano ciudadano, int codRefuerzo, String fechaHoraCita, String centroVacunacion, LocalDate fechaHoraColoca, Vacuna nroSerieDosis) {
        this.codCita = codCita;
        this.ciudadano = ciudadano;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoca = fechaHoraColoca;
        this.nroSerieDosis = nroSerieDosis;
    }

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

    public int getCodRefuerzo() {
        return codRefuerzo;
    }

    public void setCodRefuerzo(int codRefuerzo) {
        this.codRefuerzo = codRefuerzo;
    }

    public String getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(String fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
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
        return "CitaVacunacion{" + "codCita=" + codCita + ", ciudadano=" + ciudadano + ", codRefuerzo=" + codRefuerzo + ", fechaHoraCita=" + fechaHoraCita + ", centroVacunacion=" + centroVacunacion + ", fechaHoraColoca=" + fechaHoraColoca + ", nroSerieDosis=" + nroSerieDosis + '}';
    }
    
    
    
    
    
}
