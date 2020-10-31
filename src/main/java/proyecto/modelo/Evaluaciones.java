package proyecto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="evaluaciones")
public class Evaluaciones {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="materia")
	private String materia;
	
	@Column(name="nota")
	private Double nota;
	
	@Column(name="aprobado")
	private String aprobado;
	
	@Column(name="estado")
	private String estado;
	
	public Evaluaciones() {
		
	}
	
	public Evaluaciones(Long id, String nombres,String apellidos,String materia,
			Double nota,String aprobado,String estado){
		
		this.id=id;
		this.nombres=nombres;
		this.apellidos= apellidos;
		this.materia=materia;
		this.nota=nota;
		this.aprobado=aprobado;
		this.estado=estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getAprobado() {
		return aprobado;
	}

	public void setAprobado(String aprobado) {
		this.aprobado = aprobado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
