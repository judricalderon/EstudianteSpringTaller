package co.edu.unbosque.estudiante.model.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Estudiante {
    @Id
    @Column(name = "cedula")
    private String cedula;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "programa")
    private String programa;

    @Column (name = "status")
    private Status status;

    public Estudiante(String cedula, String nombre, String programa, Status status) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.programa = programa;
        this.status = status;
    }

    public Estudiante() {

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
