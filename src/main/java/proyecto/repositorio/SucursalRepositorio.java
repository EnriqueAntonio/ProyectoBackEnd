package proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.modelo.Sucursal;

@Repository
public interface SucursalRepositorio extends JpaRepository<Sucursal, Long>{

}
