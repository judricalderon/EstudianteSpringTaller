package co.edu.unbosque.estudiante.controller;

import co.edu.unbosque.estudiante.model.EstudianteDTO;
import org.springframework.http.ResponseEntity;

import java.util.Set;

public class EstudianteController implements EstudianteAPI{
    @Override
    public ResponseEntity<EstudianteDTO> modificarEstudiante(String cedula) {
        return null;
    }

    @Override
    public ResponseEntity<String> eliminarEstudiante(String cedula) {
        return null;
    }

    @Override
    public ResponseEntity<EstudianteDTO> obtenerEstudiante(String cedula) {
        return null;
    }

    @Override
    public ResponseEntity<Set<EstudianteDTO>> obtenerTodosEstudiantes() {
        return null;
    }

    @Override
    public ResponseEntity<EstudianteDTO> crearEstudiante(EstudianteDTO employee) {
        return null;
    }
}
