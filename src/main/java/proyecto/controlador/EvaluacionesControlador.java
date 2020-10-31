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

import proyecto.modelo.Evaluaciones;
import proyecto.servicio.EvaluacionesServicios;
import proyecto.utilitarios.ResponseDTO;

@RestController
@RequestMapping("/evaluaciones")
public class EvaluacionesControlador {

	@Autowired
	EvaluacionesServicios servicio;
	
	@GetMapping
	public ResponseDTO listar() {
		return servicio.findALL();
	}
	
	@PostMapping
	public ResponseDTO insertar(@RequestBody Evaluaciones evaluaciones)
	{
		return servicio.crear(evaluaciones);
	}
	
	@PutMapping
	public ResponseDTO actualizar(@RequestBody Evaluaciones evaluaciones)
	{
		return servicio.actualizar(evaluaciones);
	}
	
	@DeleteMapping("/{id}")
	public ResponseDTO eliminar(@PathVariable Long id)
	{
		return servicio.borrar(id);
	}
}
