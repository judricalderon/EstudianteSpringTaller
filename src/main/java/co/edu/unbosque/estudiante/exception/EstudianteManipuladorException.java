package co.edu.unbosque.estudiante.exception;

import co.edu.unbosque.estudiante.model.BaseRespuesta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EstudianteManipuladorException {

    @ExceptionHandler(value = EstudianteNotFoundException.class)
    public ResponseEntity<BaseRespuesta> handleNotFoundException(EstudianteNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new BaseRespuesta(ex.getMessage(),HttpStatus.NOT_FOUND.value()));
    }
}
