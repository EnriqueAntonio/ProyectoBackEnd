package proyecto.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.modelo.Patologia;
import proyecto.servicio.PatologiaServicio;
import proyecto.utilitarios.ResponseDTO;

@RestController
@RequestMapping("/patologia")
public class PatologiaControlador {
	
	@Autowired
	PatologiaServicio servicio;

	@GetMapping
	public ResponseDTO listar() {
		return servicio.findALL();
	}
	
	@PostMapping
	public ResponseDTO insertar(@RequestBody Patologia patalogia)
	{
		return servicio.crear(patalogia);
	}
	
	@PutMapping
	public ResponseDTO actualizar(@RequestBody Patologia patalogia)
	{
		return servicio.actualizar(patalogia);
	}
	
	@DeleteMapping("/{id}")
	public ResponseDTO eliminar(@PathVariable Long id)
	{
		return servicio.borrar(id);
	}
}
