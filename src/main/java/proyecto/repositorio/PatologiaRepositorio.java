package proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.modelo.Patologia;

@Repository
public interface PatologiaRepositorio extends JpaRepository<Patologia, Long>{

	
	
}
