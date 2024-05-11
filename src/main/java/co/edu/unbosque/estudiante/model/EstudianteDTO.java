package co.edu.unbosque.estudiante.model;

public class EstudianteDTO {

    private String cedula,nombre, programa, stratus;

    public EstudianteDTO(String cedula, String nombre, String programa, String stratus) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.programa = programa;
        this.stratus = stratus;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getStratus() {
        return stratus;
    }

    public void setStratus(String stratus) {
        this.stratus = stratus;
    }
}
