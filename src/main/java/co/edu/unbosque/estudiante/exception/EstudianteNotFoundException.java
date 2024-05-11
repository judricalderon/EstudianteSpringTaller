package co.edu.unbosque.estudiante.exception;

public class EstudianteNotFoundException extends RuntimeException {
    public EstudianteNotFoundException(String mensaje) {
        super(mensaje);
    }

}
