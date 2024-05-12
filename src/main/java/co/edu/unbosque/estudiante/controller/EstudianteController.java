package co.edu.unbosque.estudiante.controller;

import co.edu.unbosque.estudiante.model.EstudianteDTO;
import co.edu.unbosque.estudiante.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
@RestController
public class EstudianteController implements EstudianteAPI{

    @Autowired
    private EstudianteService estudianteService;

    @Override
    public ResponseEntity<EstudianteDTO> modificarEstudiante(EstudianteDTO estudianteDTO) {
        return ResponseEntity
                .status(HttpStatus.OK.value())
                .body(estudianteService.modificarEstudiante(estudianteDTO));
    }

    @Override
    public ResponseEntity<String> eliminarEstudiante(String cedula) {

        return ResponseEntity
                .status(HttpStatus.OK.value())
                .body(estudianteService.eliminarEstudiante(cedula));
    }

    @Override
    public ResponseEntity<EstudianteDTO> obtenerEstudiante(String cedula) {
        EstudianteDTO estudianteDto = estudianteService.buscarEstudiante(cedula);
        return ResponseEntity
                .status(HttpStatus.OK.value())
                .body(estudianteDto);
    }

    @Override
    public ResponseEntity<Set<EstudianteDTO>> obtenerTodosEstudiantes() {
        return ResponseEntity
                .status(HttpStatus.OK.value())
                .body(estudianteService.obtenerTodosEstudiantes());
    }

    @Override
    public ResponseEntity<EstudianteDTO> crearEstudiante(EstudianteDTO estudianteDTO) {
        return ResponseEntity
                .status(HttpStatus.CREATED.value())
                .body(estudianteService.crearEstudiante(estudianteDTO));
    }
}
