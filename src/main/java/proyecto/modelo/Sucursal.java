package proyecto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sucursal")
public class Sucursal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nombre_sucursal")
	private String nombre_sucursal;
	
	@Column(name="codigo_sucursal")
	private String codigo_sucursal;
	
	@Column(name="num_banco")
	private String num_banco;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="estado")
	private String estado;
	
	public Sucursal() {
		
	}
	
	public Sucursal(Long id, String nombre_sucursal,String codigo_sucursal,String num_banco,
			String correo,String direccion,String estado){
		
		this.id=id;
		this.nombre_sucursal=nombre_sucursal;
		this.codigo_sucursal= codigo_sucursal;
		this.num_banco=num_banco;
		this.correo=correo;
		this.direccion=direccion;
		this.estado=estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_sucursal() {
		return nombre_sucursal;
	}

	public void setNombre_sucursal(String nombre_sucursal) {
		this.nombre_sucursal = nombre_sucursal;
	}

	public String getCodigo_sucursal() {
		return codigo_sucursal;
	}

	public void setCodigo_sucursal(String codigo_sucursal) {
		this.codigo_sucursal = codigo_sucursal;
	}

	public String getNum_banco() {
		return num_banco;
	}

	public void setNum_banco(String num_banco) {
		this.num_banco = num_banco;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
