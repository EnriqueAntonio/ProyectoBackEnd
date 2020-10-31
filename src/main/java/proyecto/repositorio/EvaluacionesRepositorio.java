package proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.modelo.Evaluaciones;

@Repository
public interface EvaluacionesRepositorio extends JpaRepository<Evaluaciones, Long> {
	

}
