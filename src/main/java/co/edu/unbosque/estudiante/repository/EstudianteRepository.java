package co.edu.unbosque.estudiante.repository;

import co.edu.unbosque.estudiante.model.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, String> {
}
