package co.edu.unbosque.estudiante.controller;

import co.edu.unbosque.estudiante.model.EstudianteDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequestMapping("/")
public interface EstudianteAPI {

    @PutMapping("/estudiante/{cedula}")
    ResponseEntity<EstudianteDTO> modificarEstudiante(@PathVariable("cedula") String cedula);

    @DeleteMapping("/estudiante/{cedula}")
    ResponseEntity<String> eliminarEstudiante(@PathVariable("cedula") String cedula);

    @GetMapping("/estudiante/{cedula}")
    ResponseEntity<EstudianteDTO> obtenerEstudiante(@PathVariable String cedula);

    @GetMapping("/estudiante")
    ResponseEntity<Set<EstudianteDTO>> obtenerTodosEstudiantes();

    @PostMapping("/estudiante")
    ResponseEntity<EstudianteDTO> crearEstudiante(EstudianteDTO employee);


}
