package co.edu.unbosque.estudiante.service;

import co.edu.unbosque.estudiante.exception.EstudianteNotFoundException;
import co.edu.unbosque.estudiante.model.EstudianteDTO;
import co.edu.unbosque.estudiante.model.entity.Estudiante;
import co.edu.unbosque.estudiante.repository.EstudianteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;
    @Autowired
    private ModelMapper modelMapper;

    public EstudianteDTO modificarEstudiante (EstudianteDTO estudiante) {

        EstudianteDTO estudianteDTO = buscarEstudiante(estudiante.getCedula());
        eliminarEstudiante(estudiante.getCedula());

        return crearEstudiante(estudianteDTO);
    }

    public String eliminarEstudiante(String cedula) {

         estudianteRepository
                .delete(modelMapper.map(buscarEstudiante(cedula),Estudiante.class));
        return "Estudiante Eliminado";
    }

    public EstudianteDTO buscarEstudiante(String cedula) {
        return estudianteRepository
                .findById(cedula)
                .map(entity -> modelMapper.map(entity, EstudianteDTO.class))
                .orElseThrow(() -> new EstudianteNotFoundException ("Estudiante no existe"));
    }
    public Set<EstudianteDTO> obtenerTodosEstudiantes() {
        return estudianteRepository
                .findAll()
                .stream()
                .map(entity -> modelMapper.map(entity, EstudianteDTO.class))
                .collect(Collectors.toSet());
    }

    public EstudianteDTO crearEstudiante(EstudianteDTO estudianteDTO) {
        Estudiante employee = estudianteRepository.save(modelMapper.map(estudianteDTO, Estudiante.class));
        return modelMapper.map(employee, EstudianteDTO.class);
    }
}
