package Entidades;
import java.time.LocalDate;

public class CitaVacunacion {

    private int codCita;
    private int dniCiudadano; // Cambiado de Ciudadano a int
    private int codRefuerzo;
    private String centroVacunacion;
    private LocalDate fechaHoraColoca;
    private int nroSerieDosis; // Cambiado de Vacuna a int

    public CitaVacunacion() {
    }

    public CitaVacunacion(int codCita, int dniCiudadano, int codRefuerzo, String centroVacunacion, LocalDate fechaHoraColoca, int nroSerieDosis) {
        this.codCita = codCita;
        this.dniCiudadano = dniCiudadano;
        this.codRefuerzo = codRefuerzo;
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

    public int getDniCiudadano() {
        return dniCiudadano;
    }

    public void setDniCiudadano(int dniCiudadano) {
        this.dniCiudadano = dniCiudadano;
    }

    public int getCodRefuerzo() {
        return codRefuerzo;
    }

    public void setCodRefuerzo(int codRefuerzo) {
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

    public int getNroSerieDosis() {
        return nroSerieDosis;
    }

    public void setNroSerieDosis(int nroSerieDosis) {
        this.nroSerieDosis = nroSerieDosis;
    }

    @Override
    public String toString() {
        return "CitaVacunacion: " + " | codCita: " + codCita + " | dniCiudadano: " + dniCiudadano + " | codRefuerzo: " + codRefuerzo
                + " | centroVacunacion: " + centroVacunacion + " | fecha y Hora turno: " + fechaHoraColoca + " | nroSerieDosis:" + nroSerieDosis + " |\n";
    }
}
