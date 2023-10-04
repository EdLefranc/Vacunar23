
package Entidades;


public class Laboratorio {
    
    private int cuitLaboratorio;
    private String nombreLab;
    private String pais;
    private String domComercial;
    private String mail;
    private String telefono;

    public Laboratorio() {
    }

    public Laboratorio(int cuitLaboratorio, String nombreLab, String pais, String domComercial, String mail, String telefono) {
        this.cuitLaboratorio = cuitLaboratorio;
        this.nombreLab = nombreLab;
        this.pais = pais;
        this.domComercial = domComercial;
        this.mail = mail;
        this.telefono = telefono;
    }

    public int getCuitLaboratorio() {
        return cuitLaboratorio;
    }

    public void setCuitLaboratorio(int cuitLaboratorio) {
        this.cuitLaboratorio = cuitLaboratorio;
    }

    public String getNombreLab() {
        return nombreLab;
    }

    public void setNombreLab(String nombreLab) {
        this.nombreLab = nombreLab;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDomComercial() {
        return domComercial;
    }

    public void setDomComercial(String domComercial) {
        this.domComercial = domComercial;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "| Laboratorio: " + " | cuitLaboratorio: " + cuitLaboratorio + "| nombreLab: " + nombreLab + "| pais=" + pais
                + "\n| domComercial: " + domComercial + "| mail:" + mail + "| telefono:" + telefono 
                + " |\n---------------------------------------------------\n";
    }
    
    
    
}
