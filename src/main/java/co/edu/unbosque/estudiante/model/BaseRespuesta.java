package co.edu.unbosque.estudiante.model;

import org.modelmapper.spi.ErrorMessage;

public class BaseRespuesta {
    private String mensaje;
    private int codigo;
    private ErrorMessage errorMensaje;

    public BaseRespuesta(String mensaje, int codigo, ErrorMessage errorMensaje) {
        this.mensaje = mensaje;
        this.codigo = codigo;
        this.errorMensaje = errorMensaje;
    }

    public BaseRespuesta(String mensaje, int codigo) {
        this.mensaje = mensaje;
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ErrorMessage getErrorMensaje() {
        return errorMensaje;
    }

    public void setErrorMensaje(ErrorMessage errorMensaje) {
        this.errorMensaje = errorMensaje;
    }
}
