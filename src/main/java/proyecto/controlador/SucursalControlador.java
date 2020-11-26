package proyecto.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.modelo.Sucursal;
import proyecto.servicio.SucursalServicio;
import proyecto.utilitarios.ResponseDTO;

@RestController
@RequestMapping("/sucursal")
public class SucursalControlador {

	@Autowired
	SucursalServicio servicio;
	
	
	@GetMapping
	public ResponseDTO listar() {
		return servicio.findALL();
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/{id}")
	public ResponseDTO buscar(@PathVariable Long id) {
		return servicio.findbyId(id);
	}
	@PostMapping
	public ResponseDTO insertar(@RequestBody Sucursal sucursal)
	{
		return servicio.crear(sucursal);
	}
	
	@PutMapping
	public ResponseDTO actualizar(@RequestBody Sucursal sucursal)
	{
		return servicio.actualizar(sucursal);
	}
	
	@DeleteMapping("/{id}")
	public ResponseDTO eliminar(@PathVariable Long id)
	{
		return servicio.borrar(id);
	}
}
