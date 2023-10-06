
package Entidades;

import java.time.LocalDate;




public class Vacuna {
    
    private int nroSerieDosis;
    private int cuitLaboratorio;
    private String nombreVacuna;
    private String marca;
    private double medida;
    private LocalDate vencimiento;
    private boolean aplicacion;

    public Vacuna() {
    }

    public Vacuna(int nroSerieDosis, int cuitLaboratorio, String nombreVacuna, String marca, double medida, LocalDate vencimiento, boolean aplicacion) {
        this.nroSerieDosis = nroSerieDosis;
        this.cuitLaboratorio = cuitLaboratorio;
        this.nombreVacuna = nombreVacuna;
        this.marca = marca;
        this.medida = medida;
        this.vencimiento = vencimiento;
        this.aplicacion = aplicacion;
    }

    public int getNroSerieDosis() {
        return nroSerieDosis;
    }

    public void setNroSerieDosis(int nroSerieDosis) {
        this.nroSerieDosis = nroSerieDosis;
    }

    public int getCuitLaboratorio() {
        return cuitLaboratorio;
    }

    public void setCuitLaboratorio(int cuitLaboratorio) {
        this.cuitLaboratorio = cuitLaboratorio;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public boolean isAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(boolean aplicacion) {
        this.aplicacion = aplicacion;
    }

    @Override
    public String toString() {
        return "| Vacuna: " + "nroSerieDosis: " + nroSerieDosis + "| cuitLaboratorio: " + cuitLaboratorio + "| nombreVacuna: " + nombreVacuna + "| marca: " + marca + 
                "| medida: " + medida + "| vencimiento: " + vencimiento + "| aplicacion: " + aplicacion + "| \n";
    }
    
    
    
    
}
