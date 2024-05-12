package co.edu.unbosque.estudiante.controller;

import co.edu.unbosque.estudiante.model.EstudianteDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequestMapping("/estudiante/api/v1")
public interface EstudianteAPI {

    @PutMapping("/estudiante")
    ResponseEntity<EstudianteDTO> modificarEstudiante(EstudianteDTO estudianteDto);

    @DeleteMapping("/estudiante/{cedula}")
    ResponseEntity<String> eliminarEstudiante(@PathVariable("cedula") String cedula);

    @GetMapping("/estudiante/{cedula}")
    ResponseEntity<EstudianteDTO> obtenerEstudiante(@PathVariable String cedula);

    @GetMapping("/estudiante")
    ResponseEntity<Set<EstudianteDTO>> obtenerTodosEstudiantes();

    @PostMapping("/estudiante")
    ResponseEntity<EstudianteDTO> crearEstudiante(EstudianteDTO estudianteDto);


}
